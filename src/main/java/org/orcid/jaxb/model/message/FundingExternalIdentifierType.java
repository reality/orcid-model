//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * Java class for orcid-type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="orcid-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="grant-number"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "funding-external-identifier-type")
@XmlEnum
public enum FundingExternalIdentifierType implements Serializable {
    @XmlEnumValue("grant_number")
    GRANT_NUMBER("grant_number");
    private final String value;

    FundingExternalIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @JsonValue
    public String jsonValue() {
        return this.name();
    }
    
    public static FundingExternalIdentifierType fromValue(String v) {
        for (FundingExternalIdentifierType c : FundingExternalIdentifierType.values()) {
            if (c.value.equalsIgnoreCase((v))) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
