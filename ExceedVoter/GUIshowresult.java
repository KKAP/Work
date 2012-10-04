package ExceedVoter;

import java.awt.*;
import javax.swing.*;

public class GUIshowresult
{
    private boolean check;
    JPanel p;
    JFrame f;
	public void guiResult(String name,String score) {
        
		Font fn0 = new Font("Courier New", Font.BOLD, 20);
		Font fn2 = new Font("Courier New", Font.BOLD, 14);
		Font fn = new Font("Courier New", Font.BOLD, 16);
		Font fn1 = new Font("Cordia New", Font.BOLD, 26);
        
		f = new JFrame("RESULT"); // àà¶º¢éÒ§º¹ÊØ´
		p = new JPanel();
		p.setBackground(Color.WHITE); // ÊÕ¾×é¹ËÅÑ§
        
		JLabel w1 = new JLabel(" ====================== ",
                               SwingConstants.CENTER);
		JLabel l1 = new JLabel(" Result ", SwingConstants.CENTER); // µÑÇË¹Ñ§Ê×ÍÂÔ¹´ÕµéÍ¹ÃÑº
		
		JLabel w2 = new JLabel(" ====================== ",
                               SwingConstants.CENTER);
        
		w1.setFont(fn0);
		l1.setFont(fn0);
		
		w2.setFont(fn0);
        
		w1.setPreferredSize(new Dimension(1000, 25));
		l1.setPreferredSize(new Dimension(1000, 25)); // ÃÐÂÐËèÒ§¢Í§ºÃÃ·Ñ´
        
		w2.setPreferredSize(new Dimension(1000, 25));
		w1.setForeground(Color.red);
		l1.setForeground(Color.blue); // ÊÕµÑÇË¹Ñ§Ê×Í
		
		w2.setForeground(Color.red);
        
		p.add(w1);
		p.add(l1);
		
		p.add(w2);
        
		
        
		JLabel in = new JLabel("The Winner is", SwingConstants.CENTER);
		in.setFont(fn0);
		in.setPreferredSize(new Dimension(300, 50));
		in.setForeground(new Color(47, 207, 189));
		p.add(in);
		
        // 111111111111111111
		name(name);
//		JLabel q = new JLabel("11111111111111"  );
//		q.setBackground(Color.WHITE);
//		q.setPreferredSize(new Dimension(150, 10));
//		q.setOpaque(true);
//		p.add(q);
//		
//        
//		f.add(p);
        
		
		
		JLabel l2 = new JLabel("Score :", SwingConstants.CENTER);
		l2.setBackground(Color.WHITE);
		l2.setFont(fn1);
		l2.setPreferredSize(new Dimension(150, 70));
		l2.setForeground(new Color(47, 207, 189));
		l2.setOpaque(true);
		p.add(l2);
        
		
		
        
		
        //222222222222222222
		score(score);
		JLabel e = new JLabel("??????????????");
//		e.setBackground(Color.WHITE);
//		e.setPreferredSize(new Dimension(150, 20));
//		e.setOpaque(true);
//		p.add(e);
//		f.add(p);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
		f.setVisible(check);
		f.setLayout(null);
		f.setResizable(false);
        
	}
	public void name(String a){
		JLabel q = new JLabel(a);
		q.setBackground(Color.WHITE);
		q.setPreferredSize(new Dimension(150, 10));
		q.setOpaque(true);
		p.add(q);
		f.add(p);
	}
	public void score(String score){
		JLabel e = new JLabel(score);
		e.setBackground(Color.WHITE);
		e.setPreferredSize(new Dimension(150, 20));
		e.setOpaque(true);
		p.add(e);
		f.add(p);
	}
	public void setShow(boolean check){
		this.check=check;
	}
	
	
	
	
	
	
	
}