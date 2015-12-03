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
 * <p>Java class for HotelFacilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelFacilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecreationAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelFacilities", propOrder = {
    "generalAmenities",
    "recreationAmenities",
    "serviceAmenities"
})
public class HotelFacilities {

    @JSONField(name = "GeneralAmenities")
    protected String generalAmenities;
    @JSONField(name = "RecreationAmenities")
    protected String recreationAmenities;
    @JSONField(name = "ServiceAmenities")
    protected String serviceAmenities;

    /**
     * Gets the value of the generalAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralAmenities() {
        return generalAmenities;
    }

    /**
     * Sets the value of the generalAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralAmenities(String value) {
        this.generalAmenities = value;
    }

    /**
     * Gets the value of the recreationAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecreationAmenities() {
        return recreationAmenities;
    }

    /**
     * Sets the value of the recreationAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecreationAmenities(String value) {
        this.recreationAmenities = value;
    }

    /**
     * Gets the value of the serviceAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAmenities() {
        return serviceAmenities;
    }

    /**
     * Sets the value of the serviceAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAmenities(String value) {
        this.serviceAmenities = value;
    }

}
