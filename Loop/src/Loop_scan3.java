import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/*
		 * Scanner와 함께 do~while문으로 사용자가 입력하는 값으로
		 * 구구단 결과가 출력되는 프로그램 제작
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력하세요.");
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
