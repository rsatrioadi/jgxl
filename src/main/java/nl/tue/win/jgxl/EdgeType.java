
package nl.tue.win.jgxl;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EdgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EdgeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}LocalConnectionType"&gt;
 *       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="fromorder" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="toorder" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdgeType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
public class EdgeType
    extends LocalConnectionType
{

    @XmlAttribute(name = "from", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object from;
    @XmlAttribute(name = "to", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object to;
    @XmlAttribute(name = "fromorder")
    protected BigInteger fromorder;
    @XmlAttribute(name = "toorder")
    protected BigInteger toorder;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFrom(Object value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTo(Object value) {
        this.to = value;
    }

    /**
     * Gets the value of the fromorder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromorder() {
        return fromorder;
    }

    /**
     * Sets the value of the fromorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromorder(BigInteger value) {
        this.fromorder = value;
    }

    /**
     * Gets the value of the toorder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToorder() {
        return toorder;
    }

    /**
     * Sets the value of the toorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToorder(BigInteger value) {
        this.toorder = value;
    }

}
