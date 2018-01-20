package edu.miracosta.cs113;
/**
 * DirectoryEntry : Data moel class for lab 5
 * 
 * @author Nery Chapeton-Lamas (material from Kevin Lewis)
 * @version 1.0
 *
 */
public class DirectoryEntry {

	String name;
	String number;
	
	//Contructors//
	/** Default
	 * @set name to John Doe
	 * @ser mnumber to 555-555
	 */
	public DirectoryEntry(){
		this.setName("John Doe");
		this.setNumber("555-5555");
	}
	/** Full
	 * @param name
	 * @param number 
	 */
	public DirectoryEntry(String name,String number){
		this.setName(name);
		this.setNumber(number);
	}
	//END Constructors//
	
	//Setters//
	public void setNumber(String number){
		this.number = number;
	}
	
	public void setName(String name){
		this.name = name;
	}
	//End Setters
	
	//Geters
	public String getName(){
		return this.name;
	}
	
	public String getNumber(){
		return this.number;
	}
	//End Getters
	
	//OTHER Methods//
	
	public boolean equals(DirectoryEntry other){
		return (this.getName().equals(other.getName()) && (this.getNumber() == other.getNumber()) );
	}
	
	public String toString(){
		return "\" " + this.getName() +  "\", " +  "\"" + this.getNumber()  + "\"";
	}
	//End OtherMethods //
}//End CLASS
