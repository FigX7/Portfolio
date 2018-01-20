package edu.miracosta.cs113;

import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Stack;
import java.util.Collection;
import org.junit.*;
import org.hamcrest.*;


/**Lab7.java: 
 *<P> Description:
 * 
 * 
 * @author Mike Figueroa
 *
 */

public class JunitLab7<E> {

	@Test
	public void testContructor() {
		System.out.println("-------------Test Contrcutors-------------");
		
		MyArrayStack<E> testStack1 = new MyArrayStack<E>();
	
		System.out.println("Capacity of Deafult Stack = " + testStack1.getCapacity());
		System.out.println(testStack1);
	
		System.out.println("Test 1: GOOD");
				
	}
	
	@Test
	public void testPush() {
		System.out.println("-------------Test Push-------------");
		
		MyArrayStack<E> testStack1 = new MyArrayStack<E>();
		testStack1.push((E) "Bob");
		testStack1.push((E) "John");
		testStack1.push((E) "Mela");
		testStack1.push((E) "Mike");
		testStack1.push((E) "Kenzo");
		testStack1.push((E) "Sunny");
		System.out.println("-------------Test toString-------------");
		
		System.out.println(testStack1);
		System.out.println("Test 2: Good" + "\n");
		
	}
	
	@Test
	public void testReallocate() {
		System.out.println("-------------Test Reallocate-------------");
		
		MyArrayStack<E> testStack1 = new MyArrayStack<E>();
		System.out.println("Old Capacity of Array = " + testStack1.getCapacity() + "\n");
		
		testStack1.push((E) "Bob");
		testStack1.push((E) "John");
		testStack1.push((E) "Mela");
		testStack1.push((E) "Mike");
		testStack1.push((E) "Kenzo");
		testStack1.push((E) "Sunny");
		testStack1.push((E) "Manny");
		testStack1.push((E) "Marlone");
		testStack1.push((E) "Catano");
		testStack1.push((E) "Celeida");
		testStack1.push((E) "TinTin");
		testStack1.push((E) "Luisa");
		
		System.out.println(testStack1);
		
		System.out.println("New Capacity of Array = " + testStack1.getCapacity() + "\n");
		
		System.out.println("Test 3: Good" + "\n");
		
	}
	
	@Test
	public void testPop() {
	MyArrayStack<E> testStack1 = new MyArrayStack<E>();
	System.out.println("-------------Test Pop-------------");	
		
		testStack1.push((E) "Bob");
		testStack1.push((E) "John");
		testStack1.push((E) "Mela");
		testStack1.push((E) "Mike");
		testStack1.push((E) "Kenzo");
		testStack1.push((E) "Sunny");
		testStack1.push((E) "Manny");
		testStack1.push((E) "Marlone");
		testStack1.push((E) "Catano");
		testStack1.push((E) "Celeida");
		
		System.out.println(testStack1);
		System.out.println("Should Pop Celeida \n");
		
		testStack1.pop();
		
	;
		System.out.println(testStack1);
		
		System.out.println("Test 4: Good" + "\n");
		
	}
	
	@Test
	public void testPeek() {
		MyArrayStack<E> testStack1 = new MyArrayStack<E>();
		System.out.println("-------------Test Peek-------------");	
			
			testStack1.push((E) "Bob");
			testStack1.push((E) "John");
			testStack1.push((E) "Mela");
			testStack1.push((E) "Mike");
			testStack1.push((E) "Kenzo");
			testStack1.push((E) "Sunny");
			testStack1.push((E) "Manny");
			testStack1.push((E) "Marlone");
			testStack1.push((E) "Catano");
			testStack1.push((E) "Celeida");
	
			System.out.println(testStack1);
			
			System.out.println("-----Should peek Celeida and not remove-----");
			
			System.out.println("Peek = " + testStack1.peek()+'\n');
			
			System.out.println(testStack1);
			System.out.println("Test 5: Good" + "\n");
			
	}
	
	@Test public void testEquals() {
		MyArrayStack<E> testStack1 = new MyArrayStack<E>();
		MyArrayStack<E> testStack2 = new MyArrayStack<E>();
		System.out.println("-------------Test Equlas()-------------");	
			
		
		System.out.println("--------Stack one = --------");	
		testStack1.push((E) "Bob");
		testStack1.push((E) "John");
		testStack1.push((E) "Mela");
		testStack1.push((E) "Mike");
		System.out.println(testStack1);
		
		System.out.println("--------Stack two = --------");	
		
		testStack2.push((E) "Bob");
		testStack2.push((E) "John");
		testStack2.push((E) "Mela");
		testStack2.push((E) "Mike");
		System.out.println(testStack2);
		
		System.out.println("\nStacks equals eachother = " + testStack1.equals(testStack2));	
		
		System.out.println("\n--------Stack Change to be different --------");	
		testStack2.pop();
		
		System.out.println("\nStacks equals eachother = " + testStack1.equals(testStack2));
		
		System.out.println("Test 6: Good" + "\n");
			
	}
		
}
	
