package com.navteq.lbsp.ctg.trapster.modules.udb.mysql.mybatis;

import static org.junit.Assert.fail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.navteq.lbsp.ctg.trapster.modules.udb.TrapsterUdbException;
import com.navteq.lbsp.ctg.trapster.modules.udb.domain.Udb;
import com.navteq.lbsp.ctg.trapster.modules.udb.domain.UdbDao;
import com.navteq.lbsp.ctg.trapster.modules.udb.domain.UdbPopulatorType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-nvtsfw-context.xml" })
public class UdbDaoImplTest {

	private final static Log LOGGER = LogFactory.getLog(UdbDaoImplTest.class);

	@Inject
	@Qualifier("udbDao")
	private UdbDao udbDao;

	/* generated udb.id found */
	private long testId = 0;

	private Udb getDemoUdb() {
		return new Udb(UdbPopulatorType.DEMO_USER);
	}

	@Before
	public void testCreate() {
		// make sure demo user doesn't exist
		Udb user = udbDao.getByName("demo");

		if (user == null) {
			// create
			try {
				udbDao.create(getDemoUdb());
			} catch (TrapsterUdbException e) {
				LOGGER.error(e);
				fail(e.getMessage());
			}

			user = udbDao.getByName("demo");
			LOGGER.debug(user.getId() + " ***** ");
			Assert.assertNotNull(user);
			this.testId = user.getId();
		}

		
	}
	
	@After
	public void testRemoveById() {
		try {
			udbDao.removeById(1L);
			Udb user = udbDao.getById(1L);
			Assert.assertNull(user);
		} catch (Exception e) {
			LOGGER.error(e);
			fail(e.getMessage());
		}
	}

	@Test
	public void testByName() {
		Assert.assertNotNull(udbDao);
		//
		Udb user = udbDao.getByName("demo");
		Assert.assertNotNull(user);
		Assert.assertTrue(user.getName().equals("demo"));
	}

	@Test
	public void testByNameOrUname() {
		Assert.assertNotNull(udbDao);
		//
		Udb user1 = udbDao.getByNameOrUname("demo");
		Assert.assertNotNull(user1);
		//
		Udb user2 = udbDao.getByNameOrUname("demo-no-email");
		Assert.assertNotNull(user2);
		Assert.assertTrue(user1.getId().equals(user2.getId()));
	}

	@Test
	public void testByUname() {
		Assert.assertNotNull(udbDao);
		//
		Udb user = udbDao.getByUname("demo-no-email");
		Assert.assertNotNull(user);
		Assert.assertTrue(user.getUname().equals("demo-no-email"));
	}

	@Test
	public void testUpdate() throws Exception {
		Assert.assertNotNull(udbDao);
		//
		Udb user = udbDao.getById(1L);
		Assert.assertNotNull(user);
		//
		int numvotes = user.getNumvotes();
		
		user.setNumvotes(numvotes + 1);
		udbDao.update(user);
		//
		user = udbDao.getById(1L);
		Assert.assertNotNull(user);
		Assert.assertTrue(user.getNumvotes() == (numvotes + 1));
		
		
		//updating oauth date
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = dateFormat.parse("2012/09/29 00:00:00");
		long datetime=date.getTime();
		
		user.setOauthdate(date);
		udbDao.update(user);
		
		user = udbDao.getById(1L);
		
		
		Assert.assertNotNull(user);
		Assert.assertTrue(user.getOauthdate().getTime()== datetime);
		
		
	}


}
