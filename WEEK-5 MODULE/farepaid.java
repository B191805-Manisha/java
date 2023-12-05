import java.util.*;
class Super{
	String[] amenities=new String[10];
	Double[] pay=new Double[10];
	double km;
	
}
interface Fare{
	Double getFare();
	void getAmenities();
}
class Bus extends Super implements Fare{
	int k=0;
	void setAmenities(String s,boolean b){
	if(b){
		if(s.equals("Ac")){
			amenities[k]=s;
			pay[k]=100.0;
			k++;
		}
		
		else if(s.equals("sleeper")){
			amenities[k]=s;
			pay[k]=300.0;
			k++;
		}
	}
	else{
		if(s.equals("nonAc")){
			amenities[k]=s;
			pay[k]=0.0;
			k++;
		}
		else if(s.equals("semiSleeper")){
			amenities[k]=s;
			pay[k]=150.0;
			k++;
		}
		
	    }
	}
	public void getKm(double k){
		km=k;
	}
	public Double getFare(){
		Double d=0.0;
		for(int i=0;i<k;i++){
			d=d+pay[i];
		}
		return km*d;
	}
	public void getAmenities(){
		for(int i=0;i<k;i++){
			System.out.println(amenities[i]);
		}
	}
	
}
class Train extends Super implements Fare{
	int l=0;
	public void setAmenities(String s,boolean b){
		if(b){
			if(s.equals("general")){
				amenities[l]=s;
				pay[l]=30.0;
				l++;
			}
			else if(s.equals("sleeper")){
				amenities[l]=s;
				pay[l]=50.0;
				l++;
			}
			else if(s.equals("ac")){
				amenities[l]=s;
				pay[l]=40.0;
				l++;
			}
		}
		else{
			 if(s.equals("nonGeneral")){
				amenities[l]=s;
				pay[l]=60.0;
				l++;
			}
			 else if(s.equals("semiSleeper")){
				amenities[l]=s;
				pay[l]=25.0;
				l++;
			}
			else if(s.equals("nonAc")){
				amenities[l]=s;
				pay[l]=0.0;
				l++;
			}
		}
	}
	public void getAmenities(){
		for(int i=0;i<l;i++){
			System.out.println(amenities[i]);
		}
	}
	public void getKm(double k){
		km=k;
	}
	public Double getFare(){
		Double d=0.0;
		for(int i=0;i<l;i++){
			d=d+pay[i];
		}
		return km*d;
	}
	
}
class Flight implements Fare{
	String amenity;
	Double fare;
	Double km;
	public void setAmenities(String s){
		amenity=s;
		if(s.equals("economyClass"))
			fare=3000.0;
		else if(s.equals("BusinessClass"))
			fare=4500.0;
	}
	public void getKm(double d){
		km=d;
	}
	public void getAmenities(){
		System.out.println(amenity);
	}
	public Double getFare(){
		return km*fare;
	}
}
public class farepaid{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter your travelling vehicle \nenter 1 for bus ,2 for train and 3 for flight");
		int n=s.nextInt();
		if(n==1){
			Bus b=new Bus();
			System.out.println("do you want ac or non ac? \n enter 1 for ac 2 other wise");
			if(s.nextInt()==1){
				b.setAmenities("Ac",true);
			}
			else{
				b.setAmenities("nonAc",false);
			}
			System.out.println("Do you want sleeper or semi sleeper\n enter 1 for sleeper 2 otherwisw");
			if(s.nextInt()==1){
				b.setAmenities("sleeper",true);
			}
			else{
				b.setAmenities("semiSleeper",false);
			}
			System.out.println("how many kilometers you are going to travell?");
			b.getKm(s.nextDouble());
	
			System.out.println("\n\ncongratulations you choosed BUS!\n\n");
			System.out.println("Amenities you choosed are:\n");
			b.getAmenities();
			System.out.println("\nthe fare you should pay is: "+b.getFare());
			
		}
		else if(n==2){
			Train t=new Train();
			System.out.println("Do you want general? enter 1 if you want ,else any");
			if(s.nextInt()==1){
				t.setAmenities("general",true);
			}
			else{
				t.setAmenities("nonGeneral",false);
			}
			System.out.println("Do you want sleeper? enter 1 if you want, enlse any");
			if(s.nextInt()==1){
				t.setAmenities("sleeper",true);
			}
			else{
				t.setAmenities("semiSleeper",false);
			}
			System.out.println("Do you want Ac? enter 1 if you want, else any");
			if(s.nextInt()==1){
				t.setAmenities("ac",true);
			}
			else{
				t.setAmenities("nonAc",false);
			}
			System.out.println("how many kilometers you are going to travell?");
			t.getKm(s.nextDouble());
	
			System.out.println("\n\ncongratulations you choosed TRAIN!\n\n");
			System.out.println("Amenities you choosed are:\n");
			t.getAmenities();
			System.out.println("\nthe fare you should pay is: "+t.getFare());
			
			
		}
		else if(n==3){
			Flight f=new Flight();
			System.out.println("Do you want economy class or business class? enter 1 for economy 2 other wise");
			if(s.nextInt()==1){
				f.setAmenities("economyClass");
			}
			else{
				f.setAmenities("BusinessClass");
			}
			System.out.println("how many kilometers you are going to travell?");
			f.getKm(s.nextDouble());
	
			System.out.println("\n\ncongratulations you choosed FLIGHT!\n\n");
			System.out.print("Amenities you choosed is: ");
			f.getAmenities();
			System.out.println("\nthe fare you should pay is: "+f.getFare());
			
		}
		else{
			System.out.println("please choosee from above mensioned only!!");
		}	
	}
}