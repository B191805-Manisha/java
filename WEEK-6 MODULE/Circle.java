package shapes;
public class Circle{
	double ra;
	public Circle(double r){
		ra=r;
	}
	public double getArea(){
		return Math.PI*ra;
	}
	public double getPerimeter(){
		return 2*Math.PI*ra;
	}
}