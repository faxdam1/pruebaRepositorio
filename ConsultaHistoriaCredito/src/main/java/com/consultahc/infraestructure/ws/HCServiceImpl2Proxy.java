package com.consultahc.infraestructure.ws;

public class HCServiceImpl2Proxy implements com.consultahc.infraestructure.ws.HCServiceImpl2 {
  private String _endpoint = null;
  private com.consultahc.infraestructure.ws.HCServiceImpl2 hCServiceImpl2 = null;
  
  public HCServiceImpl2Proxy() {
    _initHCServiceImpl2Proxy();
  }
  
  public HCServiceImpl2Proxy(String endpoint) {
    _endpoint = endpoint;
    _initHCServiceImpl2Proxy();
  }
  
  private void _initHCServiceImpl2Proxy() {
    try {
      hCServiceImpl2 = (new com.consultahc.infraestructure.ws.ServicioHistoriaCreditoLocator()).getServicioHistoriaCredito();
      if (hCServiceImpl2 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hCServiceImpl2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hCServiceImpl2)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hCServiceImpl2 != null)
      ((javax.xml.rpc.Stub)hCServiceImpl2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.consultahc.infraestructure.ws.HCServiceImpl2 getHCServiceImpl2() {
    if (hCServiceImpl2 == null)
      _initHCServiceImpl2Proxy();
    return hCServiceImpl2;
  }
  
  public java.lang.String consultarHC2(java.lang.String xmlConsulta) throws java.rmi.RemoteException{
    if (hCServiceImpl2 == null)
      _initHCServiceImpl2Proxy();
    return hCServiceImpl2.consultarHC2(xmlConsulta);
  }
  
  public java.lang.String consultarHC2PJ(java.lang.String xmlConsulta) throws java.rmi.RemoteException{
    if (hCServiceImpl2 == null)
      _initHCServiceImpl2Proxy();
    return hCServiceImpl2.consultarHC2PJ(xmlConsulta);
  }
  
  
}