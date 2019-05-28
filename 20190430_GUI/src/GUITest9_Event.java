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
		
		//��ư�� �׼� ������ �߰�����
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�׼��� �߻��ϸ�, tfInput���� �ý�Ʈ �����ͼ� lbOutput�� ��������
				String input = tfInput.getText();
				lbOutput.setText("�ȳ� "+input+"��~");
			}
		};
		//�׼Ǹ����� ������
		btrun.addActionListener(al);
		*/
		//x10
		JTextField tfInput=new JTextField(10);
		JButton btrun = new JButton("X 10");
		JLabel lbOutput=new JLabel();
		
		//��ư�� �׼� ������ �߰�����
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�׼��� �߻��ϸ�, tfInput���� �ý�Ʈ �����ͼ� lbOutput�� ��������
				String input = tfInput.getText();
				int in=Integer.parseInt(input);
				String result=Integer.toString(in*10);
				lbOutput.setText(" = "+result);
			}
		};
		//�׼Ǹ����� ������
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
