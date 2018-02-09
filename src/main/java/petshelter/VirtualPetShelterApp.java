package petshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter myPet = new VirtualPetShelter();

		System.out.println("Welcome to Big Decimal's Pet Shelter!");
		System.out.println("Please start by admitting your first pet to the shelter.");
		System.out.println("What is your pet's name?");
		String name = input.nextLine();
		System.out.println("Give a brief description of your new pet.");
		String description = input.nextLine();
		myPet.addPet(new VirtualPet(name, description));
		String userChoice = "";

		while (!userChoice.equals("6") || !userChoice.equalsIgnoreCase("quit")) {
			System.out.println("This is the status of your pets.");
			myPet.printShelterStats();
			System.out.println();
			System.out.println("What would you like to do next?");
			System.out.println();
			System.out.println("1. Feed the pets.");
			System.out.println("2. Water the pets.");
			System.out.println("3. Play with a pet.");
			System.out.println("4. Admit a new pet.");
			System.out.println("5. Adopt a pet.");
			System.out.println("6. Quit.");
			userChoice = input.nextLine();
			if (userChoice.equals("1")) {
				myPet.feedAllPets();
				System.out.println("You just fed your pets!");
				System.out.println();
			}
			if (userChoice.equals("2")) {
				myPet.waterAllPets();
				System.out.println("You just watered your pets!");
				System.out.println();
			}
			if (userChoice.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				myPet.printAnimalNameAndDescription();
				String nameToPlayWith = input.nextLine();
				if (myPet.checkForPet(nameToPlayWith)) {
					myPet.playWithPet(nameToPlayWith);
					System.out.println("You just played with " + nameToPlayWith);
				} else {
					System.out.println("I'm sorry your don't have a pet by that name.");
					System.out.println();
				}
			}
			if (userChoice.equals("4")) {
				System.out.println("Alright, what is the new pet's name?");
				String newName = input.nextLine();
				System.out.println("What is he/she like?");
				String newDescription = input.nextLine();
				myPet.addPet(new VirtualPet(newName, newDescription));
			}
			if (userChoice.equals("5")) {
				System.out.println("Which pet is getting adopted?");
				String nameToRemove = input.nextLine();
				if (myPet.checkForPet(nameToRemove)) {
					myPet.removePet(nameToRemove);
					System.out.println(nameToRemove + " just got adopted and is no longer in your shelter!");
				} else {
					System.out.println("Sorry, you don't have a pet by that name.");
					System.out.println();
				}
			}
			if (userChoice.equals("6")) {
				System.out.println("Bye!");
				System.exit(0);
			}
			myPet.tickAllPets();

		}
	}

}
