import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class GUITest6_가위바위보 {
	static String[] filename = {"src/images/Scissors.png","src/images/rock.png","src/images/Paper.png"};
	static String[] answerString= {"사용자가 짐","비김","사용자가 이김^^"};
	protected static int computer; //컴퓨터가 낸 답
	protected static int player;   //사용자가 낸 답
	protected static int answer;   //결과 값
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("가위바위보 게임");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(1400,400));
				
		//component 만들자
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerLabel=new JLabel(computerImage);		//컴퓨터 패의 그림
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButton = new JButton(scissorsImage);		//가위 버튼
		ImageIcon rockImage = new ImageIcon(filename[1]);
		JButton rockButton = new JButton(rockImage);				//바위 버튼
		ImageIcon paperImage = new ImageIcon(filename[2]);
		JButton paperButton = new JButton(paperImage);				//보 버튼
		
		ActionListener al= new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==scissorsButton) {
					player=1;
				} else if(e.getSource()==rockButton) {
					player=2;
				}else if(e.getSource()==paperButton) {
					player=3;
				}
				//1:가위, 2:바위, 3:보
				player = 1;
				// makeComputer
				computer =makeComputer(); //computer라는 변수를 맴버변수로 만들었다.
				ImageIcon computerImage =new ImageIcon(filename[computer-1]);
				computerLabel.setIcon(computerImage);
				//compare
				answer =compare(player,computer); //짐, 이김, 비김
				//결과를 화면에 보여주자
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
	
	//컴퓨터와 사용자의 값을 비교해서 결과값을 리턴
	private static int compare(int p, int c) {		
		if((p+1)%3==c%3) {
			return 0;
		} else if(p==c) {
			return 1;
		} else {
			return 2;
		}			
	}

	//컴퓨터가 내는 값을 랜덤으로 구함
	private static int makeComputer() { 
		Random random=new Random();
		int c=random.nextInt(3-1+1)+1;
		return c;
	}
}
