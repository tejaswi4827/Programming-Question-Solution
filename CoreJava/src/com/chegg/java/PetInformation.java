package com.chegg.java;

import java.util.Scanner;

public class PetInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		Pet myPet = new Pet();
		Cat myCat = new Cat();

		String petName, catName, breed;
		int petAge, catAge;
		petName = scnr.nextLine();
		petAge = scnr.nextInt();
		scnr.nextLine();
		catName = scnr.nextLine();
		catAge = scnr.nextInt();
		scnr.nextLine();
		breed = scnr.nextLine();
		// calling pet using petName and petAge

		myPet.setName(petName);
		myPet.setAge(petAge);

		myPet.printInfo();

		// calling cat using catName catAge and breed

		myCat.setName(catName);
		myCat.setAge(catAge);
		myCat.setBreed(breed);
		myCat.printInfo();
		// getting breed of cat using getBreed() method

		myCat.printBreed();

	}

}
