
public class PoliceOfficer {
	
	private String name, badgeNumber;
	private int time;
	
	public PoliceOfficer()
	{name = "";
	 badgeNumber = "";}
	
	public PoliceOfficer(String n, String badge)
	{name=n; 
	badgeNumber=badge;}
	
	//Get police officer name
	
	public String getPoliceName()
	{return name;}
	
	//Get police officer badge
	
	public String getBadge()
	{return badgeNumber;}
	
	
	public ParkingTicket search(ParkedCar car, ParkingMeter meter) 
    {PoliceOfficer po = new PoliceOfficer(this.name,this.badgeNumber);
     time = car.getMinutesParked() - meter.getMinutesPurchased();
        
            if(time>0)
            {
            	return new ParkingTicket(car, po, time);}
                    
            else
              {return null;}}


	public int getTime()
	{return time;}
	
	
	  public String toString() 
	    {
	        String policeString = "Police Officer Name: " + name
	                        + "\nBadge: " + badgeNumber;
	        return policeString;

	    }

	  
		}
	
	
	


/*Parking Ticket Simulator

The PoliceOfficer Class. This class should simulate a police officer inspecting 
parked cars. The class’s responsibilities are:
– To know the police officer’s name and badge number

– To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired

– To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired

Write a program that demonstrates how these classes collaborate.

*/