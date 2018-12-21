import java.util.Scanner;

public class RouletteDemo {

	public static void main(String[] args) {
		
		String keepPlaying, colorChoice;
		boolean play=true;
		
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Let's play Roulette!\n");
		
		
		while (play==true)
		{	
		System.out.println("Enter a color(red, black or green):");
		colorChoice= keyboard.nextLine();
		
		Roulette myGame = new Roulette(colorChoice);
		
		myGame.setSpin();
		
		System.out.println("Spinning the wheel...\n" +
							"The spin is " + myGame.getSpin() + ". "
							+ "The color is " + myGame.getSpinColor() + ".");
		
		if ((myGame.winOrLose())==true)
		{System.out.println("Congratulations you have won!");}
		
		else
		{System.out.println("You have lost!");}
		
		
		
		System.out.println("Would you like to play again? Enter YES or NO:");
		keepPlaying=keyboard.nextLine();
		
		if(keepPlaying.equalsIgnoreCase("no"))
			{play=false;}
		
		else if(keepPlaying.equalsIgnoreCase("yes"))
		    {play=true;}
		
		
		
		}
	}
			
		
		

}
