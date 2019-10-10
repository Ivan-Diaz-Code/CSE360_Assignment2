/**
 * Name: Ivan Diaz
 * ID: 1208924661
 * Assignment 2
 * In this file we are testing how to use a version control system (Git), 
 * The code itself is a adding
 * machine, where we add and subtract from a total.  
 */
package cse360assign2;

import java.util.ArrayList;

public class AddingMachine {
	
	private int total;
	
	private AddingMachine calculator = new AddingMachine();
	private ArrayList<String> listOfStrings = new ArrayList<String>();
	public AddingMachine()
	{
		total = 0; // not needed - included for clarity
	}
	/**
	 * The methods returns the total of the Adding Machine
	 */
	public int getTotal()
	{
		return total;
	}
	/**
	 * The method add the value to the total in the Adding Machine
	 */
	public void add(int value)
	{
		total = total + value;
		listOfStrings.add(" + " + value);
		
	}
	
	/**
	 * The method subtracts the value to the total in the Adding Machine
	 */
	public void subtract (int value)
	{
		total = total - value;
		listOfStrings.add(" - " + value);
	}
	
	
	public String toString()
	{
		String returnString = "0";
		for(int iterator = 0; iterator < listOfStrings.size(); iterator++)
		{
			returnString = returnString + listOfStrings.get(iterator);
		}
		return returnString;
	}
	
	public void clear()
	{
		
	}

}
