package com.sas.xml.schema.sas_svcs.rtdm_1_1.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-01-16T10:00:28.726-03:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1/wsdl/", name = "EventPortType")
@XmlSeeAlso({com.sas.xml.schema.sas_svcs.rtdm_1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EventPortType {

    @WebResult(name = "EventResponse", targetNamespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1", partName = "parameters")
    @WebMethod(operationName = "Event")
    public com.sas.xml.schema.sas_svcs.rtdm_1.EventResponseType event(
        @WebParam(partName = "parameters", name = "Event", targetNamespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1")
        com.sas.xml.schema.sas_svcs.rtdm_1.EventType parameters
    ) throws FaultException;
}
