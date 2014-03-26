/**
 * ServicioHistoriaCreditoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.consultahc.infraestructure.ws;

@SuppressWarnings("rawtypes")
public class ServicioHistoriaCreditoLocator extends org.apache.axis.client.Service implements com.consultahc.infraestructure.ws.ServicioHistoriaCredito {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServicioHistoriaCreditoLocator() {
    }


    public ServicioHistoriaCreditoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioHistoriaCreditoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioHistoriaCredito
    private java.lang.String ServicioHistoriaCredito_address = "http://172.24.14.29:8080/dhws3.demo/services/DH2ClientesService";

    public java.lang.String getServicioHistoriaCreditoAddress() {
        return ServicioHistoriaCredito_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioHistoriaCreditoWSDDServiceName = "ServicioHistoriaCredito";

    public java.lang.String getServicioHistoriaCreditoWSDDServiceName() {
        return ServicioHistoriaCreditoWSDDServiceName;
    }

    public void setServicioHistoriaCreditoWSDDServiceName(java.lang.String name) {
        ServicioHistoriaCreditoWSDDServiceName = name;
    }

    public com.consultahc.infraestructure.ws.HCServiceImpl2 getServicioHistoriaCredito() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioHistoriaCredito_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioHistoriaCredito(endpoint);
    }

    public com.consultahc.infraestructure.ws.HCServiceImpl2 getServicioHistoriaCredito(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.consultahc.infraestructure.ws.ServicioHistoriaCreditoSoapBindingStub _stub = new com.consultahc.infraestructure.ws.ServicioHistoriaCreditoSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioHistoriaCreditoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioHistoriaCreditoEndpointAddress(java.lang.String address) {
        ServicioHistoriaCredito_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.consultahc.infraestructure.ws.HCServiceImpl2.class.isAssignableFrom(serviceEndpointInterface)) {
                com.consultahc.infraestructure.ws.ServicioHistoriaCreditoSoapBindingStub _stub = new com.consultahc.infraestructure.ws.ServicioHistoriaCreditoSoapBindingStub(new java.net.URL(ServicioHistoriaCredito_address), this);
                _stub.setPortName(getServicioHistoriaCreditoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServicioHistoriaCredito".equals(inputPortName)) {
            return getServicioHistoriaCredito();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.datacredito.com.co/services/ServicioHistoriaCredito", "ServicioHistoriaCredito");
    }

    private java.util.HashSet ports = null;

    
	@SuppressWarnings("unchecked")
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.datacredito.com.co/services/ServicioHistoriaCredito", "ServicioHistoriaCredito"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioHistoriaCredito".equals(portName)) {
            setServicioHistoriaCreditoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
