import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choicenum= 0;
		int j=0;
		String[] HQ= {"����Ÿ","ī�Ծ߸�","�Ͻó��","����ġ"};
		String[] choice= {"",""};
		System.out.println("����� �̻����� ���ÿ�");

			for(int i=0;i<4;i=i+2) {
				System.out.println(HQ[i]+"  vs  "+HQ[i+1]);
				choicenum=sc.nextInt();
				if(choicenum==1)
					choice[j]=HQ[i];
				else if(choicenum==2)
					choice[j]=HQ[i+1];
				System.out.println(choice[0]+"����");
				choicenum=0;
				j++;
			}
			
					System.out.println(choice[0]+"  vs  "+choice[1]);
					choicenum=sc.nextInt();
					System.out.println("����� �̻����� "+choice[choicenum-1]+"�Դϴ�");

	}
}
