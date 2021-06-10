package DataTier;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Car;
import model.Package;
import model.Pallet;
import model.Part;

public class RemoteDatabaseServer extends UnicastRemoteObject implements RDSInterface{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Connection con;
	public RemoteDatabaseServer() throws Exception {
		super();
  	  getConnection();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	   {
	      try
	      {
	    	  

	          LocateRegistry.createRegistry( 1099);
	          	 RDSInterface server = new RemoteDatabaseServer();
		         Naming.rebind("DataTier",  server);
		         System.out.println("DataTier is starting"); 
		         System.out.println(con.toString());

	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }

	   }
	
	
	
	public static Connection getConnection() throws Exception
	{
		try
		{
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/dissasembly_system?useSSL=false";
			String username = "Tugbars";
			String password = "Th662452";
			
			Class.forName(driver);
			
	        con = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			
			return con;
		}
		catch (Exception e) { 
		System.out.println(e); }
	return null;
	}
	public String insertPallet(int max_weight, String type_of_parts) throws RemoteException {
		String msg = "";
		String query = "INSERT INTO pallet (max_weight_cap, type_of_parts) values (?,?)";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1,max_weight);
			statement.setString(2, type_of_parts);
			statement.execute();
			msg = "Pallet inserted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}

	
	public String insertCar(String chassis_nr, String model, int weight) throws RemoteException {
		String msg = "";
		String query = "INSERT INTO car(chassis_nr, model, weight) values (?, ?, ?)";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,chassis_nr);
			statement.setString(2, model);
			statement.setInt(3, weight);
			statement.execute();
			msg = "Car inserted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}

	
	public String insertPart(String chassis_nr, String part_name, int weight) throws RemoteException {
		String msg = "";
		String query = "INSERT INTO part(chassis_nr, part_name, weight) values (?, ?, ?) " + 
				"ON DUPLICATE KEY UPDATE quantity = quantity+1";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,chassis_nr);
			statement.setString(2, part_name);
			statement.setInt(3, weight);
			statement.execute();
			msg = "Part inserted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}

	
	public String insertPartWithQuantity(String chassis_nr, String part_name, int weight, int quantity) throws RemoteException {
		String msg = "";
		String query = "INSERT INTO part(chassis_nr, part_name, weight, quantity) values (?, ?, ?, ?) " + 
				"ON DUPLICATE KEY UPDATE quantity = quantity + ?";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,chassis_nr);
			statement.setString(2, part_name);
			statement.setInt(3, weight);
			statement.setInt(4, quantity);
			statement.setInt(5, quantity);
			statement.execute();
			msg = "Part inserted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}

	
	public String insertPackage(String type, String destination)  throws RemoteException {
		String msg = "";
		String query = "INSERT INTO package(type,destination) values (?, ?)";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,type);
			statement.setString(2, destination);
			statement.execute();
			msg = "Package inserted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}

	
	public ArrayList<Pallet> getPallets()  throws RemoteException {
		
		String query = "SELECT id, max_weight_cap, type_of_parts FROM pallet";
		ArrayList<Pallet> palletList = new ArrayList<Pallet>();
	try {
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet rs = statement.executeQuery(query);
		while(rs.next())
		{
			int id = rs.getInt("id");
			int maxweight = rs.getInt("max_weight_cap");
			String type = rs.getString("type_of_parts");
			
			Pallet pallet = new Pallet(id,maxweight,type);
			palletList.add(pallet);
			System.out.println(pallet);
	
		}
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return palletList;
	}
	
	
	public int getLastPalletID()  throws RemoteException
	{
		int id = 0;
		String query = "SELECT id FROM pallet WHERE ID = (SELECT MAX(ID) FROM pallet)";
	try {
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet rs = statement.executeQuery(query);
		rs.next();
			id = rs.getInt("id");
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return id;
	}

	public int getLastPackageID()  throws RemoteException
	{
		int id = 0;
		String query = "SELECT id FROM package WHERE id = (SELECT MAX(id) FROM package)";
	try {
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet rs = statement.executeQuery(query);
		rs.next();
			id = rs.getInt("id");
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return id;
	}

	
	public ArrayList<Package> getPackages() throws RemoteException {

		String query = "SELECT id, type, destination FROM package";
		ArrayList<Package> packageList = new ArrayList<Package>();
	try {
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet rs = statement.executeQuery(query);
		while(rs.next())
		{
			int id = rs.getInt("id");
			String type = rs.getString("type");
			String destination = rs.getString("destination");
			packageList.add(new Package(id,type,destination));
	
		}
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return packageList;
	}

	
	public ArrayList<Car> getCars() throws RemoteException {
		
		String query = "SELECT chassis_nr, weight, model FROM car";
		ArrayList<Car> carList = new ArrayList<Car>();
	try {
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet rs = statement.executeQuery(query);
		while(rs.next())
		{
			String chassis_nr = rs.getString("chassis_nr");
			int weight = rs.getInt("weight");
			String model = rs.getString("model");
			
			Car car = new Car(chassis_nr, model, weight);
			carList.add(car);
	
		}
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return carList;
	}

	
	public ArrayList<Part> trackCarParts(String chassis_nr) throws RemoteException{
		
		String query = "SELECT part.part_name, part.weight, package_parts.part_quantity," +
				" pallet_parts.pallet_id, package.destination FROM part " + 
				"JOIN car on car.chassis_nr = part.chassis_nr " + 
				"JOIN pallet_parts on part.chassis_nr = pallet_parts.part_chassis_nr AND part.part_name = pallet_parts.part_name " + 
				"JOIN package_parts on package_parts.part_chassis_nr = part.chassis_nr AND part.part_name = package_parts.part_name " + 
				"JOIN package on package_parts.package_id = package.id WHERE part.chassis_nr = ?";
		ArrayList<Part> partList = new ArrayList<Part>();
		try {
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,chassis_nr);
		ResultSet rs = statement.executeQuery();
		while(rs.next())
		{
			String part_name = rs.getString("part_name");
			int weight = rs.getInt("weight");
			int quantity = rs.getInt("part_quantity");
			int pallet_id = rs.getInt("pallet_id");
			String destination = rs.getString("destination");
			
			partList.add(new Part(chassis_nr, part_name, weight, quantity, pallet_id, destination));
		}
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return partList;
	}

	
	public ArrayList<Part> getPartsForPallet(int pallet_id) throws RemoteException{
		
		String query = "SELECT part.chassis_nr, part.part_name, part.weight, pallet_parts.part_quantity FROM pallet_parts " + 
				"JOIN part ON part.chassis_nr = pallet_parts.part_chassis_nr AND part.part_name = pallet_parts.part_name " + 
				"WHERE pallet_parts.pallet_id = ? ";
		ArrayList<Part> partList = new ArrayList<Part>();
	try {
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1,pallet_id);
		ResultSet rs = statement.executeQuery();
		while(rs.next())
		{
			String chassis_nr = rs.getString("chassis_nr");
			String part_name = rs.getString("part_name");
			int weight = rs.getInt("weight");
			int quantity = rs.getInt("part_quantity");
			
			partList.add(new Part(chassis_nr, part_name, weight, quantity));
		}
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return partList;
	}

	
	public ArrayList<Part> getPartsForPackage(int package_id) throws RemoteException{
		
		String query = "SELECT part.chassis_nr, part.part_name, part.weight, package_parts.part_quantity FROM package_parts " + 
				"JOIN part ON part.chassis_nr = package_parts.part_chassis_nr AND part.part_name = package_parts.part_name " + 
				"WHERE package_parts.package_id = ?";
		ArrayList<Part> partList = new ArrayList<Part>();
	try {
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1,package_id);
		ResultSet rs = statement.executeQuery();
		while(rs.next())
		{
			String chassis_nr = rs.getString("chassis_nr");
			String part_name = rs.getString("part_name");
			int weight = rs.getInt("weight");
			int quantity = rs.getInt("part_quantity");
			
			partList.add(new Part(chassis_nr, part_name, weight, quantity));
		}
	}
	catch (Exception e ) {
        System.out.println(e);
    }
		return partList;
	}

	
	public String removePallet(int pallet_id) throws RemoteException{
		String query = "DELETE FROM pallet_parts WHERE id = ?";
			String msg = "";
			try {
				PreparedStatement statement = con.prepareStatement(query);
		        statement.setInt(1, pallet_id);
				statement.execute();
				query = "DELETE FROM pallet WHERE id = ?";
				statement = con.prepareStatement(query);
		        statement.setInt(1, pallet_id);
				statement.execute();
				msg = "Pallet removed";
				
			} catch (Exception e) {
				msg = e.getMessage();
				e.printStackTrace();
			}
			return msg;
	}

	
	public String removePackage(int package_id) throws RemoteException{
		String query = " DELETE FROM package_parts WHERE package_id = ?; ";
		String msg = "";
		try {
			PreparedStatement statement = con.prepareStatement(query);
	        statement.setInt(1, package_id);
			statement.execute();
			
			query = "DELETE FROM package WHERE id = ?";
			statement = con.prepareStatement(query);
	        statement.setInt(1, package_id);
			statement.execute();
			
			msg = "Package removed";
			
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	
	public String removeCar(String chassis_nr) throws RemoteException{
		String query = " DELETE FROM package_parts WHERE part_chassis_nr = ?; ";
		String msg = "";
		try {
			PreparedStatement statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
			statement.execute();
			
			query = "DELETE FROM pallet_parts WHERE part_chassis_nr = ?";
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
			statement.execute();
			
			query = "DELETE FROM part WHERE chassis_nr = ?";
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
			statement.execute();
			
			query = "DELETE FROM car WHERE chassis_nr = ?";
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
			statement.execute();
			msg = "Car removed";
			
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	
	public String removePart(String chassis_nr, String part_name) throws RemoteException{
		String query = " DELETE FROM package_parts WHERE part_chassis_nr = ? AND part_name = ?";
		String msg = "";
		try {
			PreparedStatement statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
	        statement.setString(2, part_name);
			statement.execute();
			
			query = "DELETE FROM pallet_parts WHERE part_chassis_nr = ? AND part_name = ?";
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
	        statement.setString(2, part_name);
			statement.execute();
			
			query = "DELETE FROM part WHERE chassis_nr = ? AND part_name = ?";
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
	        statement.setString(2, part_name);
			statement.execute();
			
			msg = "Part removed";
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	
	public String putPartOnPallet(String part_chassis_nr, String part_name, int pallet_id) throws RemoteException{
		String msg = "";
		String query = "INSERT INTO pallet_parts(part_chassis_nr, part_name, pallet_id) values (?, ?, ?) " + 
				"ON DUPLICATE KEY UPDATE part_quantity = part_quantity + 1";
		try {
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,part_chassis_nr);
			statement.setString(2, part_name);
			statement.setInt(3, pallet_id);
			statement.execute();
			msg = "Part put on pallet";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}
	
	public String putPartsOnPallet(String part_chassis_nr, String part_name, int pallet_id, int part_quantity) throws RemoteException{
		String msg = "";
		String query = "INSERT INTO pallet_parts(part_chassis_nr, part_name, pallet_id, part_quantity) values (?, ?, ?, ?) " + 
				"ON DUPLICATE KEY UPDATE part_quantity = part_quantity + ?";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,part_chassis_nr);
			statement.setString(2, part_name);
			statement.setInt(3, pallet_id);
			statement.setInt(4, part_quantity);
			statement.setInt(5, part_quantity);
			statement.execute();
			msg = "Parts put on pallet";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}
	

	
	public String putPartIntoPackage(String part_chassis_nr, String part_name, int package_id) throws RemoteException{
		String msg = "";
		String query = "INSERT INTO package_parts(part_chassis_nr, part_name, package_id) values (?, ?, ?) " + 
				"ON DUPLICATE KEY UPDATE part_quantity = part_quantity + 1";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,part_chassis_nr);
			statement.setString(2, part_name);
			statement.setInt(3, package_id);
			statement.execute();
			msg = "Part put in package";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}
	
	public String putPartsIntoPackage(String part_chassis_nr, String part_name, int package_id, int part_quantity) throws RemoteException{
		String msg = "";
		String query = "INSERT INTO package_parts(part_chassis_nr, part_name, package_id, part_quantity) values (?, ?, ?, ?) " + 
				"ON DUPLICATE KEY UPDATE part_quantity = part_quantity + ?";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,part_chassis_nr);
			statement.setString(2, part_name);
			statement.setInt(3, package_id);
			statement.setInt(4, part_quantity);
			statement.setInt(5, part_quantity);
			statement.execute();
			msg = "Parts put in package";
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}
	

	
	public String removePartFromPallet(String chassis_nr, String part_name, int pallet_id) throws RemoteException{
		String msg = "";
		String query = "DELETE FROM pallet_parts WHERE part_chassis_nr = ? AND part_name = ? AND pallet_id = ?";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
	        statement.setString(2, part_name);
	        statement.setInt(3, pallet_id);
			statement.execute();
			msg = "Part removed from pallet";
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}
	
	public String removePartFromPalletByQuantity(String chassis_nr, String part_name, int pallet_id, int quantity) throws RemoteException{
		String msg = "";
		String query = "UPDATE pallet_parts SET part_quantity = part_quantity - ? WHERE part_chassis_nr = ? AND part_name = ? AND pallet_id = ?";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement = con.prepareStatement(query);
	        statement.setInt(1, quantity);
	        statement.setString(2, chassis_nr);
	        statement.setString(3, part_name);
	        statement.setInt(4, pallet_id);

	        
			statement.execute();
			msg = "Part removed from pallet";
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}
	
	public String removePartFromPackageByQuantity(String chassis_nr, String part_name, int package_id, int quantity) throws RemoteException {
		String msg = "";
		String query = "UPDATE package_parts SET part_quantity = part_quantity - ? WHERE part_chassis_nr = ? AND part_name = ? AND package_id = ?";
		try {


			PreparedStatement statement = con.prepareStatement(query);
			statement = con.prepareStatement(query);
	        statement.setInt(1, quantity);
	        statement.setString(2, chassis_nr);
	        statement.setString(3, part_name);
	        statement.setInt(4, package_id);

	        
			statement.execute();
			msg = "Part removed from package";
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}

	
	public String removePartFromPackage(String chassis_nr, String part_name, int package_id) throws RemoteException{
		String msg = "";
		String query = "DELETE FROM pallet_parts WHERE part_chassis_nr = ? AND part_name = ? AND package_id = ?";
		try {
			PreparedStatement statement = con.prepareStatement(query);
			statement = con.prepareStatement(query);
	        statement.setString(1, chassis_nr);
	        statement.setString(2, part_name);
	        statement.setInt(3, package_id);
			statement.execute();
			msg = "Part removed from package";
		} catch (Exception e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return msg;
	}
}
