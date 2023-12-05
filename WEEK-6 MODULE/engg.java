import admission.Eligible;
import admission.collage;
import java.util.Scanner;

public class engg{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=s.nextInt();
		Eligible[] e=new Eligible[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("enter the marks of subjects respectively:\nmaths \nphysics \nchemistry \nenglish");
			e[i]=new Eligible(name,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
		}
		System.out.println("the eligible students are:");
		for(int i=0;i<n;i++){
			if(e[i].eligibility()){
				System.out.println(e[i].getName());
			}
		}
	}
}