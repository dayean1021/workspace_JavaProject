import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500, 300);//창 위치
		//frame.setSize(300,400);//창 크기
		frame.setPreferredSize(new Dimension(300,200)); //주로 이걸 사용
		
		JPanel panel=new JPanel();
		JLabel label = new JLabel("오월은 푸르구나~");
		label.setText("너도나도 자린다~");
		label.setOpaque(true);//불투명하게 한 뒤 색을 입힌다
		label.setBackground(Color.pink);
		
		
		JTextField tf = new JTextField("우리들은 자린다~"); //입력할 수 있는 창
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		
		frame.pack(); //감싸다
		frame.setVisible(true); //보여줘라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close하는 순간 종료
	}
}
