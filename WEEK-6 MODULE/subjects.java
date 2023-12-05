import java.util.Scanner;
import dept.CSE;
import dept.ME;
import dept.Civil;
import dept.ECE;
public class subjects{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("Enter the Department to display subjects:");
			System.out.println("1 for CSE \n2 for ECE \n3 for Civil \n for ME ");
			int n=s.nextInt();
			switch(n){
				case 1:	CSE c=new CSE();
					System.out.println("The CSE subjects are:");
					c.displaySubjects();
					break;
				case 2: ECE e=new ECE();
					System.out.println("the ECE subjects are:");
					e.displaySubjects();
					break;
				case 3:Civil cl=new Civil();
					System.out.println("the Civil subjects are:");
					cl.displaySubjects();
					break;
				case 4:ME m=new ME();
					System.out.println("the ME subjects are:");
					m.displaySubjects();
					break;
				default:System.out.println("please enter given choices only");
					System.exit(0);
			}
		}
	}
}