import java.util.Scanner;

public class MonthDaysDemo {

	public static void main(String[] args) {

		String userMonth;
		int userYear;
		
	//create new MonthDays class
		
		MonthDays myMonth= new MonthDays();
		
	//Scanner for user input
		
		Scanner keyboard= new Scanner(System.in);
		
	//Ask and setfor month
	
		System.out.println("This program will tell you how many days are in a month.\n"
							+ "Enter a month:");
		userMonth=keyboard.nextLine();
			
		myMonth.setMonth(userMonth);
		
	//If month is not entered right...
		
		if(myMonth.getMonthNumber()==-1)
		{System.out.println("This is not a valid month. "+
							"Enter a month:");
		
		userMonth=keyboard.nextLine();
		
		myMonth.setMonth(userMonth);
		}
		
		
		System.out.println("Enter a year:");
		
		userYear=keyboard.nextInt();
		
		myMonth.setYear(userYear);
		
		
		System.out.println(userMonth + " has " + myMonth.getMonthDays() + " days.");
		
		
		

	}

}
