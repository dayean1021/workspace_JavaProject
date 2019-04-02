import java.util.Random;
import java.util.Scanner;
public class UpDownBot {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1~100까지의 수는 생각하세요!!");
			int start=0;
			int end=99;
			
			Random random=new Random();
			int com_num = random.nextInt(end-start+1)+start;
			System.out.println(com_num);
			
			while(true) {
				
					System.out.print("1.UP, 2.DOWN, 3.정답  을 입력해 주세요 --> ");//30
					int user=sc.nextInt();
					
					//Up
					if(user==1) {
						start=com_num+1;
						com_num = random.nextInt(end-start+1)+start;
						System.out.println(com_num);
					}
					//Down
					else if(user==2) {
						end=com_num-1;
						com_num = random.nextInt(end-start+1)+start;
						System.out.println(com_num);
					}
					//정답
					else if(user==3) {
						System.out.println("정답입니다...!");
						break;
					}
			
		}
			System.out.println("게임을 종료합니다...");
	}//main
}
