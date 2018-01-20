package edu.miracosta.cs113;
import java.util.Scanner;

/**HwFiveTester
 * <P>Description use MyArrayStack.java for stacks
 * <P>1.Create two stacks;
 * <P>2.pop half of stack and push to second stack
 * <P>3. compare two stacks.
 * <p>NOTE: if string is odd number additional pop is needed middle is same for both stack
 * does need to be compared
 * @author Mike Figueroa
 *
 */
public class HwFiveTester {

	public static void main(String[] args) {
	//------------Data Members ----------
	
		String toCheck;
		Scanner stdIn = new Scanner(System.in);
		MyArrayStack stack1 = new MyArrayStack();
		MyArrayStack stack2 = new MyArrayStack();
		
		System.out.println("Please enter Text to test Palindrome:");
		toCheck = stdIn.nextLine();
		
		for (int i = 0; i < toCheck.length(); i++) {
			stack1.push(toCheck.charAt(i));
		
		
		
		}
		for (int i = toCheck.length()/2; i < toCheck.length(); i++){
			stack2.push(stack1.pop());
			 
		}
		
		if (toCheck.length() % 2 != 0) {
			stack2.pop();
		}

		System.out.println("Input String is palindrome = " + stack1.equals(stack2));
	
	}

}
