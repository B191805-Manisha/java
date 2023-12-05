class Shape{
	abstract Double getArea();
	abstract Double getVolume();
}
class Sphere extends Shape{
	double r;
	Sphere(Double r){
		this.r=r;
	}
	public Double getArea(){
		return 4*Math.PI*r*r;
	}
	public Double getDouble(){
		return (4/3)*Math.PI*r*r*r;
	}
}
class Cube extends Shape{
	Double s;
	Cube(Double r){
		s=r;
	}
	public Double getArea(){
		return 6*s*s;
	}
	public Double getDouble(){
		return s*s*s;
	}
	
}
public class Area{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Cube c=new Cube(s.nextDouble());
		Sphere sp=new Sphere(s.nextDouble());
		System.out.println("Cube area: "+c.getArea()+" volume: "+c.getVolume());
		System.out.println("Sphere area: "+sp.getArea()+" volume: "+sp.getVolume());
	}
}