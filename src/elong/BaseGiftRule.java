//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 02:42:21 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for BaseGiftRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseGiftRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRule">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateType" type="{}HotelGiftDateTypeEnum"/>
 *         &lt;element name="WeekSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HourNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HourType" type="{}HotelGiftHourTypeEnum"/>
 *         &lt;element name="WayOfGiving" type="{}HotelGiftWayOfGivingEnum"/>
 *         &lt;element name="WayOfGivingOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseGiftRule", propOrder = {
    "startDate",
    "endDate",
    "dateType",
    "weekSet",
    "giftContent",
    "giftTypes",
    "hourNumber",
    "hourType",
    "wayOfGiving",
    "wayOfGivingOther"
})
@XmlSeeAlso({
    GiftForRP.class,
    Gift.class
})
public class BaseGiftRule
    extends BaseRule
{

    @JSONField(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date startDate;
    @JSONField(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date endDate;
    @JSONField(name = "DateType")
    @XmlSchemaType(name = "string")
    protected HotelGiftDateTypeEnum dateType;
    @JSONField(name = "WeekSet")
    protected String weekSet;
    @JSONField(name = "GiftContent")
    protected String giftContent;
    @JSONField(name = "GiftTypes")
    protected String giftTypes;
    @JSONField(name = "HourNumber")
    protected int hourNumber;
    @JSONField(name = "HourType")
    @XmlSchemaType(name = "string")
    protected HotelGiftHourTypeEnum hourType;
    @JSONField(name = "WayOfGiving")
    @XmlSchemaType(name = "string")
    protected HotelGiftWayOfGivingEnum wayOfGiving;
    @JSONField(name = "WayOfGivingOther")
    protected String wayOfGivingOther;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setStartDate(java.util.Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEndDate(java.util.Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftDateTypeEnum }
     *     
     */
    public HotelGiftDateTypeEnum getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftDateTypeEnum }
     *     
     */
    public void setDateType(HotelGiftDateTypeEnum value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the weekSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekSet() {
        return weekSet;
    }

    /**
     * Sets the value of the weekSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekSet(String value) {
        this.weekSet = value;
    }

    /**
     * Gets the value of the giftContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftContent() {
        return giftContent;
    }

    /**
     * Sets the value of the giftContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftContent(String value) {
        this.giftContent = value;
    }

    /**
     * Gets the value of the giftTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftTypes() {
        return giftTypes;
    }

    /**
     * Sets the value of the giftTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftTypes(String value) {
        this.giftTypes = value;
    }

    /**
     * Gets the value of the hourNumber property.
     * 
     */
    public int getHourNumber() {
        return hourNumber;
    }

    /**
     * Sets the value of the hourNumber property.
     * 
     */
    public void setHourNumber(int value) {
        this.hourNumber = value;
    }

    /**
     * Gets the value of the hourType property.
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftHourTypeEnum }
     *     
     */
    public HotelGiftHourTypeEnum getHourType() {
        return hourType;
    }

    /**
     * Sets the value of the hourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftHourTypeEnum }
     *     
     */
    public void setHourType(HotelGiftHourTypeEnum value) {
        this.hourType = value;
    }

    /**
     * Gets the value of the wayOfGiving property.
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftWayOfGivingEnum }
     *     
     */
    public HotelGiftWayOfGivingEnum getWayOfGiving() {
        return wayOfGiving;
    }

    /**
     * Sets the value of the wayOfGiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftWayOfGivingEnum }
     *     
     */
    public void setWayOfGiving(HotelGiftWayOfGivingEnum value) {
        this.wayOfGiving = value;
    }

    /**
     * Gets the value of the wayOfGivingOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayOfGivingOther() {
        return wayOfGivingOther;
    }

    /**
     * Sets the value of the wayOfGivingOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayOfGivingOther(String value) {
        this.wayOfGivingOther = value;
    }

}
