//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 02:42:20 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumOrderContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumOrderContactType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoNeed"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="Proxy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumOrderContactType")
@XmlEnum
public enum EnumOrderContactType {

    @XmlEnumValue("NoNeed")
    NoNeed("NoNeed"),
    @XmlEnumValue("Customer")
    Customer("Customer"),
    @XmlEnumValue("Proxy")
    Proxy("Proxy");
    private final String value;

    EnumOrderContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumOrderContactType fromValue(String v) {
        for (EnumOrderContactType c: EnumOrderContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
