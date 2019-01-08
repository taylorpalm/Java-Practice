
public class RoomDimension {

	private int length, width;
	
	public RoomDimension()
	{length=0;
	width=0;}
	
	public RoomDimension(int l, int w)
	{length=l;
	width=w;}
	
	//SET VARIABLES

	public void setLength(int l)
	{length=l;}
	
	public void setwidth(int w)
	{width=w;}
	
	//GET VARIABLES
	
	public int getLength()
	{return length;}
	
	public int getWidth()
	{return width;}
	
	public int getArea()
	{int area=length*width;
		return area;}
	
	
	
	
	
	
}



/*Carpet Calculator

The Westfield Carpet Company has asked you to write an 
application that calculates the price of carpeting for 
rectangular rooms. To calculate the price, you multiply 
the area of the floor (width times length) by the price 
per square foot of carpet. For example, the area of floor 
that is 12 feet long and 10 feet wide is 120 square feet. 
To cover that floor with carpet that costs $8 per square 
foot would cost $960.

First, you should create a class named RoomDimension that 
has two fields: one for the length of the room, and one for the width. 
The RoomDimension class should have a method that returns the area of the room. 
(The area of the room is the room’s length multiplied by the room’s width.)

Next, you should create a RoomCarpet class that has a RoomDimension 
object as a field. It should also have a field for the cost of the carpet
per square foot. The RoomCarpet class should have a method that returns 
the total cost of the carpet.
*/