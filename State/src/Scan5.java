import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		byte a = 10;
//		if(a < 30) {
//			System.out.println("�Է��� ���� 30���� �Դϴ�.");
//		} else if(a < 60) {
//			System.out.println("�Է��� ���� 60���� �Դϴ�.");
//		} else {
//			System.out.println("���� ���� �����Դϴ�.");
//		}
		
		if (a < 10) {
			System.out.println("10 �̻� ���ڸ� �Է��ϼ���");
		} else if (a >= 10 || a <= 22) {	//���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷ �Դϴ�.");
		} else {
			System.out.println("���� ���� �����Դϴ�.");
		}
		
		/* ���빮��
		 * 
		 *  Q. 1~45���� ���� �ϳ��� �Է��ϼ���.
		 *  error ����
		 *  0�� �Է� : ���� �Է��� �߸��Ǿ����ϴ�.
		 *  45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 *  
		 *  1~45���ڸ� �Է��Ͽ��� ���
		 *  7,12,14 ������ ���ڰ� �Է� �� ��÷�Դϴ�. ��� ���
		 *  �� �ܿ� ���� �� ���� ��ȸ�� �����ϼ���. ��� ���
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���.");
		int num = s.nextInt();
		s.close();
//		bad		
//		if(num == 0) {
//			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
//		} else if(num >= 1 && num <= 45) {
//			//System.out.println("���� ���� �����Դϴ�.");
//			if(num == 7 || num == 12 || num == 14) {
//				System.out.println("��÷�Դϴ�.");
//			} else {
//				System.out.println("���� ��ȸ�� �����ϼ���.");
//			}
//		} else if(num > 45) {
//			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
//		}
		
		/*
		 * ���� ������ else�� ����
		 */		
		if(num == 0) {
			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");			
		} else if(num > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		} else {
			if(num == 7 || num == 12 || num == 14) {
				System.out.println("20% ���� ��÷�Դϴ�.");
			} else if(num == 41) {
				System.out.println("50% ���� ��÷�Դϴ�.");
			} else {
				System.out.println("���� ��ȸ�� �����ϼ���.");
			}
		}
 
	}

}