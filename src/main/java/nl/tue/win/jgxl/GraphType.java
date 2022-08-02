
package nl.tue.win.jgxl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for graphType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graphType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}TypedElementType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}node"/&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}edge"/&gt;
 *         &lt;element ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}rel"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="edgeids" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="hypergraph" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="edgemode" type="{http://www.gupro.de/GXL/gxl-1.0.dtd}edgemodeType" default="directed" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphType", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", propOrder = {
    "nodeOrEdgeOrRel"
})
public class GraphType
    extends TypedElementType
{

    @XmlElements({
        @XmlElement(name = "node", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = NodeType.class),
        @XmlElement(name = "edge", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = EdgeType.class),
        @XmlElement(name = "rel", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = RelType.class)
    })
    protected List<GraphElementType> nodeOrEdgeOrRel;
    @XmlAttribute(name = "role")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String role;
    @XmlAttribute(name = "edgeids")
    protected Boolean edgeids;
    @XmlAttribute(name = "hypergraph")
    protected Boolean hypergraph;
    @XmlAttribute(name = "edgemode")
    protected EdgemodeType edgemode;

    /**
     * Gets the value of the nodeOrEdgeOrRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nodeOrEdgeOrRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeOrEdgeOrRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgeType }
     * {@link NodeType }
     * {@link RelType }
     * 
     * 
     */
    public List<GraphElementType> getNodeOrEdgeOrRel() {
        if (nodeOrEdgeOrRel == null) {
            nodeOrEdgeOrRel = new ArrayList<GraphElementType>();
        }
        return this.nodeOrEdgeOrRel;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the edgeids property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEdgeids() {
        if (edgeids == null) {
            return false;
        } else {
            return edgeids;
        }
    }

    /**
     * Sets the value of the edgeids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEdgeids(Boolean value) {
        this.edgeids = value;
    }

    /**
     * Gets the value of the hypergraph property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHypergraph() {
        if (hypergraph == null) {
            return false;
        } else {
            return hypergraph;
        }
    }

    /**
     * Sets the value of the hypergraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHypergraph(Boolean value) {
        this.hypergraph = value;
    }

    /**
     * Gets the value of the edgemode property.
     * 
     * @return
     *     possible object is
     *     {@link EdgemodeType }
     *     
     */
    public EdgemodeType getEdgemode() {
        if (edgemode == null) {
            return EdgemodeType.DIRECTED;
        } else {
            return edgemode;
        }
    }

    /**
     * Sets the value of the edgemode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgemodeType }
     *     
     */
    public void setEdgemode(EdgemodeType value) {
        this.edgemode = value;
    }

}
