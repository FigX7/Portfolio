package edu.miracosta.cs113;
import java.util.Scanner;

/**
 * EquiTriangle.java: Represents a square Extends shape. MEthods to calculate permieter and area.
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0

				
*/	

public class EquiTriangle extends Shape {

	private double sideLength = 0.0;
	
	/* Contructs a Equilateral Triangle
		@ no param
	*/
	
	public EquiTriangle(){
		super("Equilateral Triangle");
	}
	
	/* Contructs a square of specified sides
	@ length
	 */
	
	public EquiTriangle(double length){
		super("Equilateral Triangle");
		sideLength = length;
	}
	
	// Methods
	
	/* Get side length
	 @ return side;
	 */
	
	public double getSideLength(){
		return this.sideLength;
	}
	
	/* COmpute the area iof the EquiTriangle
	  @return area of square
	*/
	@Override
	public double computeArea(){
		return ((Math.sqrt(3))/4) * (Math.pow(sideLength, 2));
	}
	
	/* Computes perimeter of EquiTriangle
	 * @return parameter
	 * @see edu.miracosta.cs113.Shape#computePerimeter()
	 */
	
	@Override
	public double computePerimeter(){
		return 3 * sideLength;
	}
	
	
	//* Reads shapes data *//
	
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
	

