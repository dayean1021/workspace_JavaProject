import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class GUITest6_���������� {
	static String[] filename = {"src/images/Scissors.png","src/images/rock.png","src/images/Paper.png"};
	static String[] answerString= {"����ڰ� ��","���","����ڰ� �̱�^^"};
	protected static int computer; //��ǻ�Ͱ� �� ��
	protected static int player;   //����ڰ� �� ��
	protected static int answer;   //��� ��
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("���������� ����");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(1400,400));
				
		//component ������
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerLabel=new JLabel(computerImage);		//��ǻ�� ���� �׸�
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButton = new JButton(scissorsImage);		//���� ��ư
		ImageIcon rockImage = new ImageIcon(filename[1]);
		JButton rockButton = new JButton(rockImage);				//���� ��ư
		ImageIcon paperImage = new ImageIcon(filename[2]);
		JButton paperButton = new JButton(paperImage);				//�� ��ư
		
		ActionListener al= new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==scissorsButton) {
					player=1;
				} else if(e.getSource()==rockButton) {
					player=2;
				}else if(e.getSource()==paperButton) {
					player=3;
				}
				//1:����, 2:����, 3:��
				player = 1;
				// makeComputer
				computer =makeComputer(); //computer��� ������ �ɹ������� �������.
				ImageIcon computerImage =new ImageIcon(filename[computer-1]);
				computerLabel.setIcon(computerImage);
				//compare
				answer =compare(player,computer); //��, �̱�, ���
				//����� ȭ�鿡 ��������
				result.setText(answerString[answer]);
				
			}
		};
		scissorsButton.addActionListener(al);
		rockButton.addActionListener(al);
		paperButton.addActionListener(al);
		
		panel.add(computerLabel);
		panel.add(result);
		
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//��ǻ�Ϳ� ������� ���� ���ؼ� ������� ����
	private static int compare(int p, int c) {		
		if((p+1)%3==c%3) {
			return 0;
		} else if(p==c) {
			return 1;
		} else {
			return 2;
		}			
	}

	//��ǻ�Ͱ� ���� ���� �������� ����
	private static int makeComputer() { 
		Random random=new Random();
		int c=random.nextInt(3-1+1)+1;
		return c;
	}
}
