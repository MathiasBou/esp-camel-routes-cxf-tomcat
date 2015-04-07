
package com.sas.xml.schema.sas_svcs.rtdm_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sas.xml.schema.sas_svcs.rtdm_1 package. 
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

    private final static QName _EventResponse_QNAME = new QName("http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", "EventResponse");
    private final static QName _FaultException_QNAME = new QName("http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", "FaultException");
    private final static QName _Event_QNAME = new QName("http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", "Event");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sas.xml.schema.sas_svcs.rtdm_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BooleanArray }
     * 
     */
    public BooleanArray createBooleanArray() {
        return new BooleanArray();
    }

    /**
     * Create an instance of {@link TableArray }
     * 
     */
    public TableArray createTableArray() {
        return new TableArray();
    }

    /**
     * Create an instance of {@link DateTimeArray }
     * 
     */
    public DateTimeArray createDateTimeArray() {
        return new DateTimeArray();
    }

    /**
     * Create an instance of {@link FloatArray }
     * 
     */
    public FloatArray createFloatArray() {
        return new FloatArray();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link IntArray }
     * 
     */
    public IntArray createIntArray() {
        return new IntArray();
    }

    /**
     * Create an instance of {@link Float }
     * 
     */
    public Float createFloat() {
        return new Float();
    }

    /**
     * Create an instance of {@link BooleanArray.Val }
     * 
     */
    public BooleanArray.Val createBooleanArrayVal() {
        return new BooleanArray.Val();
    }

    /**
     * Create an instance of {@link TableArray.Val }
     * 
     */
    public TableArray.Val createTableArrayVal() {
        return new TableArray.Val();
    }

    /**
     * Create an instance of {@link DateTimeArray.Val }
     * 
     */
    public DateTimeArray.Val createDateTimeArrayVal() {
        return new DateTimeArray.Val();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new Table();
    }

    /**
     * Create an instance of {@link TableType }
     * 
     */
    public TableType createTableType() {
        return new TableType();
    }

    /**
     * Create an instance of {@link Boolean }
     * 
     */
    public Boolean createBoolean() {
        return new Boolean();
    }

    /**
     * Create an instance of {@link FloatArray.Val }
     * 
     */
    public FloatArray.Val createFloatArrayVal() {
        return new FloatArray.Val();
    }

    /**
     * Create an instance of {@link StringArray.Val }
     * 
     */
    public StringArray.Val createStringArrayVal() {
        return new StringArray.Val();
    }

    /**
     * Create an instance of {@link IntArray.Val }
     * 
     */
    public IntArray.Val createIntArrayVal() {
        return new IntArray.Val();
    }

    /**
     * Create an instance of {@link FaultException }
     * 
     */
    public FaultException createFaultException() {
        return new FaultException();
    }

    /**
     * Create an instance of {@link EventResponseType }
     * 
     */
    public EventResponseType createEventResponseType() {
        return new EventResponseType();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link String }
     * 
     */
    public String createString() {
        return new String();
    }

    /**
     * Create an instance of {@link Int }
     * 
     */
    public Int createInt() {
        return new Int();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link TableDataType }
     * 
     */
    public TableDataType createTableDataType() {
        return new TableDataType();
    }

    /**
     * Create an instance of {@link TableColumnType }
     * 
     */
    public TableColumnType createTableColumnType() {
        return new TableColumnType();
    }

    /**
     * Create an instance of {@link DataItemResponseType }
     * 
     */
    public DataItemResponseType createDataItemResponseType() {
        return new DataItemResponseType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link BodyResponseType }
     * 
     */
    public BodyResponseType createBodyResponseType() {
        return new BodyResponseType();
    }

    /**
     * Create an instance of {@link TableRowType }
     * 
     */
    public TableRowType createTableRowType() {
        return new TableRowType();
    }

    /**
     * Create an instance of {@link DataItemType }
     * 
     */
    public DataItemType createDataItemType() {
        return new DataItemType();
    }

    /**
     * Create an instance of {@link HeaderResponseType }
     * 
     */
    public HeaderResponseType createHeaderResponseType() {
        return new HeaderResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", name = "EventResponse")
    public JAXBElement<EventResponseType> createEventResponse(EventResponseType value) {
        return new JAXBElement<EventResponseType>(_EventResponse_QNAME, EventResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", name = "FaultException")
    public JAXBElement<FaultException> createFaultException(FaultException value) {
        return new JAXBElement<FaultException>(_FaultException_QNAME, FaultException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", name = "Event")
    public JAXBElement<EventType> createEvent(EventType value) {
        return new JAXBElement<EventType>(_Event_QNAME, EventType.class, null, value);
    }

}
