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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trapTypeLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trapTypeLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="levelname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trapTypeLevelType", propOrder = {
    "bit",
    "levelname",
    "icon"
})
public class TrapTypeLevelType {

    protected long bit;
    @XmlElement(required = true)
    protected String levelname;
    @XmlElement(required = true)
    protected String icon;

    /**
     * Gets the value of the bit property.
     * 
     */
    public long getBit() {
        return bit;
    }

    /**
     * Sets the value of the bit property.
     * 
     */
    public void setBit(long value) {
        this.bit = value;
    }

    /**
     * Gets the value of the levelname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelname() {
        return levelname;
    }

    /**
     * Sets the value of the levelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelname(String value) {
        this.levelname = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

}
