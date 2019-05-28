import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUITest9_Event {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Event");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,500));
		
		/*
		//JtextField, JButton, JLabel
		JTextField tfInput=new JTextField(10);
		JButton btrun = new JButton("->");
		JLabel lbOutput=new JLabel();
		
		//버튼에 액션 리스너 추가하자
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//액션이 발생하면, tfInput에서 택스트 가져와서 lbOutput에 설정하자
				String input = tfInput.getText();
				lbOutput.setText("안녕 "+input+"야~");
			}
		};
		//액션리스너 만들자
		btrun.addActionListener(al);
		*/
		//x10
		JTextField tfInput=new JTextField(10);
		JButton btrun = new JButton("X 10");
		JLabel lbOutput=new JLabel();
		
		//버튼에 액션 리스너 추가하자
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//액션이 발생하면, tfInput에서 택스트 가져와서 lbOutput에 설정하자
				String input = tfInput.getText();
				int in=Integer.parseInt(input);
				String result=Integer.toString(in*10);
				lbOutput.setText(" = "+result);
			}
		};
		//액션리스너 만들자
		btrun.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btrun);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
