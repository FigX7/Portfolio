package edu.miracosta.cs113;

/**
 * LabOne.java: prints Numbers 1 to 100, but for multiples of 3 print "Fizz"
 * 										for multiples of 5 print "Buzz"
 * 										for mutltiples of 5 & 3 "Fizzbuzz"
 * 
 * Class Invariant: 
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.1
 * 
 * Alogrithm:
 * 
 * 			Use modulo for each case of multiples.
 * 			OUTPUT Fizz for mulitples of 3
 * 			OUTPUT Buzz for multiples of 5
 * 			OUTPUT Fizzbuzz for integer that is both multiples of 5 and 3
*/

public class LabOne {
	
	public static void main (String[] args){
	
	for ( int i = 1; i < 100; i++){
		if ((i % 5 != 0) && (i % 3 != 0)){
			System.out.println(i);
		}else if ( (i % 5 == 0) && (i % 3 == 0)) {
			System.out.println("Fizzbuzz");
		}else if(i % 3 == 0) {
			System.out.println("Fizz");
		}else if( i % 5 == 0) {
			System.out.println("Buzz");
		}
	} 
	
	}
}
