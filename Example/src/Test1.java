import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/* ���빮�� 
		 * 
		 * ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ���
		 * 
		 * ù��° ���ڰ��� �Է��ϼ���.
		 * �ι�° ���ڰ��� �Է��ϼ���.
		 * 
		 * ù��° ���ڰ� * �ι�° ���ڰ��� ���� ����� ���
		 * ��, �ش� ������� 100 ������ ���
		 * ��¸޼��� "100������ ������Դϴ�."��� ����
		 * 100�̻��� ��� "�ش� ���� 100�̻� ������Դϴ�." ��� ���
		 * 
		 */
		
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
//		int n1 = s1.nextInt();
//		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
//		int n2 = s2.nextInt();
//		s1.close();
//		s2.close();
//		int r = n1 * n2;
//		System.out.println(r);
//		if(r<=100) {
//			System.out.println("100������ ������Դϴ�.");
//		} else {
//			System.out.println("�ش� ���� 100�̻� ������Դϴ�.");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ����");
		int user1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�ι�° ����");
		int user2 = sc.nextInt();
		
		int user3 = user1 * user2;
		if(user3<100) {
			System.out.println("100����");
		} else {
			System.out.println("100�̻�");
		}
		sc.close();
		sc2.close();
		

	}

}
