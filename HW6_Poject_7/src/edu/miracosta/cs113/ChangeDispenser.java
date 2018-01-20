package edu.miracosta.cs113;
/**
 * 
 * @author Mike Figueroa
 *
 */
public class ChangeDispenser {
	
	private int pennies = 0;
	private int nickles = 0;
	private int dimes = 0;
	private int quarters = 0;
	
	
	/**Uses Recurive method to get coint that total change
	 * NOT
	 * 
	 * @param change
	 */
	public void showChange(double change) {
		int changeInt =  (int) (change * 100);
		
		if(changeInt == 0) {
			System.out.println("Quarters = " + quarters + "\nDimes = " + dimes + "\nNickles = " + nickles + "\nPennies = "  + pennies);
		}else {
			quarters += ((int) changeInt / 25);
			changeInt -= quarters * 25;
			dimes +=  ((int) changeInt / 10);
			changeInt -= dimes * 10;
			nickles += ((int) changeInt / 5);
			changeInt -= nickles * 5;
			pennies += ((int) changeInt / 1);
			changeInt -= pennies * 1;
			if(quarters == 4) {
				pennies++;
			}
			double changeLeft = (double) changeInt; 
			showChange(changeLeft);
			
		}
	}
}
