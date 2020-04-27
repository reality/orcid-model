//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 11:03:27 AM BST 
//

package org.orcid.jaxb.model.record_rc1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "workExternalIdentifier" })
@XmlRootElement(name = "external-identifiers")
@JsonIgnoreProperties("scope")
public class WorkExternalIdentifiers implements Serializable, ExternalIdentifiersContainer {

    private static final long serialVersionUID = 1L;
   
    @XmlElement(name = "work-external-identifier", namespace = "http://www.orcid.org/ns/work")
    protected List<WorkExternalIdentifier> workExternalIdentifier;

    public WorkExternalIdentifiers() {

    }

    public WorkExternalIdentifiers(List<WorkExternalIdentifier> externalIdentifier) {
        this.workExternalIdentifier = externalIdentifier;
    }

    /**
     * Gets the value of the workExternalIdentifier property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the workExternalIdentifier property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWorkExternalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link WorkExternalIdentifier }
     * 
     * @return a List of WorkExternalIdentifier objects
     * 
     * 
     */
    public List<WorkExternalIdentifier> getWorkExternalIdentifier() {
        if (workExternalIdentifier == null) {
            workExternalIdentifier = new ArrayList<WorkExternalIdentifier>();
        }
        return this.workExternalIdentifier;
    }  
       
    @XmlTransient
    @JsonIgnore
    public List<WorkExternalIdentifier> getExternalIdentifier() {        
        return getWorkExternalIdentifier();
    }      

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkExternalIdentifiers)) {
            return false;
        }

        WorkExternalIdentifiers that = (WorkExternalIdentifiers) o;

        if (workExternalIdentifier == null) {
            if (that.workExternalIdentifier != null)
                return false;
        } else {
            if (that.workExternalIdentifier == null)
                return false;
            else if (!(workExternalIdentifier.containsAll(that.workExternalIdentifier) && that.workExternalIdentifier.containsAll(workExternalIdentifier) && 
                    that.workExternalIdentifier.size() == workExternalIdentifier.size())) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = workExternalIdentifier != null ? workExternalIdentifier.hashCode() : 0;
        return result;
    }
    
    public static WorkExternalIdentifiers valueOf(org.orcid.jaxb.model.message.WorkExternalIdentifiers messageWorkExternalIdentifiers) {
        WorkExternalIdentifiers result = new WorkExternalIdentifiers();
        
        if(messageWorkExternalIdentifiers != null && !messageWorkExternalIdentifiers.getWorkExternalIdentifier().isEmpty()) {
            for(org.orcid.jaxb.model.message.WorkExternalIdentifier messageExtId : messageWorkExternalIdentifiers.getWorkExternalIdentifier()) {
                WorkExternalIdentifier extId = new WorkExternalIdentifier();
                if(messageExtId.getWorkExternalIdentifierId() != null) {
                    extId.setWorkExternalIdentifierId(new WorkExternalIdentifierId(messageExtId.getWorkExternalIdentifierId().getContent()));
                }
                if(messageExtId.getWorkExternalIdentifierType() != null) {
                    extId.setWorkExternalIdentifierType(WorkExternalIdentifierType.fromValue(messageExtId.getWorkExternalIdentifierType().value()));
                }
                result.getExternalIdentifier().add(extId);
            }
        }
        
        return result;
    }
}
