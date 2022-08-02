
package nl.tue.win.jgxl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalConnectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}GraphElementType"&gt;
 *       &lt;attribute name="isDirected" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalConnectionType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
@XmlSeeAlso({
    EdgeType.class,
    RelType.class
})
public class LocalConnectionType
    extends GraphElementType
{

    @XmlAttribute(name = "isDirected")
    protected Boolean isDirected;

    /**
     * Gets the value of the isDirected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDirected() {
        return isDirected;
    }

    /**
     * Sets the value of the isDirected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDirected(Boolean value) {
        this.isDirected = value;
    }

}
