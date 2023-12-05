import tvremote.Channel;
import tvremote.Buttons;
import tvremote.Channel;
import java.util.Scanner;

public class Tv{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Channel c=new Channel();
		while(true){
			System.out.println("please select option \n enter 1 for switchonn\n2 for ngc \n3 for star sports \n4 for discovery \n5 for star ma movies and \n6 for tvOff");
			int n=s.nextInt();
			switch(n){
				case 1:c.switchOn();
				break;
				case 2:c.ngc();
				break;
				case 3:c.startSports();
				break;
				case 4:c.discovery();
				break;
				case 5:c.star();
				break;
				case 6:c.switchOff();
				System.exit(0);
				default:System.out.println("choose from mensioned");
			}
		}
	}
}