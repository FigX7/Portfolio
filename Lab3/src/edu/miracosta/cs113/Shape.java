package edu.miracosta.cs113;

//** Abstract Class for a geometric shape. **//
 public abstract class Shape {
	 
	 private String shapeName = "";
	 
	 /* Inintializes the shapeName.
	  @ param shapeName the kind of shape
	 */
	 
	 public Shape(String shapeName){
		 this.shapeName = shapeName;
	 }
	 
	 /* Get kind of shape. 
	  * @ return the shapeName
	 */
	 
	 public String getShapeName() {
		 return this.shapeName;
	 }
	 
	 @Override
	 public String toString(){
		 return "Shape is a " + shapeName;
	 }
	 
	 // abstract methods
	 
	 public abstract double computeArea();
	 public abstract double computePerimeter();
	 public abstract void readShapeData();
 }
