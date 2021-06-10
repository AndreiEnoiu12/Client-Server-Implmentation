import java.rmi.Remote;
import java.util.ArrayList;

import model.Car;
import model.Pallet;
import model.Part;
import model.Package;

public interface IDB extends Remote{
	public String insertPallet(int max_weight, String type);
	public String insertCar(String chassis_nr,String model,int weight);
	public String insertPart(String chassis_nr, String part_name, int weight);
	public String insertPartWithQuantity(String chassis_nr, String part_name, int weight, int quantity);
	public String insertPackage(String type, String destination);
	
	public ArrayList<Pallet> getPallets(); //without parts
	public ArrayList<Package> getPackages(); //without parts
	public ArrayList<Car> getCars();
	public ArrayList<Part> trackCarParts(String chassis_nr);
	public ArrayList<Part> getPartsForPallet(int pallet_id);
	public ArrayList<Part> getPartsForPackage(int package_id);
	public int getLastPackageID();
	public int getLastPalletID();


	
	public String removePallet(int pallet_id);
	public String removePackage(int package_id);
	public String removeCar(String chassis_nr);
	public String removePart(String chassis_nr, String part_name);
	
	public String putPartOnPallet(String part_chassis_nr, String part_name, int pallet_id);
	public String putPartsOnPallet(String part_chassis_nr, String part_name, int pallet_id, int quantity);

	public String putPartIntoPackage(String part_chassis_nr, String part_name, int package_id);
	public String removePartFromPallet(String chassis_nr, String part_name, int pallet_id);
	public String removePartFromPackage(String chassis_nr, String part_name, int package_id);
	public String removePartFromPackageByQuantity(String chassis_nr, String part_name, int package_id, int quantity);
	public String removePartFromPalletByQuantity(String chassis_nr, String part_name, int pallet_id, int quantity);
}
