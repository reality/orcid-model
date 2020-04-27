//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.record_rc3;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.orcid.jaxb.model.common_rc3.Visibility;

/**
 * City
 * 
 * Java class for anonymous complex type.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "content" })
@XmlRootElement(name = "city")
public class City implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String content;
    @XmlAttribute(name = "visibility")
    protected Visibility visibility;

    public City() {
    }

    public City(String city) {
        this.content = city;
    }

    /**
     * City
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return possible object is {@link Visibility }
     * 
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *            allowed object is {@link Visibility }
     * 
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        City other = (City) obj;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;
        if (visibility != other.visibility)
            return false;
        return true;
    }

}
