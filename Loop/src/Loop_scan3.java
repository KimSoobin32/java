import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/*
		 * Scanner�� �Բ� do~while������ ����ڰ� �Է��ϴ� ������
		 * ������ ����� ��µǴ� ���α׷� ����
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int n = s.nextInt();
		s.close();
		int a = 1;
		int ans;
		do {
			ans = n * a;
			System.out.printf("%d ",ans);
			a++;
		}while(a<10);
		
	}

}
