import java.awt.*;

import javax.swing.*;

public class GUITest4_JRadioButton {

	public static void main(String[] args) {
		JFrame frame=new JFrame("라디오버튼");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,500));
		
		//JRadioButton
		JRadioButton exo =new JRadioButton("EXO");
		JRadioButton troye =new JRadioButton("Troye Sivan");
		ButtonGroup bg= new ButtonGroup(); //그룹으로 묶어줌
		bg.add(exo);
		bg.add(troye);
		
		panel.add(exo);
		panel.add(troye);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
