package edu.miracosta.cs113;

 /**
 * SolutionAna;ysis.java: Refined SolutionFinder to return analysis.
 * 
 * Class Invariant: No error checking for theory input.
 * 
 * 
 * @author		Michael Figueroa
 * @version		1.1
 * 
 *
 * Alogrithm:
 * 				Declare answerSet // used for theory selection
 * 						int solution  // used for correction from given clue value from Class AssistantJack
 * 						int murder	  
 * 						int weapon	
 * 						int location
 *						Scanner stdIn = new Scanner(System.in);
 *						Theory answer = null;                    //used for final answer of obeject type Theory
 *						AssistantJack jack;              
 * 			
 * 				Intialize two arrays
 * 						int[] num6 = {1,2,3,4,5,6};                      used to Assign values to Arraylist for weapons nad murders
 *						int[] num10 = {1,2,3,4,5,6,7,8,9,10};			 used to Assign values to Arraylist for locations
 * 
 *				Add values to ArrayList's allWeapon & allMurder 
 *						FOR (int i = 0; i <= 5; i++){
 *							allWeapon.add(num6[i]);
 *							allMurder.add(num6[i]);
 *  					END FOR
 * 
 *				Add values to ArrayList's allLocation
 * 						FOR  (int i = 0; i <= 9; i++)
 *							allLocation.add(num10[i]);
 *						END FOR
 *				PROMPT "Which theory would like you like to test? (1, 2, 3[random]): "
 *				ASSIGN jack from user input
 *				
 *				DO
 *					weapon = allWeapon.size() ;								//as allWeapon.size()-- different weapons values are selected
					location = allLocation.size();									''
					murder = allMurder.size();										''
	
					System.out.println (weapon +"," + location + "," + murder + "," );
					solution = jack.checkAnswer(weapon, location, murder);
			
					System.out.println(solution);
			
					if (solution == 1){
						allWeapon.remove(allWeapon.indexOf(weapon));       //removes values 6 - 1 as clue given
					}
		
					if (solution == 2 ){
						allLocation.remove(allLocation.indexOf(location)); //removes values 10 - 1 as clue given
					}
					if (solution == 3 ){
						allMurder.remove(allMurder.indexOf(murder));		//removes values 6 - 1 as clue given
					}
	
				END WHILE(solution != 0);
					
				
*/				
 
