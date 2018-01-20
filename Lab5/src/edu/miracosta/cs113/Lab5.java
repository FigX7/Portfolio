package edu.miracosta.cs113;
import java.util.ArrayList;
/**
 * Lab5PartOne : custom replave static m,ethid
 * 
 * @author Nery Chapeton-Lamas (material from Kevin Lewis)
 * @version 1.0
 *
 */


public class Lab5 {

	public static void main(String[] args){
	
		ArrayList<DirectoryEntry> aList =  new ArrayList<DirectoryEntry>();
		DirectoryEntry bruce = new DirectoryEntry("Bruce Wayne", "555 - BATS");
		DirectoryEntry peter = new DirectoryEntry("Peter Parker", "555 - SPDY");
		DirectoryEntry ash = new DirectoryEntry("Ash Ketchum", "555 - POkE");
		DirectoryEntry trunks = new DirectoryEntry("Trunks Breigh", "555 - SAYN");
		DirectoryEntry remy = new DirectoryEntry("Remy Etienne LeBeau", "555 - GAMB");
		DirectoryEntry tony = new DirectoryEntry("Anthony Stark", "555 -IRON");
		
		
		aList.add(bruce);
		aList.add(peter);
		aList.add(ash);
		
		aList.add(remy);
		aList.add(ash);

		System.out.println("\n---------Old Array-----------\n");
		printArray(aList);
		
		System.out.println("\new Array with replace: BATMAN for IronMan = newItem\n" );
		replace(aList,bruce,tony);
		printArray(aList);
		
		
		System.out.println("\n-----Remove First instace of = ash-----");
		delete(aList,ash);
		System.out.println("\n----New Array minus first instace Ash-----\n");
		
		printArray(aList);
		
	}
	
	/** print contents of Array
	 * 
	 * @param aList
	 */
	
	public static void printArray(ArrayList<DirectoryEntry> aList)
	{
		
		for (int i = 0; i < aList.size();i++){
			System.out.println(aList.get(i));
		}
		
	}

	
	/** Replace each occurence of oldItem in aList with newItem
		@Param Array, String
	*/
	public static void replace(ArrayList<DirectoryEntry> aList,DirectoryEntry oldItem,DirectoryEntry newItem){
		ArrayList<DirectoryEntry> myList =  new ArrayList<DirectoryEntry>();
		myList = aList;
		for( int i = 0; i < myList.size();i++){
			
			if(myList.get(i).equals(oldItem)){
				myList.set(i, newItem);
			
			}
		}
	}
	
	/** RDeletes the first occurence of traget in alIst
	 @param ArrayLisy, String targer
	 */
	
	public static void delete(ArrayList<DirectoryEntry> aList,DirectoryEntry target){
		int i = aList.indexOf(target);
		if (i == -1){
			System.out.println("Target not found");
		}else{
			System.out.println("\nTarget found\nTarget = " + target +  '\n');
			aList.remove(i);
		}
	}
	 
}