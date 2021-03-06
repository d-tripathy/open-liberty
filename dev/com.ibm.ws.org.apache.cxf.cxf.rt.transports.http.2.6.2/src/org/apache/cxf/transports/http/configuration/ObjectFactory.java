//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.20 at 10:41:30 AM CDT 
//


package org.apache.cxf.transports.http.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.cxf.transports.http.configuration package. 
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

    private final static QName _Client_QNAME = new QName("http://cxf.apache.org/transports/http/configuration", "client");
    private final static QName _Server_QNAME = new QName("http://cxf.apache.org/transports/http/configuration", "server");
    private final static QName _FixedParameterOrder_QNAME = new QName("http://cxf.apache.org/transports/http/configuration", "fixedParameterOrder");
    private final static QName _ContextMatchStrategy_QNAME = new QName("http://cxf.apache.org/transports/http/configuration", "contextMatchStrategy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.cxf.transports.http.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HTTPServerPolicy }
     * 
     */
    public HTTPServerPolicy createHTTPServerPolicy() {
        return new HTTPServerPolicy();
    }

    /**
     * Create an instance of {@link HTTPClientPolicy }
     * 
     */
    public HTTPClientPolicy createHTTPClientPolicy() {
        return new HTTPClientPolicy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTTPClientPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/transports/http/configuration", name = "client")
    public JAXBElement<HTTPClientPolicy> createClient(HTTPClientPolicy value) {
        return new JAXBElement<HTTPClientPolicy>(_Client_QNAME, HTTPClientPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTTPServerPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/transports/http/configuration", name = "server")
    public JAXBElement<HTTPServerPolicy> createServer(HTTPServerPolicy value) {
        return new JAXBElement<HTTPServerPolicy>(_Server_QNAME, HTTPServerPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/transports/http/configuration", name = "fixedParameterOrder", defaultValue = "false")
    public JAXBElement<Boolean> createFixedParameterOrder(Boolean value) {
        return new JAXBElement<Boolean>(_FixedParameterOrder_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/transports/http/configuration", name = "contextMatchStrategy", defaultValue = "stem")
    public JAXBElement<String> createContextMatchStrategy(String value) {
        return new JAXBElement<String>(_ContextMatchStrategy_QNAME, String.class, null, value);
    }

}
