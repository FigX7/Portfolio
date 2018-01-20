package edu.miracosta.cs113;

import java.util.LinkedList;
import java.util.Queue;

/**Defines an Object of type PrintJob
 * 
 * 
 * 
 * @author Michael Figueroa
 *
 */
public class Printer {
	private int ppm = 10;
	private int count = 0;
	private String printerId = "";
	private boolean isInUse = false;
	
	public Printer(int ppm,String id) {
		this.ppm = ppm;
		this.printerId = id;
	}
	
	public int getPPM() {
		return this.ppm;
	}
	
	public void setPPM(int newPPM) {
		this.ppm = newPPM;
	}
	
	public boolean getInUse() {
		return this.isInUse;
	}
	
	public void setJobPrinter(PrintJob job) {
		job.setPrintedFrom(this.printerId);
	}
	
	public PrintJob print(PrintJob toPrint) {
		int temp = (int) Math.ceil(toPrint.getPage()/this.getPPM());
		if(temp == 0) {
			temp = 1;
		}
		System.out.println("PrintTime = " + temp);
		NetworkOS.totalPrintTime += temp;
		
		
		toPrint.setTimeStarted(NetworkOS.time);
		toPrint.setOrderReceived(NetworkOS.time);
		toPrint.setPrintTime(temp);
		for(int i = temp; i > 0; i--){
			isInUse = true;
		
			
		}
		
		toPrint.setTimeDone(toPrint.getTimeStarted() + temp);
		setJobPrinter(toPrint);
		NetworkOS.printedOrder.add(toPrint);
		isInUse = false;
		return toPrint;
	}
}
