import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * ���빮��9
		 * A�л��� ���� ������ �Է� �ް� ��� ������ ������ ���α׷� ����
		 * "������ �Է��ϼ���."��� ������ �� 5���� ������ �Ǹ�,
		 * ��� ������ �ջ��Ͽ� ���
		 * �߰�: ��� ������ �ջ� �� �� 5���� ������ ���� ��հ��� ����ϼž� �մϴ�.
		 * ��� �޼����� "�ش� ������ ������: " ��� 
		 * ��, ���� ������ 40�� ���� �� ��� "������Դϴ�. "��� �޼�����
		 * ����� ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�"�̶�� �޼�����
		 * ����Ͻʽÿ�.
		 * 
		 * �߰���ȹ
		 * "�Է��Ͻ� ���� ���� �����ּ���: "��� ���ϸ��� ��� ��
		 * �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ����Ǿ��
		 * �մϴ�.
		 * for��
		 */
//		System.out.println("�Է��Ͻ� ���� ���� �����ּ���: ");
//
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();// ���� ��
//		int f;	//�ݺ�
//		int h = 0;	//��
//		int j;	//����� �Է� ����
//		for(f=1;f<=num;f++) {
//			System.out.println("������ �Է��ϼ���.");
//			j = sc.nextInt();
//			h = h + j;
//		}
//		System.out.println("�� ������ "+h+"�Դϴ�.");
//				
//		int aver = h/num;
//		System.out.println("�ش� ������ ������: "+aver);
//		if(aver<=40) {
//			System.out.println("������Դϴ�.");
//		}
//		else {System.out.println("�հ�");}
//		
//		sc.close();
		
		//
		Scanner s = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
		int subject = s.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while(w<=subject) {
			System.out.println("���� �Է�");
			user = s.nextInt();
			total += user;
			w++;
		}
		double avg = (double)(total) / subject;
		String msg;
		if(avg<40) {
			msg = "������Դϴ�.";
		} else {
			msg = "�հ��Դϴ�.";
		}
		System.out.println("���� ��� ������ "+avg+"���̸�, "+msg);
		s.close();
	}

}
