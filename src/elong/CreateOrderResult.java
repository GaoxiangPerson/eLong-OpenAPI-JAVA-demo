//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.11 at 05:39:08 PM CST 
//


package elong;

import java.math.BigDecimal;
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
 * <p>Java class for CreateOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="IsInstantConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaymentDeadlineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderResult", propOrder = {
    "orderId",
    "cancelTime",
    "guaranteeAmount",
    "currencyCode",
    "isInstantConfirm",
    "paymentDeadlineTime",
    "paymentMessage"
})
@XmlSeeAlso({
    UpdateOrderResult.class
})
public class CreateOrderResult {

    @JSONField(name = "OrderId")
    protected long orderId;
    @JSONField(name = "CancelTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date cancelTime;
    @JSONField(name = "GuaranteeAmount")
    protected BigDecimal guaranteeAmount;
    @JSONField(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode currencyCode;
    @JSONField(name = "IsInstantConfirm")
    protected Boolean isInstantConfirm;
    @JSONField(name = "PaymentDeadlineTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date paymentDeadlineTime;
    @JSONField(name = "PaymentMessage")
    protected String paymentMessage;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the cancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getCancelTime() {
        return cancelTime;
    }

    /**
     * Sets the value of the cancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setCancelTime(java.util.Date value) {
        this.cancelTime = value;
    }

    /**
     * Gets the value of the guaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Sets the value of the guaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuaranteeAmount(BigDecimal value) {
        this.guaranteeAmount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public EnumCurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public void setCurrencyCode(EnumCurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the isInstantConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInstantConfirm() {
        return isInstantConfirm;
    }

    /**
     * Sets the value of the isInstantConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInstantConfirm(Boolean value) {
        this.isInstantConfirm = value;
    }

    /**
     * Gets the value of the paymentDeadlineTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getPaymentDeadlineTime() {
        return paymentDeadlineTime;
    }

    /**
     * Sets the value of the paymentDeadlineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setPaymentDeadlineTime(java.util.Date value) {
        this.paymentDeadlineTime = value;
    }

    /**
     * Gets the value of the paymentMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMessage() {
        return paymentMessage;
    }

    /**
     * Sets the value of the paymentMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMessage(String value) {
        this.paymentMessage = value;
    }

}
