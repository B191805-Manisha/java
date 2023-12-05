import fare.Passenger;
import java.util.Scanner;

public class TotalFare{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many passengers are travelling");
		int n=s.nextInt();
		Passenger[] p=new Passenger[n];
		int i;
		for(i=0;i<n;i++){
			System.out.println("please eter their type \npress 1 for child \n2 for student \n3 for citizen \n4 for seniorcitizen");	
			int k=s.nextInt();
			System.out.println("enter how many kms you want to travell");
			int km=s.nextInt();
			switch(k){
				case 1:p[i]=new Passenger("child",km);
					break;
				case 2:p[i]=new Passenger("student",km);
					break;
				case 3:p[i]=new Passenger("citizen",km);
					break;
				case 4:p[i]=new Passenger("seniorCitizen",km);
					break;
				default:System.out.println("please choose from mensioned only");
			}
		}
		Passenger ps=new Passenger();
		ps.totalFare(p,i);
		System.out.println("the total fare of all passengers is:"+ps.getFare());
	}
}