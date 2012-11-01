package GUI;
import javax.swing.*;
import javax.swing.event.*;

import model.Ballot;
import model.Ballotbox;
import model.Categories;
import model.Project;

import com.sun.codemodel.internal.JGenerifiable;

import controler.ControlLogin;
import controler.ControlVote;



import java.awt.*;
import java.awt.event.*;
public class GUIlogin {
	private boolean check;
	private JFrame frame = new JFrame("Login"); //create frame
	private JButton loginBtn = new JButton("Login"); //create Login Button
	private JButton showBtn = new JButton("Show Result"); //show result btn
	private JTextField usernameText = new JTextField(20); //Textfield for username
	private JPasswordField passwordText = new JPasswordField(20); //TextField for password
	private JTextPane headText = new JTextPane(); //Head text
	private JTextArea head = new JTextArea("Login") ;
	private JPanel pnlCenter = new JPanel();
	private JPanel pnlSouth = new JPanel();
	private JLabel userLabel = new JLabel("User");
	private JLabel passLabel = new JLabel("Password");
	//private 
	private String name ;

	/**
	 * A constucter for a GUI stuffs.
	 */
	public GUIlogin(){
		frame.setLayout(new GridLayout(0, 2));
		//pnlCenter.add(head);
		frame.add(userLabel);
		frame.add(usernameText);
		frame.add(passLabel);
		frame.add(passwordText);
		frame.add(loginBtn);
		frame.add(showBtn);
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		frame.setResizable(false);
		



		loginBtn.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				name = usernameText.getText();
				frame.setVisible(false);
				ControlLogin controlLogin = new ControlLogin();
				controlLogin.identfy(name);
				
				Project a1 = new Project("1", "1");
				Categories categories = new Categories("dddd");
				
				
				Ballot ballot = new Ballot(controlLogin.identfy(name), a1, categories);
				GUIvote guiVote = new GUIvote(); 
				guiVote.guiVote(ballot, new ControlVote(new Ballotbox()));
				guiVote.setShow(true);
				
			}
		});



	}
	public void show(){
		frame.setVisible(check); 
	}

	public void setShow(boolean check) {
		this.check = check;
	}
	public String toString(){
		return name;
	}
}