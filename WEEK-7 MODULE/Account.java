import bank.Bank;
import java.util.Scanner;

public class Account{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Bank[] b=new Bank[5];
		b[0]=new Bank("b181929","rgukt1929");
		b[1]=new Bank("b181930","rgukt1930");
		b[2]=new Bank("b181931","rgukt1931");
		b[3]=new Bank("b181932","rgukt1932");
		b[4]=new Bank("b181933","rgukt1933");
	while(true){
		System.out.println("press 1 for checking 2 for not checking");
		if(s.nextInt()==1){
			System.out.println("enter your username and password ");
			String u=s.next();
			String p=s.next();
			int f=-1;
			for(int i=0;i<5;i++){
				if((b[i].getU()).equals(u) && (b[i].getP()).equals(p)){
					f=i;
					break;
				}	
			}
			try{
			 	meth(f,s,b);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else{
			System.out.println("Thank you");
			break;
		}
	}
	}
	public static void meth(int f,Scanner s,Bank[] b) throws Exception{
			if(f==-1){
				throw new Exception("Credentials mismatch Exception occured");
			}
			 else{	
				while(true){
					System.out.println("YOU ARE SUCCESSFULLY LOGGED IN");
					System.out.println("press 1 for credit 2 for debit 3 for display balance 4 for exit");
					int k=s.nextInt();
					switch(k){
						case 1:System.out.println("enter amount to credit");
							b[f].credit(s.nextDouble());
							break;
						case 2:System.out.println("enter the amount to be debited");
							try{
									b[f].debit(s.nextDouble());
									System.out.println("amount debited successfully");
								
							}
							catch(Exception e){
								System.out.println(e);
							}
							break;
						case 3:System.out.println("Your balance is: "+b[f].getB());
							break;
						case 4:System.exit(0);
							
					}
				}
			}
	}
	
}
