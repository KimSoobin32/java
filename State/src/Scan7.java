import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 * [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
		 * Q. �������� ��ȣ�� �Է��ϼ���.
		 * 
		 * ���� 220524
		 * 
		 * ����ڰ� ���� 220524 �ܿ� �Է� ��
		 * "������ȣ�� Ʋ���ϴ�." ��� ���
		 * ������ ������ȣ ���ڸ� �Է� �� "����Ȯ�� �Ǽ̽��ϴ�." ��� ���
		 * 
		 * ��, 220524�� java���� �� ���� ���� ����Ǵ� ������ ó��
		 * 
		 */
		
//		int sc = 220524;
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Q. �������� ��ȣ�� �Է��ϼ���.");
//		int num = s.nextInt();
//		s.close();	//Scanner �ݾ��ֱ�
//		if(num == sc) {
//			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
//		} else {
//			System.out.println("������ȣ�� Ʋ���ϴ�.");
//		}
		
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
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		int n1 = s1.nextInt();
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		int n2 = s2.nextInt();
		s1.close();
		s2.close();
		int r = n1 * n2;
		System.out.println(r);
		if(r<=100) {
			System.out.println("100������ ������Դϴ�.");
		} else {
			System.out.println("�ش� ���� 100�̻� ������Դϴ�.");
		}
		
		/* ���빮�� 
		 * ���ǹ� �ڵ带 �ۼ�
		 * ���� �ڽ��� ���忡�� ������ϴ� ���μ����� ����
		 * ���� �⺻�ڻ� �ݾ��� 100000
		 * 
		 * "1�� �Է� �� �Ա�, 2�� �Է� �� ��� �Դϴ�." ��� �޼����� ���� ���� ����
		 * 1���� �Է� �� "�ش� �ݾ��� �Է��ϼ���"
		 * ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ�ݾ��� ���
		 * 
		 * 2���� �Է� �� "����� �ݾ��� �Է��ϼ���."
		 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ� �� �ڻ� �ݾ��� ���
		 * 
		 */
		int m = 100000;
		Scanner i1 = new Scanner(System.in);
		Scanner i2 = new Scanner(System.in);
		System.out.println("1�� �Է� �� �Ա�, 2�� �Է� �� ��� �Դϴ�.");
		byte num = i1.nextByte();
		if(num == 1) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���.");
			int im = i2.nextInt();
			System.out.println(m + im);
		} else if(num == 2) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���.");
			int im = i2.nextInt();
			System.out.println(m - im);
		} else {
			System.out.println("1, 2�� �ƴ�");
		}
		i1.close();
		i2.close();
		
	}

}
