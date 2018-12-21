import java.util.Random;

public class Roulette {
	
	private int spin;
	private String choice, color;
	private boolean win=false;
	
	public Roulette(String c)
	{choice=c;}
	
	public void setChoice(String c)
	{choice=c;}
	
	public String getChoice()
	{return choice;}
	
	
	public void setSpin()
	{Random randomNumbers = new Random();
	
	spin = randomNumbers.nextInt(37);}
	
	public int getSpin()
	{return spin;}
	
	
	public String getSpinColor()
	{
	
	if(spin==37||spin==0)
		{color= "green";}
	
	
	else if((spin%2==0 && (spin>=1 && spin<=10))  ||
			(spin%2>0 && (spin>=11 && spin<=18))  ||
			(spin%2==0 && (spin>=19 && spin<=28)) || 
			(spin%2>0 && (spin>=29 && spin<=36)))
			
		{color= "black";}
	
	else
		{color= "red";}
	
	return color;

	}
	
	
	public boolean winOrLose()
	{
		if(choice.equalsIgnoreCase(this.getSpinColor()))
		{win=true;}
		
		else
		{win=false;}
		
		return win;
	}
	

	
	
}
