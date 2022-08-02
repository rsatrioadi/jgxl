
package nl.tue.win.jgxl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraphElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}TypedElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}graph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphElementType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", propOrder = {
    "graph"
})
@XmlSeeAlso({
    NodeType.class,
    LocalConnectionType.class
})
public class GraphElementType
    extends TypedElementType
{

    @XmlElement(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd")
    protected List<GraphType> graph;

    /**
     * Gets the value of the graph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the graph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphType }
     * 
     * 
     */
    public List<GraphType> getGraph() {
        if (graph == null) {
            graph = new ArrayList<GraphType>();
        }
        return this.graph;
    }

}
