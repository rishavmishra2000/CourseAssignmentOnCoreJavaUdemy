// Carpet Cost Calculator

class Floor{
	private double width;
	private double height;
	
	public Floor(double width, double height){
		if(width < 0){
			this.width = 0;
		} else {
			this.width = width;
		}
		
		if(height < 0){
			this.height = 0;
		} else {
			this.height = height;
		}
	}
	
	
	public double getArea(){
		return (this.width * this.height);
	}
}

class Carpet {
	private double cost;
	
	public Carpet(double cost){
		if(cost < 0){
			this.cost = 0;
		} else {
			this.cost = cost;
		}
	}
	
	public double getCost(){
		return this.cost;
	}
}


class Calculator{
	private Floor floor;
	private Carpet carpet;
	
	public Calculator(Floor floor, Carpet carpet){
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost(){
		double totalCost = floor.getArea() * carpet.getCost();
		return totalCost;
	}
}


public class CarpetCostCalculator{
	public static void main(String []args){
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		
		Calculator calculator = new Calculator(floor, carpet);
		
		System.out.println("total= " + calculator.getTotalCost());
		
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		
		calculator = new Calculator(floor, carpet);
		
		System.out.println("total= " + calculator.getTotalCost());
	}
}