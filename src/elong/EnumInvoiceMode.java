//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumInvoiceMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumInvoiceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSense"/>
 *     &lt;enumeration value="Elong"/>
 *     &lt;enumeration value="Hotel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumInvoiceMode")
@XmlEnum
public enum EnumInvoiceMode {

    @XmlEnumValue("NoSense")
    NoSense("NoSense"),
    @XmlEnumValue("Elong")
    Elong("Elong"),
    @XmlEnumValue("Hotel")
    Hotel("Hotel");
    private final String value;

    EnumInvoiceMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumInvoiceMode fromValue(String v) {
        for (EnumInvoiceMode c: EnumInvoiceMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
