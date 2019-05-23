import java.awt.*;
import javax.swing.*;

public class GUITest6_가위바위보 {
	static String[] filename = {"src/images/Scissors.png","src/images/rock.png","src/images/Paper.png"};
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("가위바위보 게임");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,500));
				
		//component 만들자
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel comLabel=new JLabel(computerImage);		//컴퓨터 패의 그림
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButton = new JButton(scissorsImage);		//가위 버튼
		ImageIcon rockImage = new ImageIcon(filename[1]);
		JButton rockButton = new JButton(rockImage);				//바위 버튼
		ImageIcon paperImage = new ImageIcon(filename[2]);
		JButton paperButton = new JButton(paperImage);				//보 버튼
	
		
		panel.add(comLabel);
		panel.add(result);
		
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
