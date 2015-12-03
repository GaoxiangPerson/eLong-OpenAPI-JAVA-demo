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
 * <p>Java class for SupplierRatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierRatePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeekendStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WeekendEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingRules" type="{}ArrayOfBaseBookingRule" minOccurs="0"/>
 *         &lt;element name="Rooms" type="{}ArrayOfMSRoomRelation" minOccurs="0"/>
 *         &lt;element name="InvoiceMode" type="{}EnumInvoiceMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierRatePlan", propOrder = {
    "hotelCode",
    "weekendStart",
    "weekendEnd",
    "bookingRules",
    "rooms",
    "invoiceMode"
})
public class SupplierRatePlan {

    @JSONField(name = "HotelCode")
    protected String hotelCode;
    @JSONField(name = "WeekendStart")
    protected int weekendStart;
    @JSONField(name = "WeekendEnd")
    protected int weekendEnd;
    @JSONField(name = "BookingRules")
    protected List<BaseBookingRule> bookingRules;
    @JSONField(name = "Rooms")
    protected List<MSRoomRelation> rooms;
    @JSONField(name = "InvoiceMode")
    @XmlSchemaType(name = "string")
    protected EnumInvoiceMode invoiceMode;

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
     * Gets the value of the weekendStart property.
     * 
     */
    public int getWeekendStart() {
        return weekendStart;
    }

    /**
     * Sets the value of the weekendStart property.
     * 
     */
    public void setWeekendStart(int value) {
        this.weekendStart = value;
    }

    /**
     * Gets the value of the weekendEnd property.
     * 
     */
    public int getWeekendEnd() {
        return weekendEnd;
    }

    /**
     * Sets the value of the weekendEnd property.
     * 
     */
    public void setWeekendEnd(int value) {
        this.weekendEnd = value;
    }

    /**
     * Gets the value of the bookingRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<BaseBookingRule> }
     *     
     */
    public List<BaseBookingRule> getBookingRules() {
        return bookingRules;
    }

    /**
     * Sets the value of the bookingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BaseBookingRule> }
     *     
     */
    public void setBookingRules(List<BaseBookingRule> value) {
        this.bookingRules = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link List<MSRoomRelation> }
     *     
     */
    public List<MSRoomRelation> getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<MSRoomRelation> }
     *     
     */
    public void setRooms(List<MSRoomRelation> value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the invoiceMode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumInvoiceMode }
     *     
     */
    public EnumInvoiceMode getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * Sets the value of the invoiceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumInvoiceMode }
     *     
     */
    public void setInvoiceMode(EnumInvoiceMode value) {
        this.invoiceMode = value;
    }

}
