import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�.
		 * Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���.
		 * ������� : ¦��, Ȧ�� ���Դϴ�. ��� ���
		 */
		
		Scanner a = new Scanner(System.in);
		System.out.println("Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���.");
		int num = a.nextInt();
		a.close();
		//%�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if(num % 2 == 0) {
			System.out.println("¦�� ���Դϴ�.");
		} else {
			System.out.println("Ȧ�� ���Դϴ�.");
		}

	}

}
