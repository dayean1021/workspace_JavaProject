	import java.util.*;
public class 묵찌빠 {
	//가위바위보게임


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("<<가위바위보 게임>>");
			
			while(true) {
				System.out.println("1.가위  2.바위  3.보  0.끝");
				System.out.print("번호를 입력하세요 -> ");
				int p=sc.nextInt();
				
				if (p==0) {
					System.out.println("프로그램을 종료합니다..."); 
					System.exit(0);
				}
				int c=makeconputer();
				int result=compare(p,c);
				
				System.out.println("게임 결과는...");
				System.out.println("두구두구두구....");
				switch(result) {
				case -1: //컴퓨터가 이김
					c=makeconputer();
					System.out.println("컴퓨터가 이겼습니다 다시");
					break;
				case 0:
					System.out.println("비겼습니다");
					break;
				case 1:
					System.out.println("!!!이겼습니다!!!");
					break;
				}
			}
			
		}

		//컴퓨터와 사용자의 값을 비교해서 결과값을 리턴
		private static int compare(int p, int c) {
			int result=0;
			
			if(p==c) {
				result=0;
			} else if((p==1&&c==3)||(p==2&&c==1)||(p==3&&c==2)) {
				result=1;
			} else {
				result=-1;
			}
			//-1사용자가 짐, 0 비김, 1사용자가 이김
			
			return result;
		}

		//컴퓨터가 내는 값을 랜덤으로 구함
		private static int makeconputer() { 
			Random random=new Random();
			int c=random.nextInt(3-1+1)+1;
			return c;
		}

	}
