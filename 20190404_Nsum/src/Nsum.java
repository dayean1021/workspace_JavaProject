import java.util.*;
public class Nsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("각 자리 수의 수를 더한 값을 출력하자");
		System.out.println("숫자를 입력하세요");
		String num=sc.nextLine();
		nSum(num);

	}

	private static void nSum(String num) {
		int length=num.length();
		int sum=0;	
		
		for (int i=0;i<length;i++ ) {
			char n=num.charAt(i);
			sum+=n-'0'; //0=48
		}
		
		System.out.println("숫자의 합은 : "+sum+"입니다.");
	}

}
