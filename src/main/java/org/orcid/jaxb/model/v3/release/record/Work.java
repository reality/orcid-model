//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import io.swagger.annotations.ApiModelProperty;
import org.orcid.jaxb.model.common.LanguageCode;
import org.orcid.jaxb.model.common.WorkType;
import org.orcid.jaxb.model.common.adapters.LanguageCodeAdapter;
import org.orcid.jaxb.model.common.adapters.WorkTypeAdapter;
import org.orcid.jaxb.model.record.bulk.BulkElement;
import org.orcid.jaxb.model.record.util.RecordUtil;
import org.orcid.jaxb.model.v3.release.common.Country;
import org.orcid.jaxb.model.v3.release.common.CreatedDate;
import org.orcid.jaxb.model.v3.release.common.Filterable;
import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;
import org.orcid.jaxb.model.v3.release.common.PublicationDate;
import org.orcid.jaxb.model.v3.release.common.Source;
import org.orcid.jaxb.model.v3.release.common.Title;
import org.orcid.jaxb.model.v3.release.common.Url;
import org.orcid.jaxb.model.v3.release.common.Visibility;

import io.swagger.annotations.ApiModel;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "createdDate", "lastModifiedDate", "source", "putCode", "path", "title", "journalTitle", "shortDescription", "citation", "type", "publicationDate",
        "externalIdentifiers", "url", "contributors", "languageCode", "country" })
