import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * while������ �ڵ� �ۼ��ؾ��ϸ�, ���μ����� ������ ����.
		 * ����ڰ� ��ǰ�� ��ü �����Ͽ���.������
		 * "7000 �����Ͻðڽ��ϱ�?"��� ��µǸ�, ���� 1�̶�� �Է��ϸ�
		 * �������� �ݾ׿� �߰� �Ǿ����ϴ�. ��, 2��� �Է� ��
		 * �������� �ݾ׿� �߰� �Ǿ����� �ȵ�.
		 * 
		 * �� ���� Ƚ���� 4��
		 * �������� ���� ���� �ݾ��� �������� �ڵ� �ۼ�
		 */
		Scanner s = new Scanner(System.in);
		final int p = 7000;
		int w = 1;
		int n;
		int m = 0;
		while(w<=4) {
			System.out.println("7000 �����Ͻðڽ��ϱ�?");
			n = s.nextInt();
			if(n==1) {
				m = m + p;
			}
			w++;
		}
		System.out.println("�����ݾ���: "+m);
		s.close();
		
		
	}

}
