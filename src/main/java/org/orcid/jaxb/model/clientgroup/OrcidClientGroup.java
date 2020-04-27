//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 12:45:00 PM BST 
//

package org.orcid.jaxb.model.clientgroup;

import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class OrcidClientGroup implements Serializable {

    private final static long serialVersionUID = 1L;
    protected MemberType type;
    protected String groupOrcid;
    protected String groupName;
    protected String email;
    protected List<OrcidClient> orcidClient;
    protected String salesforceId;

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link MemberType }
     * 
     */
    public MemberType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param type
     *            allowed object is {@link MemberType }
     * 
     */
    public void setType(MemberType type) {
        this.type = type;
    }

    /**
     * Gets the value of the groupOrcid property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGroupOrcid() {
        return groupOrcid;
    }

    /**
     * Sets the value of the groupOrcid property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setGroupOrcid(String value) {
        this.groupOrcid = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the salesforceId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSalesforceId() {
        return salesforceId;
    }

    /**
     * Sets the value of the salesforceId property.
     * 
     * @param salesforceId
     *            allowed object is {@link String }
     * 
     */
    public void setSalesforceId(String salesforceId) {
        this.salesforceId = salesforceId;
    }

    /**
     * Gets the value of the orcidClient property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the orcidClient property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOrcidClient().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link OrcidClient }
     * 
     * @return a List of OrcidClient objects
     * 
     */
    public List<OrcidClient> getOrcidClient() {
        if (orcidClient == null) {
            orcidClient = new ArrayList<OrcidClient>();
        }
        return this.orcidClient;
    }

    @Override
    public String toString() {
        try {
            JAXBContext context = JAXBContext.newInstance(getClass());
            StringWriter writer = new StringWriter();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, writer);
            return writer.toString();
        } catch (JAXBException e) {
            return ("Unable to unmarshal because: " + e);
        }
    }

    public static OrcidClientGroup unmarshall(InputStream input) {
        try {
            JAXBContext context = JAXBContext.newInstance(OrcidClientGroup.class.getPackage().getName());
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (OrcidClientGroup) unmarshaller.unmarshal(input);
        } catch (JAXBException e) {
            // XXX Should be more specific exception
            throw new RuntimeException("Unable to unmarshall client group" + e);
        }
    }

}
