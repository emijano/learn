/**
 * 
 */
package com.emijano;

import com.emijano.animals.*;
import java.util.Date;

public class Zoo {

	public static void main(String[] args) {
		
		createAnimal();
		
	}
	
	static void createAnimal(){
		
		Animal animal;
		String name;
		int age;
		Date date = null;
		
		ConsoleInput input = new ConsoleInput();
		
		name = input.askForName();
		age  = input.askForAge();
//		date = input.askForPurchaseDate();
		
		if (date != null)
			animal = new Animal(name, age, date);
		else
			animal = new Animal(name, age);
		
		System.out.println("Animal: " + animal.getName() + ", age: " + animal.getAge());

		if (animal.getPurchaseDate() != null)
			System.out.println("Purchase date: " + animal.getPurchaseDate());
				
	}
		
}