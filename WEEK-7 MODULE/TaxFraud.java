import audit.Tax;
import java.util.Scanner;

public class TaxFraud{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter homeExpenditure ,healthExpenditure vehicle Expenditure personal Expenditure and miscellaneous Expenditures respectively");
		System.out.println(" followed by enter the tax that you have paid");
		Tax t=new Tax(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble());
		System.out.println("enter your income");
		t.taxCal();
		try{
			t.taxChecker();
			
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("The mount you has to pay is :"+t.taxPaid());
		}
	}
}