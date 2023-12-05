package bank;

interface management{
	//boolean creditentialsCheck(String u,String pswd);
	void credit(double d);
	void debit(double d) throws Exception;
	double getB();
	
}
public class Bank implements management{
	String uname;
	String pswd;
	double balance;
	public Bank(String u,String p){
		uname=u;
		pswd=p;
		balance=20000;
	}
	public String getU(){
		return uname;
	}
	public String getP(){
		return pswd;
	}
	public void credit(double d){
		balance=balance+d;
	}
	public void debit(double d) throws Exception{
		if(balance<d){
			throw new Exception("cannot debit insufficient balance Exception");
		}
		else{
		balance=balance-d;
		}
	}
	public double getB(){
		return balance;
	}
}