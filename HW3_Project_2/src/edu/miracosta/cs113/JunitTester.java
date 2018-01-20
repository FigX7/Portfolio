
package edu.miracosta.cs113;

import java.util.ListIterator;
import org.junit.Assert;
import org.junit.Test;
/**
 * JUnitTesterProgTwo.javaa driver for projext 2 on pg 145.
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0
 * @param <E>

				
*/	



public class JunitTester<E>{
	
	PolyLinkList<Term> x = new PolyLinkList<Term>();
	PolyLinkList<Term> y = new PolyLinkList<Term>();
	PolyLinkList<Term> z = new PolyLinkList<Term>();
	
	Term first = new Term(1,0);
	Term second = new Term(2,1);
	Term third = new Term(3,2);
	Term fourth = new Term(4,3);
	Term fifth = new Term(5,4);
	
	Term first1 = new Term(1,0);
	Term second2 = new Term(1,1);
	Term third3 = new Term(1,2);
	Term fourth4 = new Term(1,3);
	Term fifth5 = new Term(1,4);
	
	ListIterator<Term> it = x.listIterator(0);
	ListIterator<Term> it2 = y.listIterator(0);


	public void testAdd(){
		
		Term first = new Term(0,3);
		Term second = new Term(1,4);
		Term third = new Term(2,4);
		Term fourth = new Term(3,3);
		Term fifth = new Term(4,4);
	
		System.out.println("\ntest ADD and add(int)");
		x.add(first);
		x.add(second);
		x.add(third);
		x.add(1,fourth);
		
		x.printlist(x);
		System.out.println("\n1). Good\n");
	}
	
	@Test
	public void addPoly(){
		
		x.add(first);
		x.add(second);
		x.add(third);
		x.add(1,fourth);
		System.out.println("\nFirst Poly");
		x.printlist(x);
		
		y.add(first1);
		y.add(second2);
		y.add(third3);
		y.add(1,fourth4);
		
		System.out.println("\nSecond Poly");
		y.printlist(y);
		
		System.out.println("\nAdd Poly");
		z = z.addTwoPoly(x,y);
		
		System.out.println();
		z.printlist(z);
		System.out.println("\n3). Good");
		
	}
}

