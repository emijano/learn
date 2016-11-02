package com.emijano.animals;

import java.util.Date;

public class Animal {
	
	String name;
	Integer age;
	Date purchaseDate;
	Boolean active;
	
	public Animal(String someName, Integer someAge){
		this.setName(someName);
		this.setAge(someAge);
		this.setActive(true);
	}

	public Animal(String someName, Integer someAge, Date someDate){
		this(someName, someAge);
		this.setPurchaseDate(someDate);
	}
	
	public String saySomething(String sthToSay){
		return "I'm saying: " + sthToSay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
}
