package edu.miracosta.cs113;
import java.util.Scanner;

/**
 * Square.java: Represents a square Extends shape. MEthods to calculate permieter and area.
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0

				
*/	

public class Square extends Shape {

	private double sideLength = 0.0;
	
	/* Contructs a square
		@ no param
	*/
	
	public Square(){
		super("Square");
	}
	
	/* Contructs a square of specified sides
	@ length
	 */
	
	public Square(double length){
		super("Square");
		sideLength = length;
	}
	
	// Methods
	
	/* Get side length
	 @ return side;
	 */
	
	public double getSideLength(){
		return this.sideLength;
	}
	
	/* COmpute the area iof the square
	  @return area of square
	*/
	@Override
	public double computeArea(){
		return sideLength * sideLength;
	}
	
	/* Computes perimeter of square
	 * @return parameter
	 * @see edu.miracosta.cs113.Shape#computePerimeter()
	 */
	
	@Override
	public double computePerimeter(){
		return 4 * sideLength;
	}
	
	
	
	public void readShapeData(){
		Scanner stdIn  = new Scanner(System.in);
		System.out.println("Enter the length for each side of the square:");
		sideLength = stdIn.nextDouble();
		
		
	}
	
	/*Overide toString*/
	
	@Override
	public String toString(){ 
		return super.toString() + ": sides lengths are" + this.sideLength; 
	}
}
	

