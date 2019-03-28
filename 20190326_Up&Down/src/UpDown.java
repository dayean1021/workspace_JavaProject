import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			int com_num=(int)(Math.random()*100);
			System.out.println("<<UP & DOWN GAME>>");
			
			while(true) {
				System.out.print("컴퓨터가 생각한 숫자를 입력하세요 : ");
				int uesr_Num=sc.nextInt();
				
				if (uesr_Num>com_num) {
					System.out.println("DOWN");
				}
				else if(uesr_Num<com_num) {
					System.out.println("UP");
				}
				else if(uesr_Num==com_num) {
					System.out.println("짝짝 ~정답입니다~ 짝짝");
					break;
				}
			}
			
	

	}
}
