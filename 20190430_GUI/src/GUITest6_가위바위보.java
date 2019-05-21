import java.awt.*;
import javax.swing.*;

public class GUITest6_가위바위보 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("가위바위보 게임");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,500));
				
		JLabel result = new JLabel("Win");
		ImageIcon comImage = new ImageIcon("");
		JLabel comLabel=new JLabel(comImage);
		
		ImageIcon scissorsImage = new ImageIcon("");
		JButton scissorsButton = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon("");
		JButton rockButton = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon("");
		JButton paperButton = new JButton(paperImage);
		
		
		panel.add(comp);
		panel.add(result);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
