//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}application-summary" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "applicationSummary" })
@XmlRootElement(name = "applications")
public class Applications implements VisibilityType, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "application-summary", required = true)
    protected List<ApplicationSummary> applicationSummary;
    @XmlAttribute
    protected Visibility visibility;

    /**
     * Gets the value of the applicationSummary property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSummary property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSummary().add(newItem);
     * </pre>
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationSummary }
     * 
     * @return a List of ApplicationSummary objects
     * 
     */
    public List<ApplicationSummary> getApplicationSummary() {
        if (applicationSummary == null) {
            applicationSummary = new ArrayList<ApplicationSummary>();
        }
        return this.applicationSummary;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Applications)) {
            return false;
        }

        Applications that = (Applications) o;

        if (applicationSummary != null ? !applicationSummary.equals(that.applicationSummary) : that.applicationSummary != null) {
            return false;
        }
        if (visibility != that.visibility) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = applicationSummary != null ? applicationSummary.hashCode() : 0;
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        return result;
    }
}
