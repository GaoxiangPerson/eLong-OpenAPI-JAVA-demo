//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelGift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelGift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedProducts" type="{}ArrayOfHotelGiftProductRelation" minOccurs="0"/>
 *         &lt;element name="EffectiveDates" type="{}ArrayOfHotelGiftDate" minOccurs="0"/>
 *         &lt;element name="DateType" type="{}HotelGiftDateTypeEnum"/>
 *         &lt;element name="WeekSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftContentEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HourNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HourType" type="{}HotelGiftHourTypeEnum"/>
 *         &lt;element name="WayOfGiving" type="{}HotelGiftWayOfGivingEnum"/>
 *         &lt;element name="WayOfGivingOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WayOfGivingOtherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGift", propOrder = {
    "hotelGiftId",
    "hotelCode",
    "relatedProducts",
    "effectiveDates",
    "dateType",
    "weekSet",
    "giftContent",
    "giftContentEn",
    "giftTypes",
    "hourNumber",
    "hourType",
    "wayOfGiving",
    "wayOfGivingOther",
    "wayOfGivingOtherEn"
})
public class HotelGift {

    @JSONField(name = "HotelGiftId")
    protected int hotelGiftId;
    @JSONField(name = "HotelCode")
    protected String hotelCode;
    @JSONField(name = "RelatedProducts")
    protected List<HotelGiftProductRelation> relatedProducts;
    @JSONField(name = "EffectiveDates")
    protected List<HotelGiftDate> effectiveDates;
    @JSONField(name = "DateType")
    @XmlSchemaType(name = "string")
    protected HotelGiftDateTypeEnum dateType;
    @JSONField(name = "WeekSet")
    protected String weekSet;
    @JSONField(name = "GiftContent")
    protected String giftContent;
    @JSONField(name = "GiftContentEn")
    protected String giftContentEn;
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
    @JSONField(name = "WayOfGivingOtherEn")
    protected String wayOfGivingOtherEn;

    /**
     * Gets the value of the hotelGiftId property.
     * 
     */
    public int getHotelGiftId() {
        return hotelGiftId;
    }

    /**
     * Sets the value of the hotelGiftId property.
     * 
     */
    public void setHotelGiftId(int value) {
        this.hotelGiftId = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the relatedProducts property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelGiftProductRelation> }
     *     
     */
    public List<HotelGiftProductRelation> getRelatedProducts() {
        return relatedProducts;
    }

    /**
     * Sets the value of the relatedProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelGiftProductRelation> }
     *     
     */
    public void setRelatedProducts(List<HotelGiftProductRelation> value) {
        this.relatedProducts = value;
    }

    /**
     * Gets the value of the effectiveDates property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelGiftDate> }
     *     
     */
    public List<HotelGiftDate> getEffectiveDates() {
        return effectiveDates;
    }

    /**
     * Sets the value of the effectiveDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelGiftDate> }
     *     
     */
    public void setEffectiveDates(List<HotelGiftDate> value) {
        this.effectiveDates = value;
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
     * Gets the value of the giftContentEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftContentEn() {
        return giftContentEn;
    }

    /**
     * Sets the value of the giftContentEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftContentEn(String value) {
        this.giftContentEn = value;
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

    /**
     * Gets the value of the wayOfGivingOtherEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayOfGivingOtherEn() {
        return wayOfGivingOtherEn;
    }

    /**
     * Sets the value of the wayOfGivingOtherEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayOfGivingOtherEn(String value) {
        this.wayOfGivingOtherEn = value;
    }

}
