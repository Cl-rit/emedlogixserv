//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.12 at 10:31:48 PM IST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The mainTerm type is the base term element.
 * 
 * <p>Java class for mainTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mainTermType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}termGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mainTermType", propOrder = {
    "title",
    "manif",
    "see",
    "seeAlso",
    "cell",
    "term"
})
@XmlSeeAlso({
    TermType.class
})
public class MainTermType {

    protected ContentType title;
    protected ContentType manif;
    protected ContentType see;
    protected ContentType seeAlso;
    protected List<CellType> cell;
    protected List<TermType> term;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setTitle(ContentType value) {
        this.title = value;
    }

    /**
     * Gets the value of the manif property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getManif() {
        return manif;
    }

    /**
     * Sets the value of the manif property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setManif(ContentType value) {
        this.manif = value;
    }

    /**
     * Gets the value of the see property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getSee() {
        return see;
    }

    /**
     * Sets the value of the see property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setSee(ContentType value) {
        this.see = value;
    }

    /**
     * Gets the value of the seeAlso property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getSeeAlso() {
        return seeAlso;
    }

    /**
     * Sets the value of the seeAlso property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setSeeAlso(ContentType value) {
        this.seeAlso = value;
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
     * {@link CellType }
     * 
     * 
     */
    public List<CellType> getCell() {
        if (cell == null) {
            cell = new ArrayList<CellType>();
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
     * {@link TermType }
     * 
     * 
     */
    public List<TermType> getTerm() {
        if (term == null) {
            term = new ArrayList<TermType>();
        }
        return this.term;
    }

}
