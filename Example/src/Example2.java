import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * ���빮��2
		 * ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,(���)
		 * ������ ����� ����Ͽ� ¦������ Ȧ�������� ���
		 * 
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���."��� �޼����� ��µǸ�
		 * �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		 * ���� ���� ���� ¦������ Ȧ�������� ���
		 * ��, �ش� �ݺ����� for ~ do while���� �Ѱ����� �����ؼ� �ۼ�
		 * 
		 * ���ǹ��� �ݺ��� �ۿ� ����
		 * �ݺ��� �ȿ��� �ձ���, ¦���� Ȧ���ĸ� ���ǹ�����
		 */
		Scanner s = new Scanner(System.in);
		int d = 1;
		int g;
		int h = 0;
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���.");
		g = s.nextInt();
		s.close();
		do {
			h = h + (g * d);
			d++;
		}while(d<=9);
		if(h%2==0) {
			System.out.println(h+" ¦��");
		} else {
			System.out.println(h+" Ȧ��");
		}
		

	}

}
