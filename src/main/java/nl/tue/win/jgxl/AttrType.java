
package nl.tue.win.jgxl;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttrType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}AttributedElementType"&gt;
 *       &lt;group ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}value"/&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="kind" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttrType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", propOrder = {
    "bag",
    "set",
    "seq",
    "tup",
    "bool",
    "_int",
    "_float",
    "string",
    "locator",
    "_enum"
})
public class AttrType
    extends AttributedElementType
{

    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected BagType bag;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected SetType set;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected SeqType seq;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected TupType tup;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected Boolean bool;
    @XmlElement(name = "int", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected BigInteger _int;
    @XmlElement(name = "float", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected Float _float;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected String string;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected LocatorType locator;
    @XmlElement(name = "enum", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected String _enum;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "kind")
    protected String kind;

    /**
     * Gets the value of the bag property.
     * 
     * @return
     *     possible object is
     *     {@link BagType }
     *     
     */
    public BagType getBag() {
        return bag;
    }

    /**
     * Sets the value of the bag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagType }
     *     
     */
    public void setBag(BagType value) {
        this.bag = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link SetType }
     *     
     */
    public SetType getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetType }
     *     
     */
    public void setSet(SetType value) {
        this.set = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link SeqType }
     *     
     */
    public SeqType getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeqType }
     *     
     */
    public void setSeq(SeqType value) {
        this.seq = value;
    }

    /**
     * Gets the value of the tup property.
     * 
     * @return
     *     possible object is
     *     {@link TupType }
     *     
     */
    public TupType getTup() {
        return tup;
    }

    /**
     * Sets the value of the tup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupType }
     *     
     */
    public void setTup(TupType value) {
        this.tup = value;
    }

    /**
     * Gets the value of the bool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBool() {
        return bool;
    }

    /**
     * Sets the value of the bool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBool(Boolean value) {
        this.bool = value;
    }

    /**
     * Gets the value of the int property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInt() {
        return _int;
    }

    /**
     * Sets the value of the int property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInt(BigInteger value) {
        this._int = value;
    }

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
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the locator property.
     * 
     * @return
     *     possible object is
     *     {@link LocatorType }
     *     
     */
    public LocatorType getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatorType }
     *     
     */
    public void setLocator(LocatorType value) {
        this.locator = value;
    }

    /**
     * Gets the value of the enum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnum() {
        return _enum;
    }

    /**
     * Sets the value of the enum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnum(String value) {
        this._enum = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

}
