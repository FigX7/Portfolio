package edu.miracosta.cs113;
/**Defines an Object of type PrintJob
 * 
 * 
 * 
 * @author Michael Figueroa
 *
 */
public class PrintJob implements Comparable{
	private int numPages = 0;
	private String printId = "";
	private String printedFrom;
	private int orderReceived;
	private int orderPrinted;
	private int printTime;

//-----Contructors ----///
	/**Creates PrintJob with numPages and timeStart passed as arguments. 
	 * 
	 * @param numPages
	 * @param timeStart
	 */
	public PrintJob (int numPages) {
		this.numPages = numPages;
		for (int i  = 0; i < 7; i++) {
		   if(i % 3 == 0) {
			this.printId += randomChar(65,90);
		   }else if(i % 2 == 0){
			   this.printId += randomChar(48,57);
		   }else {
			   this.printId += randomChar(97,122);
		   }
		}
		
 	}
	
//------ Getters ---///
	public String getPrintedFrom() {
		return this.printedFrom;
	}
	
	public int getPage() {
		return this.numPages;
	}
	
	public String getPrintId() {
		return this.printId;
	}
	

	public int getOrderReceived() {
		return this.orderReceived;
	}
	public int getOrderPrinted() {
		return this.orderPrinted;
	}
	
	public int getPrintTime() {
		return this.printTime;
	}

	
//------ Setters ---//
	
	/**Sets Printer that printed the job
	 * 
	 * @param printer
	 */
	public void setPrintedFrom(String printer) {
		this.printedFrom = printer;
	}
	
	/**Set Num of Pages for job
	 * 
	 * @param x
	 */
	public void setPages(int x) {
		this.numPages = x;
	}
	

	public void setOrderReceived(int orderReceived) {
		this.orderReceived  = orderReceived;
	}
	
	public void setOrderPrinted(int printed) {
		this.orderPrinted = printed;
	}
	
	
	public void setPrintTime(int printTime) {
		this.printTime = printTime;
	}
	
	
	
//----- OTHER ----//
	/**Create random Char for printer id
	 * 
	 * @param min
	 * @param max
	 * @return char
	 */
	public char randomChar(int min, int max) {
		int result;
		result = (char) Math.floor((Math.random() * (max - min))  + min) ;
		return (char) result;
	}
	
	
	public String toString(){
		return "Job Id  = " + this.getPrintId() + "\nTimeStarted = " + this.getOrderReceived() + 
				"\nNum Pages = " +  this.getPage() + 
				"\nTime Finished = " +  this.getOrderPrinted() ;

	}

	@Override
	public int compareTo(Object o) {
		int result = 0;
		PrintJob other = (PrintJob) o;
		if (this.getOrderPrinted() < other.getOrderPrinted() ) {
			result = -1;
		}else if (this.getOrderPrinted() > other.getOrderPrinted() ) {
			result = 1;
		}else if (this.getOrderPrinted() == other.getOrderPrinted() ) {
			 if(this.getPage() < other.getPage()) {
				 result = -1;
			 }else if(this.getPage() > other.getPage()) {
				 result = 1;
			 }
		}
		
		return result;
	}
	
	
}
