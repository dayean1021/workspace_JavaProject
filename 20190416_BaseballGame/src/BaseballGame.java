import java.util.*;
public class BaseballGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String c=makecom();
		System.out.println("<<�߱�����>>");
		//��ǻ�Ͱ� ������ ���� �迭�� ����
	
		while(true) {
			//�� �Է�
			String p=sc.nextLine();
			//strike, ball���ϱ�
			boolean isEnd=play(p,c);
			
			
			
			if(isEnd==true) {
				System.out.println("HIT");
				break;
			}
			
		}//while
	}//main
	
	
	
	private static String makecom() {
		StringBuffer buffer =new StringBuffer();
		//1~9����
		Random random=new Random();
		for(int i=0;i<3;) {
			int r=random.nextInt(9-1+1)+1;
			String rString = String.valueOf(r);
			//StringBuffer��
			if(!buffer.toString().contains(rString));{
				buffer.append(rString);
				i++;
			}
				return null;
			
		}
		return buffer.toString();
	}



	private static boolean play(String p, String c) {
		int strike=0;
		int ball=0;
		for (int i=0;i<p.length();i++) {
			for (int j=0;j<c.length();j++) {
				if(p.charAt(i)==c.charAt(j)) {
					if(i==j) strike++;
					else ball++;
				}
			}
		}
		System.out.println(p+"\tstrike: "+strike+"\tball: "+ball);
		
		if(p.equals(c))
		return true;
		return false;
	}//play
	
}//class