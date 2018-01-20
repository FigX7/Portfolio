package edu.miracosta.cs113;

/**
 * Term .java:
 * 										
 * 
 * Class Invariant: No error checking for input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.0

				
*/	

public class Term implements Comparable{
	
	private int coefficient;
	private int exponent;

	
	/** Default Constructor
	 @param none
	*/
	
	public Term(){
		setCoefficient(0);
		setExponent(0);
	}
	
	/** Full constructor
	  @param coefficient (This is first param that sets coefficient for Term)
	  @param exponent (This is second param that sets exponent for Term)
	*/
	
	
	public Term(int coefficient,int exponent){
		this.setCoefficient( coefficient);
		this.setExponent(exponent);
		
	}


	/////////////*** Getters ****//////////////////

	/** getCoefficient()
	  @param void
	  @returns this.coeffcient
	*/
	
	public int getCoefficient(){
		return this.coefficient;
	}
	
	/** getExponent()
	  @param void
	  @returns this.coeffcient
	*/
	
	public int getExponent(){
		return this.exponent;
	}
	
	
	
	///////////////*********Setters************/////////
	
	
	/** setCoefficient for term
	  @param (int coefficient)
	*/
	public void setCoefficient(int coefficient){
		this.coefficient = coefficient;
	}
	
	/** setExponent for Term
	  @param (intexponent)
	*/
	public void setExponent(int exponent){
		this.exponent = exponent;
	}
	
	
	//********************* Others ***************//
	/** toString overiders string to display Term
	  @param none
	  @return temp (temp is String with appended details of a Term 
	*/
	@Override
	public String toString(){
		String temp = "";
		temp = temp +  Integer.toString(this.getCoefficient())+ "x" + 
				"^" + Integer.toString(this.getExponent()) + " +";
		
		return temp;
	}
	
	/** addCoe adds the coefficents of two Terms
	  @param term2 (Other term for addition
	  @return sum of two coefficients 
	*/
	
	public int addCoe(Term term2){
		return this.coefficient + term2.coefficient;
	}
	
	/** addExp adds the exponents of two Terms
	  @param term2 (Other term for addition
	  @return sum of two exponents 
	*/
	
	public int addExp(Term term2){
		return this.getExponent() + term2.getExponent();
	}
	
	
	@Override
	public boolean equals(Object other){
	
		if (this == other){
			return true;
		}
		
		if (!(other instanceof Term)){
			return false;
		}
		
		Term x = (Term)other; 
		
		if (this.compareTo(x) == 0){
			return true;
		}else{
			return false;
		}
		
		
		
	}
	
	
	/////////****************Required*******************////////////////
	
	/** Compares two term's exponents
	  @param term2 (Other term for comparison)
	  @return result (0 for equality,1 for term greater, -1 for term1 less.)
	*/
	
	@Override
	public int compareTo(Object other) {
		Term o = (Term)other;
		
		if ((this.getExponent() == o.getExponent())){
			int result = 0;
			return result;
		 } else if((this.getExponent() > o.getExponent())) {
			 int result = 1;
			 return result;
		 } else if((this.getExponent() < o.getExponent())) {
			 int result = -1;
			 return result;
		 } 
		return 10;
	}


}