
package nl.tue.win.jgxl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypedElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypedElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}AttributedElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}attr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypedElementType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", propOrder = {
    "type",
    "attr"
})
@XmlSeeAlso({
    GraphType.class,
    GraphElementType.class
})
public class TypedElementType
    extends AttributedElementType
{

    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected TypeType type;
    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected List<AttrType> attr;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the attr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrType }
     * 
     * 
     */
    public List<AttrType> getAttr() {
        if (attr == null) {
            attr = new ArrayList<AttrType>();
        }
        return this.attr;
    }

}
