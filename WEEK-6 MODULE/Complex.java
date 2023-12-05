import java.util.Scanner;
import complex.Arith;

public class Complex{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Arith a1=new Arith();
		Arith a2=new Arith();
		System.out.println("enter real part and imaginary part of 1st complex no: ");
		int a=s.nextInt();
		int b=s.nextInt();
		a1=new Arith(a,b);
		//a2=new Arith(a,b);
		System.out.println("enter real part and imaginary part of 2nd complex no: ");
		int c=s.nextInt();
		int d=s.nextInt();
		//a1=new Arith(c,d);
		a2=new Arith(c,d);
		a1.add(new Arith(a,b),new Arith(c,d));
		System.out.println("a1"+"="+a+"+"+b+"i");
		System.out.println("a2"+"="+c+"+"+d+"i");
		System.out.println("Added value: "+a1.getrp()+"+"+a1.getip()+"i");
		a2.sub(new Arith(a,b),new Arith(c,d));
		System.out.println("Subtracted value: "+a2.getrp()+"-"+a2.getip()+"i");
	}
}