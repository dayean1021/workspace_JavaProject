import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("â");
		JLabel label = new JLabel("���̺�"); //���빰�� ����
		frame.add(label); //â�� ���̺��� �߰��ض�
		
		frame.setPreferredSize(new Dimension(400,100)); //�����ϸ� �̷��� �϶�
		frame.setLocation(200,500);
		frame.pack(); //���� ������ Ȯ��
		frame.setVisible(true);
		
		JFrame frame2=new JFrame("ħ��");
		frame2.pack();
		frame2.setVisible(true);
	}

}
