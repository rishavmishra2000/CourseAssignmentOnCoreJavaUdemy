// Pool Area Challenge

class Rectangle {
    private double width;
	private double length;
	
	// -1 , 1
	//  1 ,-1
	//  2 , 2
	
	public Rectangle(double width, double length){
		if(width < 0){
			this.width = 0;
			if(length < 0){
				this.length = 0;
			} else {
				this.length= length;
			} 
		} else if(width > 0){
			this.width = width;
			if(length < 0){
				this.length = 0;
			} else {
				this.length= length;
			} 
		}
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getArea(){
		return width * length;
	}
}

class Cuboid extends Rectangle{
	private double height;
	
	public Cuboid(double width, double length, double height){
		super(width, length);
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

public class CuboidChallenge {
	public static void main(String []args){
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println("Rectangle.getWidth(): Width= " + rectangle.getWidth());
		System.out.println("Rectangle.getLength(): Length= " + rectangle.getLength());
		System.out.println("Rectangle.getArea(): Area= " + rectangle.getArea());
		
		Cuboid cuboid = new Cuboid(5, 10, 5);
		System.out.println("Cuboid.getWidth(): Width= " + cuboid.getWidth());
		System.out.println("Cuboid.getLength(): Length= " + cuboid.getLength());
		System.out.println("Cuboid.getArea(): Area= " + cuboid.getArea());
		System.out.println("Cuboid.getHeight(): Height= " + cuboid.getHeight());
		System.out.println("Cuboid.getVolume(): Volume= " + cuboid.getVolume());
	}
}






