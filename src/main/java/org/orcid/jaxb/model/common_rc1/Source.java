//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.common_rc1;

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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "sourceOrcid", "sourceClientId", "sourceName" })
@XmlRootElement(name = "source", namespace = "http://www.orcid.org/ns/common")
public class Source implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlElement(name="source-orcid", namespace = "http://www.orcid.org/ns/common")
    protected SourceOrcid sourceOrcid;
    @XmlElement(name="source-client-id", namespace="http://www.orcid.org/ns/common")
    protected SourceClientId sourceClientId;
    @XmlElement(name="source-name", namespace="http://www.orcid.org/ns/common")
    protected SourceName sourceName;

    public Source() {
    }

    public Source(String amenderOrcidPath) {
        SourceOrcid so = new SourceOrcid();
        so.setPath(amenderOrcidPath);
        this.sourceOrcid = so;
    }

    /**
     * Only use this method if you really need to tell the difference between a
     * source ORCID and a source client ID. Use {@link #retrieveSourcePath()}
     * instead.
     *
     * @return possible object is {@link SourceOrcid }
     * 
     */
    @Deprecated
    public SourceOrcid getSourceOrcid() {
        return sourceOrcid;
    }

    /**
     * Sets the value of the sourceOrcid property.
     * 
     * @param value
     *            allowed object is {@link SourceOrcid }
     * 
     */
    public void setSourceOrcid(SourceOrcid value) {
        this.sourceOrcid = value;
    }

    /**
     * Only use this method if you really need to tell the difference between a
     * source ORCID and a source client ID. Use {@link #retrieveSourcePath()}
     * instead.
     * 
     * @return the SourceClientId
     * 
     **/
    @Deprecated
    public SourceClientId getSourceClientId() {
        return sourceClientId;
    }

    public void setSourceClientId(SourceClientId sourceClientId) {
        this.sourceClientId = sourceClientId;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return possible object is {@link SourceName }
     * 
     */
    public SourceName getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *            allowed object is {@link SourceName }
     * 
     */
    public void setSourceName(SourceName value) {
        this.sourceName = value;
    }

    public String retrieveSourcePath() {
        if (sourceClientId != null) {
            return sourceClientId.getPath();
        }
        if (sourceOrcid != null) {
            return sourceOrcid.getPath();
        }
        return null;
    }
    
    public String retriveSourceUri() {
        if (sourceClientId != null) {
            return sourceClientId.getUri();
        }
        if (sourceOrcid != null) {
            return sourceOrcid.getUri();
        }
        return null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sourceClientId == null) ? 0 : sourceClientId.hashCode());
        result = prime * result + ((sourceOrcid == null) ? 0 : sourceOrcid.hashCode());
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
        Source other = (Source) obj;
        if (sourceClientId == null) {
            if (other.sourceClientId != null)
                return false;
        } else if (!sourceClientId.equals(other.sourceClientId))
            return false;
        if (sourceOrcid == null) {
            if (other.sourceOrcid != null)
                return false;
        } else if (!sourceOrcid.equals(other.sourceOrcid))
            return false;
        return true;
    }

}
