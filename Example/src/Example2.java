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
		String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���.";
		String msg2;	//�޼��� ����, ���� ���̱�
		int d = 1;	//�ݺ�
		int g;	//��
		int h = 0;	//��
		System.out.println(msg);
		g = s.nextInt();
		s.close();
		do {
			h = h + (g * d);	//h += g*d;
			d++;
		}while(d<=9);
		if(h%2==0) {
//			System.out.println(h+" ������� ¦���Դϴ�.");
			msg2 = "¦��";
		} else {
//			System.out.println(h+" Ȧ��");
			msg2 = "Ȧ��";
		}
		System.out.println("������� " + msg2 + "�Դϴ�.");

	}

}
