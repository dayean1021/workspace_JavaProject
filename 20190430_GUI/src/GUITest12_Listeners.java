import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class GUITest12_Listeners {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300,200)); 
		
		JPanel panel = new JPanel();
		JTextField tfInput=new JTextField(10);
		JTextField tfInput2=new JTextField(20);
		JLabel lbOutput=new JLabel("�� ����!");
		
		tfInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText()+" ���� �ܼ�Ʈ!!!");
				
			}
		});
		tfInput.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				lbOutput.setText("�ٽõ��ƿ�");
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				lbOutput.setText("�����ٶ��");				
			}
		});
		
		panel.add(tfInput);
		panel.add(tfInput2);
		panel.add(lbOutput);
		frame.add(panel);

		
		frame.pack();
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}