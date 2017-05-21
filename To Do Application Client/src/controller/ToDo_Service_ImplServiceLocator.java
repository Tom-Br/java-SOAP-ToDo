/**
 * ToDo_Service_ImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controller;

public class ToDo_Service_ImplServiceLocator extends org.apache.axis.client.Service implements controller.ToDo_Service_ImplService {

    public ToDo_Service_ImplServiceLocator() {
    }


    public ToDo_Service_ImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ToDo_Service_ImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ToDo_Service_Impl
    private java.lang.String ToDo_Service_Impl_address = "http://localhost:8080/To_Do_Application/services/ToDo_Service_Impl";

    public java.lang.String getToDo_Service_ImplAddress() {
        return ToDo_Service_Impl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ToDo_Service_ImplWSDDServiceName = "ToDo_Service_Impl";

    public java.lang.String getToDo_Service_ImplWSDDServiceName() {
        return ToDo_Service_ImplWSDDServiceName;
    }

    public void setToDo_Service_ImplWSDDServiceName(java.lang.String name) {
        ToDo_Service_ImplWSDDServiceName = name;
    }

    public controller.ToDo_Service_Impl getToDo_Service_Impl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ToDo_Service_Impl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getToDo_Service_Impl(endpoint);
    }

    public controller.ToDo_Service_Impl getToDo_Service_Impl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            controller.ToDo_Service_ImplSoapBindingStub _stub = new controller.ToDo_Service_ImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getToDo_Service_ImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setToDo_Service_ImplEndpointAddress(java.lang.String address) {
        ToDo_Service_Impl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (controller.ToDo_Service_Impl.class.isAssignableFrom(serviceEndpointInterface)) {
                controller.ToDo_Service_ImplSoapBindingStub _stub = new controller.ToDo_Service_ImplSoapBindingStub(new java.net.URL(ToDo_Service_Impl_address), this);
                _stub.setPortName(getToDo_Service_ImplWSDDServiceName());
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
        if ("ToDo_Service_Impl".equals(inputPortName)) {
            return getToDo_Service_Impl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller", "ToDo_Service_ImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller", "ToDo_Service_Impl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ToDo_Service_Impl".equals(portName)) {
            setToDo_Service_ImplEndpointAddress(address);
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
