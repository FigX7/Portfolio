/********************************************
* AUTHOR: Michael Figueroa
* COURSE: CS 111 Intro to CS I
* SECTION: TuTH 11:00am - 12:50pm
* HOMEWORK #: 05
* PROJECT #: 01
* LAST MODIFIED: 9/25/2016
********************************************/

/*****************************************************************************
* BranchingResponse
*****************************************************************************
* PROGRAM DESCRIPTION:

*Program reads in input from user . Outputs Yes,No Wow, or Input Sting in Quations MArks based of
* if sentance ends in a ? and is even or odd  , or ends with !, and lastly everyother case. 

*****************************************************************************
* ALGORITHM:
* 
* PROMPT use for input
* READ in sentence
* IF (sentence.lastIndexOf('?') > -1) && (sentence.length % 2 == 0) THEN
* OUTPUT Yes
* ELSE IF (sentence.lastIndexOf('?') > -1) && (sentence.length % 2 > 0) THEN
* OUTPUT NO
* ELSe IF ((sentence.lastIndexOf('!') > -1) THEN
* OUTPUT Wow.
* ELSE 
* OUTPUT "You always say \""May the force be with you \"".


* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* java.util.Scanner;
*****************************************/

import java.util.Scanner;

public class BranchingResponse
{
	public static void main(String[] args)
	{
		/***** DECLARATION SECTION *****/
		
		String inputSentence;
		Scanner stdIn;
		
		/***** INITIALIZATION SECTION *****/
		
			stdIn = new Scanner(System.in);
		
		/***** INTRO SECTION *****/	
			System.out.print("                         !!          Weclome to Zoltar's Box Your Buddy        !!                                        \n" +
										"-----------------------------------------------------------------------------------------------------------\n"+
										"\nPlease Enter a one line Sentence.(Press Enter when finished): ");
			inputSentence = stdIn.nextLine();
			stdIn.close();
			
		/***** PROCESSING SECTION *****/		
		
			if ((inputSentence.lastIndexOf('?') == inputSentence.length() - 1) && (inputSentence.length() % 2 == 0))
			{
				System.out.println("Yes.");
			}
			else if ((inputSentence.lastIndexOf('?') == inputSentence.length() - 1) && (inputSentence.length() % 2 > 0))
			{
				System.out.println("No.");
			}
			else if (inputSentence.lastIndexOf('!') == inputSentence.length() -1)
			{
				System.out.println("Wow.");
			}
			else
			{
				System.out.println("You always say \"" + inputSentence + "\"."); 
			}	
	}
}							
									
