package com.emijano;

import java.util.*;

public class ConsoleInput{
	
	Scanner sc = new Scanner(System.in);
	
	String getUserInput(){
		return sc.nextLine();
	}
	
	public String askForName(){
		
		System.out.println("Name of the animal: ");
		return getUserInput();
		
	}
	
	public int askForAge(){
		
		int age = -1;

		System.out.println("Age of the animal: ");
		
		while (age <= 0) 
			{

			try{
				age = Integer.valueOf(getUserInput());
				
				if (age > 0)
					return age;
				else
					System.out.println("Age must be a positive value!");
			}
			catch (NumberFormatException nfe){
				System.out.println("Given string is not a number!");
			}
		}
		
		return 0;
		
	}

//	public Date askForPurchaseDate(){
//		
//		System.out.println("Date when animal has been purchased: ");
//		return getUserInput();
//		
//	}
}
