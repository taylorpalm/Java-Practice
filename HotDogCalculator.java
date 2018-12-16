
public class HotDogCalculator {

	private int hotDogsPerPerson, peopleAttending, hotDogsNeeded,
				hotDogPackagesNeeded, bunPackagesNeeded;
	private final int HOT_DOGS_PER_PACKAGE=10, BUNS_PER_PACKAGE=8;
	
//Hot Dog calculator w/ input people attending and how many hot dogs per person
	
	public HotDogCalculator(int pa, int hdpp)
	{hotDogsPerPerson=hdpp;
     peopleAttending=pa;
	}
	
	public void setHotDogsPerPerson(int hdpp)
	{hotDogsPerPerson=hdpp;}
	
	public void setPeopleAttending(int pa)
	{peopleAttending=pa;}	
	
	public int getHotDogsPerPerson()
	{return hotDogsPerPerson;}
	
	public int getPeopleAttending()
	{return peopleAttending;}
	
	public int getHotDogPackagesNeeded()
	{hotDogsNeeded=(peopleAttending * hotDogsPerPerson);
		
		if((hotDogsNeeded%HOT_DOGS_PER_PACKAGE)==0)
		{hotDogPackagesNeeded=hotDogsNeeded/HOT_DOGS_PER_PACKAGE;}
		
		else
		{hotDogPackagesNeeded=((hotDogsNeeded/HOT_DOGS_PER_PACKAGE)+1);}
		
		return hotDogPackagesNeeded;
			
	}
	
	public int getBunPackagesNeeded()
	{	
		if(hotDogsNeeded%BUNS_PER_PACKAGE==0)
		{bunPackagesNeeded=hotDogsNeeded/BUNS_PER_PACKAGE;}
		
		else
		{bunPackagesNeeded=((hotDogsNeeded/BUNS_PER_PACKAGE)+1);}
		
		return bunPackagesNeeded;
			
	}
	
	public int getLeftoverHotDogs()
	{ 	
		return (hotDogPackagesNeeded*HOT_DOGS_PER_PACKAGE)-hotDogsNeeded;}
	
	public int getLeftoverBuns()
	{ 	
		return (bunPackagesNeeded*BUNS_PER_PACKAGE)-hotDogsNeeded;}
	
}
