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
 * <p>Java class for trapTypeAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trapTypeAttributeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.trapster.com/schema/2.0.0/trapster}attributeType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icons" type="{http://www.trapster.com/schema/2.0.0/trapster}trapTypeIconType"/>
 *         &lt;element name="reportable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alertable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="votable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audioid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="announces" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notifiable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lifetime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="levels" type="{http://www.trapster.com/schema/2.0.0/trapster}trapTypeLevelListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trapTypeAttributeType", propOrder = {
    "category",
    "name",
    "description",
    "icons",
    "reportable",
    "alertable",
    "votable",
    "audioid",
    "announces",
    "notifiable",
    "lifetime",
    "levels"
})
public class TrapTypeAttributeType
    extends AttributeType
{

    protected int category;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected TrapTypeIconType icons;
    @XmlElement(required = true)
    protected String reportable;
    @XmlElement(required = true)
    protected String alertable;
    @XmlElement(required = true)
    protected String votable;
    @XmlElement(required = true)
    protected String audioid;
    @XmlElement(required = true)
    protected String announces;
    @XmlElement(required = true)
    protected String notifiable;
    protected long lifetime;
    @XmlElement(required = true)
    protected TrapTypeLevelListType levels;

    /**
     * Gets the value of the category property.
     * 
     */
    public int getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(int value) {
        this.category = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * @return
     *     possible object is
     *     {@link TrapTypeIconType }
     *     
     */
    public TrapTypeIconType getIcons() {
        return icons;
    }

    /**
     * Sets the value of the icons property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapTypeIconType }
     *     
     */
    public void setIcons(TrapTypeIconType value) {
        this.icons = value;
    }

    /**
     * Gets the value of the reportable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportable() {
        return reportable;
    }

    /**
     * Sets the value of the reportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportable(String value) {
        this.reportable = value;
    }

    /**
     * Gets the value of the alertable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertable() {
        return alertable;
    }

    /**
     * Sets the value of the alertable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertable(String value) {
        this.alertable = value;
    }

    /**
     * Gets the value of the votable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotable() {
        return votable;
    }

    /**
     * Sets the value of the votable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotable(String value) {
        this.votable = value;
    }

    /**
     * Gets the value of the audioid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioid() {
        return audioid;
    }

    /**
     * Sets the value of the audioid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioid(String value) {
        this.audioid = value;
    }

    /**
     * Gets the value of the announces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnounces() {
        return announces;
    }

    /**
     * Sets the value of the announces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnounces(String value) {
        this.announces = value;
    }

    /**
     * Gets the value of the notifiable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifiable() {
        return notifiable;
    }

    /**
     * Sets the value of the notifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifiable(String value) {
        this.notifiable = value;
    }

    /**
     * Gets the value of the lifetime property.
     * 
     */
    public long getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     */
    public void setLifetime(long value) {
        this.lifetime = value;
    }

    /**
     * Gets the value of the levels property.
     * 
     * @return
     *     possible object is
     *     {@link TrapTypeLevelListType }
     *     
     */
    public TrapTypeLevelListType getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapTypeLevelListType }
     *     
     */
    public void setLevels(TrapTypeLevelListType value) {
        this.levels = value;
    }

}
