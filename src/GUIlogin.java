
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class GUIlogin {
		private JFrame frame = new JFrame("Login"); //create frame
		
		private JButton loginBtn = new JButton("Login"); //create Login Button
		private JButton showBtn = new JButton("Show Result"); //show result btn
		private JTextField usernameText = new JTextField(20); //Textfield for username
		private JPasswordField passwordText = new JPasswordField(20); //TextField for password
		private JTextPane headText = new JTextPane(); //Head text
		private JTextArea head = new JTextArea("Login") ;
		private JPanel pnlCenter = new JPanel();
		private JPanel pnlSouth = new JPanel();
		
		public GUIlogin(){
			
			//pnlCenter.add(head);
			pnlCenter.add(usernameText);
			pnlCenter.add(passwordText);
			pnlCenter.add(loginBtn);
			pnlCenter.add(showBtn);
			frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().add(pnlCenter , BorderLayout.CENTER);
			frame.getContentPane().add(pnlCenter, BorderLayout.CENTER);
			frame.setSize(500, 400);
			
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);  
			
		}
		public static void main (String [] args) {
				GUIlogin gui = new GUIlogin();
				
		}
}
