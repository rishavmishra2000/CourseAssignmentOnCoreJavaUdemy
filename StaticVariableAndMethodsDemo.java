// Java Static Variable and method Demo

class StaticDemo{
	public static String pname = "";
	
	public static void setName(String name){
	    pname = name;
	}
}

class Main{
	public static void main(String []args){
		// Referencing the static variable using the class name 
		StaticDemo.pname = "Rishav";
		System.out.println(StaticDemo.pname);
		
		// Referencing the static variable from the class object
		StaticDemo demo = new StaticDemo();
		demo.setName("Vaibhav");
		System.out.println(demo.pname);
		
		// Note: we cannot access static variable/method from non-static variable/method.
	}
}