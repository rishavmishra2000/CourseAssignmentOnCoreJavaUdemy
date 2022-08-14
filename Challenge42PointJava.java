public class Point{
	private int x;
	private int y;
	
	public Point(){
		
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public double distance(){
		double result = Math.sqrt((this.x - 0)*(this.x - 0) + (this.y - 0)*(this.y - 0));
		return result;
	}
	
	public double distance(Point second){
	    double result = Math.sqrt((this.x - second.x)*(this.x - second.x) + (this.y - second.y)*(this.y - second.y));
	    return result;
	}
	
	public double distance(int x, int y){
	    double result = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	    return result;
	}
}

public class PointMain{
	public static void main(String []args){
		Point first = new Point(6,5);
        Point second = new Point(3,1);
        
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + second.distance(first));
		System.out.println("distance(2,2)= " + first.distance(2,2));
		
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
	}
}