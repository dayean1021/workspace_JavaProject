import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUITest10_CounterButton {

	public static void main(String[] args) {
		JFrame frame=new JFrame("CounterButton");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(300,100));
		
		//JLable, JButton
		JLabel lbNumber =new JLabel("0");
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER); //��� ����
		JButton btCount = new JButton("Click Counter");
		
		//GridLayout
		GridLayout g1=new GridLayout(1,2);
		panel.setLayout(g1);
		panel.add(lbNumber);
		panel.add(btCount);
		
		//Event
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lbNumber���� �ؽ�Ʈ �����ͼ�
				String input=lbNumber.getText();
				int in=Integer.parseInt(input);
				//+1�� �ϰ�
				in=in+1;
				//lbNumber�� ��������
				String result=Integer.toString(in);
				lbNumber.setText(result);
			}
		};
		btCount.addActionListener(listener);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
