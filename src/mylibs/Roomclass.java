package mylibs;

public class Roomclass {
	String Room_Type;
	String Room_Status;
	Double Room_Price;
	int Room_no;
	public Roomclass() {
		Room_Type = "";
		Room_Status = "";
		Room_Price = 0.0;
		Room_no = 0;
	}
	public Roomclass(String room_Type, String room_Status, Double room_Price, int room_no) {
		super();
		Room_Type = room_Type;
		Room_Status = room_Status;
		Room_Price = room_Price;
		Room_no = room_no;

		
	}
	public String getRoom_Type() {
		return Room_Type;
	}
	public void setRoom_Type(String room_Type) {
		Room_Type = room_Type;
	}
	public String getRoom_Status() {
		return Room_Status;
	}
	public void setRoom_Status(String room_Status) {
		Room_Status = room_Status;
	}
	public Double getRoom_Price() {
		return Room_Price;
	}
	public void setRoom_Price(Double room_Price) {
		Room_Price = room_Price;
	}
	public int getRoom_no() {
		return Room_no;
	}
	public void setRoom_no(int room_no) {
		Room_no = room_no;
	}
	@Override
	public String toString() {
		return "Roomclass [Room_Type=" + Room_Type + ", Room_Status=" + Room_Status + ", Room_Price=" + Room_Price
				+ ", Room_no=" + Room_no + "]";
	}
	 
}
