package mylibs;

public class Bookingclass {

	String Start_Date;
	String End_Date;
	String Room_Type;
	String Room_Status;
	int customer_Id, booking_Id;
	double Room_Price;

	public Bookingclass() {
		this.Start_Date = "";
		this.End_Date = "";
		this.Room_Type = "";
		this.Room_Status = "Pending";
		this.customer_Id = 0;
		this.booking_Id = 0;
		this.Room_Price = 0;

	}

	public Bookingclass(String start_Date, String end_Date, String room_Type, String room_Status, int customer_Id,
			int booking_Id, double room_Price) {
		Start_Date = start_Date;
		End_Date = end_Date;
		Room_Type = room_Type;
		Room_Status = room_Status;
		this.customer_Id = customer_Id;
		this.booking_Id = booking_Id;
		Room_Price = room_Price;
	}

	public String getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

	public String getEnd_Date() {
		return End_Date;
	}

	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
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

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public int getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(int booking_Id) {
		this.booking_Id = booking_Id;
	}

	public double getRoom_Price() {
		return Room_Price;
	}

	public void setRoom_Price(double room_Price) {
		Room_Price = room_Price;

	}

	@Override
	public String toString() {
		return "Bookingclass [Start_Date=" + Start_Date + ", End_Date=" + End_Date + ", Room_Type=" + Room_Type
				+ ", Room_Status=" + Room_Status + ", customer_Id=" + customer_Id + ", booking_Id=" + booking_Id
				+ ", Room_Price=" + Room_Price + "]";
	}
}