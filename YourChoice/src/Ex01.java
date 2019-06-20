import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choicenum= 0;
		int j=0;
		String[] HQ= {"히나타","카게야마","니시노야","다이치"};
		String[] choice= {"",""};
		System.out.println("당신의 이상형을 고르시오");

			for(int i=0;i<4;i=i+2) {
				System.out.println(HQ[i]+"  vs  "+HQ[i+1]);
				choicenum=sc.nextInt();
				if(choicenum==1)
					choice[j]=HQ[i];
				else if(choicenum==2)
					choice[j]=HQ[i+1];
				System.out.println(choice[0]+"선택");
				choicenum=0;
				j++;
			}
			
					System.out.println(choice[0]+"  vs  "+choice[1]);
					choicenum=sc.nextInt();
					System.out.println("당신의 이상형은 "+choice[choicenum-1]+"입니다");

	}
}
