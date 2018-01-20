package edu.miracosta.cs113;

 /**
 * SolutionFinder.java: finds murderer from 6 persons, crime scene from 10 locations, and six weapons
 * 						with the help of Class AssitantJack
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
 public class SolutionFinder {
	 /**
	 * Tester for random assistant theory checker
	 * 
	 * @param args
	 *            command line arguments (unnused)
	 */
	 
	 public static void main(String[] args){
		int answerSet, solution, murder, weapon, location;
		int[] num6 = {1,2,3,4,5,6};
		int[] num10 = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner stdIn = new Scanner(System.in);
		Theory answer = null;
		AssistantJack jack;
		
		
		ArrayList<Integer> allWeapon = new ArrayList<Integer>();
		ArrayList<Integer> allMurder = new ArrayList<Integer>();
		ArrayList<Integer> allLocation = new ArrayList<Integer>();

		for (int i = 0; i <= 5; i++){
			allWeapon.add(num6[i]);
			allMurder.add(num6[i]);
		}
		
		for (int i = 0; i <= 9; i++){
			allLocation.add(num10[i]);
		}
		
		
		System.out.print("Which theory would like you like to test? (1, 2, 3[random]): ");
		answerSet = stdIn.nextInt();
		stdIn.close();
		
		jack = new AssistantJack(answerSet);

		do {

			weapon = allWeapon.size() ;
			location = allLocation.size();
			murder = allMurder.size();

			System.out.println (weapon +"," + location + "," + murder + "," );
			solution = jack.checkAnswer(weapon, location, murder);
			
			System.out.println(solution);
			
			if (solution == 1){
				allWeapon.remove(allWeapon.indexOf(weapon));
			}
		
			if (solution == 2 ){
				allLocation.remove(allLocation.indexOf(location));
			}
			if (solution == 3 ){
				allMurder.remove(allMurder.indexOf(murder));
			}
	
		} while (solution != 0);
		answer = new Theory(weapon, location, murder);
		System.out.println("Total Checks = " + jack.getTimesAsked() + ", Solution = " + answer);

		if (jack.getTimesAsked() > 20) {
			System.out.println("FAILED!! You're a horrible Detective...");
		} else {
			System.out.println("WOW! You might as well be called Batman!");
		}

	}

}
