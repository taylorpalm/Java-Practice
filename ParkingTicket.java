
public class ParkingTicket {
	
	//fields
	
	private ParkedCar car;
	private PoliceOfficer officer; 
	private ParkingMeter meter;
	private int minutes;
	private int fine;
	
	public ParkingTicket()
	{}
	
	public ParkingTicket(ParkedCar c, PoliceOfficer police, int min) 
    {
       car=c;
       officer = police;
       minutes=min;
    }
	
	//Set Variables:
	
	public ParkedCar getCar() 
    {return car;}

	public ParkingMeter getParkingMeter() 
    {return meter;}

	public PoliceOfficer getPoliceOfficer() 
    {return officer;}

	
	public int getFine()
	{
		if(minutes<=60)
		{fine=25;}
		
		else if(minutes>60)
		{int minutesOverHour= minutes-60;
		 int extraFine= (minutesOverHour/60);
		 
		 if(minutesOverHour%60==0)
		 {fine= 25 + (extraFine*10);}
		 
		 if(minutesOverHour%60!=0)
		 {fine= 25 + ((extraFine+1)*10);}
				 
		}
		
		return fine;
	}
	
	 public String toString() 
     {

         String ticketString = officer.toString()
        		 			   + "\n" + car.toString()
        		 			   + "\nMinutes Over: " + minutes
        		 			   + "\nFine: $" + this.getFine();
                 

         return ticketString;

     }



}


/*Parking Ticket Simulator


The ParkingTicket Class. This class should simulate a parking ticket. 
The class’s responsibilities are:
– To report the make, model, color, and license number of the illegally parked car

– To report the amount of the fine, which is $25 for the first hour or part of an hour that
the car is illegally parked, plus $10 for every additional hour or part of an hour that 
the car is illegally parked

– To report the name and badge number of the police officer issuing the ticket

The PoliceOfficer Class. This class should simulate a police officer inspecting 
parked cars. The class’s responsibilities are:
– To know the police officer’s name and badge number

– To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired

– To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired

Write a program that demonstrates how these classes collaborate.

*/