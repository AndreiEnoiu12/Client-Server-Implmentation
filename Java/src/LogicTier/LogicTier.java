package LogicTier;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import DataTier.RDSInterface;
import model.Car;
import model.Package;
import model.Pallet;
import model.Part;

public class LogicTier implements LogicTierInterface {

	private RDSInterface rds;
	public LogicTier() throws MalformedURLException, RemoteException, NotBoundException
	{
		rds = (RDSInterface)  Naming.lookup("rmi://localhost:1099/DataTier");
	}
	@Override
	public String insertPallet(int max_weight, String type) throws RemoteException {
		return rds.insertPallet(max_weight, type);
	}
	@Override
	public String insertCar(String chassis_nr, String model, int weight) throws RemoteException {
		return rds.insertCar(chassis_nr, model, weight);
	}
	@Override
	public String insertPart(String chassis_nr, String part_name, int weight) throws RemoteException {
		return rds.insertPart(chassis_nr, part_name, weight);
	}
	@Override
	public String insertPartWithQuantity(String chassis_nr, String part_name, int weight, int quantity)
			throws RemoteException {
		return rds.insertPartWithQuantity(chassis_nr, part_name, weight, quantity);
	}
	@Override
	public String insertPackage(String type, String destination) throws RemoteException {
		return rds.insertPackage(type, destination);
	}
	@Override
	public String getPallets() throws RemoteException {
		rds.getPallets();
		return "";
	}
	@Override
	public String getPackages() throws RemoteException {
		rds.getPackages();
		return "";
	}
	@Override
	public String getCars() throws RemoteException {
		ArrayList<Car> cars = rds.getCars();
		String carsString = "";
		carsString += "chassis_nr, model, weight, ";
		
		for(Car car : cars)
		{
			if(car != null)
			{
				carsString += car.getchassis_nr() + ", " + car.getmodel() + ", " + car.getWeight() + ", ";
 			}
		}
		return carsString;
	}
	@Override
	public String trackCarParts(String chassis_nr) throws RemoteException {
		rds.trackCarParts(chassis_nr);
		return " ";
	}
	@Override
	public String getPartsForPallet(int pallet_id) throws RemoteException {
		 rds.getPartsForPallet(pallet_id);
		return " ";
	}
	@Override
	public String getPartsForPackage(int package_id) throws RemoteException {
		rds.getPartsForPackage(package_id);
		return " ";
	}
	@Override
	public int getLastPackageID() throws RemoteException {
		return rds.getLastPackageID();
	}
	@Override
	public int getLastPalletID() throws RemoteException {
		return rds.getLastPalletID();
	}
	@Override
	public String removePallet(int pallet_id) throws RemoteException {
		return rds.removePallet(pallet_id);
	}
	@Override
	public String removePackage(int package_id) throws RemoteException {
		return rds.removePackage(package_id);
	}
	@Override
	public String removeCar(String chassis_nr) throws RemoteException {
		return rds.removeCar(chassis_nr);
	}
	@Override
	public String removePart(String chassis_nr, String part_name) throws RemoteException {
		return rds.removePart(part_name, part_name);
	}
	@Override
	public String putPartOnPallet(String part_chassis_nr, String part_name, int pallet_id) throws RemoteException {
		return rds.putPartOnPallet(part_chassis_nr, part_name, pallet_id);
	}
	@Override
	public String putPartsOnPallet(String part_chassis_nr, String part_name, int pallet_id, int quantity)
			throws RemoteException {
		return rds.putPartsOnPallet(part_chassis_nr, part_name, quantity, quantity);
	}
	@Override
	public String putPartIntoPackage(String part_chassis_nr, String part_name, int package_id) throws RemoteException {
		return rds.putPartIntoPackage(part_chassis_nr, part_name, package_id);
	}
	@Override
	public String removePartFromPallet(String chassis_nr, String part_name, int pallet_id) throws RemoteException {
		return rds.removePartFromPallet(chassis_nr, part_name, pallet_id);
	}
	@Override
	public String removePartFromPackage(String chassis_nr, String part_name, int package_id) throws RemoteException {
		return rds.removePartFromPackage(chassis_nr, part_name, package_id);
	}
	@Override
	public String removePartFromPackageByQuantity(String chassis_nr, String part_name, int package_id, int quantity)
			throws RemoteException {
		return rds.removePartFromPackageByQuantity(chassis_nr, part_name, package_id, quantity);
	}
	@Override
	public String removePartFromPalletByQuantity(String chassis_nr, String part_name, int pallet_id, int quantity)
			throws RemoteException {
		return rds.removePartFromPalletByQuantity(chassis_nr, part_name, pallet_id, quantity);
	}
}
