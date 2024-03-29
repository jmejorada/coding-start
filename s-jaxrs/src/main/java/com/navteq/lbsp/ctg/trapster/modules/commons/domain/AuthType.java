//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.30 at 01:06:27 PM EDT 
//


package com.navteq.lbsp.ctg.trapster.modules.commons.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for authType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appkey" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="pwdhash" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="devicetype" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="deviceid" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="appcapabilities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authType", propOrder = {
    "appkey",
    "login",
    "pwdhash",
    "devicetype",
    "deviceid",
    "appcapabilities",
    "appid"
})
public class AuthType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String appkey;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String login;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String pwdhash;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String devicetype;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String deviceid;
    protected int appcapabilities;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String appid;

    /**
     * Gets the value of the appkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * Sets the value of the appkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppkey(String value) {
        this.appkey = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the pwdhash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwdhash() {
        return pwdhash;
    }

    /**
     * Sets the value of the pwdhash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdhash(String value) {
        this.pwdhash = value;
    }

    /**
     * Gets the value of the devicetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicetype() {
        return devicetype;
    }

    /**
     * Sets the value of the devicetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicetype(String value) {
        this.devicetype = value;
    }

    /**
     * Gets the value of the deviceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * Sets the value of the deviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceid(String value) {
        this.deviceid = value;
    }

    /**
     * Gets the value of the appcapabilities property.
     * 
     */
    public int getAppcapabilities() {
        return appcapabilities;
    }

    /**
     * Sets the value of the appcapabilities property.
     * 
     */
    public void setAppcapabilities(int value) {
        this.appcapabilities = value;
    }

    /**
     * Gets the value of the appid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppid() {
        return appid;
    }

    /**
     * Sets the value of the appid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppid(String value) {
        this.appid = value;
    }

}
