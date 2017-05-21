/**
 * ToDo_Service_Impl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controller;

public interface ToDo_Service_Impl extends java.rmi.Remote {
    public application.Item getItem(int id) throws java.rmi.RemoteException;
    public boolean addItem(application.Item a) throws java.rmi.RemoteException;
    public boolean deleteItem(int id) throws java.rmi.RemoteException;
    public application.Item[] getAllItems() throws java.rmi.RemoteException;
}
