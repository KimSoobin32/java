import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ����ڰ� �� 3���� ���ڸ� �Է�
		 * 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ���
		 * 
		 * 123456789 * 123456789 * 123456789
		 */
		Scanner s = new Scanner(System.in);
		int a = 1;
		int n;
		long g = 1;	//long�� �Է� �� ���� ������� - ���� �߻��� (->keep)
		do {
			System.out.println(a+"��° ���ڸ� �Է��ϼ���.");
			n = s.nextInt();
			g = g * n;
			a++;
		}while(a<=3);
		System.out.println("���հ�: "+g);
		s.close();
		
		
	}

}
