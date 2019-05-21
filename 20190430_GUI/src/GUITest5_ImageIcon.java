import java.awt.*;
import javax.swing.*;


public class GUITest5_ImageIcon {
	public static void main(String[] args) {
		JFrame frame=new JFrame("이미지 아이콘(bakugo)");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,500));
				
		//ImageIcon, JLabel
		ImageIcon bakugo = new ImageIcon("src/images/bakugo.jpg");
		JLabel imageLabel =new JLabel(bakugo);
		
		//ImageIcon, JButton
		ImageIcon midorea = new ImageIcon("src/images/midorea.png");
		
		//ImageIcon크기수정
		ImageIcon smallmidorea = new ImageIcon(midorea.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT));
		JButton imageButton =new JButton(smallmidorea);
		imageButton.setRolloverIcon(bakugo);//마우스 올리면
		imageButton.setPressedIcon(midorea);//마우스 누르면

		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
