import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/*
		 * Scanner�� �԰� while������ ����ڰ� �Է��ϴ� ������
		 * ������ ����� ��µǴ� ���α׷� ����
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int n = s.nextInt();
		int a = 1;
		int ans;
		while(a<=9){
			ans = a * n;
			System.out.print(ans+" ");
			a++;
		}
		s.close();
	}

}
