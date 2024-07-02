
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

public class Welcomepage extends JFrame implements ActionListener {
  
	JPanel p1, p2;
	JLabel lbl1, lbl2, lbl3;
	JButton b1, b2;

public Welcomepage() {
	
		
		getContentPane().setBackground(Color.WHITE);   
		setBounds(100, 100, 1920, 1080);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0, 10, 1547, 65);
		p1.setBackground(Color.CYAN);
		p1.setForeground(Color.GREEN);
		getContentPane().add(p1);
		p1.setLayout(null);
		
		lbl1 = new JLabel("Welcome to Luton Hotel");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl1.setForeground(Color.BLACK);
		lbl1.setBackground(Color.BLACK);
		lbl1.setBounds(627, 10, 351, 43);
		p1.add(lbl1);
		
		p2 = new JPanel();
		p2.setBounds(0, 74, 1547, 58);
		p2.setBackground(new Color(144, 238, 144));
		getContentPane().add(p2);
		p2.setLayout(null);
		
		lbl2 = new JLabel("Hotel Online Booking And Management System");
		lbl2.setBounds(519, 10, 501, 35);
		lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		p2.add(lbl2);
		
		b1 = new JButton("Log In");
		b1.setBounds(1250,14,100,30);
		p2.add(b1);
		b1.setBackground(new Color(173, 216, 230));
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.addActionListener(this);
		b1.setFocusable(false);
		
		b2 = new JButton("Close");
		b2.setBounds(1357, 14, 100, 30);
		p2.add(b2);
		b2.setBackground(new Color(173, 216, 230));
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.addActionListener(this);
		b2.setFocusable(false);
		
		lbl3 = new JLabel("New label");
		lbl3.setIcon(new ImageIcon("C:\\Users\\dipesh\\Desktop\\welcomeimg.jpg"));
		lbl3.setBounds(0, 133, 1547, 720);
		getContentPane().add(lbl3);
		
		setVisible(true);
	}
@Override
public void actionPerformed(ActionEvent ae) {
	if (ae.getSource() == b1) {
	Login Log = new Login();
	setVisible(false);
	
	}
	if (ae.getSource() == b2) {
		System.exit(0);
	}
}

public static void main(String[] args) {
	new Welcomepage();

}
}