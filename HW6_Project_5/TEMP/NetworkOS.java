package edu.miracosta.cs113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NetworkOS {
	
	static int time = 0;
	static int totalPrintTime = 0;
	
	static ArrayList<PrintJob> jobsOrder =  new ArrayList<PrintJob>();
	static ArrayList printedOrder =  new ArrayList();
	public static void main(String[] args) {
		
		
		
		
		
		ArrayList<Printer> printers = new ArrayList<Printer>();
		Printer printer1 = new Printer(10,"Printer-1");
		Printer printer2 = new Printer(10,"Printer-2");
		Printer printer3 = new Printer(10,"Printer-3");
		printers.add(printer1);
		printers.add(printer2);
		printers.add(printer3);
		
		
		ArrayList<PrintQueue> allQueues =  new ArrayList<PrintQueue>();
		PrintQueue cat1 = new PrintQueue(1,9);
		PrintQueue cat2 = new PrintQueue(10,19);
		PrintQueue cat3 = new PrintQueue(20,100);
		allQueues.add(cat1);
		allQueues.add(cat2);
		allQueues.add(cat3);
	
		int pageRand = 0; 
		pageRand = (int) ((Math.random()*50 - 1) + 1);
		
		for(int i = 0; i < 100; i++) {
			
		}
		PrintJob job1 = new PrintJob(50);
		PrintJob job2 = new PrintJob(20);
		PrintJob job3 = new PrintJob(1);
		PrintJob job4 = new PrintJob(10);
		PrintJob job5 = new PrintJob(5);
	
		
		
		
		
		System.out.println(job1);
		sendToPrint(job1, allQueues, printers);
		sendToPrint(job2, allQueues, printers);
		sendToPrint(job3, allQueues, printers);
		sendToPrint(job4, allQueues, printers);
		sendToPrint(job5, allQueues, printers);
		
		printPrinterSystem();
	}

	public static void printPrinterSystem() {
		String result = "Total Print Time = " + NetworkOS.totalPrintTime;
		result += "\n|     Job Id     | Time Job Received | Time Job Printed |  Printed From Printer |\n" 
					+"--------------------------------------------------------------------------------\n" ;
		for(int i = 0; i < jobsOrder.size(); i++) {
			
			PrintJob tempJob = jobsOrder.get(i);
			result +="|     " + tempJob.getPrintId() + "    |         " + tempJob.getOrderReceived() + "         |        " +
			tempJob.getTimeDone() + "         |        " +  tempJob.getPrintedFrom() + "      |\n";
	
		}
		System.out.println(result);
	}
	
	public static void sendToPrint(PrintJob newJob,ArrayList<PrintQueue> queue, ArrayList<Printer> printers) {
		
		for (int i = 0; i < queue.size(); i++) {
			PrintJob tempJob;
			PrintQueue temp;
			temp = queue.get(i);
			if((newJob.getPage() >= temp.getMin()) && (newJob.getPage() <= temp.getMax())){
				temp.addJob(newJob);
			}
			for (int j = 0; j < printers.size(); j++) {
				if((temp.getSize() != 0) && printers.get(j).getInUse() == false ) {
					tempJob = temp.removeJob();
					tempJob = printers.get(j).print(tempJob);
				}
			}
		}
		
	}
	
}
