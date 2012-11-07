package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

import user.Student;
import user.Voter;

import model.Ballot;
import model.Criterion;
import model.Project;
import model.ProjectDescription;
import controler.ControlVote;

public class GUIvote extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtDescription;
	private JTextField txtName;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JCheckBox chckbxNewCheckBox_6;
	private JCheckBox chckbxNewCheckBox_7;
	private JCheckBox chckbxNewCheckBox_8;
	Criterion criterion;
	


	/**
	 * Create the frame.
	 */
	public GUIvote(final Project project,final int i,final ControlVote controlVote) {
		frame = new JFrame("Vote");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(74, 228, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				int bestIdea=0;
				int usable=0;
				int bestGraphic=0;
				if(a.getSource()==chckbxNewCheckBox) bestIdea=2;
				else if(a.getSource()==chckbxNewCheckBox_1) bestIdea =3;
				else if(a.getSource()==chckbxNewCheckBox_2) bestIdea =1;
				if(a.getSource()==chckbxNewCheckBox_3) usable=1;
				else if(a.getSource()==chckbxNewCheckBox_4) usable =2;
				else if(a.getSource()==chckbxNewCheckBox_5) usable =3;
				if(a.getSource()==chckbxNewCheckBox_6) usable=3;
				else if(a.getSource()==chckbxNewCheckBox_7) usable =1;
				else if(a.getSource()==chckbxNewCheckBox_8) usable =2;
				Ballot ballot=new Ballot(new Student("peach"), project.getProject().get(i)) ;
				ballot.add(bestGraphic,bestIdea,usable);
				controlVote.add(ballot);
				frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(226, 228, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		
		chckbxNewCheckBox = new JCheckBox("2");
		chckbxNewCheckBox.setBounds(74, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("3");
		chckbxNewCheckBox_1.setBounds(74, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("1");
		chckbxNewCheckBox_2.setBounds(74, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("1");
		chckbxNewCheckBox_3.setBounds(173, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("2");
		chckbxNewCheckBox_4.setBounds(173, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		chckbxNewCheckBox_5 = new JCheckBox("3");
		chckbxNewCheckBox_5.setBounds(173, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JLabel lblVote = new JLabel("VOTE");
		lblVote.setBounds(196, 11, 46, 14);
		contentPane.add(lblVote);
		
		txtDescription = new JTextField();
		txtDescription.setText(project.getProject().get(i).getDescription());
		txtDescription.setEnabled(false);
		txtDescription.setBounds(240, 36, 165, 63);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText(project.getProject().get(i).getName());
		txtName.setEnabled(false);
		txtName.setBounds(40, 36, 165, 63);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblBeautiful = new JLabel("Best Idea");
		lblBeautiful.setBounds(74, 101, 46, 14);
		contentPane.add(lblBeautiful);
		
		JLabel lblUsable = new JLabel("Usable");
		lblUsable.setBounds(175, 101, 46, 14);
		contentPane.add(lblUsable);
		
		JLabel lblNewLabel = new JLabel("Best Graphic");
		lblNewLabel.setBounds(288, 101, 89, 14);
		contentPane.add(lblNewLabel);
		
		chckbxNewCheckBox_6 = new JCheckBox("1");
		chckbxNewCheckBox_6.setBounds(288, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		chckbxNewCheckBox_7 = new JCheckBox("2");
		chckbxNewCheckBox_7.setBounds(288, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		chckbxNewCheckBox_8 = new JCheckBox("3");
		chckbxNewCheckBox_8.setBounds(288, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		frame.add(contentPane);
		frame.setVisible(true);
		
		
		
		
		
	}
}
