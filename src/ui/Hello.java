package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;


public class Hello extends JFrame {
	JPanel panel1, panel2;
	JTextField txtroom, txtprice;
	JButton btnsave, btnupdate, btnpay, btndelete, btnclose;
	JLabel lblarv, lbldep, lblroom, lblprice, lblno, lblbook;
	JComboBox cmbarrival, cmbroomtype, cmbdeparture;
	JTable table;
	DefaultTableModel dtm;
	JScrollPane scroll;
	JScrollPane scrollPane;
	JTable table_1;
	JDateChooser arrivaldate, departuredate;
	
	

	public Hello() {
		setSize(750, 450);
		getContentPane().setBackground(Color.YELLOW);
		setTitle("Booking Form");
		setBounds(100, 100, 450, 300);
		setSize(750, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		panel1 = new JPanel();
		panel1.setBounds(0, 195, 734, 215);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 734, 215);
		panel1.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "E-Mail", "Arrival Date", "Departure Date", "Booking Status"
			}
		));
		scrollPane.setViewportView(table_1);
		
		
		
	
		lblarv = new JLabel("Arrival Date");
		lblarv.setBounds(31, 50, 97, 14);
		getContentPane().setLayout(null);
		getContentPane().add(lblarv);

		lblroom = new JLabel("Departure Date");
		lblroom.setBounds(31, 79, 97, 14);
		getContentPane().add(lblroom);

		btnsave = new JButton("Save");
		btnsave.setBackground(Color.GREEN);
		btnsave.setBounds(239, 162, 89, 23);
		getContentPane().add(btnsave);

		btnpay = new JButton("Pay");
		btnpay.setBackground(Color.YELLOW);
		btnpay.setBounds(338, 162, 89, 23);
		getContentPane().add(btnpay);

		btnupdate = new JButton("Update");
		btnupdate.setBackground(Color.MAGENTA);
		btnupdate.setBounds(437, 162, 89, 23);
		getContentPane().add(btnupdate);

		btndelete = new JButton("Delete");
		btndelete.setBackground(Color.RED);
		btndelete.setBounds(536, 162, 89, 23);
		getContentPane().add(btndelete);

		btnclose = new JButton("Close");
		btnclose.setBackground(Color.PINK);
		btnclose.setBounds(635, 162, 89, 23);
		getContentPane().add(btnclose);
		

		cmbroomtype = new JComboBox();
		cmbroomtype.setBounds(555, 63, 131, 22);
		getContentPane().add(cmbroomtype);
		
		arrivaldate = new JDateChooser();
		arrivaldate.setBounds(151, 46, 108, 22);
		add(arrivaldate);
			
		departuredate = new JDateChooser();
		departuredate.setBounds(151, 75, 108, 22);
		add(departuredate);

		lbldep = new JLabel("RoomType");
		lbldep.setBounds(409, 67, 136, 14);
		getContentPane().add(lbldep);

		lblroom = new JLabel("Room Price");
		lblroom.setBounds(409, 111, 89, 14);
		getContentPane().add(lblroom);

		txtroom = new JTextField();
		txtroom.setBounds(555, 108, 86, 20);
		getContentPane().add(txtroom);
		txtroom.setColumns(10);

		lblbook = new JLabel("BOOKING FORM");
		lblbook.setForeground(Color.RED);
		lblbook.setBackground(Color.WHITE);
		lblbook.setFont(new Font("Corbel", Font.BOLD, 26));
		lblbook.setBounds(262, 11, 236, 32);
		getContentPane().add(lblbook);

		txtprice = new JTextField();
		txtprice.setBounds(151, 108, 108, 20);
		getContentPane().add(txtprice);
		txtprice.setColumns(10);

		lblno = new JLabel("Room no");
		lblno.setBounds(31, 111, 72, 14);
		getContentPane().add(lblno);
		
		//creating table
		dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setBounds(0, 195, 726, 208);
		getContentPane().add(table);
		
		//add columns
		dtm.addColumn("Name");
		dtm.addColumn("E-Mail");
		dtm.addColumn("Arrival Date");
		dtm.addColumn("Departure Date");
		dtm.addColumn("Booking Date");
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(0, 195, 726, 208);
		getContentPane().add(scroll);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		new Hello();

	}
}