
package nl.tue.win.jgxl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.tue.win.jgxl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AttributedElement_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "attributedElement");
    private final static QName _TypedElement_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "typedElement");
    private final static QName _Gxl_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "gxl");
    private final static QName _Type_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "type");
    private final static QName _Graph_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "graph");
    private final static QName _GraphElement_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "graphElement");
    private final static QName _Node_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "node");
    private final static QName _LocalConnection_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "localConnection");
    private final static QName _Edge_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "edge");
    private final static QName _Rel_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "rel");
    private final static QName _Relend_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "relend");
    private final static QName _Attr_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "attr");
    private final static QName _Locator_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "locator");
    private final static QName _Bool_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "bool");
    private final static QName _Int_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "int");
    private final static QName _Float_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "float");
    private final static QName _String_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "string");
    private final static QName _FreeType_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "freeType");
    private final static QName _Enum_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "enum");
    private final static QName _CompositeValue_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "compositeValue");
    private final static QName _Bag_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "bag");
    private final static QName _Set_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "set");
    private final static QName _Seq_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "seq");
    private final static QName _Tup_QNAME = new QName("http://www.gupro.de/GXL/gxl-1.0.dtd", "tup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tue.win.jgxl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttributedElementType }
     * 
     */
    public AttributedElementType createAttributedElementType() {
        return new AttributedElementType();
    }

    /**
     * Create an instance of {@link TypedElementType }
     * 
     */
    public TypedElementType createTypedElementType() {
        return new TypedElementType();
    }

    /**
     * Create an instance of {@link GxlType }
     * 
     */
    public GxlType createGxlType() {
        return new GxlType();
    }

    /**
     * Create an instance of {@link TypeType }
     * 
     */
    public TypeType createTypeType() {
        return new TypeType();
    }

    /**
     * Create an instance of {@link GraphType }
     * 
     */
    public GraphType createGraphType() {
        return new GraphType();
    }

    /**
     * Create an instance of {@link GraphElementType }
     * 
     */
    public GraphElementType createGraphElementType() {
        return new GraphElementType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link LocalConnectionType }
     * 
     */
    public LocalConnectionType createLocalConnectionType() {
        return new LocalConnectionType();
    }

    /**
     * Create an instance of {@link EdgeType }
     * 
     */
    public EdgeType createEdgeType() {
        return new EdgeType();
    }

    /**
     * Create an instance of {@link RelType }
     * 
     */
    public RelType createRelType() {
        return new RelType();
    }

    /**
     * Create an instance of {@link RelendType }
     * 
     */
    public RelendType createRelendType() {
        return new RelendType();
    }

    /**
     * Create an instance of {@link AttrType }
     * 
     */
    public AttrType createAttrType() {
        return new AttrType();
    }

    /**
     * Create an instance of {@link LocatorType }
     * 
     */
    public LocatorType createLocatorType() {
        return new LocatorType();
    }

    /**
     * Create an instance of {@link CompositeValueType }
     * 
     */
    public CompositeValueType createCompositeValueType() {
        return new CompositeValueType();
    }

    /**
     * Create an instance of {@link BagType }
     * 
     */
    public BagType createBagType() {
        return new BagType();
    }

    /**
     * Create an instance of {@link SetType }
     * 
     */
    public SetType createSetType() {
        return new SetType();
    }

    /**
     * Create an instance of {@link SeqType }
     * 
     */
    public SeqType createSeqType() {
        return new SeqType();
    }

    /**
     * Create an instance of {@link TupType }
     * 
     */
    public TupType createTupType() {
        return new TupType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributedElementType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "attributedElement")
    public JAXBElement<AttributedElementType> createAttributedElement(AttributedElementType value) {
        return new JAXBElement<AttributedElementType>(_AttributedElement_QNAME, AttributedElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypedElementType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "typedElement")
    public JAXBElement<TypedElementType> createTypedElement(TypedElementType value) {
        return new JAXBElement<TypedElementType>(_TypedElement_QNAME, TypedElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GxlType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GxlType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "gxl")
    public JAXBElement<GxlType> createGxl(GxlType value) {
        return new JAXBElement<GxlType>(_Gxl_QNAME, GxlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "type")
    public JAXBElement<TypeType> createType(TypeType value) {
        return new JAXBElement<TypeType>(_Type_QNAME, TypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GraphType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "graph")
    public JAXBElement<GraphType> createGraph(GraphType value) {
        return new JAXBElement<GraphType>(_Graph_QNAME, GraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GraphElementType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "graphElement")
    public JAXBElement<GraphElementType> createGraphElement(GraphElementType value) {
        return new JAXBElement<GraphElementType>(_GraphElement_QNAME, GraphElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "node")
    public JAXBElement<NodeType> createNode(NodeType value) {
        return new JAXBElement<NodeType>(_Node_QNAME, NodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalConnectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalConnectionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "localConnection")
    public JAXBElement<LocalConnectionType> createLocalConnection(LocalConnectionType value) {
        return new JAXBElement<LocalConnectionType>(_LocalConnection_QNAME, LocalConnectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "edge")
    public JAXBElement<EdgeType> createEdge(EdgeType value) {
        return new JAXBElement<EdgeType>(_Edge_QNAME, EdgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "rel")
    public JAXBElement<RelType> createRel(RelType value) {
        return new JAXBElement<RelType>(_Rel_QNAME, RelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelendType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelendType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "relend")
    public JAXBElement<RelendType> createRelend(RelendType value) {
        return new JAXBElement<RelendType>(_Relend_QNAME, RelendType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "attr")
    public JAXBElement<AttrType> createAttr(AttrType value) {
        return new JAXBElement<AttrType>(_Attr_QNAME, AttrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocatorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "locator")
    public JAXBElement<LocatorType> createLocator(LocatorType value) {
        return new JAXBElement<LocatorType>(_Locator_QNAME, LocatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "bool")
    public JAXBElement<Boolean> createBool(Boolean value) {
        return new JAXBElement<Boolean>(_Bool_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "int")
    public JAXBElement<BigInteger> createInt(BigInteger value) {
        return new JAXBElement<BigInteger>(_Int_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "freeType")
    public JAXBElement<String> createFreeType(String value) {
        return new JAXBElement<String>(_FreeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "enum")
    public JAXBElement<String> createEnum(String value) {
        return new JAXBElement<String>(_Enum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "compositeValue")
    public JAXBElement<CompositeValueType> createCompositeValue(CompositeValueType value) {
        return new JAXBElement<CompositeValueType>(_CompositeValue_QNAME, CompositeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BagType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "bag")
    public JAXBElement<BagType> createBag(BagType value) {
        return new JAXBElement<BagType>(_Bag_QNAME, BagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "set")
    public JAXBElement<SetType> createSet(SetType value) {
        return new JAXBElement<SetType>(_Set_QNAME, SetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "seq")
    public JAXBElement<SeqType> createSeq(SeqType value) {
        return new JAXBElement<SeqType>(_Seq_QNAME, SeqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", name = "tup")
    public JAXBElement<TupType> createTup(TupType value) {
        return new JAXBElement<TupType>(_Tup_QNAME, TupType.class, null, value);
    }

}
