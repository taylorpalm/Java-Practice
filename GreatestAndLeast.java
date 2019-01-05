import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class GreatestAndLeast {

	public static void main(String[] args) {
		
		int number=0;
		ArrayList<Integer> series = new ArrayList<Integer>();
		
		System.out.println("Enter a series of integers and this program will determine \n"
				+ "the greatest and least numbers.\nWhen you are done entering numbers, "
				+ "enter '-99' to end the series.\n");
		
		Scanner keyboard= new Scanner(System.in);
		
		//Get series of numbers
		
		while(number!=-99)	
		{System.out.println("Enter a number:");
		 number=keyboard.nextInt();
		
		 if(number!=-99)
		 {series.add(number);}
		 
		}
		
		//Find least number
	     System.out.println( "The least number is: " + Collections.min(series));
	       
	    //Find greatest number 
	     System.out.println( "The greatest number is: " + Collections.max(series));   

	}

}


/*The Greatest and Least of These
Write a program with a loop that lets the user enter a series of integers. 
The user should enter -99 to signal the end of the series. After all the 
numbers have been entered, the program should display the largest and 
smallest numbers entered.*/