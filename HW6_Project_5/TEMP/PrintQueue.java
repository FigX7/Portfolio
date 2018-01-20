package edu.miracosta.cs113;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
	private int min = 0;
 	private int max = 0;
 	private int size = 0;
	private Queue queueRange = new LinkedList();
	
	
	public PrintQueue(int min, int max) {
		this.max = max;
		this.min = min;
	}
	
	public void addJob(PrintJob x) {
		queueRange.offer(x);
		NetworkOS.jobsOrder.add(x);
		this.size ++;
		x.setPrintTime(NetworkOS.time);
		NetworkOS.time++;
		
	}
	
	public PrintJob removeJob() {
		this.size --;
		return (PrintJob) queueRange.poll();
		
	}
	
	public int getSize() {
		return this.size;
	}
//-------Getters ----////
	public int getMin() {
		return this.min;
	}
	public int getMax() {
		return this.max;
	}
	
//------ OTher ----//
	
	
}