@XmlRootElement(name = "work", namespace = "http://www.orcid.org/ns/work")
@ApiModel(value = "WorkV3_0")
public class Work implements Filterable, Serializable, SourceAware, BulkElement, ExternalIdentifiersAwareActivity {
    private static final long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/work")
    protected WorkTitle title;
    @XmlElement(name = "journal-title", namespace = "http://www.orcid.org/ns/work")
    protected Title journalTitle;
    @XmlElement(name = "short-description", namespace = "http://www.orcid.org/ns/work")
    protected String shortDescription;
    @XmlElement(namespace = "http://www.orcid.org/ns/work")
    protected Citation citation;
    @XmlJavaTypeAdapter(WorkTypeAdapter.class)
    @XmlElement(namespace = "http://www.orcid.org/ns/work")
    @ApiModelProperty(dataType = "string", allowableValues = "annotation, artistic-performance, book-chapter, book-review, book, " +
            "conference-abstract, conference-paper, conference-poster, data-management-plan, data-set, dictionary-entry, disclosure, dissertation-thesis, " +
            "edited-book, encyclopedia-entry, invention, journal-article, journal-issue, lecture-speech, license, magazine-article, manual," +
            "newsletter-article, newspaper-article, online-resource, other, patent, physical-object, preprint, registered-copyright, report," +
            "research-technique, research-tool, software, spin-off-company, standards-and-policy, supervised-student-publication, technical-standard," +
            "test, trademark, translation, website, working-paper,review, undefined")
    protected WorkType type;
    @XmlElement(name = "publication-date", namespace = "http://www.orcid.org/ns/common")
    protected PublicationDate publicationDate;
    @XmlElement(name = "external-ids", namespace = "http://www.orcid.org/ns/common")
    protected ExternalIDs externalIdentifiers;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Url url;
    @XmlElement(namespace = "http://www.orcid.org/ns/work")
    protected WorkContributors contributors;
    @XmlJavaTypeAdapter(LanguageCodeAdapter.class)
    @XmlElement(name = "language-code", namespace = "http://www.orcid.org/ns/common")
    protected LanguageCode languageCode;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Country country;    
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Source source;
    @XmlAttribute(name = "put-code")
    protected Long putCode;
    @XmlAttribute
    @ApiModelProperty(dataType = "string", allowableValues = "limited, registered-only, public")
    protected Visibility visibility;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "created-date", namespace = "http://www.orcid.org/ns/common")
    protected CreatedDate createdDate;

    /**
     * Gets the value of the putCode property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Long getPutCode() {
        return putCode;
    }

    /**
     * Sets the value of the putCode property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setPutCode(Long value) {
        this.putCode = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param path
     *            allowed object is {@link Object }
     * 
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Gets the value of the workTitle property.
     * 
     * @return possible object is {@link WorkTitle }
     * 
     */
    public WorkTitle getWorkTitle() {
        return title;
    }

    /**
     * Sets the value of the workTitle property.
     * 
     * @param value
     *            allowed object is {@link WorkTitle }
     * 
     */
    public void setWorkTitle(WorkTitle value) {
        this.title = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the workCitation property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Citation getWorkCitation() {
        return citation;
    }

    /**
     * Sets the value of the workCitation property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setWorkCitation(Citation value) {
        this.citation = value;
    }

    /**
     * Gets the value of the workType property.
     * 
     * @return possible object is {@link WorkType }
     * 
     */
    public WorkType getWorkType() {
        return type;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *            allowed object is {@link WorkType }
     * 
     */
    public void setWorkType(WorkType value) {
        this.type = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return possible object is {@link PublicationDate }
     * 
     */
    public PublicationDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *            allowed object is {@link PublicationDate }
     * 
     */
    public void setPublicationDate(PublicationDate value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the workExternalIdentifiers property.
     * 
     * @return possible object is {@link ExternalIDs }
     * 
     */
    public ExternalIDs getWorkExternalIdentifiers() {
        return externalIdentifiers;
    }

    public ExternalIDs getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * Sets the value of the workExternalIdentifiers property.
     * 
     * @param value
     *            allowed object is {@link ExternalIDs }
     * 
     */
    public void setWorkExternalIdentifiers(ExternalIDs value) {
        this.externalIdentifiers = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return possible object is {@link Url }
     * 
     */
    public Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *            allowed object is {@link Url }
     * 
     */
    public void setUrl(Url value) {
        this.url = value;
    }

    /**
     * Gets the value of the workContributors property.
     * 
     * @return possible object is {@link WorkContributors }
     * 
     */
    public WorkContributors getWorkContributors() {
        return contributors;
    }

    /**
     * Sets the value of the workContributors property.
     * 
     * @param value
     *            allowed object is {@link WorkContributors }
     * 
     */
    public void setWorkContributors(WorkContributors value) {
        this.contributors = value;
    }

    /**
     * Gets the value of the workSources property.
     * 
     * @return possible object is {@link WorkSource }
     * 
     */

    @Override
    public String retrieveSourcePath() {
        if (source != null) {
            return source.retrieveSourcePath();
        }
        return null;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
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

    /**
     * Gets the value of the journalTitle property.
     * 
     * @return possible object is {@link Title }
     * 
     */
    public Title getJournalTitle() {
        return journalTitle;
    }

    /**
     * Sets the value of the journalTitle property.
     * 
     * @param value
     *            allowed object is {@link Title }
     * 
     */
    public void setJournalTitle(Title value) {
        this.journalTitle = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return possible object is {@link Title }
     * 
     */
    public String getLanguageCode() {
        return languageCode == null ? null : languageCode.name();
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param languageCode
     *            allowed object is {@link String }
     * 
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = (languageCode == null) ? null : LanguageCode.valueOf(languageCode);        
    }

    /**
     * Gets the value of the country property.
     * 
     * @return possible object is {@link Country }
     * 
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param country
     *            allowed object is {@link Country }
     * 
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return RecordUtil.convertToString(this);
    }

    /**
     * Indicates if two works are ORCID duplicated. Two works will be duplicated
     * if they have the same title, type, subtype, external identifiers and
     * source.
     * 
     * @param obj - work to check for duplication
     * 
     * @return true if the two works are duplicated according to ORCID
     *         requirements
     * */
    public boolean isDuplicatedLegacyMode(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Work other = (Work) obj;

        if (this.getWorkTitle() == null) {
            if (other.getWorkTitle() != null)
                return false;
        } else if (!this.getWorkTitle().equals(other.getWorkTitle()))
            return false;

        if (this.getWorkType() == null) {
            if (other.getWorkType() != null)
                return false;
        } else if (!this.getWorkType().equals(other.getWorkType()))
            return false;

        if (this.getWorkExternalIdentifiers() == null) {
            if (other.getWorkExternalIdentifiers() != null)
                return false;
        } else if (!this.getWorkExternalIdentifiers().equals(other.getWorkExternalIdentifiers()))
            return false;

        if (this.getSource() == null) {
            if (other.getSource() != null)
                return false;
        } else if (!this.getSource().equals(other.getSource()))
            return false;

        return true;
    }

    /**
     * Indicates if two works are ORCID duplicated. Two works will be duplicated
     * if they have the same title, type, subtype, external identifiers and
     * source.
     * 
     * @param obj - object to check for duplication
     * 
     * @return true if the two works are duplicated according to ORCID
     *         requirements
     * */
    public boolean isDuplicated(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Work other = (Work) obj;

        // Compare titles
        if (this.getWorkTitle() == null) {
            if (other.getWorkTitle() != null)
                return false;
        } else if (!this.getWorkTitle().equals(other.getWorkTitle()))
            return false;

        // Compare external identifiers
        if (this.getWorkExternalIdentifiers() == null) {
            // If other contains ext ids
            if (other.getWorkExternalIdentifiers() != null && other.getWorkExternalIdentifiers().getExternalIdentifier() != null
                    && !other.getWorkExternalIdentifiers().getExternalIdentifier().isEmpty())
                return false;
        } else if (other.getWorkExternalIdentifiers() == null) {
            if (this.getWorkExternalIdentifiers().getExternalIdentifier() != null && !this.getWorkExternalIdentifiers().getExternalIdentifier().isEmpty())
                return false;
        } else {
            List<? extends GroupAble> otherExternalIdentifiers = other.getWorkExternalIdentifiers().getExternalIdentifier();
            List<? extends GroupAble> thisExternalIdentifiers = this.getWorkExternalIdentifiers().getExternalIdentifier();
            boolean sharedExtId = false;

            start: for (GroupAble thisId : thisExternalIdentifiers) {
                for (GroupAble otherId : otherExternalIdentifiers) {
                    if (thisId.equals(otherId)) {
                        sharedExtId = true;
                        break start;
                    }
                }
            }

            if (!sharedExtId)
                return false;
        }

        // Compare source
        if (this.getSource() == null) {
            if (other.getSource() != null)
                return false;
        } else if (!this.getSource().equals(other.getSource()))
            return false;
        return true;
    }

    /**
     * Note that put-code is not part of hashcode. This is important for avoid
     * creation of duplication works.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((publicationDate == null) ? 0 : publicationDate.hashCode());
        result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((citation == null) ? 0 : citation.hashCode());
        result = prime * result + ((contributors == null) ? 0 : contributors.hashCode());
        result = prime * result + ((externalIdentifiers == null) ? 0 : externalIdentifiers.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((journalTitle == null) ? 0 : journalTitle.hashCode());
        result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        return result;
    }

    @Override
    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(CreatedDate value) {
        createdDate = value;
    }

    @Override
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(LastModifiedDate value) {
        lastModifiedDate = value;
    }

    /**
     * Note that put-code is not part of equality. This is important for avoid
     * creation of duplication works.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Work other = (Work) obj;
        if (publicationDate == null) {
            if (other.publicationDate != null)
                return false;
        } else if (!publicationDate.equals(other.publicationDate))
            return false;
        if (shortDescription == null) {
            if (other.shortDescription != null)
                return false;
        } else if (!shortDescription.equals(other.shortDescription))
            return false;
        if (url == null) {
            if (other.url != null)
                return false;
        } else if (!url.equals(other.url))
            return false;
        if (visibility != other.visibility)
            return false;
        if (citation == null) {
            if (other.citation != null)
                return false;
        } else if (!citation.equals(other.citation))
            return false;
        if (contributors == null) {
            if (other.contributors != null)
                return false;
        } else if (!contributors.equals(other.contributors))
            return false;
        if (externalIdentifiers == null) {
            if (other.externalIdentifiers != null)
                return false;
        } else if (!externalIdentifiers.equals(other.externalIdentifiers))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (type != other.type)
            return false;

        if (journalTitle == null) {
            if (other.journalTitle != null)
                return false;
        } else if (!journalTitle.equals(other.journalTitle))
            return false;

        if (languageCode == null) {
            if (other.languageCode != null)
                return false;
        } else if (!languageCode.equals(other.languageCode))
            return false;

        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;

        /*
         * Breaks our deduping if (lastModifiedDate != other.lastModifiedDate)
         * return false; if (createdDate != other.createdDate) return false;
         */

        return true;
    }

}
