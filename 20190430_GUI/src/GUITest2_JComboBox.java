import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300,200)); 
		
		JPanel panel=new JPanel();
		
		JComboBox<String> cb =new JComboBox<>();
		JLabel label=new JLabel("�¾ ��");
		for(int i=1;i<=12;i++) {
			cb.addItem(i+"");//i�� Stringȭ  (==String.valueOf(i))
		}
		
		/*
		 String[] picnics = {"���ɱ���","��������"};
		 cb.addItem("����ķ��");//���߿� �߰� ����
		cb.addItem("�ܿｺŰ");*/
		
		
		panel.add(label);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}
