package edu.miracosta.cs113;
import java.util.Scanner;


/* Computed the ARea and perimeter of shapes 
 	@author Koffman and Wolfgang
 */
	/*@ edited Michael Figueroa
	 * 
	 *commented out other shapes to not have to write classes from the book
	 * only two working are the ones requested for the HW
	 */


public class ComputeAreaAndPerimeter {
	public static void main (String[] args){
		
		Shape myShape;
		double perimeter;
		double area;
		myShape = getShape();
		myShape.readShapeData();
		perimeter = myShape.computePerimeter();
		area = myShape.computeArea();
		displayResult(myShape,area,perimeter);
		System.exit(0);
		
		
		
		
	}
	
	public static Shape getShape(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter C for Cirlce: ");
		System.out.println("Enter R for Rectangle: ");
		System.out.println("Enter S for Square: ");
		System.out.println("Enter T for Triangle: ");
		System.out.println("Enter E for Equilater Triangle: ");
		String figType = in.next();
		
		if (figType.equalsIgnoreCase("c")){			
			//return new Circle();
			return null;
		}
		
		else if (figType.equalsIgnoreCase("r")){
			//return new Rectangle();
			return null;
		}
		
		else if (figType.equalsIgnoreCase("s")){		// edited for homework
			return new Square();
			
		}
		else if (figType.equalsIgnoreCase("t")){
			//return new Triangle();
			return null;
		}
		
		else if (figType.equalsIgnoreCase("e")){		// edited for homework
			return new EquiTriangle();
			
		}else {
			return null;
		}
		
		
	}
	
	private static void displayResult(Shape myShape, double area, double perim){
		System.out.println(myShape);
		System.out.printf("The area is %.2f%nThePerimeter is %.2f%n",area,perim);
		
	}
	
	
}
