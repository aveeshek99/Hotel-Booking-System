
package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

import Database.Database;

public class BookingJDBC {

	public boolean insert(Bookingclass bok) {
		// declare
		PreparedStatement pstat;
		boolean res = false;
		String sql = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Luton", "root", "");
			{
				sql = "INSERT INTO bookingtest(Start_Date, End_Date,Prefered_Room,Booking_Status,Customer_ID,Room_Price) VALUES(?,?,?,?,?,?)";
				pstat = conn.prepareStatement(sql);
				pstat.setString(1, bok.getStart_Date());
				pstat.setString(2, bok.getEnd_Date());
				pstat.setString(3, bok.getRoom_Type());
				pstat.setString(4, bok.getRoom_Status());
				pstat.setInt(5, bok.getCustomer_Id());
				pstat.setDouble(6, bok.getRoom_Price());
				// pstat.setInt(5, bok.getRoom_no());

			}
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			res = true;

		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}
		return res;

	}

	/*
	 * public ArrayList<String> getRoom_Type() { ArrayList<String> roomtype = new
	 * ArrayList<String>(); Connection conn; PreparedStatement pstat = null; String
	 * sql = null; sql = "SELECT distinct Room_Type FROM Room_info"; try {
	 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/Luton", "root", "");
	 * pstat = conn.prepareStatement(sql); ResultSet rs = pstat.executeQuery(sql);
	 * 
	 * 
	 * while (rs.next()) { roomtype.add(rs.getString("Room_Type")); } rs.close();
	 * conn.close(); } catch (Exception ex) { System.err.println(ex.getMessage());
	 * 
	 * } return roomtype; }
	 * 
	 * public ArrayList<Integer> getRoomNo(String roomtype) { ArrayList<Integer>
	 * roomno = new ArrayList<Integer>(); Connection conn; PreparedStatement pstat =
	 * null; String sql="";
	 * 
	 * sql = "select Room_no from Room_info where Room_Type='"+ roomtype + "'";
	 * 
	 * try { Class.forName("com.mysql.cj.jdbc.Driver"); conn =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/Luton", "root", "");
	 * pstat = conn.prepareStatement(sql); ResultSet rs = pstat.executeQuery(sql);
	 * 
	 * 
	 * while (rs.next()) { roomno.add(rs.getInt("Room_no")); } rs.close();
	 * conn.close(); } catch (Exception ex) { System.err.println(ex.getMessage());
	 * 
	 * }
	 * 
	 * return roomno; }
	 * 
	 * public double getRoomPrice(int roomno) { double roomprice = 0;
	 * 
	 * Connection conn; PreparedStatement pstat = null; String sql="";
	 * 
	 * sql = "select room_price from Room_info where Room_no="+ roomno;
	 * 
	 * try { Class.forName("com.mysql.cj.jdbc.Driver"); conn =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/Luton", "root", "");
	 * pstat = conn.prepareStatement(sql); ResultSet rs = pstat.executeQuery(sql);
	 * 
	 * 
	 * while (rs.next()) { roomprice=rs.getDouble("Room_Price"); } rs.close();
	 * conn.close(); } catch (Exception ex) { System.err.println(ex.getMessage());
	 * 
	 * }
	 * 
	 * return roomprice; }
	 */

	public boolean update(Bookingclass bok) {

		// declare
		Connection conn;
		boolean res = false;

		String sql = "UPDATE bookingTest SET Start_Date=?,End_Date=?,Prefered_Room=?,Room_Price=? WHERE Booking_ID=?";
		PreparedStatement pstat; // create jdbc statement
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 1.loading driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Luton", "root", ""); // connect
			pstat = conn.prepareStatement(sql);// create jdbc statement
			pstat.setString(1, bok.getStart_Date());
			pstat.setString(2, bok.getEnd_Date());
			pstat.setString(3, bok.getRoom_Type());
			pstat.setDouble(4, bok.getRoom_Price());
			pstat.setInt(5, bok.getBooking_Id());
			// setvalues
			pstat.executeUpdate();// running sql statement
			conn.close();// Close connection
			res = true;
			// input, process, output

		} catch (Exception ex) {
			res = false;
			// error message
			JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
//		System.out.println("Error:" + ex.getMessage());
		}

		return res;
	}

	public boolean delete(Bookingclass bok) {
		boolean result = false;
		Connection conn;
		PreparedStatement pstat;
		Resultset rs;
		String sql = "Delete FROM BookingTest WHERE Booking_ID=?";

		try {
			Database db = new Database();
			conn = db.connect();// method calling
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, bok.getBooking_Id());
			pstat.executeUpdate();
			result = true;

		} catch (Exception ae) {
			JOptionPane.showMessageDialog(null, "Error:" + ae.getMessage());

		}
		return result;
	}

	public ArrayList<Bookingclass> getCustomerData(int id) {
		ArrayList<Bookingclass> booking = new ArrayList<Bookingclass>();
		try {
			Database db = new Database();
			Connection conn;
			conn = db.connect();
			String sql = "SELECT* FROM BookingTest WHERE Customer_Id=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				Bookingclass book = new Bookingclass(rs.getString("Start_Date"), rs.getString("End_Date"),
						rs.getString("Prefered_Room"), rs.getString("Booking_Status"), rs.getInt("Customer_ID"),
						rs.getInt("Booking_ID"), rs.getDouble("Room_Price"));
				booking.add(book);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
		}
		return booking;
	}

}
