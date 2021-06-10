package LogicTier;

import DataTier.RemoteDatabaseServer;

public class ClientMain {
	
 public static void main(String[] args) throws Exception {
	 
	 LogicTier logic = new LogicTier();
	 
	 logic.insertCar("Dacia", "WORK5", 800);
	 
	 
	// RemoteDatabaseServer rds = new RemoteDatabaseServer();
	 //System.out.println(rds.insertCar("WORK2", "Dacia", 600));
	 
	
	 
}
}
