//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}affiliations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}orcid-works" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-list" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "affiliations", "orcidWorks", "fundings" })
@XmlRootElement(name = "orcid-activities")
public class OrcidActivities implements Serializable {

    private final static long serialVersionUID = 1L;
    protected Affiliations affiliations;    
    @XmlElement(name = "orcid-works")
    protected OrcidWorks orcidWorks;
    @XmlElement(name = "funding-list")
    protected FundingList fundings;

    /**
     * Gets the value of the affiliations property.
     * 
     * @return possible object is {@link Affiliations }
     * 
     */
    public Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *            allowed object is {@link Affiliations }
     * 
     */
    public void setAffiliations(Affiliations value) {
        this.affiliations = value;
    }    

	/**
     * Gets the value of the orcidWorks property.
     * 
     * @return possible object is {@link OrcidWorks }
     * 
     */
    public OrcidWorks getOrcidWorks() {
        return orcidWorks;
    }

    /**
     * Sets the value of the orcidWorks property.
     * 
     * @param value
     *            allowed object is {@link OrcidWorks }
     * 
     */
    public void setOrcidWorks(OrcidWorks value) {
        this.orcidWorks = value;
    }

    /**
     * Gets the value of the FundingList property.
     * 
     * @return possible object is {@link FundingList }
     * 
     */
    public FundingList getFundings() {
        return fundings;
    }

    /**
     * Sets the value of the FundingList property.
     * 
     * @param value
     *            allowed object is {@link FundingList }
     * 
     */
    public void setFundings(FundingList value) {
        this.fundings = value;
    }


    public void downgradeToWorksOnly() {
        setAffiliations(null);
        setFundings(null);
    }
    
    public void downgradeToAffiliationsOnly() {
        setOrcidWorks(null);
        setFundings(null);
    }
    
    public void downgradeToFundingsOnly() {
        setOrcidWorks(null);        
        setAffiliations(null);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((affiliations == null) ? 0 : affiliations.hashCode());
        result = prime * result + ((fundings == null) ? 0 : fundings.hashCode());
        result = prime * result + ((orcidWorks == null) ? 0 : orcidWorks.hashCode());
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
        OrcidActivities other = (OrcidActivities) obj;
        // affiliations 
        if (affiliations == null && other.affiliations != null) return false;
        if (affiliations != null && other.affiliations == null) return false;
        if (!affiliations.equals(other.affiliations)) return false;
        
        // funding
        if (fundings == null && other.fundings != null) return false;
        if (fundings != null && other.fundings == null) return false;
        if (!fundings.equals(other.fundings)) return false;
        
        // works
        if (orcidWorks == null && other.orcidWorks != null) return false;
        if (orcidWorks != null && other.orcidWorks == null) return false;
        if (!orcidWorks.equals(other.orcidWorks)) return false;

        return true;
    }

}
