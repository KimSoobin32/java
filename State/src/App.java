
public class App {

	public static void main(String[] args) {
		/* �հ� ��� ���� �� ���� ���� ����Ͻÿ�.*/
		int r1 = 25 + 31 * 4 + 12;
		int r2 = 15 * 3 + 9 + 14;
		
		if(r1 < r2) {
			System.out.println("����1�� ���� �۽��ϴ�.");
			System.out.println(r1);
		} else if(r2 < r1) {
			System.out.println("����2�� ���� �۽��ϴ�.");
			System.out.println(r2);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		/* �ش� ���� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
		int c = r2 % 2;	//%��ȣ�� ��� �� 0 �Ǵ� 1�� ������ ���� ��µ˴ϴ�.
		System.out.println(c);
		if(c == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}

	}

}
