package edu.miracosta.cs113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	private int min = 0;
 	private int max = 0;
 	private int ppm = 10;

 	private boolean isBusy = false;
 	private String printerID = "Default 1";
 	private int timer = 0;
 	private ArrayList<PrintJob> printedOrder =  new ArrayList<PrintJob>();
 	
	private Queue<PrintJob> queueRange = new LinkedList<PrintJob>();
	
	public Printer (int min,int max,int ppm,String printerID) {
		this.min = min;
		this.max = max;
		this.ppm = ppm;
		this.printerID = printerID;
		
	}
	
	public Printer (int min,int max,int ppm) {
		this.min = min;
		this.max = max;
		this.ppm = ppm;

	}
	
//--------Setters -----------//
	public void setMin(int min) {
		this.min = min;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public void setPPM(int ppm) {
		this.ppm = ppm;
	}
	
	public void setPrinterID(String newId) {
		this.printerID = newId;
	}
	
	public void setIsBusy(boolean x) {
		this.isBusy = x;
	}
	

//------ Getters --------//
	
	public int getMin() {
		return this.min;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public int getPPM() {
		return this.ppm;
	}
	
	public String getID() {
		return this.printerID;
	
	}
	
	public boolean isBusy() {
		return this.isBusy;
	}
	
	public int getTimer() {
		return this.timer;
	}
	
	public ArrayList getOrderPrinted() {
		return this.printedOrder;
	}
//---------------Other ------////
	 public void addJob(PrintJob newJob) {
		 this.queueRange.offer(newJob);
		 print();
	 }
	 
	 public void print() {
		 PrintJob tempJob;
		 tempJob = this.queueRange.peek();
		 if(this.queueRange.size() == 0) {
			this.setIsBusy(false);
		}else if(tempJob.getPrintTime() == 0) {
			tempJob.setOrderPrinted(timer);
			this.printedOrder.add(this.queueRange.poll());
			
		}else {
			tempJob.setPrintTime(tempJob.getPrintTime() - 1);
			timer ++;
			print();
		}
		 
	 }
}
