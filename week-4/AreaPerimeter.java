import java.util.*;
import java.lang.*;

class AreaandPerimeterutil{
	double squareArea(int s){
		return s*s;	
	}
	
	double circleArea(int r){
		return Math.PI * r * r;
	}
	
	double rectangleArea(int l,int b){
		return l*b;	
	}
	
	double squarePerimeter(int s){
		return 4*s;	
	}
	
	double circlePerimeter(int r){
		return 2*Math.PI*r;	
	}
	
	double rectanglePerimeter(int l,int b){
		return 2*(l+b);
	}
}



class AreaPerimeter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		AreaandPerimeterutil ap=new AreaandPerimeterutil();
		System.out.println("1 for square\n2 for Rectangle\n3 for Circle\n-1 to exit");
		int k=sc.nextInt();
		while(k!=-1){
			switch(k){
				case 1:
					System.out.println("enter side of square");
					int n=sc.nextInt();
					System.out.println("area of square "+ap.squareArea(n));
					System.out.println("perimeter of square "+ap.squarePerimeter(n));
					break;
				case 2:
					System.out.println("enter length and breadth of rectangle");
					int l=sc.nextInt();
					int b=sc.nextInt();
					System.out.println("area of rectangle "+ap.rectangleArea(l,b));
					System.out.println("perimeter of rectangle "+ap.rectanglePerimeter(l,b));
					break;
				case 3:
					System.out.println("enter radius of circle");
					int r=sc.nextInt();
					System.out.println("area of circle "+ap.circleArea(r));
					System.out.println("perimeter of circle "+ap.circlePerimeter(r));
					break;
				default:
					break;
				
			}
			System.out.println("1 for quare\n2 for Rectangle\n3 for Circle\n-1 to exit");
			k=sc.nextInt();
		}
	}
}
