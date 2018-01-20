package edu.miracosta.cs113;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class Hw6Junit {

	@Test
	public void testNetOS() {
		NetworkOS testOS1 = new NetworkOS(1);
		NetworkOS testOS2 = new NetworkOS(2);
		NetworkOS testOS3 = new NetworkOS(3);
		ArrayList<PrintJob> randPrintJobs =  new ArrayList<PrintJob>();
		
		int randNum;
		
		randNum = (int) (Math.random()*(50 - 1) + 1);
		
		for(int i = 0 ; i < 10; i++){
			randNum = (int) (Math.random()*(50 - 1) + 1);
			PrintJob temp = new PrintJob(randNum);
			randPrintJobs.add(temp);
			
		}
		
		for (int i = 0; i < randPrintJobs.size(); i++) {
			testOS1.sendToPrint(randPrintJobs.get(i));
		}
		System.out.println("///--------------Test with 1 printer--------------\\");
		System.out.println(testOS1);
		
		for (int i = 0; i < randPrintJobs.size(); i++) {
			testOS2.sendToPrint(randPrintJobs.get(i));
		}
		System.out.println("///--------------Test with 2 printers--------------\\");
		System.out.println(testOS2);
		
		for (int i = 0; i < randPrintJobs.size(); i++) {
			testOS3.sendToPrint(randPrintJobs.get(i));
		}
		System.out.println("///--------------Test with 3 printers--------------\\");
		System.out.println(testOS3);
	}
}
