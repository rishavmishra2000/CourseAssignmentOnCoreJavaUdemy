// Java Static Variable and method Demo

class StaticDemo{
	public static String name = "";
	
	public StaticDemo(String name){
	    StaticDemo.name = name;
	}
	
	public static void printName(){
		System.out.println("Name= " + name);
	}
}

class Main{
	public static void main(String []args){
		// Referencing the static variable using the class name 
		StaticDemo demo = new StaticDemo("Rishav"); // create object demo and initize with Rishav
		StaticDemo demo1 = new StaticDemo("Vaibhav"); // create object demo and initize with Vaibhav
		demo.printName(); // Need to print Rishav
 		demo1.printName(); // Need to print Vaibhav
		
		/*
			Outout:-
				Name= Vaibhav
				Name= Vaibhav
		*/
		
		// Referencing the static variable from the class object
		StaticDemo.printName();
		printHello();		
		// Note: we cannot access static variable/method from non-static variable/method.
	}
	
	public static void printHello(){
			System.out.println("Hellow" + StaticDemo.name);
	}
}