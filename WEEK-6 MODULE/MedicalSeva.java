import Mseva.medical;
import Mseva.Diseases;
import java.util.Scanner;

public class MedicalSeva{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Diseases d=new Diseases();
		String[] sym=String[10];
		int i=0;
		System.out.println("Enter the Symptoms:");
		while(true){
			System.out.println("press 1 for Symptom, 2 otherwise");
			if(s.nextInt()==1){
				System.out.println("Enter the Symptom name");
				String[i]=s.next();
				i++;
			}
			else{
				break;
			}
		}
		d.sendDiseases(sym,i);
	}
}