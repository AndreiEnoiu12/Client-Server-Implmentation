package stub;

public class Client
{
	private static final String URL = "http://localhost:8080/axis2/services/WSInterface";
	
	
	public static void main( String[] args )
		throws Exception
	{
//		WSInterfaceStub stub = new WSInterfaceStub( URL );
//		
//		WSInterfaceStub.InsertCar call = new WSInterfaceStub.InsertCar();
//		call.setArgs0("WORK6");
//		call.setArgs1("Dacia");
//		call.setArgs2(800);
//		WSInterfaceStub.InsertCarResponse res = stub.insertCar( call );
//		
//		System.out.println( "Returned: " + res.get_return() );
		
		WSInterfaceStub stub = new WSInterfaceStub( URL );
		
		WSInterfaceStub.GetCars call = new WSInterfaceStub.GetCars();
		WSInterfaceStub.GetCarsResponse res = stub.getCars( call );
		
		System.out.println( "Returned: " + res.get_return() );
	}
}
