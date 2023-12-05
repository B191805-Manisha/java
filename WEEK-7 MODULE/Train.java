package reserve;

interface tickets{
	void credentials(String u,String p);
	void reserve(int count,String cls);
	void exit();
}
public class Train implements tickets{
	String uname;
	String pswd;
	int a1,a2,s1,s2;


	public Train(String u,String u){
		uname=u;
		pswd=u;
		a1=70;
		a2=70;
		s1=70;
		s2=70;
	}
	
}