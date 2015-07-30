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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelBaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StarRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstablishmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RenovationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEconomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsApartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoogleLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoogleLon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaiduLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaiduLon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessZone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Landmarks" type="{}ArrayOfHotelLandMark" minOccurs="0"/>
 *         &lt;element name="CreditCards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntroEditor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportPickUpService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneralAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecreationAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConferenceAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiningAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrivingGuide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surroundings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suppliers" type="{}ArrayOfSupplier" minOccurs="0"/>
 *         &lt;element name="ServiceRank" type="{}ServiceRank" minOccurs="0"/>
 *         &lt;element name="HasCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FacilitiesV2" type="{}HotelFacilities" minOccurs="0"/>
 *         &lt;element name="Themes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsChineseOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMerchantHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelBaseInfo", propOrder = {
    "name",
    "address",
    "postalCode",
    "starRate",
    "category",
    "phone",
    "fax",
    "establishmentDate",
    "renovationDate",
    "groupId",
    "brandId",
    "isEconomic",
    "isApartment",
    "googleLat",
    "googleLon",
    "baiduLat",
    "baiduLon",
    "cityId",
    "cityId2",
    "businessZone",
    "businessZone2",
    "district",
    "landmarks",
    "creditCards",
    "introEditor",
    "description",
    "airportPickUpService",
    "generalAmenities",
    "roomAmenities",
    "recreationAmenities",
    "conferenceAmenities",
    "diningAmenities",
    "traffic",
    "drivingGuide",
    "features",
    "surroundings",
    "facilities",
    "suppliers",
    "serviceRank",
    "hasCoupon",
    "facilitiesV2",
    "themes",
    "roomTotalAmount",
    "isChineseOnly",
    "isMerchantHotel"
})
public class HotelBaseInfo {

    @JSONField(name = "Name")
    protected String name;
    @JSONField(name = "Address")
    protected String address;
    @JSONField(name = "PostalCode")
    protected String postalCode;
    @JSONField(name = "StarRate")
    protected String starRate;
    @JSONField(name = "Category")
    protected String category;
    @JSONField(name = "Phone")
    protected String phone;
    @JSONField(name = "Fax")
    protected String fax;
    @JSONField(name = "EstablishmentDate")
    protected String establishmentDate;
    @JSONField(name = "RenovationDate")
    protected String renovationDate;
    @JSONField(name = "GroupId")
    protected String groupId;
    @JSONField(name = "BrandId")
    protected String brandId;
    @JSONField(name = "IsEconomic")
    protected String isEconomic;
    @JSONField(name = "IsApartment")
    protected String isApartment;
    @JSONField(name = "GoogleLat")
    protected String googleLat;
    @JSONField(name = "GoogleLon")
    protected String googleLon;
    @JSONField(name = "BaiduLat")
    protected String baiduLat;
    @JSONField(name = "BaiduLon")
    protected String baiduLon;
    @JSONField(name = "CityId")
    protected String cityId;
    @JSONField(name = "CityId2")
    protected String cityId2;
    @JSONField(name = "BusinessZone")
    protected String businessZone;
    @JSONField(name = "BusinessZone2")
    protected String businessZone2;
    @JSONField(name = "District")
    protected String district;
    @JSONField(name = "Landmarks")
    protected List<HotelLandMark> landmarks;
    @JSONField(name = "CreditCards")
    protected String creditCards;
    @JSONField(name = "IntroEditor")
    protected String introEditor;
    @JSONField(name = "Description")
    protected String description;
    @JSONField(name = "AirportPickUpService")
    protected String airportPickUpService;
    @JSONField(name = "GeneralAmenities")
    protected String generalAmenities;
    @JSONField(name = "RoomAmenities")
    protected String roomAmenities;
    @JSONField(name = "RecreationAmenities")
    protected String recreationAmenities;
    @JSONField(name = "ConferenceAmenities")
    protected String conferenceAmenities;
    @JSONField(name = "DiningAmenities")
    protected String diningAmenities;
    @JSONField(name = "Traffic")
    protected String traffic;
    @JSONField(name = "DrivingGuide")
    protected String drivingGuide;
    @JSONField(name = "Features")
    protected String features;
    @JSONField(name = "Surroundings")
    protected String surroundings;
    @JSONField(name = "Facilities")
    protected String facilities;
    @JSONField(name = "Suppliers")
    protected List<Supplier> suppliers;
    @JSONField(name = "ServiceRank")
    protected ServiceRank serviceRank;
    @JSONField(name = "HasCoupon")
    protected boolean hasCoupon;
    @JSONField(name = "FacilitiesV2")
    protected HotelFacilities facilitiesV2;
    @JSONField(name = "Themes")
    protected String themes;
    @JSONField(name = "RoomTotalAmount")
    protected String roomTotalAmount;
    @JSONField(name = "IsChineseOnly")
    protected String isChineseOnly;
    @JSONField(name = "IsMerchantHotel")
    protected String isMerchantHotel;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the starRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarRate() {
        return starRate;
    }

