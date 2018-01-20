package edu.miracosta.cs113;

import java.util.ArrayList;
import java.util.Collections;


public class NetworkOS {
	
	private int time = 0;

	private ArrayList<PrintJob> printedOrder =  new ArrayList<PrintJob>();
	private ArrayList<Printer> allPrinters = new ArrayList<Printer>();
	
	//private ArrayList<PrintJob> jobsOrder =  new ArrayList<PrintJob>();
	//private Queue<PrintJob> allJobs = new LinkedList<PrintJob>();
	
	
	
	public NetworkOS (int x) {
		
		if (x == 1) {
			this.allPrinters.add(new Printer(1,50,10,"Printer 1"));
			
		}else if( x == 2) {
			this.allPrinters.add(new Printer(1,24,10,"Printer 1"));
			this.allPrinters.add(new Printer(25,50,10,"Printer 2"));
		}else if( x == 3) {
			this.allPrinters.add(new Printer(1,9,10,"Printer 1"));
			this.allPrinters.add(new Printer(10,19,10,"Printer 2"));
			this.allPrinters.add(new Printer(20,50,10,"Printer 3"));
		}
	
	}
//----------Setters----------////
		
	public void setTime(int x) {
		this.time = x;
	}



//-------------Getters --------///////
	public int getTime() {
		return this.time;
	}

//	public Queue<PrintJob> getAllJobs() {
//		return this.allJobs;
//	}

//	public ArrayList getJobsOrder() {
//		return this.jobsOrder;
//	}
	
	

	
//-------- Other Methods ------------//
	
	public void addToPrintedOrder() {
		for (int i = 0; i < this.allPrinters.size(); i++) {
			this.printedOrder.addAll(allPrinters.get(i).getOrderPrinted());
		}
		
		Collections.sort(this.printedOrder);
	}
	
	public void sendToPrint(PrintJob jobToPrint) {
		
		time++;
		for(int i = 0 ; i < this.allPrinters.size(); i++) {
			Printer temp;
			temp = this.allPrinters.get(i);
			int tempPrintTime;
			tempPrintTime = (int)(Math.ceil(jobToPrint.getPage()/temp.getPPM()));
			if(tempPrintTime == 0){
				tempPrintTime = 1;
			}
			
			//System.out.println(tempPrintTime);
			if(jobToPrint.getPage() >= temp.getMin() && jobToPrint.getPage() <= temp.getMax() ) {
				
				jobToPrint.setPrintTime(tempPrintTime);
				jobToPrint.setOrderPrinted(this.getTime());
				jobToPrint.setOrderReceived(this.getTime());
				jobToPrint.setPrintedFrom(temp.getID());
				temp.addJob(jobToPrint);
				
			}
		}
	}
	
	public String toString() {
		this.addToPrintedOrder(); 
		String result = "Total Print Time = " + this.printedOrder.get(this.printedOrder.size()-1).getOrderPrinted();
		result += "\n|     Job Id     |  Pages  |  Time Job Received    |   Time Job Printed |  Printed From Printer |\n" 
					+"------------------------------------------------------------------------------------------------\n" ;
		for(int i = 0; i < printedOrder.size() ; i++) {
			
			PrintJob tempJob = printedOrder.get(i);
			result +="|     " + tempJob.getPrintId() + "    |   " + tempJob.getPage() + "    |           "+ tempJob.getOrderReceived() + "           |         " +
			tempJob.getOrderPrinted()+ "           |    " +  tempJob.getPrintedFrom() + " |\n";

		}
		
		return result;
	}
	
}
