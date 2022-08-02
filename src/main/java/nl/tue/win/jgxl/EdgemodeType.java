
package nl.tue.win.jgxl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edgemodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="edgemodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="directed"/&gt;
 *     &lt;enumeration value="undirected"/&gt;
 *     &lt;enumeration value="defaultdirected"/&gt;
 *     &lt;enumeration value="defaultundirected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "edgemodeType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
@XmlEnum
public enum EdgemodeType {

    @XmlEnumValue("directed")
    DIRECTED("directed"),
    @XmlEnumValue("undirected")
    UNDIRECTED("undirected"),
    @XmlEnumValue("defaultdirected")
    DEFAULTDIRECTED("defaultdirected"),
    @XmlEnumValue("defaultundirected")
    DEFAULTUNDIRECTED("defaultundirected");
    private final String value;

    EdgemodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EdgemodeType fromValue(String v) {
        for (EdgemodeType c: EdgemodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
