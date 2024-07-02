package ui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;



public class Checkout extends JFrame{
 		JPanel pnltitle, pnlmain;
 		JButton btnback,btnbill;
 		JLabel lblfirstimg, lblscndimg, lblback, lbldate,lbltotal;
 		JTextField flddate,fldtotal ;
 		

	public  Checkout() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,650);	
		getContentPane().setLayout(null);
		
		//Title panel
		 pnltitle = new JPanel();
		 pnltitle.setBounds(0, 0, 884, 85);
		getContentPane().add(pnltitle);
		pnltitle.setLayout(null);
		
		//sign out button of title panel
		btnback = new JButton("BACK");
		btnback.setForeground(Color.CYAN);
		btnback.setBackground(Color.GRAY);
		btnback.setBounds(785, 11, 89, 51);
		pnltitle.add(btnback);
		
		//logo image first part
		 lblfirstimg = new JLabel("");
		 lblfirstimg.setBounds(0, 0, 289, 85);
		 lblfirstimg.setForeground(Color.LIGHT_GRAY);
		 lblfirstimg.setBackground(Color.LIGHT_GRAY);
		 lblfirstimg.setIcon(new ImageIcon(getClass().getResource("/logofirst.jpg")));
		 pnltitle.add(lblfirstimg);
		
		//logo image second part
		 lblscndimg = new JLabel("");
		 lblscndimg.setIcon(new ImageIcon(getClass().getResource("/whitebackground.jpg")));
		 lblscndimg.setBounds(288, 0, 596, 85);
		 pnltitle.add(lblscndimg);
		
		// main panel
		 pnlmain = new JPanel();
		 pnlmain.setBounds(0, 84, 884, 527);
		 getContentPane().add(pnlmain);
		 pnlmain.setLayout(null);
		 
		 //Checkout date label
		 lbldate = new JLabel("CHECK-OUT-DATE");
		 lbldate.setBounds(20, 11, 158, 14);
		 pnlmain.add(lbldate);
		 
		 
		 //check out date text field
		flddate = new JTextField();
		flddate.setBounds(212, 5, 136, 26);
		pnlmain.add(flddate);
		flddate.setColumns(10);

		 
		 //checkout total bill text feild
		fldtotal = new JTextField();
		fldtotal.setBounds(738, 8, 136, 20);
		pnlmain.add(fldtotal);
		fldtotal.setColumns(10);
		
		//totalbill lable
		lbltotal = new JLabel("TOTAL BILL");
		lbltotal.setBounds(609, 11, 100, 14);
		pnlmain.add(lbltotal);
		
		//print bill button
		btnbill = new JButton("PRINT BILL");
		btnbill.setForeground(Color.CYAN);
		btnbill.setBackground(Color.GRAY);
		btnbill.setBounds(726, 455, 106, 55);
		pnlmain.add(btnbill);
		 
		//background image
		 lblback= new JLabel("");
		 lblback.setIcon(new ImageIcon(getClass().getResource("/checkoutpage.png")));
		 lblback.setBounds(0, 0, 884, 527);
		 pnlmain.add(lblback);
		 
		 setVisible(true);
		}
	public static void main(String[] args) {
		new Checkout();

	}
	
}