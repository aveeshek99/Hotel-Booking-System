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



 	public class Corporate extends JFrame implements ActionListener{
 		JPanel pnltitle, pnlmain;
 		JLabel lblfirstimg, lblscndimg, lblback,lblWelName;
 		JButton btncheckin, btncheckout, btnview, btnbook, btnsignout;
 		
 	// global variable
 		int id;
 		String name, email;

	public  Corporate(int id, String email, String name) {
		// store value
				this.id = id;
				this.email = email;
				this.name = name;
		
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
		 btnsignout = new JButton("SIGN OUT");
		 btnsignout.setForeground(Color.CYAN);
		 btnsignout.setBackground(Color.GRAY);
		 btnsignout.setBounds(755, 11, 94, 47);
		 btnsignout.addActionListener(this);

		 pnltitle.add(btnsignout);
		
		//logo image first part
		 lblfirstimg = new JLabel("");
		 lblfirstimg.setBounds(0, 0, 289, 85);
		 lblfirstimg.setForeground(Color.LIGHT_GRAY);
		 lblfirstimg.setBackground(Color.LIGHT_GRAY);
		 lblfirstimg.setIcon(new ImageIcon("C:\\Users\\dipesh\\Desktop\\logofirst.jpg"));
		 pnltitle.add(lblfirstimg);
		
		//logo image second part
		 lblscndimg = new JLabel("");
		 lblscndimg.setIcon(new ImageIcon("C:\\Users\\dipesh\\Desktop\\whitebackground.jpg"));
		 lblscndimg.setBounds(288, 0, 596, 85);
		 pnltitle.add(lblscndimg);
		
		// main panel
		 pnlmain = new JPanel();
		 pnlmain.setBounds(0, 84, 884, 527);
		 getContentPane().add(pnlmain);
		 pnlmain.setLayout(null);
		
		//check in button
		 btncheckin = new JButton("CHECK IN");
		 btncheckin.setForeground(Color.CYAN);
		 btncheckin.setBackground(Color.GRAY);
		 btncheckin.setBounds(150, 145, 111, 48);
		 btncheckin.addActionListener(this);

		 pnlmain.add(btncheckin);
		
		//check out button
		 btncheckout = new JButton("CHECK OUT");
		 btncheckout.setForeground(Color.CYAN);
		 btncheckout.setBackground(Color.GRAY);
		 btncheckout.setBounds(150, 196, 111, 65);
		 btncheckout.addActionListener(this);

		 pnlmain.add(btncheckout);
		
		//view button
		 btnview = new JButton("VIEW");
		 btnview.setForeground(Color.CYAN);
		 btnview.setBackground(Color.GRAY);
		 btnview.setBounds(80, 144, 65, 117);
		 btnview.addActionListener(this);

		pnlmain.add(btnview);
		
		//extra service button
		 btnbook = new JButton("Booking");
		 btnbook.setForeground(Color.CYAN);
		 btnbook.setBackground(Color.GRAY);
		 btnbook.setBounds(80, 265, 181, 53);
		 btnbook.addActionListener(this);
		pnlmain.add(btnbook);
		
		//background image
		 lblback= new JLabel("");
		 lblback.setIcon(new ImageIcon("C:\\Users\\dipesh\\Desktop\\scndimg.jpg"));
		 lblback.setBounds(0, 0, 884, 527);
		 pnlmain.add(lblback);
		 
		 lblWelName = new JLabel("Hello " + name);
			lblWelName.setBounds(450, 350, 149, 30);
			lblWelName.setHorizontalTextPosition(JLabel.CENTER);
			lblWelName.setHorizontalAlignment(JLabel.CENTER);
			lblWelName.setVerticalAlignment(JLabel.CENTER);
			lblWelName.setFont(new Font("Verdana",Font.BOLD,14));
			pnlmain.add(lblWelName);

		 
		 setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnsignout) {
			if (ae.getSource() == btnsignout)
				;
			Login Log = new Login();
			setVisible(false);
		}
		
		if (ae.getSource() == btnbook) {
			if (ae.getSource() == btnbook)
				;
			Booking bok = new Booking(id, email, name);
			setVisible(false);
		}
		
		if(ae.getSource()==btncheckout) {
			if(ae.getSource()==btncheckout);
			Checkout check= new Checkout();
			setVisible(false);
		}
	}
	
	

	
}