    /**
     * Sets the value of the starRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarRate(String value) {
        this.starRate = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the establishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * Sets the value of the establishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentDate(String value) {
        this.establishmentDate = value;
    }

    /**
     * Gets the value of the renovationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenovationDate() {
        return renovationDate;
    }

    /**
     * Sets the value of the renovationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenovationDate(String value) {
        this.renovationDate = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the isEconomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEconomic() {
        return isEconomic;
    }

    /**
     * Sets the value of the isEconomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEconomic(String value) {
        this.isEconomic = value;
    }

    /**
     * Gets the value of the isApartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsApartment() {
        return isApartment;
    }

    /**
     * Sets the value of the isApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsApartment(String value) {
        this.isApartment = value;
    }

    /**
     * Gets the value of the googleLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleLat() {
        return googleLat;
    }

    /**
     * Sets the value of the googleLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleLat(String value) {
        this.googleLat = value;
    }

    /**
     * Gets the value of the googleLon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleLon() {
        return googleLon;
    }

    /**
     * Sets the value of the googleLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleLon(String value) {
        this.googleLon = value;
    }

    /**
     * Gets the value of the baiduLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaiduLat() {
        return baiduLat;
    }

    /**
     * Sets the value of the baiduLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaiduLat(String value) {
        this.baiduLat = value;
    }

    /**
     * Gets the value of the baiduLon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaiduLon() {
        return baiduLon;
    }

    /**
     * Sets the value of the baiduLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaiduLon(String value) {
        this.baiduLon = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the cityId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId2() {
        return cityId2;
    }

    /**
     * Sets the value of the cityId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId2(String value) {
        this.cityId2 = value;
    }

    /**
     * Gets the value of the businessZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessZone() {
        return businessZone;
    }

    /**
     * Sets the value of the businessZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessZone(String value) {
        this.businessZone = value;
    }

    /**
     * Gets the value of the businessZone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessZone2() {
        return businessZone2;
    }

    /**
     * Sets the value of the businessZone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessZone2(String value) {
        this.businessZone2 = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the landmarks property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelLandMark> }
     *     
     */
    public List<HotelLandMark> getLandmarks() {
        return landmarks;
    }

    /**
     * Sets the value of the landmarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelLandMark> }
     *     
     */
    public void setLandmarks(List<HotelLandMark> value) {
        this.landmarks = value;
    }

    /**
     * Gets the value of the creditCards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCards() {
        return creditCards;
    }

    /**
     * Sets the value of the creditCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCards(String value) {
        this.creditCards = value;
    }

    /**
     * Gets the value of the introEditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroEditor() {
        return introEditor;
    }

    /**
     * Sets the value of the introEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroEditor(String value) {
        this.introEditor = value;
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
     * Gets the value of the airportPickUpService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportPickUpService() {
        return airportPickUpService;
    }

    /**
     * Sets the value of the airportPickUpService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportPickUpService(String value) {
        this.airportPickUpService = value;
    }

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
     * Gets the value of the roomAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenities() {
        return roomAmenities;
    }

    /**
     * Sets the value of the roomAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenities(String value) {
        this.roomAmenities = value;
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
     * Gets the value of the conferenceAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceAmenities() {
        return conferenceAmenities;
    }

    /**
     * Sets the value of the conferenceAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceAmenities(String value) {
        this.conferenceAmenities = value;
    }

    /**
     * Gets the value of the diningAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiningAmenities() {
        return diningAmenities;
    }

    /**
     * Sets the value of the diningAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiningAmenities(String value) {
        this.diningAmenities = value;
    }

    /**
     * Gets the value of the traffic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraffic() {
        return traffic;
    }

    /**
     * Sets the value of the traffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraffic(String value) {
        this.traffic = value;
    }

    /**
     * Gets the value of the drivingGuide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingGuide() {
        return drivingGuide;
    }

    /**
     * Sets the value of the drivingGuide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingGuide(String value) {
        this.drivingGuide = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatures(String value) {
        this.features = value;
    }

    /**
     * Gets the value of the surroundings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurroundings() {
        return surroundings;
    }

    /**
     * Sets the value of the surroundings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurroundings(String value) {
        this.surroundings = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilities(String value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link List<Supplier> }
     *     
     */
    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Supplier> }
     *     
     */
    public void setSuppliers(List<Supplier> value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the serviceRank property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRank }
     *     
     */
    public ServiceRank getServiceRank() {
        return serviceRank;
    }

    /**
     * Sets the value of the serviceRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRank }
     *     
     */
    public void setServiceRank(ServiceRank value) {
        this.serviceRank = value;
    }

    /**
     * Gets the value of the hasCoupon property.
     * 
     */
    public boolean isHasCoupon() {
        return hasCoupon;
    }

    /**
     * Sets the value of the hasCoupon property.
     * 
     */
    public void setHasCoupon(boolean value) {
        this.hasCoupon = value;
    }

    /**
     * Gets the value of the facilitiesV2 property.
     * 
     * @return
     *     possible object is
     *     {@link HotelFacilities }
     *     
     */
    public HotelFacilities getFacilitiesV2() {
        return facilitiesV2;
    }

    /**
     * Sets the value of the facilitiesV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelFacilities }
     *     
     */
    public void setFacilitiesV2(HotelFacilities value) {
        this.facilitiesV2 = value;
    }

    /**
     * Gets the value of the themes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThemes() {
        return themes;
    }

    /**
     * Sets the value of the themes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThemes(String value) {
        this.themes = value;
    }

    /**
     * Gets the value of the roomTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTotalAmount() {
        return roomTotalAmount;
    }

    /**
     * Sets the value of the roomTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTotalAmount(String value) {
        this.roomTotalAmount = value;
    }

    /**
     * Gets the value of the isChineseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsChineseOnly() {
        return isChineseOnly;
    }

    /**
     * Sets the value of the isChineseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsChineseOnly(String value) {
        this.isChineseOnly = value;
    }

    /**
     * Gets the value of the isMerchantHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMerchantHotel() {
        return isMerchantHotel;
    }

    /**
     * Sets the value of the isMerchantHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMerchantHotel(String value) {
        this.isMerchantHotel = value;
    }

}
