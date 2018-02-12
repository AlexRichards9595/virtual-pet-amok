package petshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter myPet = new VirtualPetShelter();

		System.out.println("Welcome to Big Decimal's Pet Shelter!");
		String userChoice = "";

		while (!userChoice.equals("10") || !userChoice.equalsIgnoreCase("quit")) {
			myPet.tickAllPets();
			System.out.println("This is the status of your pets.");
			myPet.printShelterStats();
			System.out.println();
			System.out.println("What would you like to do next?");
			System.out.println();
			System.out.println("1. Feed the pets.");
			System.out.println("2. Water the pets.");
			System.out.println("3. Play with a pet.");
			System.out.println("4. Oil robitic pets");
			System.out.println("5. Walk the dogs");
			System.out.println("6. Clean litterbox");
			System.out.println("7. Clean the dog cages");
			System.out.println("8. Admit a new pet.");
			System.out.println("9. Adopt a pet.");
			System.out.println("10. Quit.");
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
				myPet.oilAllRobotPets();
				System.out.println("You just oiled your robotic pets!");
			}
			if (userChoice.equals("5")) {
				myPet.walkAllWalkables();
				System.out.println("You just walked all the dogs!");
			}
			if (userChoice.equals("6")) {
				myPet.cleanLitterBox();
				System.out.println("You just cleaned the litterbox!");
			}
			if (userChoice.equals("7")) {
				myPet.cleanAllCages();
				System.out.println("You just cleaned all the cages!");
			}
			if (userChoice.equals("8")) {
				System.out.println("Alright, what is the new pet's name?");
				String newName = input.nextLine();
				System.out.println("What is he/she like?");
				String newDescription = input.nextLine();
				System.out.println("What animal is she? (Dog, Cat, RoboDog, or RoboCat");
				String newAnimalType = input.nextLine();
				if (newAnimalType.equalsIgnoreCase("dog")) {
					myPet.addPet(new OrgDog(newName, newDescription));
				}
				if (newAnimalType.equalsIgnoreCase("cat")) {
					myPet.addPet(new OrgCat(newName, newDescription));
				}
				if (newAnimalType.equalsIgnoreCase("robodog")) {
					myPet.addPet(new RoboDog(newName, newDescription));
				}
				if (newAnimalType.equalsIgnoreCase("robocat")) {
					myPet.addPet(new RoboCat(newName, newDescription));
				} else {
					continue;
				}
			}
			if (userChoice.equals("9")) {
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
			if (userChoice.equals("10")) {
				System.out.println("Bye!");
				System.exit(0);
			}

		}
		input.close();
	}

}
