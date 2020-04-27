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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}scope-path" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "scopePath" })
@XmlRootElement(name = "scope-paths")
public class ScopePaths implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "scope-path", required = true)
    protected List<ScopePath> scopePath;

    public ScopePaths() {
    }

    public ScopePaths(List<ScopePath> scopePath) {
        this.scopePath = scopePath;
    }

    /**
     * Gets the value of the scopePath property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopePath property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopePath().add(newItem);
     * </pre>
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link ScopePath }
     * 
     * @return a List of ScopePath objects
     * 
     */
    public List<ScopePath> getScopePath() {
        if (scopePath == null) {
            scopePath = new ArrayList<ScopePath>();
        }
        return this.scopePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScopePaths)) {
            return false;
        }

        ScopePaths that = (ScopePaths) o;

        if (scopePath != null ? !scopePath.equals(that.scopePath) : that.scopePath != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return scopePath != null ? scopePath.hashCode() : 0;
    }
}
