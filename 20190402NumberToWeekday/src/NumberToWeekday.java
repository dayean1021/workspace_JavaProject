import java.util.*;
public class NumberToWeekday {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("숫자를 요일로 바꿔드립니다... ");
			System.out.print("숫자를 입력하세요(1~7) = ");
			int user=sc.nextInt();
			
			String[]WeekDays = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
			 System.out.println(WeekDays[user-1]);
			
			/*
			 * switch(user) {
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			case 6:
				System.out.println("토요일");
				break;
			case 7:
				System.out.println("일요일");
				break;
			}
			 */
		
	}
}
