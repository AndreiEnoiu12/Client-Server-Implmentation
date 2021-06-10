package LogicTier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import model.Car;
import model.Package;
import model.Pallet;
import model.Part;

public interface LogicTierInterface extends Remote{
	public String insertPallet(int max_weight, String type) throws RemoteException;
	public String insertCar(String chassis_nr,String model,int weight) throws RemoteException;
	public String insertPart(String chassis_nr, String part_name, int weight) throws RemoteException;
	public String insertPartWithQuantity(String chassis_nr, String part_name, int weight, int quantity) throws RemoteException;
	public String insertPackage(String type, String destination) throws RemoteException;
	
	public String getPallets() throws RemoteException; //without parts
	public String getPackages() throws RemoteException; //without parts
	public String getCars() throws RemoteException;
	public String trackCarParts(String chassis_nr) throws RemoteException;
	public String getPartsForPallet(int pallet_id) throws RemoteException;
	public String getPartsForPackage(int package_id) throws RemoteException;
	public int getLastPackageID() throws RemoteException;
	public int getLastPalletID() throws RemoteException;
	
	public String removePallet(int pallet_id) throws RemoteException;
	public String removePackage(int package_id) throws RemoteException;
	public String removeCar(String chassis_nr) throws RemoteException;
	public String removePart(String chassis_nr, String part_name) throws RemoteException;
	
	public String putPartOnPallet(String part_chassis_nr, String part_name, int pallet_id) throws RemoteException;
	public String putPartsOnPallet(String part_chassis_nr, String part_name, int pallet_id, int quantity) throws RemoteException;

	public String putPartIntoPackage(String part_chassis_nr, String part_name, int package_id) throws RemoteException;
	public String removePartFromPallet(String chassis_nr, String part_name, int pallet_id) throws RemoteException;
	public String removePartFromPackage(String chassis_nr, String part_name, int package_id) throws RemoteException;
	public String removePartFromPackageByQuantity(String chassis_nr, String part_name, int package_id, int quantity) throws RemoteException;
	public String removePartFromPalletByQuantity(String chassis_nr, String part_name, int pallet_id, int quantity) throws RemoteException;
}
