package controller;

public class ToDo_Service_ImplProxy implements controller.ToDo_Service_Impl {
  private String _endpoint = null;
  private controller.ToDo_Service_Impl toDo_Service_Impl = null;
  
  public ToDo_Service_ImplProxy() {
    _initToDo_Service_ImplProxy();
  }
  
  public ToDo_Service_ImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initToDo_Service_ImplProxy();
  }
  
  private void _initToDo_Service_ImplProxy() {
    try {
      toDo_Service_Impl = (new controller.ToDo_Service_ImplServiceLocator()).getToDo_Service_Impl();
      if (toDo_Service_Impl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)toDo_Service_Impl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)toDo_Service_Impl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (toDo_Service_Impl != null)
      ((javax.xml.rpc.Stub)toDo_Service_Impl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public controller.ToDo_Service_Impl getToDo_Service_Impl() {
    if (toDo_Service_Impl == null)
      _initToDo_Service_ImplProxy();
    return toDo_Service_Impl;
  }
  
  public application.Item getItem(int id) throws java.rmi.RemoteException{
    if (toDo_Service_Impl == null)
      _initToDo_Service_ImplProxy();
    return toDo_Service_Impl.getItem(id);
  }
  
  public boolean addItem(application.Item a) throws java.rmi.RemoteException{
    if (toDo_Service_Impl == null)
      _initToDo_Service_ImplProxy();
    return toDo_Service_Impl.addItem(a);
  }
  
  public boolean deleteItem(int id) throws java.rmi.RemoteException{
    if (toDo_Service_Impl == null)
      _initToDo_Service_ImplProxy();
    return toDo_Service_Impl.deleteItem(id);
  }
  
  public application.Item[] getAllItems() throws java.rmi.RemoteException{
    if (toDo_Service_Impl == null)
      _initToDo_Service_ImplProxy();
    return toDo_Service_Impl.getAllItems();
  }
  
  
}