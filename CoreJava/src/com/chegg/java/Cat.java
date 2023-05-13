package com.chegg.java;

public class Cat extends Pet {

	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String userBreed) {
		breed = userBreed;
	}
	
	
	// printing breed of cat using below method
	public void printBreed() {
		System.out.print("Breed: ");
		System.out.print(getBreed());
	
		
	}
}
