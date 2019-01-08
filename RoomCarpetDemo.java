
public class RoomCarpetDemo {

	public static void main(String[] args) {

		RoomDimension dim = new RoomDimension(10, 8);
		RoomCarpet myCarpet= new RoomCarpet(dim);
		
		System.out.println(myCarpet.toString());

	}

}
