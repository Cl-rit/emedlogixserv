//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.13 at 09:55:40 PM IST 
//


package com.emedlogix.index;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}version" minOccurs="0"/&gt;
 *         &lt;element ref="{}title" minOccurs="0"/&gt;
 *         &lt;element ref="{}indexHeading" minOccurs="0"/&gt;
 *         &lt;element ref="{}letter" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isAddenda"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "title",
    "indexHeading",
    "letter"
})
@XmlRootElement(name = "ICD10CM.index")
public class ICD10CMIndex {

    protected String version;
    protected Title title;
    protected IndexHeading indexHeading;
    @XmlElement(required = true)
    protected List<Letter> letter;
    @XmlAttribute(name = "isAddenda")
    protected String isAddenda;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the indexHeading property.
     * 
     * @return
     *     possible object is
     *     {@link IndexHeading }
     *     
     */
    public IndexHeading getIndexHeading() {
        return indexHeading;
    }

    /**
     * Sets the value of the indexHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexHeading }
     *     
     */
    public void setIndexHeading(IndexHeading value) {
        this.indexHeading = value;
    }

    /**
     * Gets the value of the letter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the letter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Letter }
     * 
     * 
     */
    public List<Letter> getLetter() {
        if (letter == null) {
            letter = new ArrayList<Letter>();
        }
        return this.letter;
    }

    /**
     * Gets the value of the isAddenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAddenda() {
        return isAddenda;
    }

    /**
     * Sets the value of the isAddenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAddenda(String value) {
        this.isAddenda = value;
    }

}
