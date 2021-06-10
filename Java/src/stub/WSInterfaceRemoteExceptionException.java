/**
 * WSInterfaceRemoteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package stub;

public class WSInterfaceRemoteExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1526404630214L;
    private stub.WSInterfaceStub.WSInterfaceRemoteException faultMessage;

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

    public void setFaultMessage(
        stub.WSInterfaceStub.WSInterfaceRemoteException msg) {
        faultMessage = msg;
    }

    public stub.WSInterfaceStub.WSInterfaceRemoteException getFaultMessage() {
        return faultMessage;
    }
}
