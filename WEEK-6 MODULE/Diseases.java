package Mseva;

public class Diseases implements medical{
	String[] s=new String[2];
	
	public sendDisease(String[] sm,int n){
		for(int i=0;i<n;i++){
			if(sm[i].equalsIgnoreCase("stomachache") || sm[i].equalsIgnoreCase("vomitting") || sm[i].equalsIgnoreCase("loweyesight") ){
				continue;
			}
		}
	}
	
}