import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300,200)); 
		
		JPanel panel=new JPanel();
		
		JComboBox<String> cb =new JComboBox<>();
		JLabel label=new JLabel("태어난 달");
		for(int i=1;i<=12;i++) {
			cb.addItem(i+"");//i를 String화  (==String.valueOf(i))
		}
		
		/*
		 String[] picnics = {"봄꽃구경","여름수영"};
		 cb.addItem("가을캠프");//나중에 추가 가능
		cb.addItem("겨울스키");*/
		
		
		panel.add(label);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}
