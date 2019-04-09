import java.util.*;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fee;
		//분을 입력
		System.out.print("주치 시간을 입력하세요(분 단위로) : ");
		int time=sc.nextInt();
		
		if(0<=time&&time<=30) {
			fee=2000;
		} else {
			//30분 이하면 2000
			int 십의자리 =time/10;
			int 일의자리=time%10;
			fee=(십의자리-1)*1000;
			if(일의자리>=1)
				fee+=1000;
		}
		
		System.out.println("주차요금은 "+fee+"원");
		
	}
}
