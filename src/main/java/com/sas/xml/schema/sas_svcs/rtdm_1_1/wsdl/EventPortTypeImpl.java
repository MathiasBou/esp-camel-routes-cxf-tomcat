
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.sas.xml.schema.sas_svcs.rtdm_1_1.wsdl;

import java.util.logging.Logger;
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

@javax.jws.WebService(
                      serviceName = "EventService",
                      portName = "EventPort",
                      targetNamespace = "http://www.sas.com/xml/schema/sas-svcs/rtdm-1.1/wsdl/",
                      wsdlLocation = "file:/C:/Users/eurnpa/Documents/Telefonica%20Argentina/ESP-ROUTES-END-TO-END/esp-camel-routes-cxf-api/src/main/resources/wsdl/campaña_umbral_recarga.wsdl",
                      endpointInterface = "com.sas.xml.schema.sas_svcs.rtdm_1_1.wsdl.EventPortType")
                      
public class EventPortTypeImpl implements EventPortType {

    private static final Logger LOG = Logger.getLogger(EventPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.sas.xml.schema.sas_svcs.rtdm_1_1.wsdl.EventPortType#event(com.sas.xml.schema.sas_svcs.rtdm_1.EventType  parameters )*
     */
    public com.sas.xml.schema.sas_svcs.rtdm_1.EventResponseType event(com.sas.xml.schema.sas_svcs.rtdm_1.EventType parameters) throws FaultException    { 
        LOG.info("Executing operation event");
        System.out.println(parameters);
        try {
            com.sas.xml.schema.sas_svcs.rtdm_1.EventResponseType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new FaultException("FaultException...");
    }

}