import java.util.Scanner;
import java.util.ArrayList;
 public class SolutionAnalysis {
	 /**
	 * Tester for random assistant theory checker
	 * 
	 * @param args
	 *            command line arguments (unnused)
	 */
	 
	 public static void main(String[] args){
		int answerSet, solution1,solution2,solution3;
		double avgTotal = 0.0;
		double L = 0.0;
		int runs = 0;
		
		int[] num6 = {1,2,3,4,5,6};
		int[] num10 = {1,2,3,4,5,6,7,8,9,10};
		
		
		Scanner stdIn = new Scanner(System.in);
		Theory answer1 = null;
		Theory answer2 = null;
		Theory answer3 = null;
		
		AssistantJack jack1;
		AssistantJack jack2;
		AssistantJack jack3;
		
		System.out.println("Please enter runs: ");
		runs = stdIn.nextInt();

		
		for(int c = 0; c < runs; c++){
			int murder, weapon, location;	
			
			ArrayList<Integer> allWeapon = new ArrayList<Integer>();
			ArrayList<Integer> allMurder = new ArrayList<Integer>();
			ArrayList<Integer> allLocation = new ArrayList<Integer>();
			
			ArrayList<Integer> allWeapon2 = new ArrayList<Integer>();
			ArrayList<Integer> allMurder2 = new ArrayList<Integer>();
			ArrayList<Integer> allLocation2 = new ArrayList<Integer>();
			
			ArrayList<Integer> allWeapon3 = new ArrayList<Integer>();
			ArrayList<Integer> allMurder3 = new ArrayList<Integer>();
			ArrayList<Integer> allLocation3 = new ArrayList<Integer>();
			
			for (int i = 0; i <= 5; i++){
					allWeapon.add(num6[i]);
					allMurder.add(num6[i]);
					allWeapon2.add(num6[i]);
					allMurder2.add(num6[i]);
					allWeapon3.add(num6[i]);
					allMurder3.add(num6[i]);
					
				}
				
				for (int i = 0; i <= 9; i++){
					allLocation.add(num10[i]);
					allLocation2.add(num10[i]); 
					allLocation3.add(num10[i]);
				}
				
			
				jack1 = new AssistantJack(1);
				jack2 = new AssistantJack(2);
				jack3 = new AssistantJack(3);
		
				
				do {
		
					weapon = allWeapon.size() ;
					location = allLocation.size();
					murder = allMurder.size();
		
					
					solution1 = jack1.checkAnswer(weapon, location, murder);
					
					
					
					if (solution1 == 1){
						allWeapon.remove(allWeapon.indexOf(weapon));
					}
				
					if (solution1 == 2 ){
						allLocation.remove(allLocation.indexOf(location));
					}
					if (solution1 == 3 ){
						allMurder.remove(allMurder.indexOf(murder));
					}
			
				} while (solution1 != 0);
				answer1 = new Theory(weapon, location, murder);
				System.out.println("Total Checks = " + jack1.getTimesAsked() + ", Solution = " + answer1);
		
				if (jack1.getTimesAsked() > 20) {
					System.out.println("FAILED!! You're a horrible Detective...");
				} else {
					System.out.println("WOW! You might as well be called Batman!");
				}
				
				do {
		
					weapon = allWeapon2.size() ;
					location = allLocation2.size();
					murder = allMurder2.size();
		
					
					solution2 = jack2.checkAnswer(weapon, location, murder);
					
					
					
					if (solution2 == 1){
						allWeapon2.remove(allWeapon2.indexOf(weapon));
					}
				
					if (solution2 == 2 ){
						allLocation2.remove(allLocation2.indexOf(location));
					}
					if (solution2 == 3 ){
						allMurder2.remove(allMurder2.indexOf(murder));
					}
			
				} while (solution2 != 0);
				answer2 = new Theory(weapon, location, murder);
				System.out.println("Total Checks = " + jack2.getTimesAsked() + ", Solution = " + answer2);
		
				if (jack2.getTimesAsked() > 20) {
					System.out.println("FAILED!! You're a horrible Detective...");
				} else {
					System.out.println("WOW! You might as well be called Batman!");
				}
				do {
		
					weapon = allWeapon3.size() ;
					location = allLocation3.size();
					murder = allMurder3.size();
		
					
					solution3 = jack3.checkAnswer(weapon, location, murder);
					
					
					
					if (solution3 == 1){
						allWeapon3.remove(allWeapon3.indexOf(weapon));
					}
				
					if (solution3 == 2 ){
						allLocation3.remove(allLocation3.indexOf(location));
					}
					if (solution3 == 3 ){
						allMurder3.remove(allMurder3.indexOf(murder));
					}
			
				} while (solution3 != 0);
				answer3 = new Theory(weapon, location, murder);
				System.out.println("Total Checks = " + jack3.getTimesAsked() + ", Solution = " + answer3);
		
				if (jack3.getTimesAsked() > 20) {
					System.out.println("FAILED!! You're a horrible Detective...");
				} else {
					System.out.println("WOW! You might as well be called Batman!");
				}
				double avgAll = 0.0;
				avgAll = ((jack1.getTimesAsked()+jack2.getTimesAsked()+jack3.getTimesAsked())/3);
				avgTotal = avgTotal + avgAll;  
				System.out.println(avgAll);
			
				
			}
				L = (avgTotal / (runs + 1));
				System.out.println();
				System.out.println();
				
				System.out.println("Limit is: :" + L);
		}
}