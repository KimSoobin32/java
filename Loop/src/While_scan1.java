import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*
		 * 응용문제: 총 2번의 질문을 하게 됨
		 * 사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner 제작
		 */
		Scanner s = new Scanner(System.in);
		int a = 1;
		int n;
		int h = 0;
		while(a<=2) {
			System.out.println(a+"번째 숫자를 입력하세요.");
			n = s.nextInt();
			h = h + n;
			a++;
		}
		System.out.println("총 합계 수는 "+h);
		s.close();

	}

}
