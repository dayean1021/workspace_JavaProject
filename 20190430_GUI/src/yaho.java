import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class yaho {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300,200)); 
		
		JPanel panel=new JPanel();
		JLabel label = new JLabel("야호");
		
		JTextField tf = new JTextField("야호"); //입력할 수 있는 창
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		
		frame.pack(); //감싸다
		frame.setVisible(true); //보여줘라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close하는 순간 종료
	}
}
