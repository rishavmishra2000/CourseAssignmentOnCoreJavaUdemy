// Printer Challenge
class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex){
		if(tonerLevel >= 0 && tonerLevel <= 100){
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		this.duplex = duplex;
		pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmount){
		if(tonerAmount > 0 && tonerAmount <= 100){
			if(tonerAmount + this.tonerLevel > 100){
				return -1;
			} else {
				this.tonerLevel += tonerAmount;
				return this.tonerLevel;
			}
		} else {
			return -1;
		}
	}
	
	public int printPages(int pages){
		int pagesToPrint = pages;
		if(this.duplex){
			System.out.println("Printing in duplex mdoe");
			pagesToPrint = ((pagesToPrint / 2) + (pagesToPrint % 2));
			this.pagesPrinted += pagesToPrint;
			return pagesToPrint;
		} else {
			System.out.println("Printing in simplex mdoe");
			this.pagesPrinted += pagesToPrint;
			return pagesToPrint;
		}
	}
	
	public int getPagesPrinted(){
		return pagesPrinted;
	}
	
	public void setDuplex(boolean type){
		this.duplex = false;
	}
}

public class PrinterStarted{
	public static void main(String []args){
		Printer printer = new Printer(50, true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " + printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " + printer.getPagesPrinted());
		
		printer.setDuplex(false);
		
		pagesPrinted = printer.printPages(5);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " + printer.getPagesPrinted());
	}
}