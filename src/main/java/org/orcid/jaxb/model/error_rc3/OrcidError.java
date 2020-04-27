//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.09 at 01:28:54 PM GMT 
//


package org.orcid.jaxb.model.error_rc3;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.record.bulk.BulkElement;


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
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="developerMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="moreInfo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseCode",
    "developerMessage",
    "userMessage",
    "errorCode",
    "moreInfo"
})
@XmlRootElement(name = "error", namespace = "http://www.orcid.org/ns/error")
public class OrcidError implements Serializable, BulkElement {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "response-code", namespace = "http://www.orcid.org/ns/error")
    protected int responseCode;
    @XmlElement(required = true, name = "developer-message", namespace = "http://www.orcid.org/ns/error")
    protected String developerMessage;
    @XmlElement(name = "user-message", namespace = "http://www.orcid.org/ns/error")
    protected String userMessage;
    @XmlElement(name = "error-code", namespace = "http://www.orcid.org/ns/error")
    protected Integer errorCode;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = "more-info", namespace = "http://www.orcid.org/ns/error")
    protected String moreInfo;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return the response code
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }


	/**
	 * Sets the valud of the responseCode property.
	 * 
	 * @param value - the responseCode
	 */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the developerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperMessage() {
        return developerMessage;
    }

    /**
     * Sets the value of the developerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperMessage(String value) {
        this.developerMessage = value;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * Sets the value of the userMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessage(String value) {
        this.userMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the moreInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * Sets the value of the moreInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreInfo(String value) {
        this.moreInfo = value;
    }

}
