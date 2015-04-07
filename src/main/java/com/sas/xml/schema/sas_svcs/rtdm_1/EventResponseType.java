
package com.sas.xml.schema.sas_svcs.rtdm_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1}HeaderResponseType"/>
 *         &lt;element name="Body" type="{http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1}BodyResponseType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Umbral_de_Recarga" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventResponseType", propOrder = {
    "header",
    "body"
})
public class EventResponseType {

    @XmlElement(name = "Header", required = true)
    protected HeaderResponseType header;
    @XmlElement(name = "Body", required = true)
    protected BodyResponseType body;
    @XmlAttribute(name = "name", required = true)
    protected java.lang.String name;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResponseType }
     *     
     */
    public HeaderResponseType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResponseType }
     *     
     */
    public void setHeader(HeaderResponseType value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link BodyResponseType }
     *     
     */
    public BodyResponseType getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyResponseType }
     *     
     */
    public void setBody(BodyResponseType value) {
        this.body = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        if (name == null) {
            return "Umbral_de_Recarga";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

}
