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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Hotels" type="{}ArrayOfHotel" minOccurs="0"/>
 *         &lt;element name="ExchangeRateList" type="{}ArrayOfExchangeRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelList", propOrder = {
    "count",
    "hotels",
    "exchangeRateList"
})
public class HotelList {

    @JSONField(name = "Count")
    protected int count;
    @JSONField(name = "Hotels")
    protected List<Hotel> hotels;
    @JSONField(name = "ExchangeRateList")
    protected List<ExchangeRate> exchangeRateList;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the hotels property.
     * 
     * @return
     *     possible object is
     *     {@link List<Hotel> }
     *     
     */
    public List<Hotel> getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Hotel> }
     *     
     */
    public void setHotels(List<Hotel> value) {
        this.hotels = value;
    }

    /**
     * Gets the value of the exchangeRateList property.
     * 
     * @return
     *     possible object is
     *     {@link List<ExchangeRate> }
     *     
     */
    public List<ExchangeRate> getExchangeRateList() {
        return exchangeRateList;
    }

    /**
     * Sets the value of the exchangeRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<ExchangeRate> }
     *     
     */
    public void setExchangeRateList(List<ExchangeRate> value) {
        this.exchangeRateList = value;
    }

}
