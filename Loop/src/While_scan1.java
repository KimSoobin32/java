import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮��: �� 2���� ������ �ϰ� ��
		 * ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner ����
		 */
		Scanner s = new Scanner(System.in);
		int a = 1;
		int n;
		int h = 0;
		while(a<=2) {
			System.out.println(a+"��° ���ڸ� �Է��ϼ���.");
			n = s.nextInt();
			h = h + n;
			a++;
		}
		System.out.println("�� �հ� ���� "+h);
		s.close();

	}

}
