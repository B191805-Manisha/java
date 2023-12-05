import java.util.*;

class vehicle{
	String company,model
	int mileage,fuelCap,displa;
	vehicle(String c,String mdl,int m,int f,int d){
		company=c;
		model=mdl;
		mileage=m;
		fuelcpa=f;
		displa=d;
	}
}

class twoWheeler extends vehicle{
	boolean frontb,rearb,headlamp;
	String tyretype;
	String[] userreviews=new String[];
	twoWheeler(String company,String model,int m,int f,int d,boolean frontb,boolean rearb,boolean headlamp,string tyretype,String[] ur){
		super(company,model,m,f,d);
		this.frontb=frontb;
		this.rearb=rearb;
		this.headlamp=headlamp;
		this.tyretype=tyretype;
		this.userreviews=ur;
	}
}

class fourWheeler extends vehicle{
	boolean airconditioner, airbags, powerstr, rainwiper;
	twoWheeler(String company,String model,int m,int f,int d,boolean airconditioner,boolean airbags,boolean powerstr, boolean rainwiper){
		super(company,model,m,f,d);
	}
}

class RguktCRVehicle{
	public static void main(String args[]){
		twoWheeler[] tw=new twoWheeler[4];
        	twoWheelers[0]=new TwoWheeler("Honda", "Activa 5G", 55, 5.3, 109.19", true, true, true, "Halogen", 4.5);
        
	}
}


































































import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    String company;
    String model;
    String mileage;
    String fuelCapacity;
    String displacement;

    public Vehicle(String company, String model, String mileage, String fuelCapacity, String displacement) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }
}

class TwoWheeler extends Vehicle {
    String frontBrake;
    String rearBrake;
    String tyreType;
    String headLamp;
    double userReviews;

    public TwoWheeler(String company, String model, String mileage, String fuelCapacity, String displacement,
                      String frontBrake, String rearBrake, String tyreType, String headLamp, double userReviews) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
        this.tyreType = tyreType;
        this.headLamp = headLamp;
        this.userReviews = userReviews;
    }
}

class FourWheeler extends Vehicle {
    boolean airConditioner;
    boolean airBags;
    boolean powerSteering;
    boolean rainSensingWiper;

    public FourWheeler(String company, String model, String mileage, String fuelCapacity, String displacement,
                       boolean airConditioner, boolean airBags, boolean powerSteering, boolean rainSensingWiper) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.airConditioner = airConditioner;
        this.airBags = airBags;
        this.powerSteering = powerSteering;
        this.rainSensingWiper = rainSensingWiper;
    }
}

public class VehicleComparison {
    public static void main(String[] args) {
        List<TwoWheeler> twoWheelers = new ArrayList<>();
        List<FourWheeler> fourWheelers = new ArrayList<>();

        // Sample vehicle data
        twoWheelers.add(new TwoWheeler("Honda", "Activa 5G", "55 kmpl", "5.3 liters", "109.19 cc",
                "Drum", "Drum", "Tubeless", "Halogen", 4.5));
        twoWheelers.add(new TwoWheeler("TVS", "Apache RTR 160", "50 kmpl", "12 liters", "159.7 cc",
                "Disc", "Drum", "Tubeless", "LED", 4.3));
        twoWheelers.add(new TwoWheeler("Hero", "Splendor Plus", "81 kmpl", "9.8 liters", "97.2 cc",
                "Drum", "Drum", "Tube", "Halogen", 4.2));
        twoWheelers.add(new TwoWheeler("Bajaj", "Pulsar 150", "50 kmpl", "15.5 liters", "149.5 cc",
                "Disc", "Drum", "Tubeless", "Halogen", 4.4));

        fourWheelers.add(new FourWheeler("Maruti Suzuki", "Swift", "23.2 kmpl", "37 liters", "1197 cc",
                true, true, true, false));
        fourWheelers.add(new FourWheeler("Hyundai", "Creta", "16.8 kmpl", "55 liters", "1497 cc",
                true, true, true, true));
        fourWheelers.add(new FourWheeler("Honda", "City", "17.4 kmpl", "40 liters", "1498 cc",
                true, true, true, true));
        fourWheelers.add(new FourWheeler("Tata", "Nexon", "17 kmpl", "44 liters", "1199 cc",
                true, true, true, true));

        Scanner scanner = new Scanner(System.in);
        int vehicleType;
        List<Vehicle> chosenVehicles = new ArrayList<>();

        System.out.println("Available 2-Wheelers:");
        for (int i = 0; i < twoWheelers.size(); i++) {
            System.out.println((i + 1) + ". " + twoWheelers.get(i).company + " - " + twoWheelers.get(i).model);
        }

        System.out.println("\nAvailable 4-Wheelers:");
        for (int i = 0; i < fourWheelers.size(); i++) {
            System.out.println((i + 1) + ". " + fourWheelers.get(i).company + " - " + fourWheelers.get(i).model);
        }

        System.out.print("Enter '2' for 2-Wheeler or '4' for 4-Wheeler: ");
        vehicleType = scanner.nextInt();

        if (vehicleType == 2) {
            while (true) {
                System.out.print("Enter the number of the 2-Wheeler you want to compare (0 to finish): ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice > 0 && choice <= twoWheelers.size()) {
                    chosenVehicles.add(twoWheelers.get(choice - 1));
                } else {
                    System.out.println("Invalid choice. Please enter a valid number.");
                }
            }
        } else if (vehicleType == 4) {
            while (true) {
                System.out.print("Enter the number of the 4-Wheeler you want to compare (0 to finish): ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice > 0 && choice <= fourWheelers.size()) {
                    chosenVehicles.add(fourWheelers.get(choice - 1));
                } else {
                    System.out.println("Invalid choice. Please enter a valid number.");
                }
            }
        }

        // Compare and display chosen vehicles
        if (!chosenVehicles.isEmpty()) {
            System.out.println("Chosen Vehicles for Comparison:");
            for (int i = 0; i < chosenVehicles.size(); i++) {
                Vehicle vehicle = chosenVehicles.get(i);
                System.out.println("Company: " + vehicle.company);
                System.out.println("Model: " + vehicle.model);
                System.out.println("Mileage: " + vehicle.mileage);
                System.out.println("Fuel Capacity: " + vehicle.fuelCapacity);
                System.out.println("Displacement: " + vehicle.displacement);

                if (vehicle instanceof TwoWheeler) {
                    TwoWheeler twoWheeler = (TwoWheeler) vehicle;
                    System.out.println("Front Brake: " + twoWheeler.frontBrake);
                    System.out.println("Rear Brake: " + twoWheeler.rearBrake);
                    System.out.println("Tyre Type: " + twoWheeler.tyreType);
                    System.out.println("Head Lamp: " + twoWheeler.headLamp);
                                        System.out.println("User Reviews: " + twoWheeler.userReviews);
                } else if (vehicle instanceof FourWheeler) {
                    FourWheeler fourWheeler = (FourWheeler) vehicle;
                    System.out.println("Air Conditioner: " + (fourWheeler.airConditioner ? "Yes" : "No"));
                    System.out.println("Air Bags: " + (fourWheeler.airBags ? "Yes" : "No"));
                    System.out.println("Power Steering: " + (fourWheeler.powerSteering ? "Yes" : "No"));
                    System.out.println("Rain Sensing Wiper: " + (fourWheeler.rainSensingWiper ? "Yes" : "No"));
                }

                System.out.println();
            }
        } else {
            System.out.println("No vehicles chosen for comparison.");
        }
    }
}



