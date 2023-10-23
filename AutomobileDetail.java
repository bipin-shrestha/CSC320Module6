import java.util.ArrayList;

class AutomobileDetail {	
	
	public static void AddVehicle(ArrayList<Automobile> vehicles, Automobile vehicle) {
		vehicles.add(vehicle);
		System.out.println(vehicle.getAutoMake()+ " "+ vehicle.getAutoModel() +" Added Succesfully!");
		String[] displayInventory = ListInventory(vehicles);
		System.out.println("\nVehicle Inventory : ");
		for(int i=0; i<displayInventory.length; i++) {
			System.out.println(displayInventory[i]);
		}
	}
	// Defining method to remove a vehicle
	public static void RemoveVehicle(ArrayList<Automobile> vehicles,Automobile vehicle) {
		vehicles.remove(vehicle);
		System.out.println(vehicle.getAutoMake()+ " " + vehicle.getAutoModel() + " is removed.");
	}	
	public static void UpdateVehicle(ArrayList<Automobile> vehicles, int index, Automobile newVehicle) {	
		System.out.println(vehicles.get(index).getAutoMake()+ " "+ vehicles.get(index).getAutoModel() +" updated Succesfully!");
		vehicles.set(index, newVehicle);
		String[] updatedVehicle = ListInventory(vehicles);
		System.out.println("\nVehicle Inventory");
		for(int i=0; i<updatedVehicle.length; i++) {
			System.out.println(updatedVehicle[i]);
		}
	}
	public static String[] ListInventory(ArrayList<Automobile> vehicles) {
		String[] vehicleDetails = new String[vehicles.size()];
		for(int i=0; i<vehicles.size(); i++) {
			String vehicleDetail = i +" "+ vehicles.get(i).getAutoMake()+" "+ vehicles.get(i).getAutoModel()+" "+
									vehicles.get(i).getAutoColor()+" "+ vehicles.get(i).getAutoYear();
			vehicleDetails[i] = vehicleDetail;
		}	
		return vehicleDetails;
	}
	
	public static void main(String[] args) {
		// Creating Automobile objects
		ArrayList<Automobile> vehicleInventory = new ArrayList<Automobile>();
		Automobile vehicle1 = new Automobile("Toyota","Camry","Red",1999);
		Automobile vehicle2 = new Automobile("Toyota","Corolla","Red",1999);
		Automobile vehicle3 = new Automobile("Toyota","Celica","Red",1999);
		AddVehicle(vehicleInventory,vehicle1);
		AddVehicle(vehicleInventory,vehicle2);
		AddVehicle(vehicleInventory,vehicle3);
		System.out.println(vehicleInventory.get(0).getAutoModel());
		System.out.println(vehicleInventory.get(1).getAutoModel());
		System.out.println(vehicleInventory.get(2).getAutoModel());
		RemoveVehicle(vehicleInventory, vehicle1);
		Automobile vehicle5 = new Automobile("Toyota", "Highlander", "White", 2019);
		UpdateVehicle(vehicleInventory, 1, vehicle5);
	}
}

