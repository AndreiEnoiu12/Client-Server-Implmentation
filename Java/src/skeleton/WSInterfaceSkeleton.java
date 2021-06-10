/**
 * WSInterfaceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package skeleton;

import LogicTier.LogicTier;
import webservice.InsertCarResponse;
import webservice.GetCarsResponse;

/**
 *  WSInterfaceSkeleton java skeleton for the axisService
 */
public class WSInterfaceSkeleton implements WSInterfaceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param removePackage0
     * @return removePackageResponse1
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePackageResponse removePackage(
        webservice.RemovePackage removePackage0)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePackage");
    }

    /**
     * Auto generated method signature
     *
     * @param putPartIntoPackage2
     * @return putPartIntoPackageResponse3
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.PutPartIntoPackageResponse putPartIntoPackage(
        webservice.PutPartIntoPackage putPartIntoPackage2)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#putPartIntoPackage");
    }

    /**
     * Auto generated method signature
     *
     * @param insertCar4
     * @return insertCarResponse5
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.InsertCarResponse insertCar(
        webservice.InsertCar insertCar4)
        throws WSInterfaceRemoteExceptionException {
    	InsertCarResponse res = new InsertCarResponse();
    	
    	
   	 try {
   		LogicTier logic = new LogicTier();

   		logic.insertCar(insertCar4.getArgs0(), insertCar4.getArgs1(), insertCar4.getArgs2());
		
		res.set_return("Car: " + insertCar4.getArgs0() + " " + insertCar4.getArgs1() + " inserted");
	} catch (Exception e) {
		res.set_return(e.getMessage());		
		e.printStackTrace();
	}
   	 return res;
    }

    /**
     * Auto generated method signature
     *
     * @param insertPartWithQuantity6
     * @return insertPartWithQuantityResponse7
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.InsertPartWithQuantityResponse insertPartWithQuantity(
        webservice.InsertPartWithQuantity insertPartWithQuantity6)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#insertPartWithQuantity");
    }

    /**
     * Auto generated method signature
     *
     * @param removePartFromPackageByQuantity8
     * @return removePartFromPackageByQuantityResponse9
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePartFromPackageByQuantityResponse removePartFromPackageByQuantity(
        webservice.RemovePartFromPackageByQuantity removePartFromPackageByQuantity8)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePartFromPackageByQuantity");
    }

    /**
     * Auto generated method signature
     *
     * @param removePartFromPackage10
     * @return removePartFromPackageResponse11
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePartFromPackageResponse removePartFromPackage(
        webservice.RemovePartFromPackage removePartFromPackage10)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePartFromPackage");
    }

    /**
     * Auto generated method signature
     *
     * @param getPartsForPallet12
     * @return getPartsForPalletResponse13
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetPartsForPalletResponse getPartsForPallet(
        webservice.GetPartsForPallet getPartsForPallet12)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getPartsForPallet");
    }

    /**
     * Auto generated method signature
     *
     * @param insertPart14
     * @return insertPartResponse15
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.InsertPartResponse insertPart(
        webservice.InsertPart insertPart14)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#insertPart");
    }

    /**
     * Auto generated method signature
     *
     * @param removeCar16
     * @return removeCarResponse17
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemoveCarResponse removeCar(
        webservice.RemoveCar removeCar16)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removeCar");
    }

    /**
     * Auto generated method signature
     *
     * @param getLastPackageID18
     * @return getLastPackageIDResponse19
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetLastPackageIDResponse getLastPackageID(
        webservice.GetLastPackageID getLastPackageID18)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getLastPackageID");
    }

    /**
     * Auto generated method signature
     *
     * @param insertPackage20
     * @return insertPackageResponse21
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.InsertPackageResponse insertPackage(
        webservice.InsertPackage insertPackage20)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#insertPackage");
    }

    /**
     * Auto generated method signature
     *
     * @param getPartsForPackage22
     * @return getPartsForPackageResponse23
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetPartsForPackageResponse getPartsForPackage(
        webservice.GetPartsForPackage getPartsForPackage22)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getPartsForPackage");
    }

    /**
     * Auto generated method signature
     *
     * @param getCars24
     * @return getCarsResponse25
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetCarsResponse getCars(webservice.GetCars getCars24)
        throws WSInterfaceRemoteExceptionException {
    	GetCarsResponse res = new GetCarsResponse();
   	 try {
   		LogicTier logic = new LogicTier();
   		res.set_return(logic.getCars());
			} catch (Exception e) {
		res.set_return(e.getMessage());		
		e.printStackTrace();
	}
   	 return res;
    }

    /**
     * Auto generated method signature
     *
     * @param getPallets26
     * @return getPalletsResponse27
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetPalletsResponse getPallets(
        webservice.GetPallets getPallets26)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getPallets");
    }

    /**
     * Auto generated method signature
     *
     * @param removePart28
     * @return removePartResponse29
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePartResponse removePart(
        webservice.RemovePart removePart28)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePart");
    }

    /**
     * Auto generated method signature
     *
     * @param removePallet30
     * @return removePalletResponse31
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePalletResponse removePallet(
        webservice.RemovePallet removePallet30)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePallet");
    }

    /**
     * Auto generated method signature
     *
     * @param removePartFromPallet32
     * @return removePartFromPalletResponse33
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePartFromPalletResponse removePartFromPallet(
        webservice.RemovePartFromPallet removePartFromPallet32)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePartFromPallet");
    }

    /**
     * Auto generated method signature
     *
     * @param getLastPalletID34
     * @return getLastPalletIDResponse35
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetLastPalletIDResponse getLastPalletID(
        webservice.GetLastPalletID getLastPalletID34)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getLastPalletID");
    }

    /**
     * Auto generated method signature
     *
     * @param putPartOnPallet36
     * @return putPartOnPalletResponse37
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.PutPartOnPalletResponse putPartOnPallet(
        webservice.PutPartOnPallet putPartOnPallet36)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#putPartOnPallet");
    }

    /**
     * Auto generated method signature
     *
     * @param removePartFromPalletByQuantity38
     * @return removePartFromPalletByQuantityResponse39
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.RemovePartFromPalletByQuantityResponse removePartFromPalletByQuantity(
        webservice.RemovePartFromPalletByQuantity removePartFromPalletByQuantity38)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#removePartFromPalletByQuantity");
    }

    /**
     * Auto generated method signature
     *
     * @param getPackages40
     * @return getPackagesResponse41
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.GetPackagesResponse getPackages(
        webservice.GetPackages getPackages40)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getPackages");
    }

    /**
     * Auto generated method signature
     *
     * @param trackCarParts42
     * @return trackCarPartsResponse43
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.TrackCarPartsResponse trackCarParts(
        webservice.TrackCarParts trackCarParts42)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#trackCarParts");
    }

    /**
     * Auto generated method signature
     *
     * @param insertPallet44
     * @return insertPalletResponse45
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.InsertPalletResponse insertPallet(
        webservice.InsertPallet insertPallet44)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#insertPallet");
    }

    /**
     * Auto generated method signature
     *
     * @param putPartsOnPallet46
     * @return putPartsOnPalletResponse47
     * @throws WSInterfaceRemoteExceptionException
     */
    public webservice.PutPartsOnPalletResponse putPartsOnPallet(
        webservice.PutPartsOnPallet putPartsOnPallet46)
        throws WSInterfaceRemoteExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#putPartsOnPallet");
    }
}
