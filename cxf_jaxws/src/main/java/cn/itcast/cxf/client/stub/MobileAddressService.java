package cn.itcast.cxf.client.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-11-30T15:14:04.589+08:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://server.cxf.itcast.cn/", name = "MobileAddressService")
@XmlSeeAlso({ObjectFactory.class})
public interface MobileAddressService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAddressByMobileNo", targetNamespace = "http://server.cxf.itcast.cn/", className = "cn.itcast.cxf.client.stub.GetAddressByMobileNo")
    @WebMethod
    @ResponseWrapper(localName = "getAddressByMobileNoResponse", targetNamespace = "http://server.cxf.itcast.cn/", className = "cn.itcast.cxf.client.stub.GetAddressByMobileNoResponse")
    public java.lang.String getAddressByMobileNo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
