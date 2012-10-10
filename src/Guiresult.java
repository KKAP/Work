import javax.swing.*;

import java.awt.*;
import java.util.Set;



public class Guiresult {
	public  JFrame frame ;
	
	public Guiresult(){
		
		frame = new JFrame("Result");
		
	}
	
	public void show(int i , String name , int score){
		
	for(int c = 0 ;c<i ;c++ ){
		JLabel label  = new JLabel();
		label.setText( c+1+"     "+name+"     "+score);
	}
		 
	
		 
	}
	public void setvisible(boolean i){
		frame.setVisible(i);
		
	}
}
