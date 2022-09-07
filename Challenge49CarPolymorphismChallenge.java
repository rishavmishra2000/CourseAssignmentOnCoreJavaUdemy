// Polymorphism Challenege	
class Car{
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}
	
	public String startEngine(){
		return "Car -> Engine Started";
	}
	
	public String accelerate(){
		return "Car -> Accelerated";
	}
	
	public String brake(){
		return "Car -> Brake";
	}
	
	public int getCylinders(){
		return this.cylinders;
	}
	
	public String getName(){
		return this.name;
	}
}

class Mitsubishi extends Car{
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}
	
	public String startEngine(){
		return "Mitsubishi -> Engine Started";
	}
	
	public String accelerate(){
		return "Mitsubishi -> Accelerated";
	}
	
	public String brake(){
		return "Mitsubishi -> Brake";
	}
}

class Ford extends Car{
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}
	
	public String startEngine(){
		return "Ford -> Engine Started";
	}
	
	public String accelerate(){
		return "Ford -> Accelerated";
	}
	
	public String brake(){
		return "Ford -> Brake";
	}
}

class Holden extends Car{
	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}
	
	public String startEngine(){
		// return "Holden -> Engine Started";
	}
	
	public String accelerate(){
		return "Holden -> Accelerated";
	}
	
	public String brake(){
		return "Holden -> Brake";
	}
}

public class CarIndustry{
	public static void main(String []args){
		Car car = new Car(8, "Base car");
		car.startEngine();
		car.accelerate();
		car.brake();
		
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
		mitsubishi.startEngine();
		mitsubishi.accelerate();
		mitsubishi.brake();
		
		Ford ford = new Ford(6, "Ford Falcon");
		ford.startEngine();
		ford.accelerate();
		ford.brake();
		
		Holden holden = new Holden(6, "Holden Commodore");
		holden.startEngine();
		holden.accelerate();
		holden.brake();
	}
}