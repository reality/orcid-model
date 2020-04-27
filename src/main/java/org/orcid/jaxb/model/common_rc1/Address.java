//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.common_rc1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.record_rc1.City;
import org.orcid.jaxb.model.record_rc1.Region;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "city", "region", "country" })
@XmlRootElement(name = "address")
public class Address implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected City city;
    @XmlElement(name = "region")
    protected Region region;
    @XmlElement(required = true)
    protected Country country;

    /**
     * Gets the value of the affiliationCity property.
     * 
     * @return possible object is {@link City }
     * 
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the affiliationCity property.
     * 
     * @param value
     *            allowed object is {@link City }
     * 
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Gets the value of the affiliationRegion property.
     * 
     * @return possible object is {@link Region }
     * 
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the affiliationRegion property.
     * 
     * @param value
     *            allowed object is {@link Region }
     * 
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the affiliationCountry property.
     * 
     * @return possible object is {@link Country }
     * 
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the affiliationCountry property.
     * 
     * @param value - the Country
     * 
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((region == null) ? 0 : region.hashCode());
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
        Address other = (Address) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (region == null) {
            if (other.region != null)
                return false;
        } else if (!region.equals(other.region))
            return false;
        return true;
    }

}
