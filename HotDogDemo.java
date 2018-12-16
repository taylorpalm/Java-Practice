import java.util.Scanner;

public class HotDogDemo {

	public static void main(String[] args) {

		int numOfPeople=0, hotDogsPP=0;
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Enter how many people are attending your cookout:");
		numOfPeople=keyboard.nextInt();
		
		System.out.println("Enter how many hot dogs per person you need:");
		hotDogsPP=keyboard.nextInt();
		
		HotDogCalculator myCookout= new HotDogCalculator(numOfPeople, hotDogsPP);
		
		System.out.println("You will need " + myCookout.getHotDogPackagesNeeded() 
							+ " packages of hot dogs and " + myCookout.getBunPackagesNeeded()
							+ " packages of buns.\n" + "You will have " 
							+ myCookout.getLeftoverHotDogs() + " left over hot dogs and "
							+ myCookout.getLeftoverBuns() + " left over buns.");

	}

}
