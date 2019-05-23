import java.awt.*;
import javax.swing.*;

public class GUITest7_Layout {

	public static void main(String[] args) {
		JFrame frame=new JFrame("창이름");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(400,500));
		/*
		//FlowLayout
		FlowLayout f1=new FlowLayout();
		f1.setAlignment(FlowLayout.RIGHT);
		panel.setLayout(f1);*/
		
		//BorderLayout
		BorderLayout b1 = new BorderLayout();
		panel.setLayout(b1);
		JButton btNorth=new JButton("NORTH");
		JButton btWest=new JButton("WEST");
		JButton btCenter=new JButton("CENTER");
		JButton btEast=new JButton("EAST");
		JButton btSouth=new JButton("SOUTH");
		panel.add(btNorth, BorderLayout.NORTH);
		panel.add(btWest, BorderLayout.WEST);
		panel.add(btCenter, BorderLayout.CENTER);
		panel.add(btEast, BorderLayout.EAST);
		panel.add(btSouth, BorderLayout.SOUTH);
		
		JPanel panelNorth =new JPanel(); //panel 안에 또 panel을 만듬
		//0~9 i
		for(int i=0;i<10;i++) {
			JButton troye = new JButton("Troye "+i);
			panelNorth.add(troye);
		}
		panel.add(panelNorth,BorderLayout.NORTH);
		
		//GridLayout
		GridLayout gl = new GridLayout(2,3);
		JPanel panelCenter=new JPanel();
		panelCenter.setLayout(gl);
			for(int i=0;i<6;i++) {
				JButton troye = new JButton("Sivan "+i);
				panelCenter.add(troye);
			}
		panel.add(panelCenter,BorderLayout.CENTER);
		
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
