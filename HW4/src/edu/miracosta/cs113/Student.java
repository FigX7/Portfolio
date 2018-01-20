package edu.miracosta.cs113;
/**
 * Student.java
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0

				
*/	


public class Student<E> implements Comparable{
		
//------ DATA MEMBERS
	private String fName;
	private String lName;
	private int position;
	
//END DATA MEMBERS
	
//----- Constructors	
	/**Default constructor;
	 * @param i 
	 * @param string2 
	 * @param string 
	 *@param none
	 */
	
	public Student(String lName, String fName, int i){
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setPos(i);
	}
	
	/**Full constructor;
	 *@param fName
	 *@param lName
	 */
	public Student(String fName,String lName){
		this.fName = fName;
		this.lName = lName;
		this.position = 0;
	}
//END Constructors	

//------Methods
	//Setters
	public void setFullName(String fName,String lName,int pos){
		this.fName = fName;
		this.lName = lName;
		this.position = pos;
	}
	
	public void setFirstName(String fName){
		this.fName = fName;
	}
	
	public void setLastName(String lName){
		this.lName = lName;
	}
	
	public void setPos(int pos){
		this.position = pos;
	}
	//Getters
	
	public String getFirstName(){
		return this.fName;
	}
	
	public String getLastName(){
	return this.lName;
	}
	
	public int getPos(){
		return this.position;
	}
	
	//OTHERS
	
	
	public boolean equals(Object obj){
		boolean result = false;
		Student other = (Student) obj;
		if(other == this){
			result = true;
		}else if(!(other instanceof Student) ){
			result = false;
		}else if (this.getFirstName().toUpperCase() == other.getFirstName().toUpperCase()
					&& this.getLastName().toUpperCase() == other.getLastName().toUpperCase()){
			result = true;
		}
		return result;
	}
	
	public String toString(){
		return this.getLastName() + ", " + this.getFirstName() + ", Pos = " + this.getPos() ;
	
	}
	
	@Override
	public int compareTo(Object other) {
		Student x = (Student)other;
		int result = 0;
		if ((this.getPos() == x.getPos())){
			result = 0;
		 } else if((this.getPos() > x.getPos())) {
			 result = 1;
		 } else if((this.getPos()< x.getPos())) {
			 result = -1;
		 } 
		return result;
	}

//END Methods
	
}
// END CLASS