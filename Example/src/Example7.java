import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * ���빮��7
		 * ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ��� ����
		 * "ù��° �Է°� (��, 1~10�����Դϴ�.): " 
		 * "�ι�° �Է°� (��, 1~10�����Դϴ�.): "
		 * "����° �Է°� (��, 1~10�����Դϴ�.): " 
		 * "������ �����Դϴ�. �ش� ������ ���� ���� ��� ��ȣ�� �����ÿ�." +,-,*,/
		 * 
		 * �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ���
		 * (�ݺ���), ���ǹ�
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° �Է°� (��, 1~10�����Դϴ�.): ");
		int n1 = s.nextInt();
		System.out.println("�ι�° �Է°� (��, 1~10�����Դϴ�.): ");
		int n2 = s.nextInt();
		System.out.println("����° �Է°� (��, 1~10�����Դϴ�.): ");
		int n3 = s.nextInt();
		System.out.println("������ �����Դϴ�. �ش� ������ ���� ���� ��� ��ȣ�� �����ÿ�.");
		String a = s.next();
		
		
		if(a.equals("+")) {	//String �� �� equals ����! (== �Ұ�)
			System.out.println(n1+n2+n3);
		} else if(a.equals("-")) {
			System.out.println(n1-n2-n3);
		} else if(a.equals("*")) {
			System.out.println(n1*n2*n3);
		} else {
			System.out.println(n1/n2/n3);	//�Ҽ������� ��Ÿ������� ��� double ���
		}
		s.close();
		

	}

}
