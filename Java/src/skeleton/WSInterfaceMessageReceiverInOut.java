/**
 * WSInterfaceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package skeleton;


/**
 *  WSInterfaceMessageReceiverInOut message receiver
 */
public class WSInterfaceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            WSInterfaceSkeletonInterface skel = (WSInterfaceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("removePackage".equals(methodName)) {
                    webservice.RemovePackageResponse removePackageResponse145 = null;
                    webservice.RemovePackage wrappedParam = (webservice.RemovePackage) fromOM(msgContext.getEnvelope()
                                                                                                        .getBody()
                                                                                                        .getFirstElement(),
                            webservice.RemovePackage.class);

                    removePackageResponse145 = skel.removePackage(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePackageResponse145, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePackageResponse"));
                } else
                 if ("putPartIntoPackage".equals(methodName)) {
                    webservice.PutPartIntoPackageResponse putPartIntoPackageResponse147 =
                        null;
                    webservice.PutPartIntoPackage wrappedParam = (webservice.PutPartIntoPackage) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            webservice.PutPartIntoPackage.class);

                    putPartIntoPackageResponse147 = skel.putPartIntoPackage(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            putPartIntoPackageResponse147, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "putPartIntoPackageResponse"));
                } else
                 if ("insertCar".equals(methodName)) {
                    webservice.InsertCarResponse insertCarResponse149 = null;
                    webservice.InsertCar wrappedParam = (webservice.InsertCar) fromOM(msgContext.getEnvelope()
                                                                                                .getBody()
                                                                                                .getFirstElement(),
                            webservice.InsertCar.class);

                    insertCarResponse149 = skel.insertCar(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            insertCarResponse149, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "insertCarResponse"));
                } else
                 if ("insertPartWithQuantity".equals(methodName)) {
                    webservice.InsertPartWithQuantityResponse insertPartWithQuantityResponse151 =
                        null;
                    webservice.InsertPartWithQuantity wrappedParam = (webservice.InsertPartWithQuantity) fromOM(msgContext.getEnvelope()
                                                                                                                          .getBody()
                                                                                                                          .getFirstElement(),
                            webservice.InsertPartWithQuantity.class);

                    insertPartWithQuantityResponse151 = skel.insertPartWithQuantity(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            insertPartWithQuantityResponse151, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "insertPartWithQuantityResponse"));
                } else
                 if ("removePartFromPackageByQuantity".equals(methodName)) {
                    webservice.RemovePartFromPackageByQuantityResponse removePartFromPackageByQuantityResponse153 =
                        null;
                    webservice.RemovePartFromPackageByQuantity wrappedParam = (webservice.RemovePartFromPackageByQuantity) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            webservice.RemovePartFromPackageByQuantity.class);

                    removePartFromPackageByQuantityResponse153 = skel.removePartFromPackageByQuantity(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePartFromPackageByQuantityResponse153, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePartFromPackageByQuantityResponse"));
                } else
                 if ("removePartFromPackage".equals(methodName)) {
                    webservice.RemovePartFromPackageResponse removePartFromPackageResponse155 =
                        null;
                    webservice.RemovePartFromPackage wrappedParam = (webservice.RemovePartFromPackage) fromOM(msgContext.getEnvelope()
                                                                                                                        .getBody()
                                                                                                                        .getFirstElement(),
                            webservice.RemovePartFromPackage.class);

                    removePartFromPackageResponse155 = skel.removePartFromPackage(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePartFromPackageResponse155, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePartFromPackageResponse"));
                } else
                 if ("getPartsForPallet".equals(methodName)) {
                    webservice.GetPartsForPalletResponse getPartsForPalletResponse157 =
                        null;
                    webservice.GetPartsForPallet wrappedParam = (webservice.GetPartsForPallet) fromOM(msgContext.getEnvelope()
                                                                                                                .getBody()
                                                                                                                .getFirstElement(),
                            webservice.GetPartsForPallet.class);

                    getPartsForPalletResponse157 = skel.getPartsForPallet(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getPartsForPalletResponse157, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getPartsForPalletResponse"));
                } else
                 if ("insertPart".equals(methodName)) {
                    webservice.InsertPartResponse insertPartResponse159 = null;
                    webservice.InsertPart wrappedParam = (webservice.InsertPart) fromOM(msgContext.getEnvelope()
                                                                                                  .getBody()
                                                                                                  .getFirstElement(),
                            webservice.InsertPart.class);

                    insertPartResponse159 = skel.insertPart(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            insertPartResponse159, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "insertPartResponse"));
                } else
                 if ("removeCar".equals(methodName)) {
                    webservice.RemoveCarResponse removeCarResponse161 = null;
                    webservice.RemoveCar wrappedParam = (webservice.RemoveCar) fromOM(msgContext.getEnvelope()
                                                                                                .getBody()
                                                                                                .getFirstElement(),
                            webservice.RemoveCar.class);

                    removeCarResponse161 = skel.removeCar(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removeCarResponse161, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removeCarResponse"));
                } else
                 if ("getLastPackageID".equals(methodName)) {
                    webservice.GetLastPackageIDResponse getLastPackageIDResponse163 =
                        null;
                    webservice.GetLastPackageID wrappedParam = (webservice.GetLastPackageID) fromOM(msgContext.getEnvelope()
                                                                                                              .getBody()
                                                                                                              .getFirstElement(),
                            webservice.GetLastPackageID.class);

                    getLastPackageIDResponse163 = skel.getLastPackageID(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getLastPackageIDResponse163, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getLastPackageIDResponse"));
                } else
                 if ("insertPackage".equals(methodName)) {
                    webservice.InsertPackageResponse insertPackageResponse165 = null;
                    webservice.InsertPackage wrappedParam = (webservice.InsertPackage) fromOM(msgContext.getEnvelope()
                                                                                                        .getBody()
                                                                                                        .getFirstElement(),
                            webservice.InsertPackage.class);

                    insertPackageResponse165 = skel.insertPackage(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            insertPackageResponse165, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "insertPackageResponse"));
                } else
                 if ("getPartsForPackage".equals(methodName)) {
                    webservice.GetPartsForPackageResponse getPartsForPackageResponse167 =
                        null;
                    webservice.GetPartsForPackage wrappedParam = (webservice.GetPartsForPackage) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            webservice.GetPartsForPackage.class);

                    getPartsForPackageResponse167 = skel.getPartsForPackage(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getPartsForPackageResponse167, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getPartsForPackageResponse"));
                } else
                 if ("getCars".equals(methodName)) {
                    webservice.GetCarsResponse getCarsResponse169 = null;
                    webservice.GetCars wrappedParam = (webservice.GetCars) fromOM(msgContext.getEnvelope()
                                                                                            .getBody()
                                                                                            .getFirstElement(),
                            webservice.GetCars.class);

                    getCarsResponse169 = skel.getCars(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getCarsResponse169, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getCarsResponse"));
                } else
                 if ("getPallets".equals(methodName)) {
                    webservice.GetPalletsResponse getPalletsResponse171 = null;
                    webservice.GetPallets wrappedParam = (webservice.GetPallets) fromOM(msgContext.getEnvelope()
                                                                                                  .getBody()
                                                                                                  .getFirstElement(),
                            webservice.GetPallets.class);

                    getPalletsResponse171 = skel.getPallets(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getPalletsResponse171, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getPalletsResponse"));
                } else
                 if ("removePart".equals(methodName)) {
                    webservice.RemovePartResponse removePartResponse173 = null;
                    webservice.RemovePart wrappedParam = (webservice.RemovePart) fromOM(msgContext.getEnvelope()
                                                                                                  .getBody()
                                                                                                  .getFirstElement(),
                            webservice.RemovePart.class);

                    removePartResponse173 = skel.removePart(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePartResponse173, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePartResponse"));
                } else
                 if ("removePallet".equals(methodName)) {
                    webservice.RemovePalletResponse removePalletResponse175 = null;
                    webservice.RemovePallet wrappedParam = (webservice.RemovePallet) fromOM(msgContext.getEnvelope()
                                                                                                      .getBody()
                                                                                                      .getFirstElement(),
                            webservice.RemovePallet.class);

                    removePalletResponse175 = skel.removePallet(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePalletResponse175, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePalletResponse"));
                } else
                 if ("removePartFromPallet".equals(methodName)) {
                    webservice.RemovePartFromPalletResponse removePartFromPalletResponse177 =
                        null;
                    webservice.RemovePartFromPallet wrappedParam = (webservice.RemovePartFromPallet) fromOM(msgContext.getEnvelope()
                                                                                                                      .getBody()
                                                                                                                      .getFirstElement(),
                            webservice.RemovePartFromPallet.class);

                    removePartFromPalletResponse177 = skel.removePartFromPallet(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePartFromPalletResponse177, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePartFromPalletResponse"));
                } else
                 if ("getLastPalletID".equals(methodName)) {
                    webservice.GetLastPalletIDResponse getLastPalletIDResponse179 =
                        null;
                    webservice.GetLastPalletID wrappedParam = (webservice.GetLastPalletID) fromOM(msgContext.getEnvelope()
                                                                                                            .getBody()
                                                                                                            .getFirstElement(),
                            webservice.GetLastPalletID.class);

                    getLastPalletIDResponse179 = skel.getLastPalletID(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getLastPalletIDResponse179, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getLastPalletIDResponse"));
                } else
                 if ("putPartOnPallet".equals(methodName)) {
                    webservice.PutPartOnPalletResponse putPartOnPalletResponse181 =
                        null;
                    webservice.PutPartOnPallet wrappedParam = (webservice.PutPartOnPallet) fromOM(msgContext.getEnvelope()
                                                                                                            .getBody()
                                                                                                            .getFirstElement(),
                            webservice.PutPartOnPallet.class);

                    putPartOnPalletResponse181 = skel.putPartOnPallet(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            putPartOnPalletResponse181, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "putPartOnPalletResponse"));
                } else
                 if ("removePartFromPalletByQuantity".equals(methodName)) {
                    webservice.RemovePartFromPalletByQuantityResponse removePartFromPalletByQuantityResponse183 =
                        null;
                    webservice.RemovePartFromPalletByQuantity wrappedParam = (webservice.RemovePartFromPalletByQuantity) fromOM(msgContext.getEnvelope()
                                                                                                                                          .getBody()
                                                                                                                                          .getFirstElement(),
                            webservice.RemovePartFromPalletByQuantity.class);

                    removePartFromPalletByQuantityResponse183 = skel.removePartFromPalletByQuantity(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            removePartFromPalletByQuantityResponse183, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "removePartFromPalletByQuantityResponse"));
                } else
                 if ("getPackages".equals(methodName)) {
                    webservice.GetPackagesResponse getPackagesResponse185 = null;
                    webservice.GetPackages wrappedParam = (webservice.GetPackages) fromOM(msgContext.getEnvelope()
                                                                                                    .getBody()
                                                                                                    .getFirstElement(),
                            webservice.GetPackages.class);

                    getPackagesResponse185 = skel.getPackages(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getPackagesResponse185, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "getPackagesResponse"));
                } else
                 if ("trackCarParts".equals(methodName)) {
                    webservice.TrackCarPartsResponse trackCarPartsResponse187 = null;
                    webservice.TrackCarParts wrappedParam = (webservice.TrackCarParts) fromOM(msgContext.getEnvelope()
                                                                                                        .getBody()
                                                                                                        .getFirstElement(),
                            webservice.TrackCarParts.class);

                    trackCarPartsResponse187 = skel.trackCarParts(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            trackCarPartsResponse187, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "trackCarPartsResponse"));
                } else
                 if ("insertPallet".equals(methodName)) {
                    webservice.InsertPalletResponse insertPalletResponse189 = null;
                    webservice.InsertPallet wrappedParam = (webservice.InsertPallet) fromOM(msgContext.getEnvelope()
                                                                                                      .getBody()
                                                                                                      .getFirstElement(),
                            webservice.InsertPallet.class);

                    insertPalletResponse189 = skel.insertPallet(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            insertPalletResponse189, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "insertPalletResponse"));
                } else
                 if ("putPartsOnPallet".equals(methodName)) {
                    webservice.PutPartsOnPalletResponse putPartsOnPalletResponse191 =
                        null;
                    webservice.PutPartsOnPallet wrappedParam = (webservice.PutPartsOnPallet) fromOM(msgContext.getEnvelope()
                                                                                                              .getBody()
                                                                                                              .getFirstElement(),
                            webservice.PutPartsOnPallet.class);

                    putPartsOnPalletResponse191 = skel.putPartsOnPallet(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            putPartsOnPalletResponse191, false,
                            new javax.xml.namespace.QName("http://webservice",
                                "putPartsOnPalletResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (WSInterfaceRemoteExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                "WSInterfaceRemoteException");

            org.apache.axis2.AxisFault f = createAxisFault(e);

            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }

            throw f;
        }
        catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(webservice.RemovePackage param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePackage.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePackageResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.WSInterfaceRemoteException param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.WSInterfaceRemoteException.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.PutPartIntoPackage param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.PutPartIntoPackage.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.PutPartIntoPackageResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.PutPartIntoPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.InsertCar param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertCar.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.InsertCarResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertCarResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.InsertPartWithQuantity param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPartWithQuantity.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.InsertPartWithQuantityResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPartWithQuantityResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPackageByQuantity param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPackageByQuantity.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPackageByQuantityResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPackageByQuantityResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPackage param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPackage.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPackageResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetPartsForPallet param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPartsForPallet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetPartsForPalletResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPartsForPalletResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.InsertPart param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPart.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.InsertPartResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPartResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.RemoveCar param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemoveCar.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemoveCarResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemoveCarResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetLastPackageID param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetLastPackageID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetLastPackageIDResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetLastPackageIDResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.InsertPackage param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPackage.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.InsertPackageResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetPartsForPackage param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPartsForPackage.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetPartsForPackageResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPartsForPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.GetCars param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetCars.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetCarsResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetCarsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.GetPallets param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPallets.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetPalletsResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPalletsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.RemovePart param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePart.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.RemovePallet param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePallet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePalletResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePalletResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPallet param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPallet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPalletResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPalletResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetLastPalletID param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetLastPalletID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetLastPalletIDResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetLastPalletIDResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.PutPartOnPallet param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.PutPartOnPallet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.PutPartOnPalletResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.PutPartOnPalletResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPalletByQuantity param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPalletByQuantity.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.RemovePartFromPalletByQuantityResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.RemovePartFromPalletByQuantityResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.GetPackages param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPackages.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.GetPackagesResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.GetPackagesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.TrackCarParts param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.TrackCarParts.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.TrackCarPartsResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.TrackCarPartsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(webservice.InsertPallet param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPallet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.InsertPalletResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.InsertPalletResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.PutPartsOnPallet param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.PutPartsOnPallet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        webservice.PutPartsOnPalletResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(webservice.PutPartsOnPalletResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePackageResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePackageResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePackageResponse wrapremovePackage() {
        webservice.RemovePackageResponse wrappedElement = new webservice.RemovePackageResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.PutPartIntoPackageResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.PutPartIntoPackageResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.PutPartIntoPackageResponse wrapputPartIntoPackage() {
        webservice.PutPartIntoPackageResponse wrappedElement = new webservice.PutPartIntoPackageResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.InsertCarResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.InsertCarResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.InsertCarResponse wrapinsertCar() {
        webservice.InsertCarResponse wrappedElement = new webservice.InsertCarResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.InsertPartWithQuantityResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.InsertPartWithQuantityResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.InsertPartWithQuantityResponse wrapinsertPartWithQuantity() {
        webservice.InsertPartWithQuantityResponse wrappedElement = new webservice.InsertPartWithQuantityResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePartFromPackageByQuantityResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePartFromPackageByQuantityResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePartFromPackageByQuantityResponse wrapremovePartFromPackageByQuantity() {
        webservice.RemovePartFromPackageByQuantityResponse wrappedElement = new webservice.RemovePartFromPackageByQuantityResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetPartsForPalletResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetPartsForPalletResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetPartsForPalletResponse wrapgetPartsForPallet() {
        webservice.GetPartsForPalletResponse wrappedElement = new webservice.GetPartsForPalletResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePartFromPackageResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePartFromPackageResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePartFromPackageResponse wrapremovePartFromPackage() {
        webservice.RemovePartFromPackageResponse wrappedElement = new webservice.RemovePartFromPackageResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.InsertPartResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.InsertPartResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.InsertPartResponse wrapinsertPart() {
        webservice.InsertPartResponse wrappedElement = new webservice.InsertPartResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemoveCarResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemoveCarResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemoveCarResponse wrapremoveCar() {
        webservice.RemoveCarResponse wrappedElement = new webservice.RemoveCarResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetLastPackageIDResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetLastPackageIDResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetLastPackageIDResponse wrapgetLastPackageID() {
        webservice.GetLastPackageIDResponse wrappedElement = new webservice.GetLastPackageIDResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.InsertPackageResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.InsertPackageResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.InsertPackageResponse wrapinsertPackage() {
        webservice.InsertPackageResponse wrappedElement = new webservice.InsertPackageResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetPartsForPackageResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetPartsForPackageResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetPartsForPackageResponse wrapgetPartsForPackage() {
        webservice.GetPartsForPackageResponse wrappedElement = new webservice.GetPartsForPackageResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetCarsResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetCarsResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetCarsResponse wrapgetCars() {
        webservice.GetCarsResponse wrappedElement = new webservice.GetCarsResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetPalletsResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetPalletsResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetPalletsResponse wrapgetPallets() {
        webservice.GetPalletsResponse wrappedElement = new webservice.GetPalletsResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePartResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePartResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePartResponse wrapremovePart() {
        webservice.RemovePartResponse wrappedElement = new webservice.RemovePartResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePalletResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePalletResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePalletResponse wrapremovePallet() {
        webservice.RemovePalletResponse wrappedElement = new webservice.RemovePalletResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePartFromPalletResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePartFromPalletResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePartFromPalletResponse wrapremovePartFromPallet() {
        webservice.RemovePartFromPalletResponse wrappedElement = new webservice.RemovePartFromPalletResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetLastPalletIDResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetLastPalletIDResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetLastPalletIDResponse wrapgetLastPalletID() {
        webservice.GetLastPalletIDResponse wrappedElement = new webservice.GetLastPalletIDResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.PutPartOnPalletResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.PutPartOnPalletResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.PutPartOnPalletResponse wrapputPartOnPallet() {
        webservice.PutPartOnPalletResponse wrappedElement = new webservice.PutPartOnPalletResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.RemovePartFromPalletByQuantityResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.RemovePartFromPalletByQuantityResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.RemovePartFromPalletByQuantityResponse wrapremovePartFromPalletByQuantity() {
        webservice.RemovePartFromPalletByQuantityResponse wrappedElement = new webservice.RemovePartFromPalletByQuantityResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.GetPackagesResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.GetPackagesResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.GetPackagesResponse wrapgetPackages() {
        webservice.GetPackagesResponse wrappedElement = new webservice.GetPackagesResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.TrackCarPartsResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.TrackCarPartsResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.TrackCarPartsResponse wraptrackCarParts() {
        webservice.TrackCarPartsResponse wrappedElement = new webservice.TrackCarPartsResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.InsertPalletResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.InsertPalletResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.InsertPalletResponse wrapinsertPallet() {
        webservice.InsertPalletResponse wrappedElement = new webservice.InsertPalletResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        webservice.PutPartsOnPalletResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    webservice.PutPartsOnPalletResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private webservice.PutPartsOnPalletResponse wrapputPartsOnPallet() {
        webservice.PutPartsOnPalletResponse wrappedElement = new webservice.PutPartsOnPalletResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (webservice.GetCars.class.equals(type)) {
                return webservice.GetCars.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetCarsResponse.class.equals(type)) {
                return webservice.GetCarsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetLastPackageID.class.equals(type)) {
                return webservice.GetLastPackageID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetLastPackageIDResponse.class.equals(type)) {
                return webservice.GetLastPackageIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetLastPalletID.class.equals(type)) {
                return webservice.GetLastPalletID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetLastPalletIDResponse.class.equals(type)) {
                return webservice.GetLastPalletIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPackages.class.equals(type)) {
                return webservice.GetPackages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPackagesResponse.class.equals(type)) {
                return webservice.GetPackagesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPallets.class.equals(type)) {
                return webservice.GetPallets.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPalletsResponse.class.equals(type)) {
                return webservice.GetPalletsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPartsForPackage.class.equals(type)) {
                return webservice.GetPartsForPackage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPartsForPackageResponse.class.equals(type)) {
                return webservice.GetPartsForPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPartsForPallet.class.equals(type)) {
                return webservice.GetPartsForPallet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.GetPartsForPalletResponse.class.equals(type)) {
                return webservice.GetPartsForPalletResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertCar.class.equals(type)) {
                return webservice.InsertCar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertCarResponse.class.equals(type)) {
                return webservice.InsertCarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPackage.class.equals(type)) {
                return webservice.InsertPackage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPackageResponse.class.equals(type)) {
                return webservice.InsertPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPallet.class.equals(type)) {
                return webservice.InsertPallet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPalletResponse.class.equals(type)) {
                return webservice.InsertPalletResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPart.class.equals(type)) {
                return webservice.InsertPart.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPartResponse.class.equals(type)) {
                return webservice.InsertPartResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPartWithQuantity.class.equals(type)) {
                return webservice.InsertPartWithQuantity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.InsertPartWithQuantityResponse.class.equals(type)) {
                return webservice.InsertPartWithQuantityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.PutPartIntoPackage.class.equals(type)) {
                return webservice.PutPartIntoPackage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.PutPartIntoPackageResponse.class.equals(type)) {
                return webservice.PutPartIntoPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.PutPartOnPallet.class.equals(type)) {
                return webservice.PutPartOnPallet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.PutPartOnPalletResponse.class.equals(type)) {
                return webservice.PutPartOnPalletResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.PutPartsOnPallet.class.equals(type)) {
                return webservice.PutPartsOnPallet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.PutPartsOnPalletResponse.class.equals(type)) {
                return webservice.PutPartsOnPalletResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemoveCar.class.equals(type)) {
                return webservice.RemoveCar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemoveCarResponse.class.equals(type)) {
                return webservice.RemoveCarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePackage.class.equals(type)) {
                return webservice.RemovePackage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePackageResponse.class.equals(type)) {
                return webservice.RemovePackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePallet.class.equals(type)) {
                return webservice.RemovePallet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePalletResponse.class.equals(type)) {
                return webservice.RemovePalletResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePart.class.equals(type)) {
                return webservice.RemovePart.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPackage.class.equals(type)) {
                return webservice.RemovePartFromPackage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPackageByQuantity.class.equals(type)) {
                return webservice.RemovePartFromPackageByQuantity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPackageByQuantityResponse.class.equals(
                        type)) {
                return webservice.RemovePartFromPackageByQuantityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPackageResponse.class.equals(type)) {
                return webservice.RemovePartFromPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPallet.class.equals(type)) {
                return webservice.RemovePartFromPallet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPalletByQuantity.class.equals(type)) {
                return webservice.RemovePartFromPalletByQuantity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPalletByQuantityResponse.class.equals(
                        type)) {
                return webservice.RemovePartFromPalletByQuantityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartFromPalletResponse.class.equals(type)) {
                return webservice.RemovePartFromPalletResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.RemovePartResponse.class.equals(type)) {
                return webservice.RemovePartResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.TrackCarParts.class.equals(type)) {
                return webservice.TrackCarParts.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.TrackCarPartsResponse.class.equals(type)) {
                return webservice.TrackCarPartsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (webservice.WSInterfaceRemoteException.class.equals(type)) {
                return webservice.WSInterfaceRemoteException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
