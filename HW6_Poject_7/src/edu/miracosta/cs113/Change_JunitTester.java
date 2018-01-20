package edu.miracosta.cs113;
import org.junit.*;
/**Tester got Recursive method
 * 
 * @author Mike Figueroa
 *
 */

public class Change_JunitTester {

	//@Test
	public void testPennies() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = 0.03;
		System.out.println("Your change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testNickles() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .05;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	//@Test
	public void testPenniesAndNickles() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .06;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	//@Test
	public void testDimes() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .10;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testDimesAndPennies() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .11;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testDimesPenniesNickles() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .17;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testQuarters() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .25;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testQuartersPennies() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .26;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testQuartersNickles() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = .30;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
	//@Test
	public void testQuartersNicklesDimes() {
		ChangeDispenser test = new ChangeDispenser();
		double changeAmount = 1.16;
		System.out.println("\nYour change in coins for $"  + changeAmount);
		test.showChange(changeAmount);
	}
	
}
