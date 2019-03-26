import java.util.*;
public class Page {
	public static void main(String[] args) {
		
		//int page=7;
		//int result=331;
		//int aa=(result/page)+1;
		
		//if(result%page==0)
			//aa=result/page;
		
		//System.out.print(aa+" 페이지가 필요합니다.");
		
		Scanner sc=new Scanner(System.in);
		int page=7;
		
		while(true) {
			System.out.print("몇 개의 개시물을 표시할까요?(정수로 입력하세요) : ");
			String InputS=sc.nextLine();
			if(InputS.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			int result=Integer.parseInt(InputS); //String을 Integer로 변경
				int aa=(result/page);
				
				if(result%page==0)
					aa=result/page;
				System.out.println(aa+" 페이지가 필요합니다.");
				
				
				
		}//while
		System.exit(0);
	}//main
}//class
