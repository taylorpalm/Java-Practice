
public class RoomCarpet {
	
	private int cost;
	private RoomDimension rd;
	
	public RoomCarpet(RoomDimension rd)
	{cost=0;
	 this.rd=rd;}
	
	public int getCost()
	{cost=8*rd.getArea();
	
	return cost;}
	
	public String toString()
	{String str= 		"Length: " + rd.getLength()
					+	"\nWidth: " + rd.getWidth()
					+	"\nArea : " + rd.getArea()
					+	"\nCost: $" + this.getCost();
	return str;}
					
	}


