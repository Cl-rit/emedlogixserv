//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.06 at 02:16:40 PM IST 
//


package generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueType", propOrder = {
    "heading",
    "value"
})
public class ValueType {

    protected Object heading;
    protected Object value;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHeading(Object value) {
        this.heading = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

}
