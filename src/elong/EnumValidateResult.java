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
 * <p>Java class for EnumValidateResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumValidateResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="Rate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumValidateResult")
@XmlEnum
public enum EnumValidateResult {

    OK("OK"),
    @XmlEnumValue("Product")
    Product("Product"),
    @XmlEnumValue("Inventory")
    Inventory("Inventory"),
    @XmlEnumValue("Rate")
    Rate("Rate");
    private final String value;

    EnumValidateResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumValidateResult fromValue(String v) {
        for (EnumValidateResult c: EnumValidateResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
