package edu.miracosta.cs113;

/**
 * LabTwo.java: finds if a number is a power of two
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0
 * 
 * Alogrithm:
 * 
 * 			
 *  		IF (x == 0) 
 * 			THEN 
 * 				isPowerOf2 == true
 * 			ELSE IF (x == 1) 
 * 			THEN
 * 				isPowerOf2 == true
 * 			ELSE IF ( n > 1)							
			THEN	
				WHILE (n > 1)
					x = n % 2;					//USE module 2 to get reaminder o n/2.
				IF(x != 0)	
				THEN
					isPower = false;
					n = -1;					 //ends loop when n not divisble by two. 
		
				ELSE
					n = n/2;                // decerement by 2 for loop, to check power of 2.
				END WHILE
			return isPower;
				
*/			
import java.util.Scanner;
//import java.util.math;
public class LabTwo{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter Numbers to check if power of 2: ");
		System.out.println(isPowerOf2(stdIn.nextDouble()));
	
	
	}
	public static boolean isPowerOf2(double n){
	
		boolean isPower = false;

		double z = Math.log(n)/ Math.log(2);

		if (z % 1 == 0 || n == 0){
			isPower = true;
		}
		return isPower;
	}
}


