import java.util.*;
import java.lang.*;
import java.io.*;
interface Rbi{
	boolean personalLoanEligibility();
	boolean homeLoanEligibility();
	boolean vehicleLoanEligibility();
}
class costumer{
	String name;
	String accno;
	double balance;
	double income;
	String job;
	double property;
	String medical;
	public boolean credit(Double d){
		if(d>balance){
			return false;
		}
		balance=balance-d;
		return true;
	}
	public double displayBalance(){
		return balance;
	}
	public boolean debit(Double d){
		balance=balance+d;
		return true;
	}
	

}
class Sbi extends costumer implements Rbi{
	Sbi(String n,String a){
		name=n;
		accno=a;
		balance=10000;
	}
	public void setIncome(Double i){
		income=i;
	}
	public void setJob(boolean j){
		if(j){
			job="Govt";
		}
		else{
			job="Private";
		}
	}
	public void setMedical(boolean b){
		if(b)
			medical="Healthy";
		else
			medical="UnHealthy";
	}
	public void setProperty(Double p){
		property=p;
	}
	public boolean personalLoanEligibility(){
		if(income>=600000 && job.equals("Govt") && medical.equals("Healthy"))
			return true;
		else
			return false;
	}
	public boolean homeLoanEligibility(){
		if(property>=10000000 && job.equals("Govt"))
			return true;
		else
			return false;
	}
	public boolean vehicleLoanEligibility(){
		if(job.equals("Govt") && income>=800000)
			return true;
		else
			return false;
	}
	
	
}
class Hdfc extends costumer implements Rbi{
	Hdfc(String n,String a){
		name=n;
		accno=a;
		balance=20000;
	}
	public void setIncome(Double i){
		income=i;
	}
	public void setJob(boolean j){
		if(j){
			job="Govt";
		}
		else{
			job="Private";
		}
	}
	public void setMedical(boolean b){
		if(b)
			medical="Healthy";
		else
			medical="UnHealthy";
	}
	public void setProperty(Double p){
		property=p;
	}
	public boolean personalLoanEligibility(){
		if(income>=800000 && job.equals("Govt") && medical.equals("Healthy"))
			return true;
		else
			return false;
	}
	public boolean homeLoanEligibility(){
		if(property>=20000000 && job.equals("Govt"))
			return true;
		else
			return false;
	}
	public boolean vehicleLoanEligibility(){
		if(job.equals("Govt") && income>=900000)
			return true;
		else
			return false;
	}
}
class Dcb extends costumer implements Rbi{
	Dcb(String n,String a){
		name=n;
		accno=a;
		balance=30000;
	}
	public void setIncome(Double i){
		income=i;
	}
	public void setJob(boolean j){
		if(j){
			job="Govt";
		}
		else{
			job="Private";
		}
	}
	public void setMedical(boolean b){
		if(b)
			medical="Healthy";
		else
			medical="UnHealthy";
	}
	public void setProperty(Double p){
		property=p;
	}
	public boolean personalLoanEligibility(){
		if(income>=900000 && job.equals("Govt") && medical.equals("Healthy"))
			return true;
		else
			return false;
	}
	public boolean homeLoanEligibility(){
		if(property>=50000000 && job.equals("Govt"))
			return true;
		else
			return false;
	}
	public boolean vehicleLoanEligibility(){
		if(job.equals("Govt") && income>=950000)
			return true;
		else
			return false;
		}
}
public class Loan{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("choose the bank you want!");
		System.out.println("press 1 for SBI 2 for HDFC 3 for DCB ");
		int n=s.nextInt();
		if(n==1){
			System.out.println("Welcome to SBI ");	
			System.out.println("enter name,account number ");
			Sbi sb=new Sbi(s.next(),s.next());
			System.out.println("enter 1 for creditting ,2 for debiting ,3 for showing your balance ,4 otherwise");
				switch(s.nextInt()){
					case 1:System.out.println("how much you want to credit");
						if(sb.credit(s.nextDouble())){
							System.out.println("Successfully credited amount");
							System.out.println("remaining amount is :"+sb.displayBalance());
						}
						else{
							System.out.println("You dont have sufficient money");	
						}
						break;
					case 2:System.out.println("how much money you want to debit:");
						if(sb.debit(s.nextDouble())){
							System.out.println("amount successfully debited");
							System.out.println("remaining amount is : "+sb.displayBalance());
						}
						break;
					case 3:System.out.println("Your balance is : "+sb.displayBalance());
						break;
					case 4:System.out.println("Thank You for using SBI");
						break;
				}
			System.out.println("Do you want loan? if yes press 1 for Personal loan 2 for home loan 3 for vehicle loan");
			int m=s.nextInt();
			if(m==1){
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						sb.setJob(false);
					}
					else{
						sb.setJob(true);
					}
				System.out.println("what is your annual income:");
					sb.setIncome(s.nextDouble());
				System.out.println("what is your Madical status \nenter 1 if u're healthy 2 for unhealthy");
					if(s.nextInt()==1){
						sb.setMedical(true);
					}
					else{
						sb.setMedical(false);
					}
				if(sb.personalLoanEligibility()){
					System.out.println("Congratulations you are eligible for Personal loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
	
			}
			else if(m==2){
				//home
				System.out.println("what is your property!");
				sb.setProperty(s.nextDouble());
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						sb.setJob(false);
					}
					else{
						sb.setJob(true);
					}
				if(sb.homeLoanEligibility()){
					System.out.println("Congratulations you are eligible for Home loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
			
			}
			else if(m==3){
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						sb.setJob(false);
					}
					else{
						sb.setJob(true);
					}
				System.out.println("what is your annual income:");
					sb.setIncome(s.nextDouble());
				if(sb.vehicleLoanEligibility()){
					System.out.println("Congratulations you are eligible for Vehicle loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
			}
			else{
				System.out.println("Dear SBI user Thank you! visit us for any queries!");
			}
		}
		else if(n==2){
			System.out.println("Welcome to HDFC ");
			System.out.println("enter name,account number ");
			Hdfc h=new Hdfc(s.next(),s.next());
			System.out.println("enter 1 for creditting ,2 for debiting ,3 for showing your balance ,4 otherwise");
			
				switch(s.nextInt()){
					case 1:System.out.println("how much you want to credit");
						if(h.credit(s.nextDouble())){
							System.out.println("Successfully credited amount");
							System.out.println("remaining amount is :"+h.displayBalance());
						}
						else{
							System.out.println("You dont have sufficient money");	
						}
						break;
					case 2:System.out.println("how much money you want to debit:");
						if(h.debit(s.nextDouble())){
							System.out.println("amount successfully debited");
							System.out.println("remaining amount is : "+h.displayBalance());
						}
						break;
					case 3:System.out.println("Your balance is : "+h.displayBalance());
						break;
					case 4:System.out.println("Thank You for using HDFC");
						break;
						
				}
			
			System.out.println("Do you want loan? if yes press 1 for Personalloan 2 for homeloan 3 for vehicleloan");
			int m=s.nextInt();
			if(m==1){
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						h.setJob(false);
					}
					else{
						h.setJob(true);
					}
				System.out.println("what is your annual income:");
					h.setIncome(s.nextDouble());
				System.out.println("what is your Madical status \nenter 1 if u're healthy 2 for unhealthy");
					if(s.nextInt()==1){
						h.setMedical(true);
					}
					else{
						h.setMedical(false);
					}
				if(h.personalLoanEligibility()){
					System.out.println("Congratulations you are eligible for Personal loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
	
			}
			else if(m==2){
				//home
				System.out.println("what is your property!");
				h.setProperty(s.nextDouble());
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						h.setJob(false);
					}
					else{
						h.setJob(true);
					}
				if(h.homeLoanEligibility()){
					System.out.println("Congratulations you are eligible for Home loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
			}
			else if(m==3){
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						h.setJob(false);
					}
					else{
						h.setJob(true);
					}
				System.out.println("what is your annual income:");
					h.setIncome(s.nextDouble());
				if(h.vehicleLoanEligibility()){
					System.out.println("Congratulations you are eligible for Vehicle loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
			}
			else{
				System.out.println("Dear user select only mensioned numbers");
			}
			
		}
		else if(n==3){
			System.out.println("Welcome to DCB ");
			System.out.println("enter name,account number ");
			Dcb d=new Dcb(s.next(),s.next());
			System.out.println("enter 1 for creditting ,2 for debiting ,3 for showing your balance ,4 otherwise");
				switch(s.nextInt()){
					case 1:System.out.println("how much you want to credit");
						if(d.credit(s.nextDouble())){
							System.out.println("Successfully credited amount");
							System.out.println("remaining amount is :"+d.displayBalance());
						}
						else{
							System.out.println("You dont have sufficient money");	
						}
						break;
					case 2:System.out.println("how much money you want to debit:");
						if(d.debit(s.nextDouble())){
							System.out.println("amount successfully debited");
							System.out.println("remaining amount is : "+d.displayBalance());
						}
						break;
					case 3:System.out.println("Your balance is : "+d.displayBalance());
						break;
					case 4:System.out.println("Thank You for using SBI");
						break;
				}
			System.out.println("Do you want loan? if yes press 1 for Personal loan, 2 for homeloan 3, for vehicle loan");
			int m=s.nextInt();
			if(m==1){
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						d.setJob(false);
					}
					else{
						d.setJob(true);
					}
				System.out.println("what is your annual income:");
					d.setIncome(s.nextDouble());
				System.out.println("what is your Madical status \nenter 1 if u're healthy 2 for unhealthy");
					if(s.nextInt()==1){
						d.setMedical(true);
					}
					else{
						d.setMedical(false);
					}
				if(d.personalLoanEligibility()){
					System.out.println("Congratulations you are eligible for Personal loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
	
			}
			else if(m==2){
				//home
				System.out.println("what is your property!");
				d.setProperty(s.nextDouble());
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						d.setJob(false);
					}
					else{
						d.setJob(true);
					}
				if(d.homeLoanEligibility()){
					System.out.println("Congratulations you are eligible for Home loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
			}
			else if(m==3){
				System.out.println("What is your job? private or govt enter 1 for private ,2 for governament");
					if(s.nextInt()==1){
						d.setJob(false);
					}
					else{
						d.setJob(true);
					}
				System.out.println("what is your annual income:");
					d.setIncome(s.nextDouble());
				if(d.vehicleLoanEligibility()){
					System.out.println("Congratulations you are eligible for Vehicle loan");
				}
				else{
					System.out.println("Sorry you are not eligible !");
				}
			}
			else{
				System.out.println("Dear user select only mensioned numbers");
			}
			
		}
		else{
			System.out.println("choose from mensioned options only");
		}
	}
}
