// Inheritance Demo	
class Bicycle{
	private int gear;
	private int speed;
	
	public Bicycle(int gear, int speed){
		System.out.println("Bicycle.constructor() called.");
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int speed){
		this.speed -= speed;
		System.out.println("Bicycle.applyBrake() called, current speed: " + this.speed);
	}
	
	public void speedUp(int speed){
		this.speed += speed;
		System.out.println("Bicycle.speedUp() called, current speed: " + this.speed);
	}
	
	public String toString(){
		return ("No of Gears: " + this.gear + "\nBicycle Speed: " + this.speed);
	}
}

class MountainBike extends Bicycle {
	private int seatHeight;
	
	public MountainBike(int gear, int speed, int seatHeight){  // 3, 100, 25
	    // call to super must be first statement in constructor
	    super(gear, speed);
		System.out.println("MountainBike.constructor() called.");
		this.seatHeight = seatHeight;
	}
	
	public void setSeatHeight(int seatHeight){
		System.out.println("MountainBike.setSeatHeight() called.");
		this.seatHeight = seatHeight;
	}
	
	public void minSpeed(){
		System.out.println("MountainBike.minSpeed() called. \n ==> super.toString() called.\n" + super.toString());
	}
	
	public void maxSpeed(){
		// if method class is done without super keyword then it run the over ridden method of the same class. if Overridden method doesn't exist, then it search the same method in base class and execute it. 
		System.out.println("MountainBike.maxSpeed() called. \n ==> toString() called.\n" + toString());
	}
	
	// Static method cann't be overridden
	@Override
	public String toString(){
		return (super.toString() + "\nSeat Height: " + this.seatHeight);
	}
}

public class Main{
	public static void main(String []args){
		MountainBike mB = new MountainBike(3, 100, 25);
		System.out.println(mB.toString());
		
		System.out.println();
		mB.applyBrake(15);
		System.out.println();
		
		mB.setSeatHeight(20);
		System.out.println();
		mB.minSpeed();
		
		System.out.println();
		mB.speedUp(20);
		System.out.println();
		
		mB.maxSpeed();
	}
}

/*
	Bicycle.constructor() called.
	MountainBike.constructor() called.
	No of Gears: 3
	Bicycle Speed: 100
	Seat Height: 25
	
	Bicycle.applyBrake() called, current speed: 85
	
	MountainBike.setSeatHeight() called.
	
	MountainBike.minSpeed() called. 
	==> super.toString() called.
	No of Gears: 3
	Bicycle Speed: 85
	
	Bicycle.speedUp() called, current speed: 105
	
	MountainBike.maxSpeed() called. 
	==> toString() called.
	No of Gears: 3
	Bicycle Speed: 105
	Seat Height: 20
*/