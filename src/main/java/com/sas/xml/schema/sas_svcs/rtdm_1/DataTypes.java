
package com.sas.xml.schema.sas_svcs.rtdm_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Int"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Float"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Table"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypes")
@XmlEnum
public enum DataTypes {

    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Table")
    TABLE("Table");
    private final java.lang.String value;

    DataTypes(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataTypes fromValue(java.lang.String v) {
        for (DataTypes c: DataTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
