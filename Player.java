
public class Player {

	private String player;
	private int points=50;
	
	public Player()
	{player="";}
	
	public Player(String p)
	{player=p;}
	
	public String getPlayer()
	{return player;}
	
	public int getPoints()
	{return points;}
	
	public Player newPlayer(String p)
	{player=p;
	
	return new Player(p);}
	
	public void playRound()
		{int roll= Die.roll();
		
		if((points-roll)>=1)
		{points-=roll;
			System.out.println("The roll is " + roll + "."
				 		  + " You have " + points + " points.\n");}
		
		else
		{points+=roll;
			System.out.println("The roll is " + roll + ". You cannot have less then 1 "
					+ "point. You now have " + points + " points.\n");}

		}
	
}
	
	

