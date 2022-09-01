// Vehicle Challenge Inheritance

class Vehicle{
	public String name;
	public String size;
	
	public int currentVelocity;
	public int currentDirection;
	
	public Vehicle(String name, String size){
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction){
		this.currentDirection = direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
	}
	
	public void move(int velocity, int direction){
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection); 
	}
	
	public String getName(){
		return name;
	}
	
	public String getSize(){
		return size;
	}
	
	public int getCurrectVelocity(){
		return currentVelocity;
	}
	
	public int getCurrentDirection(){
		return currentDirection;
	}
	
	public void stop(){
		this.currentVelocity = 0;
	}
}

class Car extends Vehicle{
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currectGear;
	
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual){
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		
		this.currectGear = 0;
	}
	
	public void changeGear(int currectGear){
		this.currectGear = currectGear;
		System.out.println("Car.changeGear(): Changed to: " + this.currectGear + " gear.");
	}
	
	public void changeVelocity(int speed, int direction){
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
		move(speed, direction);
	}
}

class Outlander extends Car {
	private int roadServiceMonths;
	
	public Outlander(int roadServiceMonths){
		super("Outlander", "4WD", 4, 4, 5, false);
		this.roadServiceMonths = roadServiceMonths;
	}
	
	public void accelerate(int rate){
		int newVelocity = getCurrectVelocity() + rate;
		if(newVelocity < 0){
			newVelocity = 0;
		}
		
		if(newVelocity == 0){
			stop();
			changeGear(0);
		} else if(newVelocity > 0 && newVelocity <= 10){
			changeGear(1);
		} else if(newVelocity > 10 && newVelocity <= 20) {
			changeGear(2);
		} else if(newVelocity > 10 && newVelocity <= 30) {
			changeGear(3);
		} else if(newVelocity > 30 && newVelocity <= 40) {
			changeGear(4);
		} else {
			changeGear(5);
		}
		
		if(newVelocity > 0){
			changeVelocity(newVelocity,getCurrentDirection());
		}
	}
}

public class Main{
	public static void main(String []args){
		Outlander outlander = new Outlander(36);
		outlander.steer(45);
		outlander.accelerate(30);
		outlander.steer(0);
		outlander.accelerate(20);
		outlander.accelerate(-60);
		outlander.steer(40);
		outlander.accelerate(53);
	}
}