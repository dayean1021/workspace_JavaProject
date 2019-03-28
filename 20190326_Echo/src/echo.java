//입력한 대로 출력
import java.util.*;
public class echo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("출력할 문장을 입력하세요(종료하려면 stop) : ");
		
		while(true) {
			String st=sc.nextLine();
			
			if (st.equals("stop")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			System.out.println(st);
		}
	}
}
