package fare;
interface reservationCost{
	void totalFare(Passenger[] pas,int n);
}

public class Passenger{
	String type;
	int dist;
	int cost=10;
	int fare=0;
	public Passenger(){
		
	}
	public Passenger(String t,int di){
		type=t;
		dist=di;
	}
	public int getFare(){
		return fare;
	}
	public void totalFare(Passenger[] pas,int n){
		for(int i=0;i<n;i++){
			if((pas[i].type).equals("child")){
				fare=fare+0;
			}
			else if((pas[i].type).equals("student")){
				fare=fare+(pas[i].dist*cost*30)/100);
			}
			else if((pas[i].type).equals("citizen")){
				fare=fare+(pas[i].dist*cost);	
			}
			else if((pas[i].type).equals("seniorCitizen")){
				fare=fare+(pas[i].dist*cost*50)/100);	
			}
		}
	}

}