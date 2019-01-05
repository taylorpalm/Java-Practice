import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class PenniesForPay {

	public static void main(String[] args) {
		
		int days=0;
		double penniesPerDay=0.0, totalPennies=0.0, salary=0.0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many days have you worked?");
		days=keyboard.nextInt();

		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US); 
		
		
		while (days<1)
		{System.out.println("You must enter 1 or greater for days worked. " 
				+ "How many days have you worked?");
		days=keyboard.nextInt();}
		
		
		{System.out.println("Day\tSalary Per Day");
			
			for(int i=0; i<days; i++)
				{penniesPerDay= Math.pow (2, i);
				totalPennies+=penniesPerDay;
				
				 System.out.println((i+1) + "\t" + moneyFormat.format(penniesPerDay/100));
				 
				}
				
			salary= totalPennies/100;;
			
			System.out.println("\nTotal Salary\t" + moneyFormat.format(salary));
			
		}}
		
		
		

	}




/*Pennies for Pay
Write a program that calculates how much a person would earn over a period of time 
if his or her salary is one penny the first day, two pennies the second day, and 
continues to double each day. The program should display a table showing the salary 
for each day, then show the total pay at the end of the period. 
The output should be displayed in a dollar amount, not the number of pennies.*/
