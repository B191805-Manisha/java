import calculator.clsi;
import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("enter the choice please..!");
			System.out.println("press 1 for addition\n 2 for subtraction\n 3 for multiplication and \n 4 for division");
			int n=s.nextInt();
			clsi cl=new clsi();
			switch(n){
				case 1:System.out.println("enter values to be add");
					int c=cl.add(s.nextInt(),s.nextInt());
					System.out.println("Addition of two values: "+c);
					break;
				case 2:System.out.println("enter valuse to be subtract");
					int d=cl.sub(s.nextInt(),s.nextInt());
					System.out.println("subtraction of tow values is "+d);
					break;
				case 3:System.out.println("enter two numbers to multiply");
					int e=cl.mul(s.nextInt(),s.nextInt());
					System.out.println("multiplication of two numbers: "+e);
					break;
				case 4: System.out.println("enter two values to divide");
					int f=cl.div(s.nextInt(),s.nextInt());
					System.out.println("te division of two numbers"+f);
					break;
				default: System.out.println("please choose from the mensioned choicec onlyy");
					System.exit(0);
			}
		}
	}
}