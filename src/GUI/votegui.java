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

public class votegui extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					votegui frame = new votegui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public votegui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(74, 228, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(226, 228, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("2");
		chckbxNewCheckBox.setBounds(74, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("3");
		chckbxNewCheckBox_1.setBounds(74, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("1");
		chckbxNewCheckBox_2.setBounds(74, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("1");
		chckbxNewCheckBox_3.setBounds(173, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("2");
		chckbxNewCheckBox_4.setBounds(173, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("3");
		chckbxNewCheckBox_5.setBounds(173, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JLabel lblVote = new JLabel("VOTE");
		lblVote.setBounds(196, 11, 46, 14);
		contentPane.add(lblVote);
		
		txtDescription = new JTextField();
		txtDescription.setText("DESCRIPTION");
		txtDescription.setBounds(240, 36, 165, 63);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
		JLabel lblBeautiful = new JLabel("Best Idea");
		lblBeautiful.setBounds(74, 101, 46, 14);
		contentPane.add(lblBeautiful);
		
		JLabel lblUsable = new JLabel("Usable");
		lblUsable.setBounds(175, 101, 46, 14);
		contentPane.add(lblUsable);
		
		JLabel lblNewLabel = new JLabel("Best Graphic");
		lblNewLabel.setBounds(288, 101, 89, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("1");
		chckbxNewCheckBox_6.setBounds(288, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("2");
		chckbxNewCheckBox_7.setBounds(288, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox checkBox = new JCheckBox("3");
		checkBox.setBounds(288, 173, 97, 23);
		contentPane.add(checkBox);
	}
}
