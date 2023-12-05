import java.util.Scanner;
import shapes.Square;
import shapes.Circle;
import shapes.Triangle;
public class Geo{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the geographic shape:");
		System.out.println("press 1 for Square 2 for Triangle and  3 for Circle");
		int n=s.nextInt();
		switch(n){
			case 1:System.out.println("enter the side ofsquare");
				Square sq=new Square(s.nextDouble());
				System.out.println("Area :"+sq.getArea()+"\nPerimeter :"+sq.getPerimeter());
				break;
			case 2:System.out.println("enter the side 1,side2,base and height of triangle");
				Triangle t=new Triangle(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble());
				System.out.println("Area: "+t.getArea()+"\nPerimeter: "+t.getPerimeter());
				break;
			case 3:System.out.println("enter the radius of the circle:");
				Circle c=new Circle(s.nextDouble());
				System.out.println("Area: "+c.getArea()+"\nPerimeter: "+c.getPerimeter());
				break;
			default:System.out.println("please enter from above mensioned oprions only");
				System.exit(0);
		}
	}
}