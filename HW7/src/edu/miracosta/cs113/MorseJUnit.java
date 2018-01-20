package edu.miracosta.cs113;
import java.io.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MorseJUnit {
	
	@Test
	public void testReadFromFile() {
		MorseCodeTreeSearch objectname = new MorseCodeTreeSearch();
		
		try {	
			Scanner stdIn = new Scanner(new File("morseFile.txt"));
			
			while(stdIn.hasNextLine()) {
				objectname.add(stdIn.nextLine());
				
			}
			System.out.println(objectname);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

