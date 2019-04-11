import java.util.*;
//30분 이상 1500, 10분당 1000원 추가
public class ParkingFee2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fee=1500;
		//분을 입력
		
		while(true) {
			System.out.print("주치 시간을 입력하세요(분 단위로) : ");
			int time=sc.nextInt();
			
			if(time<=30) 
				System.out.println("주차요금은 "+fee+"원 입니다.");
			else if(time==0) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
			//26000원 이상
			else if(time>=230) { 
				System.out.println("이용시간 초과 차 못 빼");
			}
			else {
				int a=time/10;
				fee+=(a-3)*1000;
				
				if((a*10)>0)
					fee+=1000;
				
				System.out.println("주차요금은 "+fee+"원 입니다.");
				fee=1500;
			}
		}//while
	}
}
