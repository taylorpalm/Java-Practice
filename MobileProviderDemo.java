import java.util.Scanner;
import java.text.DecimalFormat;

public class MobileProviderDemo {

	public static void main(String[] args) {
		
		String userPackage= "";
		int minutes=0;
		
	MobileProvider mybill= new MobileProvider();	
		
	System.out.println("This program will calculate your phone bill\n\n"
				+ "These are the packages offered:\n" +
				"Package A: For $39.99 per month, 450 minutes are provided. "
				+ "Additional minutes are $0.45 per minute.\n" + 
				"Package B: For $59.99 per month, 900 minutes are provided. "
				+ "Additional minutes are $0.40 per minute.\n" + 
				"Package C: For $69.99 per month, unlimited minutes are provided.\n"); 
				
			
	Scanner keyboard= new Scanner(System.in);

//Ask for package
	
	System.out.println("Which package do you have? Enter: A, B, or C.");
	userPackage=keyboard.nextLine();

//If user doesn't have unlimited minutes: ask for minutes
	
	if(!userPackage.equalsIgnoreCase("c"))
	{System.out.println("Enter how many minutes you used this month:");
	minutes=keyboard.nextInt();}
	
	DecimalFormat moneyFormat = new DecimalFormat("$0.00");

//Output user's phone bill	
	
	System.out.println("Your bill is " + moneyFormat.format(mybill.getBill(userPackage, minutes)) + ".");
	
	
//If user has A and there are savings to be had, suggest upgrading to package B:
	
	if(mybill.getSavings(userPackage, minutes)>0 && userPackage.equalsIgnoreCase("a"))
		{
		System.out.println("You could save " + moneyFormat.format(mybill.getSavings(userPackage, minutes)) +
				" by switching to package B!");}
	
//If user has B and there are savings to be had, suggest upgrading to package C:	
	
	if(mybill.getSavings(userPackage, minutes)>0 && userPackage.equalsIgnoreCase("b"))
	{
		System.out.println("You could save " + moneyFormat.format(mybill.getSavings(userPackage, minutes)) 
			+ " by switching to package C!");}



	}

}
