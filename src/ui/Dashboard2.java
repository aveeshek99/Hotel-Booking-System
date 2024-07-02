package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Dashboard2 extends JFrame implements ActionListener {
	JPanel panel, panel2, panel3;
	JLabel lbl1, lbl2, lbl3, lbl4, lblWelName;
	JButton btnlogout, btncheckin, btncheckout, btnbooking, btnservice;

	// global variable
	int id;
	String name, email;

	public Dashboard2(int id, String email, String name) {

		// store value
		this.id = id;
		this.email = email;
		this.name = name;

		// initialize and memory allocation
		setTitle("Dashboard");
		setBackground(new Color(30, 144, 255));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 999, 74);
		panel.setLayout(null);
		add(panel);

		panel2 = new JPanel();
		panel2.setBackground(new Color(102, 205, 170));
		panel2.setBounds(0, 72, 177, 523);
		add(panel2);

		lblWelName = new JLabel("Hello " + name);
		lblWelName.setBounds(850, 40, 149, 30);
		lblWelName.setHorizontalTextPosition(JLabel.CENTER);
		lblWelName.setHorizontalAlignment(JLabel.CENTER);
		lblWelName.setVerticalAlignment(JLabel.CENTER);
		lblWelName.setFont(new Font("Verdana",Font.BOLD,14));
		panel.add(lblWelName);

		lbl1 = new JLabel("Hotel Online Booking And Management System");
		lbl1.setBounds(214, 10, 637, 46);
		lbl1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl1.setForeground(new Color(255, 255, 255));
		lbl1.setFont(new Font("Impact", Font.PLAIN, 33));
		panel.add(lbl1);

		btnlogout = new JButton("Sign Out\r\n");
		btnlogout.setVerticalAlignment(SwingConstants.BOTTOM);
		btnlogout.setBounds(888, 10, 90, 28);
		btnlogout.setFont(new Font("Calibri", Font.BOLD, 14));
		btnlogout.setBackground(new Color(224, 255, 255));
		btnlogout.setForeground(Color.black);
		btnlogout.setFocusable(false);
		btnlogout.addActionListener(this);

		panel.add(btnlogout);

		JLabel lbl2 = new JLabel("");
		lbl2.setIcon(new ImageIcon("C:\\Users\\dipesh\\Desktop\\Image.jpg"));
		lbl2.setBounds(175, 72, 668, 523);
		add(lbl2);

		JLabel lbl3 = new JLabel();
		lbl3.setBackground(Color.GREEN);
		lbl3.setBounds(202, 253, 121, 48);
		add(lbl3);

		btncheckin = new JButton("Check-In");
		btncheckin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncheckin.setBounds(32, 125, 112, 44);
		btncheckin.setBackground(new Color(173, 216, 230));
		btncheckin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btncheckin.setFocusable(false);
		panel2.setLayout(null);
		btncheckin.addActionListener(this);
		panel2.add(btncheckin);

		btncheckout = new JButton("Check-Out");
		btncheckout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btncheckout.setFocusable(false);
		btncheckout.setBackground(new Color(244, 164, 96));
		btncheckout.setBounds(32, 337, 112, 44);

		btncheckout.addActionListener(this);
		panel2.add(btncheckout);

		panel3 = new JPanel();
		panel3.setBackground(new Color(144, 238, 144));
		panel3.setBounds(842, 72, 157, 523);
		add(panel3);
		panel3.setLayout(null);

		btnbooking = new JButton("Booking");
		btnbooking.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnbooking.setFocusable(false);
		btnbooking.setBackground(new Color(240, 230, 140));
		btnbooking.setBounds(22, 118, 112, 44);
		btnbooking.addActionListener(this);
		panel3.add(btnbooking);

		btnservice = new JButton("ES - Charges");
		btnservice.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnservice.setFocusable(false);
		btnservice.setBackground(new Color(210, 180, 140));
		btnservice.setBounds(18, 330, 125, 50);
		panel3.add(btnservice);
		setBounds(100, 100, 1013, 632);
		btnservice.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnlogout) {
			if (ae.getSource() == btnlogout)
				;
			Login Log = new Login();
			setVisible(false);

		}

		if (ae.getSource() == btnbooking) {
			if (ae.getSource() == btnbooking)
				;
			Booking bok = new Booking(id, email, name);
			setVisible(false);
		}

	}

}
