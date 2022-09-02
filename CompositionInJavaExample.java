// Compositon Example 

/*
									   PC
	  ,------------- has - a ----------||---------- has - a ---------,	
	  |					 			has - a							 |
      |								   ||							 |
	Monitor				   			  Case				   		Motherboard
  --------------			       ----------			      ---------------
	model					  		 model						   model
	menufacturer				  menufacturer			   	   menufacturer
	size						  powerSupply			   	     ramSlots
    nativeResolution(Resolution)  dimensions    (Dimension)  	 cardSlot
	drawPixelAt()		 ||		 pressPowerBtn() 	||			   bios
					   width    			   	   width	   loadProgram()
					   height				      height
											       depth
*/


// ************************ MONITOR WITH RESOLUTION CLASS CREATED ****************************

class Monitor{
	private String model;
	private String menufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String menufacturer, int size, Resolution nativeResolution){
		this.model = model;
		this.menufacturer = menufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String colour){
		System.out.println("Monitor.drawPixelAt(): Drawing the pixel at (" + x + "," + y + ") with colour " + colour);
	}
	
	public String getModel(){
		return model;
	}
	
	public String getMenufacturer(){
		return menufacturer;
	}
	
	public int getSize(){
		return size;
	}
	
	public Resolution getResolution(){
		return nativeResolution;
	}
}

class Resolution{
	private int width;
	private int height;
	
	public Resolution(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
}


// ************************ CASE WITH DIMENSIONS CLASS CREATED ****************************

class Case{
	private String model;
	private String menufacturer;
	private int powerSupply;
	private Dimension dimensions;
	
	public Case(String model, String menufacturer, int powerSupply, Dimension dimensions){
		this.model = model;
		this.menufacturer = menufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerBtn(){
		System.out.println("Case.pressPowerBtn(): Power Button Pressed");
	}
	
	public String getModel(){
		return model;
	}
	
	public String getMenufacturer(){
		return menufacturer;
	}
	
	public int getPowerSupply(){
		return powerSupply;
	}
	
	public Dimension getDimensions(){
		return dimensions;
	}
}

class Dimension{
	private int width;
	private int height;
	private int depth;
	
	public Dimension(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getDepth(){
		return depth;
	}
}


// ************************ MOTHERBOARD CLASS CREATED ****************************

class Motherboard{
	private String model;
	private String menufacturer;
	private int ramSlots;
	private int cardSlot;
	private String bios;
	
	public Motherboard(String model, String menufacturer, int ramSlots, int cardSlot, String bios){
		this.model = model;
		this.menufacturer = menufacturer;
		this.ramSlots = ramSlots;
		this.cardSlot = cardSlot;
		this.bios = bios;
	}
	
	public void loadProgram(String programName){
		System.out.println("Motherboard.loadProgram(): Program " + programName + " now loading...");
	}
	
	public String getModel(){
		return model;
	}
	
	public String getMenufacturer(){
		return menufacturer;
	}
	
	public int getRamSlots(){
		return ramSlots;
	}
	
	public int getCardSlots(){
		return cardSlot;
	}
	
	public String getBIOS(){
		return bios;
	}
}

// ************************ PERSONAL COMPUTER BUILD ****************************

class PC{
	private Monitor monitor;
	private Case myCase;
	private Motherboard motherboard;
	
	public PC(Monitor monitor, Case myCase, Motherboard motherboard){
		this.monitor = monitor;
		this.myCase = myCase;
		this.motherboard = motherboard;
	}
	
	public Monitor getMonitor(){
		return monitor;
	}
	
	public Case getCase(){
		return myCase;
	}
	
	public Motherboard getMotherboard(){
		return motherboard;
	}
}

// ************************ MAIN CLASS ENGINE ****************************

public class PCBuilder{
	public static void main(String []args){
		
		// Passing the object of Resolution class seperately
		Resolution resolution = new Resolution(1920, 1280);
		Monitor monitor = new Monitor("24Inch - Intex_UHD","Intex",24,resolution);
		
		// Passing the obejct of Dimension class in-line to the obejct intialization
		Case myCase = new Case("LG-360", "LG", 240, new Dimension(24,28,12));
		
		// Creating and initializing obejct of class Motherboard
		Motherboard motherboard = new Motherboard("Zebronics - H81", "Zebronics", 2, 4, "v3.2.56");
		
		// how to class the method of other class without inheritance using PC obeject
		PC pc = new PC(monitor, myCase, motherboard);
		pc.getCase().pressPowerBtn();
		pc.getMotherboard().loadProgram("Pixel Panel");
		pc.getMonitor().drawPixelAt(4,8,"Green");
	}
}
