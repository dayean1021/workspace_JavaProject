import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class GUITest11_UpDown {
	static int computer;
	public static void main(String[] args) {
		JFrame frame=new JFrame("Up&Down");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(450,100));
		
		//JTextField, JButton
		JTextField tfInput = new JTextField(10);
		JButton btQuestion = new JButton("(��)��?");		
		//JLabel
		JLabel lbResult = new JLabel("1~100���� ���� �����");
		Scanner sc=new Scanner(System.in);
		computer=(int)(Math.random()*100);
		
		//����
		ActionListener al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����� �Է°� ��������
				String input = tfInput.getText();
				tfInput.setText("");
				int player = Integer.parseInt(input);
				//��ǻ�� ������ ��������
				//��� ��������
				if (player>computer) {
					lbResult.setText(input+" DOWN");
				}
				else if(computer>player) {
					lbResult.setText(input+" UP");
				}
				else{
					lbResult.setText("¦¦ ~�����Դϴ�~ ¦¦");
					computer=(int)(Math.random()*100);
				}
				
			}
		};
		btQuestion.addActionListener(al);
		tfInput.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btQuestion);
		panel.add(lbResult);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
