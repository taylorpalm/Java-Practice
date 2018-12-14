
public class MobileProvider {
		

	private double bill=0, amountOver=0, newBill=0, savings=0;
	private int minutes=0;
	private String choice="";
	
	public MobileProvider()
	{}
	
	public void setMinutes(int m)
	{minutes=m;}
	
	public void setChoice(String c)
	{choice=c;}
	
	public int getMinutes()
	{return minutes;}
	
	public String getChoice()
	{return choice;}
	
	
	public double getBill(String c, int m)
	{choice=c;
	 minutes=m;

//package A
	 
	 if(choice.equalsIgnoreCase("a"))
	 {
		if(minutes>450.00)
		{amountOver=(minutes-450)*.45;}
		
		bill=39.99+amountOver;
		
		return bill;}
	 
//package B
	 
	 else if(choice.equalsIgnoreCase("b"))
	 {
		if(minutes>900.00)
		{amountOver=(minutes-900)*.40;}
		
		bill=59.99+amountOver;
		
		return bill;
	}
//package C		
	 
	else if(choice.equalsIgnoreCase("c"))
	{
		bill=69.99;
	
		return bill;}
	 
	else 
		
		return -1;
	 }

	

public double getSavings(String c, int m)
	{choice=c;
	 minutes=m;
	 
//package A
	 
	if(choice.equalsIgnoreCase("a"))
	{	
		if(minutes>900.00)
		{amountOver=(minutes-900.00)*.40;}
	
	newBill=59.99+amountOver;
	
    savings=bill-newBill;}
	
 //package B
	
	else if(choice.equalsIgnoreCase("b"))
	{	
		newBill=69.99;
		savings=bill-newBill;}
	 
 
	return savings;}
  


	}

/*Design a class that calculates a customer’s monthly bill. 
 * It should store the letter of the package the customer has purchased 
 * (A, B, or C) and the number of minutes that were used. It should have 
 * a method that returns the total charges. Demonstrate the class in a 
 * program that asks the user to select a package and enter the number of
 * minutes used. The program should display the total charges.
 * 
 * Modify the program you wrote for Programming Challenge 11 so it also 
 * calculates and displays the amount of money Package A customers would 
 * save if they purchased package B or C, and the amount of money package B 
 * customers would save if they purchased package C. If there would be no savings, 
 * no message should be printed.

 */

			        
			
