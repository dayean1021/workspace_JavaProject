import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("창");
		JLabel label = new JLabel("레이블"); //내용물을 넣음
		frame.add(label); //창에 레이블을 추가해라
		
		frame.setPreferredSize(new Dimension(400,100)); //웬만하면 이렇게 하라
		frame.setLocation(200,500);
		frame.pack(); //안의 내용을 확인
		frame.setVisible(true);
		
		JFrame frame2=new JFrame("침투");
		frame2.pack();
		frame2.setVisible(true);
	}

}
