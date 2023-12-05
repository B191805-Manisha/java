import java.util.*;
abstract class Employee{
	String name;
	Double amount;
	Double wage;
	abstract Double getAmount();
}
class Week extends Employee{
	
	int week;
	Week(String n,int w,Double k){
		name=n;
		week=w;
		wage=k;
	}
	public Double getAmount(){
		return week*wage;
	}
}
class Hour extends Employee{
	Double hour;
	Hour(String n,Double h,Double w){
		name=n;
		hour=h;
		wage=w;
	}
	public Double getAmount(){
		return hour*wage;
	}
}
public class Emp{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("are you a week employee of hourly employye press 1 for week 2 for hour:");
		if(s.nextInt()==1){
			System.out.println("enter name and week you worked:");
			Week w=new Week(s.next(),s.nextInt(),10000.0);
			System.out.println("the amount that you have to paid is: "+w.getAmount());
		}
		else{
			System.out.println("enter name and hours you worked:");
			Hour h=new Hour(s.next(),s.nextDouble(),1000.0);
			System.out.println("the amount that you have to paid is: "+h.getAmount());
		}
	}
}