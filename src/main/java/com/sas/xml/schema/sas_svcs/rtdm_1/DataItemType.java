
package com.sas.xml.schema.sas_svcs.rtdm_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1}Float"/>
 *         &lt;element ref="{http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1}Int"/>
 *         &lt;element ref="{http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1}String"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="MSISDN"/>
 *             &lt;enumeration value="accountCreditMeter1"/>
 *             &lt;enumeration value="accountConsumptionMeter1"/>
 *             &lt;enumeration value="accountCreditMeter2"/>
 *             &lt;enumeration value="accountConsumptionMeter2"/>
 *             &lt;enumeration value="accountCreditMeter3"/>
 *             &lt;enumeration value="accountConsumptionMeter3"/>
 *             &lt;enumeration value="accountCreditMeter4"/>
 *             &lt;enumeration value="accountConsumptionMeter4"/>
 *             &lt;enumeration value="involvedInCharge"/>
 *             &lt;enumeration value="SaldoCalculado1"/>
 *             &lt;enumeration value="SaldoCalculado2"/>
 *             &lt;enumeration value="SaldoCalculado3"/>
 *             &lt;enumeration value="SaldoCalculado4"/>
 *             &lt;enumeration value="Nombre_del_trigger"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataItemType", propOrder = {
    "_float",
    "_int",
    "string"
})
public class DataItemType {

    @XmlElement(name = "Float")
    protected Float _float;
    @XmlElement(name = "Int")
    protected Int _int;
    @XmlElement(name = "String")
    protected com.sas.xml.schema.sas_svcs.rtdm_1.String string;
    @XmlAttribute(name = "name", required = true)
    protected java.lang.String name;

    /**
     * Gets the value of the float property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFloat() {
        return _float;
    }

    /**
     * Sets the value of the float property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFloat(Float value) {
        this._float = value;
    }

    /**
     * Gets the value of the int property.
     * 
     * @return
     *     possible object is
     *     {@link Int }
     *     
     */
    public Int getInt() {
        return _int;
    }

    /**
     * Sets the value of the int property.
     * 
     * @param value
     *     allowed object is
     *     {@link Int }
     *     
     */
    public void setInt(Int value) {
        this._int = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link com.sas.xml.schema.sas_svcs.rtdm_1.String }
     *     
     */
    public com.sas.xml.schema.sas_svcs.rtdm_1.String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sas.xml.schema.sas_svcs.rtdm_1.String }
     *     
     */
    public void setString(com.sas.xml.schema.sas_svcs.rtdm_1.String value) {
        this.string = value;
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
        return name;
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
