package edu.miracosta.cs113;



import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * LabTwo.java: finds if a number is a power of two 
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.3

				
*/			
import java.util.Scanner;
//import java.util.math;
public class LabTwoResearch{
	public static void main(String[] args){
		double n;
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter Numbers to check if power of 2: ");
		n = stdIn.nextDouble();
		
		System.out.println(isPowerOf2(n));
	
	
	}
	public static boolean isPowerOf2(double n){
		 		double x = 0.0;
		 		double y = 0.0;
		 		double z = 0.0;
	
		 		boolean isPower = false;
		  		 
		  		x = Math.pow(n, 2);
		  		y = Math.pow(2,n);
		 		z = y/x;
		 	
		 		
		 		if (z != n){
		 			isPower = false;
		 		}
		 		z = Math.round(y / x); 
		 		
		 		
		  		System.out.println(n);
		  		System.out.println(x);
		  		System.out.println(y);
		  		System.out.println(z);
		  		
		 		
		 		if (n == 0){
		 			isPower = true;
		 		}else if (n == 1){
		 			isPower = true;
		 		}else if(( n <= 8) &&  (n != 6) && (n %2 == 0) ){
					isPower = true;
		 	
		 		}else if (z % x == 0){
		 			isPower = true;
		 		}
		  		return isPower;
		  	}
		  }


