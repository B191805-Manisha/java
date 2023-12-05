package admission;

public class Eligible implements collage{
	String name;
	int maths,physics,chemistry,english,avg;
	public Eligible(String s,int m,int p,int c,int e){
		name=s;
		maths=m;
		physics=p;
		chemistry=c;
		english=e;
		avg=(m+p+c+e)/4;
	}
	public boolean eligibility(){
		if(maths>=90 && physics>=95 && chemistry>=70 && english>=80 && avg>=80){
			return true;
		}
		return false;
	}
	public String getName(){
		return name;
	}
}