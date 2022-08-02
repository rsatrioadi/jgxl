
package nl.tue.win.jgxl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}value"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeValueType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", propOrder = {
    "bagOrSetOrSeq"
})
@XmlSeeAlso({
    BagType.class,
    SetType.class,
    SeqType.class,
    TupType.class
})
public class CompositeValueType {

    @XmlElementRefs({
        @XmlElementRef(name = "bag", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "seq", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tup", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "string", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locator", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enum", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> bagOrSetOrSeq;

    /**
     * Gets the value of the bagOrSetOrSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bagOrSetOrSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagOrSetOrSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * {@link JAXBElement }{@code <}{@link TupType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBagOrSetOrSeq() {
        if (bagOrSetOrSeq == null) {
            bagOrSetOrSeq = new ArrayList<JAXBElement<?>>();
        }
        return this.bagOrSetOrSeq;
    }

}
