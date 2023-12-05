package audit;

interface Detection{
	void taxChecker() throws Exception;
	Double taxPaid();
	//void homeExpenditure();
	//void healthExpenditure();
	//void vehicleExcependiture();
	//void personalFamilyExpenditure();
	//void miscellaneousExpenditure();
}
public class Tax implements Detection{
	Double home,health,vcl,fam,mis,tax,income,total,totaltax=0.0;
	public Tax(Double hm,Double h,Double v,Double f,Double m,Double i,Double t){
		home=hm;
		health=h;
		vcl=v;
		fam=f;
		mis=m;
		income=i;
		tax=t;
		total=hm+h+f+m+v;
		
	}
	
	public void taxCal(){
		totaltax=((income-total)*10)/100;
	}
	public void taxChecker() throws Exception{
		if(tax<totaltax){
			throw new Exception("You have not paid Tax");
		}
		else{
			System.out.println("YOU HAVE SUCCESSFULLY PAID YOUR TAX");
		}
		
	}
	public Double taxPaid(){
		return totaltax-tax;
	}
}