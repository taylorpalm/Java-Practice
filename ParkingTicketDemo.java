
public class ParkingTicketDemo {

	public static void main(String[] args) {
		
		ParkedCar car = new ParkedCar("Prius", "2010", "Charcoal", "G2Y702", 120);
        ParkingMeter meter = new ParkingMeter(50);
        PoliceOfficer bennet = new PoliceOfficer("Alex Bennet", "460");
        ParkingTicket ticket = bennet.search(car, meter);
        
        
        if (ticket != null) 
        {
            System.out.println(ticket.toString());
        } 
    else 
        {
            System.out.println("No ticket issued.");
        }


	}

}
