import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * ���빮��8
		 * ����� �н������ a1234
		 * ����ڰ� �н����带 �Է�
		 * ��, 3ȸ �̻� ���н� ������ ���� ���
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
		 * ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ���
		 */
//		Scanner s = new Scanner(System.in);		
//		String p;		
//		int c = 1;		
//		while(c<=3) {
//			System.out.println("�н����带 �Է��ϼ���.");
//			p = s.next();
//			if(p.equals("a1234")) {
//				System.out.println("�α��� �Ǿ����ϴ�.");
//				break;
//			} else if(c>=3){
//				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
//			} else {
//				System.out.println("����");
//			}
//			c++;
//		}		
//		s.close();
		
		final String pw = "a1234";
		int cnt = 3;
		Scanner sc = new Scanner(System.in);
		int w = 0;
		String msg = "�н����带 �Է��ϼ���.";
		while(w<3) {
			System.out.println(msg);
			String user_pw = sc.next();
			if(pw.equals(user_pw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			} else {
				msg = "�ùٸ� �н����带 �־��ּ���.";
				cnt--;
				if(cnt==0) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}				
			}			
			w++;
		}
		sc.close();

		
		
	}

}
