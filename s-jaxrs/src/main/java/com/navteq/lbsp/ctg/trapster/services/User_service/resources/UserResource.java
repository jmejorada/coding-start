package com.navteq.lbsp.ctg.trapster.services.User_service.resources;


import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.navteq.lbsp.ctg.trapster.modules.commons.domain.DataType;
import com.navteq.lbsp.ctg.trapster.modules.commons.domain.TrapsterResponseType;
import com.navteq.lbsp.ctg.trapster.modules.commons.domain.TrapsterType;
import com.navteq.lbsp.ctg.trapster.modules.udb.TrapsterUdbException;
import com.navteq.lbsp.ctg.trapster.modules.udb.domain.Udb;
import com.navteq.lbsp.ctg.trapster.modules.udb.domain.UdbDao;
import com.navteq.lbsp.ctg.trapster.services.User_service.exception.ResourceNotFoundException;


/**
 * This is an example resource CRUD resource for demonstration purposes.
 * 
 * 
 */

@Singleton
@Named("userResource")
@Path("/2.0/user")
public class UserResource {
	
	private final static Log logger = LogFactory.getLog(UserResource.class);
	private final static long MINIMUM_EPOCHTIME = 28800000L; // used for setting
	
		
	//TODO  using example.module-udb as DAO layer, wire in access
	@Autowired
	@Qualifier("udbDao")
	private UdbDao udbDao;
	


	private TrapsterType convrtToTrapsterType(Udb udb,int statusCode){
	
		TrapsterType tt=new TrapsterType();
		tt.setResponse(getResponseType());
		tt.getResponse().getData().setId(udb.getId());
		tt.getResponse().getData().setDisplayname(udb.getUname());
		tt.getResponse().setStatuscode(statusCode);
		return tt;
	}
	/**
	 * returns TrapsterType for existing user specified in query parameter
	 * as userid all that happens here is getting path/query parms into local
	 * vars, and then call a common get method getByUserId
	 * 
	 * @param userid
	 *            : key to udb table
	 */
	@GET
	@Path("/query")
	public Response getUserUsingOnlyQueryParms(@QueryParam("id") Long id, 
											   @QueryParam("displayName") String displayName
												)
			throws ResourceNotFoundException {
		this.logger.debug("ID****:" + id);
		this.logger.debug("dispName****:"+ displayName);
		Udb udb=null;
		if(id!=null)
			udb=this.udbDao.getById(id);
		if(udb==null&& displayName !=null && displayName.length()>0)
			udb=this.udbDao.getByNameOrUname(displayName);
		
		
		return Response.ok(convrtToTrapsterType(udb,301)).build();
	}




	/**
	 * creates a new user posted via XML/JSON and returns the resource location
	 * if succeeded
	 * 
	 * @param incomingRequest
	 *            POST request body
	 */
	  @POST
	  @Produces(MediaType.APPLICATION_XML)
	  @Consumes(MediaType.APPLICATION_XML)
	public Response update(JAXBElement<TrapsterType> payload,
		      @Context HttpServletResponse servletResponse) throws IOException,
		      													   ResourceNotFoundException,
		      													   TrapsterUdbException, 
		      													   AddressException {
		
		
		//check if its there...if its not then add, else return...this must be deleted later
		
		  TrapsterType tt=new TrapsterType();
		  String uname=payload.getValue().getRequest().getParams().getDisplayname();
		  Long id=payload.getValue().getRequest().getParams().getId();
		  Long result=null;
		  this.logger.debug("Got to method..... "+ uname);

		  //Udb user=new Udb();
		  //user.setUname(uname);
		  
		  try{
			  
			  Udb user=this.udbDao.getById(id);
			  if(user==null){
				  user=new Udb();
				  user.setUname(uname);
				  int resultInt=this.udbDao.create(user);
				  result=new Long(resultInt);
				  this.logger.debug("created done: " +result);
			  }else{
				  user.setUname(uname);
				  this.udbDao.update(user);
				  result=user.getId();
				  this.logger.debug("udpated: " +result);
			  }
			  
			  
			  TrapsterResponseType response=getResponseType();
			  response.getData().setId(result);
			  tt.setResponse(response);
			  tt.getResponse().setStatuscode(301);
		  }catch(Exception e){
			  e.printStackTrace();
		  }

		 return Response.ok(tt).build();
	}

	
	private TrapsterResponseType getResponseType(){
		TrapsterResponseType response =new TrapsterResponseType();
		  DataType data =new DataType();
		  response.setData(data);
		  return response;
	}
		
	/**
	 * delete an existing user
	 * 
	 * @param userid
	 *            : key to udb table
	 * 
	 * @throws ResourceNotFoundException
	 */
	@DELETE
	@Path("/delete/{id}")
	public Response delete(
			@PathParam("id") Long id) throws ResourceNotFoundException {
		
		this.logger.debug("Gonna Delete the folowing !!!!! " +id);
		this.udbDao.removeById(id);
		
		return null;

	}

	


	  
	  

	
}