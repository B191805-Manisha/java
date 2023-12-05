import java.util.Scanner;

public class StringArgs{

	public static void meth2(String s,int n) throws Exception{
		if(n>10)
			throw new Exception("lenth exceeded");
		else
			System.out.println("your string is "+s);
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		int n=st.length();
		try{
		meth2(st,n);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}