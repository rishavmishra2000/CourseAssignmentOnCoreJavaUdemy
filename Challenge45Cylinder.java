// Cylinder Challenge

/* 
	two ways to set the radius and height to 0 if value is negative.
*/

class Circle{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void setRadius(double radius){
		if(radius < 0){
			this.radius = 0;
		}
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return (Math.PI * radius * radius);
	}
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height){
		super(radius);
		if(height < 0){
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return getArea() * height;
	}
}

public class CylinderChallenge{
	public static void main(String []args){
		Circle circle = new Circle(3.75);
		System.out.println("Circle.getRadius(): Radius= " + circle.getRadius());
		System.out.println("Circle.getArea(): Area= " + circle.getArea());
		
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.getRadius(): Radius= " + cylinder.getRadius());
		System.out.println("cylinder.getHeight(): Height= " + cylinder.getHeight());
		System.out.println("cylinder.getArea(): Area= " + cylinder.getArea());
		System.out.println("cylinder.getVolume(): Volume= " + cylinder.getVolume());
	}
}