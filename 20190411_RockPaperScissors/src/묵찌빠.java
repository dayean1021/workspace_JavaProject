	import java.util.*;
public class ����� {
	//��������������


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("<<���������� ����>>");
			
			while(true) {
				System.out.println("1.����  2.����  3.��  0.��");
				System.out.print("��ȣ�� �Է��ϼ��� -> ");
				int p=sc.nextInt();
				
				if (p==0) {
					System.out.println("���α׷��� �����մϴ�..."); 
					System.exit(0);
				}
				int c=makeconputer();
				int result=compare(p,c);
				
				System.out.println("���� �����...");
				System.out.println("�α��α��α�....");
				switch(result) {
				case -1: //��ǻ�Ͱ� �̱�
					c=makeconputer();
					System.out.println("��ǻ�Ͱ� �̰���ϴ� �ٽ�");
					break;
				case 0:
					System.out.println("�����ϴ�");
					break;
				case 1:
					System.out.println("!!!�̰���ϴ�!!!");
					break;
				}
			}
			
		}

		//��ǻ�Ϳ� ������� ���� ���ؼ� ������� ����
		private static int compare(int p, int c) {
			int result=0;
			
			if(p==c) {
				result=0;
			} else if((p==1&&c==3)||(p==2&&c==1)||(p==3&&c==2)) {
				result=1;
			} else {
				result=-1;
			}
			//-1����ڰ� ��, 0 ���, 1����ڰ� �̱�
			
			return result;
		}

		//��ǻ�Ͱ� ���� ���� �������� ����
		private static int makeconputer() { 
			Random random=new Random();
			int c=random.nextInt(3-1+1)+1;
			return c;
		}

	}
