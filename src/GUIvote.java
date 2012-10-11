
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * This is the UI of the vote part. It will display what user can vote and submitting their votes.
 * 
 *
 */

public class GUIvote {
	public JFrame f;
	private boolean check;

	public void guiVote(final Ballot ballot) {

		Font fn0 = new Font("Courier New", Font.BOLD, 20);
		Font fn2 = new Font("Courier New", Font.BOLD, 14);
		Font fn = new Font("Courier New", Font.BOLD, 16);
		Font fn1 = new Font("Cordia New", Font.BOLD, 26);

		f = new JFrame("VOTE");
		JPanel p = new JPanel();
		p.setBackground(Color.WHITE);

		JLabel w1 = new JLabel(" ====================== ",
				SwingConstants.CENTER);
		JLabel l1 = new JLabel(" Vote ", SwingConstants.CENTER);

		JLabel w2 = new JLabel(" ====================== ",
				SwingConstants.CENTER);

		w1.setFont(fn0);
		l1.setFont(fn0);

		w2.setFont(fn0);

		w1.setPreferredSize(new Dimension(1000, 25));
		l1.setPreferredSize(new Dimension(1000, 25));

		w2.setPreferredSize(new Dimension(1000, 25));
		w1.setForeground(Color.red);
		l1.setForeground(Color.blue);

		w2.setForeground(Color.red);

		p.add(w1);
		p.add(l1);

		p.add(w2);

		JLabel descriptions = new JLabel("FOR DESCRIPTION",SwingConstants.NORTH_EAST);
		descriptions.setFont(fn0);
		descriptions.setPreferredSize(new Dimension(500, 100));
		descriptions.setForeground(new Color(47, 207, 189));
		p.add(descriptions);

		JLabel in = new JLabel("Candidate");
		in.setFont(fn0);
		in.setPreferredSize(new Dimension(300, 50));
		in.setForeground(new Color(47, 207, 189));
		p.add(in);


		JLabel q = new JLabel(ballot.getProjectdescription().getName());
		q.setBackground(Color.WHITE);
		q.setPreferredSize(new Dimension(150, 10));
		q.setOpaque(true);
		p.add(q);
		f.add(p);

		JLabel graphics = new JLabel("Graphics");
		graphics.setBackground(Color.WHITE);
		graphics.setPreferredSize(new Dimension(150, 10));
		graphics.setOpaque(true);
		p.add(graphics);


		JLabel useful = new JLabel("Usefulness");
		useful.setBackground(Color.WHITE);
		useful.setPreferredSize(new Dimension(150, 10));
		useful.setOpaque(true);
		p.add(useful);

		JLabel goodidea = new JLabel("Good Idea");
		goodidea.setBackground(Color.WHITE);
		goodidea.setPreferredSize(new Dimension(150, 10));
		goodidea.setOpaque(true);
		p.add(goodidea);

		JCheckBox graphicsone = new JCheckBox("1");
		useful.setBackground(Color.WHITE);
		useful.setPreferredSize(new Dimension(150, 10));
		useful.setOpaque(true);
		p.add(graphicsone);

		JCheckBox graphicstwo = new JCheckBox("2");
		useful.setBackground(Color.WHITE);
		useful.setPreferredSize(new Dimension(150, 10));
		useful.setOpaque(true);
		p.add(graphicstwo);

		JButton l2 = new JButton("Submit");
		l2.setBackground(Color.WHITE);
		l2.setFont(fn1);
		l2.setPreferredSize(new Dimension(150, 70));
		l2.setForeground(new Color(47, 207, 189));
		l2.setOpaque(true);
		p.add(l2);

		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
		f.setVisible(check);
		f.setLayout(null);
		f.setResizable(false);

		l2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ballot.vote();
				f.setVisible(true);
			}
		});

	}

	public void setShow(boolean check) {
		this.check = check;
	}
}
