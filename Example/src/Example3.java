import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * ���빮��3.
		 * ����ڰ� �ش� ���� �Է�
		 * �� ����ڰ� 2���� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ���� �ȿ� �ִ�
		 * ��� ���ڸ� ���ؼ� ������� �������� ����
		 * �� �ش� �ڵ�� do while�� �ۼ�
		 * 
		 * ����)
		 * ù��° ���� ���ڴ�? 5
		 * �ι�° ���� ���ڴ�? 10
		 * ���� ���� ��� �հ�� : 45 �Դϴ�.
		 */
		Scanner s1 = new Scanner(System.in);	//��ĳ�� �ϳ��� �ᵵ ��
		
		System.out.println("ù��° ���� ���ڴ�?");
		int n1 = s1.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int n2 = s1.nextInt();
		
		int d = n1;
		int h = 0;
		do {
			h = h + d;
			d++;
		}while(d<=n2);
		System.out.printf("���� ���� ��� �հ�� : %d �Դϴ�.",h);
		
		s1.close();
		
	}

}
