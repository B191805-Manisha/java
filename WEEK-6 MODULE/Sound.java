import java.util.Scanner;
import sounds.dolby;
import sounds.Podcast;
public class Sound{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Podcast p=new Podcast();
		System.out.println("Do you want to play podcast or dolby \npress 1 for dolby 2 for podcost");
		if(s.nextInt()==1){
			p.playDolby();	
		}
		else{
			p.playPodcast();
		}
	}
}