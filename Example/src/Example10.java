import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * ���빮��10
		 * ���� �̿����� ���� ���� ���α׷��� ����
		 * ���� �׸��� ��ü 3�����̸�,
		 * ��� true�� ����Ǿ�߸� ���� ���μ����� ����
		 * ����ڿ��� �����Ǵ� ������ ������ ����.
		 * "�����׸� �����Ͻðڽ��ϱ�?"��� �޼��� ��� ������(1), ���Ǿ���(2)
		 * 
		 * ���� �׸��� �Ѱ����� �������� ���� ���
		 * "��� ���� �ϼž߸� ������ �˴ϴ�."��� ���
		 * ��� ���� �Ͽ��� ���
		 * "ȸ�������� �Ϸ� �Ǿ����ϴ�."��� ���
		 */
//		Scanner s = new Scanner(System.in);
//		int w = 1;
//		int n;
//		int c = 3;
//		while(w <= 3) {
//			System.out.println("�����׸� �����Ͻðڽ��ϱ�?");
//			n = s.nextInt();
//			
//			if(n==1) {
//				c--;
//			} else {
//				break;
//			}
//
//			w++;
//		}
//		if(c==0) {
//			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
//		} 
//		else {
//			System.out.println("��� �����ϼž߸� ������ �˴ϴ�.");
//		}
//		s.close();
		
		Scanner sc = new Scanner(System.in);
		int d = 1;
		int agree;
		boolean all_agree = false;
		do {
			System.out.println("�����׸� �����Ͻðڽ��ϱ�?");
			agree = sc.nextInt();
			
			if(agree==1) {
				all_agree = true;
			}else {
				all_agree = false;
				break;
			}
			d++;
		}while(d<=3);
		if(all_agree==false) {
			System.out.println("��� �����ϼž߸� ������ �˴ϴ�.");
		} else {
			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
		}
		sc.close();
		
	}

}
