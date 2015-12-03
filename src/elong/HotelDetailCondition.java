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
import java.util.Date;


/**
 * <p>Java class for HotelDetailCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDetailCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HotelIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentType" type="{}EnumPaymentType"/>
 *         &lt;element name="CheckInPersonAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDetailCondition", propOrder = {
    "arrivalDate",
    "departureDate",
    "hotelIds",
    "roomTypeId",
    "ratePlanId",
    "paymentType",
    "checkInPersonAmount",
    "options"
})
public class HotelDetailCondition {

    @JSONField(name = "ArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date arrivalDate;
    @JSONField(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date departureDate;
    @JSONField(name = "HotelIds")
    protected String hotelIds;
    @JSONField(name = "RoomTypeId")
    protected String roomTypeId;
    @JSONField(name = "RatePlanId")
    protected int ratePlanId;
    @JSONField(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected EnumPaymentType paymentType;
    @JSONField(name = "CheckInPersonAmount")
    protected int checkInPersonAmount;
    @JSONField(name = "Options")
    protected String options;

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setArrivalDate(java.util.Date value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setDepartureDate(java.util.Date value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the hotelIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelIds() {
        return hotelIds;
    }

    /**
     * Sets the value of the hotelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelIds(String value) {
        this.hotelIds = value;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the ratePlanId property.
     * 
     */
    public int getRatePlanId() {
        return ratePlanId;
    }

    /**
     * Sets the value of the ratePlanId property.
     * 
     */
    public void setRatePlanId(int value) {
        this.ratePlanId = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPaymentType }
     *     
     */
    public EnumPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPaymentType }
     *     
     */
    public void setPaymentType(EnumPaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the checkInPersonAmount property.
     * 
     */
    public int getCheckInPersonAmount() {
        return checkInPersonAmount;
    }

    /**
     * Sets the value of the checkInPersonAmount property.
     * 
     */
    public void setCheckInPersonAmount(int value) {
        this.checkInPersonAmount = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

}
