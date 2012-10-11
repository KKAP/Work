import javax.swing.*;

import java.awt.*;
import java.util.Set;

public class Guiresult {
	public JFrame frame;
	public JPanel panel;

	public Guiresult() {

		frame = new JFrame("Result");
		panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		frame.add(panel);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void show(int i, String name, int score) {

		JPanel panel_num = new JPanel();
		JPanel panel_name = new JPanel();
		JPanel panel_score = new JPanel();
		panel_num.setLayout(new BoxLayout(panel_num, BoxLayout.Y_AXIS));
		panel_name.setLayout(new BoxLayout(panel_name, BoxLayout.Y_AXIS));
		panel_score.setLayout(new BoxLayout(panel_score, BoxLayout.Y_AXIS));
		JLabel label_headnum = new JLabel("NO.     ");
		JLabel label_headname = new JLabel("Name     ");
		JLabel label_headscore = new JLabel("Score     ");
		panel_num.add(label_headnum);
		panel_name.add(label_headname);
		panel_score.add(label_headscore);
		for (int c = 0; c < i; c++) {

			JLabel label_num = new JLabel(i+"");
			JLabel label_name = new JLabel(name);
			JLabel label_score = new JLabel(score+"");
			panel_num.add(label_num);
			panel_name.add(label_name);
			panel_score.add(label_score);
			panel.add(panel_num);
			panel.add(panel_name);
			panel.add(panel_score);
		}

	}

	public void setvisible(boolean i) {
		frame.setVisible(i);

	}
	}