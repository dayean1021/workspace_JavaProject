import java.util.*;
public class StudentNumber2Major {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학번을 입력하면 학과를 출력하기");
		System.out.print("학번을 입력하세요 -> ");
		String stunum=sc.nextLine();
		String grade=stunum.substring(0,1);
		String classroom=stunum.substring(1,2);
		
		//int stunum=sc.nextInt();
		//int grade=stunum/1000;
		//int ban=(stunum-(grade*1000))/100;
		//String department[]= {"뉴미디어소프트웨어","뉴미디어솔루션과","뉴미디어디자인과"};
		
		//1학년, 2학년
		if(grade.equals("1")||grade.equals("2")) {
			if(classroom.equals("1")||classroom.equals("2"))
				System.out.println("뉴미디어소프트웨어과");
			else if(classroom.equals("3")||classroom.equals("4"))
				System.out.println("뉴미디어솔루션과");
			else if(classroom.equals("5")||classroom.equals("6"))
				System.out.println("뉴미디어디자인과");
			
		}
		//3학년
		else if(grade.equals("3")) {
			if(classroom.equals("1")||classroom.equals("2"))
				System.out.println("인터랙티브미디어과");
			else if(classroom.equals("3")||classroom.equals("4"))
				System.out.println("뉴미디어디자인과");
			else if(classroom.equals("5")||classroom.equals("6"))
				System.out.println("뉴미디어솔루션과");
			
		}
	}
}
