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
 *         &lt;choice&gt;
 *           &lt;element ref="{}title"/&gt;
 *           &lt;element ref="{}diff"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{}termGroup"/&gt;
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
    "title",
    "diff",
    "see",
    "seeAlso",
    "code",
    "seecat",
    "subcat",
    "manif",
    "warning",
    "cell",
    "term"
})
@XmlRootElement(name = "mainTerm")
public class MainTerm {

    protected Title title;
    protected Diff diff;
    protected String see;
    protected String seeAlso;
    protected String code;
    protected String seecat;
    protected String subcat;
    protected String manif;
    protected String warning;
    protected List<Cell> cell;
    protected List<Term> term;

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
     * Gets the value of the diff property.
     * 
     * @return
     *     possible object is
     *     {@link Diff }
     *     
     */
    public Diff getDiff() {
        return diff;
    }

    /**
     * Sets the value of the diff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diff }
     *     
     */
    public void setDiff(Diff value) {
        this.diff = value;
    }

    /**
     * Gets the value of the see property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSee() {
        return see;
    }

    /**
     * Sets the value of the see property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSee(String value) {
        this.see = value;
    }

    /**
     * Gets the value of the seeAlso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeeAlso() {
        return seeAlso;
    }

    /**
     * Sets the value of the seeAlso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeeAlso(String value) {
        this.seeAlso = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the seecat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeecat() {
        return seecat;
    }

    /**
     * Sets the value of the seecat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeecat(String value) {
        this.seecat = value;
    }

    /**
     * Gets the value of the subcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcat() {
        return subcat;
    }

    /**
     * Sets the value of the subcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcat(String value) {
        this.subcat = value;
    }

    /**
     * Gets the value of the manif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManif() {
        return manif;
    }

    /**
     * Sets the value of the manif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManif(String value) {
        this.manif = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cell }
     * 
     * 
     */
    public List<Cell> getCell() {
        if (cell == null) {
            cell = new ArrayList<Cell>();
        }
        return this.cell;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Term }
     * 
     * 
     */
    public List<Term> getTerm() {
        if (term == null) {
            term = new ArrayList<Term>();
        }
        return this.term;
    }

}
