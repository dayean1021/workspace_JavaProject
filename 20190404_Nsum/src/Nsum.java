import java.util.*;
public class Nsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�� �ڸ� ���� ���� ���� ���� �������");
		System.out.println("���ڸ� �Է��ϼ���");
		String num=sc.nextLine();
		int length=num.length();
		int sum=0;
		
		
		for (int i=0;i<length;i++ ) {
			char n=num.charAt(i);
			sum+=n-'0'; //0=48
		}
		
		System.out.println("������ ���� : "+sum+"�Դϴ�.");

	}

}
