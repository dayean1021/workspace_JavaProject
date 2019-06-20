import java.awt.*;
import javax.swing.*;

public class worldcup {
	public static void main(String[] args) {
		String[] image= {"src/images/macdayeon.jpg","src/images/lilockdayeon.jpg","src/images/framedayeon.jpg","src/images/posedayeon.jpg"};
		String[] explanation= {"맥날에서 소프트콘 들고 사진 찍는 척 하는 다연","리락쿠마랑 지하철 데이트 하는 다연","액자 안에서 이쁜 척 하는 다연","올마이트 포즈 따라하는 다연"};
		JFrame frame=new JFrame("따요니월드컵");
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(1000,600));
	
		//BorderLayout
		BorderLayout bl1=new BorderLayout();
		panel.setLayout(bl1);
		
		JLabel stage = new JLabel("??강");
		panel.add(stage, BorderLayout.NORTH);
		
		//BorderLayout2
		BorderLayout bl2=new BorderLayout();
		JLabel panelCenter = new JLabel();
		panelCenter.setLayout(bl2);
		
		JLabel text1 = new JLabel("당신의 따요니를 선택하세요!!!!");
		panelCenter.add(text1, BorderLayout.NORTH);
		
		
		//GridLayout1
		GridLayout gl1=new GridLayout(1,2);
		JPanel Button = new JPanel();
		Button.setLayout(gl1);
			//JButton				
			ImageIcon mac = new ImageIcon(image[0]);
			ImageIcon smac = new ImageIcon(mac.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT));
			JButton button1 = new JButton(smac);
			Button.add(button1);
			ImageIcon lilock = new ImageIcon(image[1]);
			ImageIcon slilock = new ImageIcon(lilock.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT));
			JButton button2 = new JButton(slilock);
			Button.add(button2);
		panelCenter.add(Button, BorderLayout.CENTER);
		
		//GridLayout2
		GridLayout gl2=new GridLayout(1,2);
		JPanel Ex =new JPanel();
		Ex.setLayout(gl2);
		JLabel ex1 = new JLabel(explanation[0]);
		JLabel ex2 = new JLabel(explanation[1]);
		Ex.add(ex1);
		Ex.add(ex2);
		panelCenter.add(Ex, BorderLayout.SOUTH);
		
		panel.add(panelCenter,BorderLayout.CENTER);
		
		
		
		
		
		
		
		
		
		
		frame.add(panel);
		//frame.add(panelCenter);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
