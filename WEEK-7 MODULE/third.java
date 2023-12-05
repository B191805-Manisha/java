import java.util.Scanner;

public class third{
	public static void main(String[] args){
		try{
			meth();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void meth() throws Exception{
		Scanner s=new Scanner(System.in);
		
		if(s.hasNextInt()){
			System.out.println("number ");
		}
		else{
		throw new Exception("Number mis MatchException");
		}
	}
}