/**
 * WSInterfaceRemoteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package skeleton;

public class WSInterfaceRemoteExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1526404347655L;
    private webservice.WSInterfaceRemoteException faultMessage;

    public WSInterfaceRemoteExceptionException() {
        super("WSInterfaceRemoteExceptionException");
    }

    public WSInterfaceRemoteExceptionException(java.lang.String s) {
        super(s);
    }

    public WSInterfaceRemoteExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public WSInterfaceRemoteExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(webservice.WSInterfaceRemoteException msg) {
        faultMessage = msg;
    }

    public webservice.WSInterfaceRemoteException getFaultMessage() {
        return faultMessage;
    }
}
