//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 02:42:21 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for IncrInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncrInventory">
 *   &lt;complexContent>
 *     &lt;extension base="{}Inventory">
 *       &lt;attribute name="LastId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncrInventory")
public class IncrInventory
    extends Inventory
{

    @XmlAttribute(name = "LastId")
    protected long lastId;
    @XmlAttribute(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date time;

    /**
     * Gets the value of the lastId property.
     * 
     */
    public long getLastId() {
        return lastId;
    }

    /**
     * Sets the value of the lastId property.
     * 
     */
    public void setLastId(long value) {
        this.lastId = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setTime(java.util.Date value) {
        this.time = value;
    }

}
