
package nl.tue.win.jgxl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}LocalConnectionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}relend" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", propOrder = {
    "relend"
})
public class RelType
    extends LocalConnectionType
{

    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected List<RelendType> relend;

    /**
     * Gets the value of the relend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelendType }
     * 
     * 
     */
    public List<RelendType> getRelend() {
        if (relend == null) {
            relend = new ArrayList<RelendType>();
        }
        return this.relend;
    }

}
