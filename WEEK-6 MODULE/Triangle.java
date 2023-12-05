package shapes;
public class Triangle{
	double s1,s2,b,h;
	public Triangle(double a,double bb,double c,double d){
		s1=a;
		s2=bb;
		b=c;
		h=d;
	}
	public double getArea(){
		return (1/2)*b*h;
	}
	public double getPerimeter(){
		return s1+s2+b;
	}
}