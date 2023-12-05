package shapes;
public class Square{
	double s;
	public Square(double sid){
		s=sid;
	}
	public double getArea(){
		return s*s;
	}
	public double getPerimeter(){
		return 4*s;
	}
}