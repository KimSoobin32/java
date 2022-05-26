import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 사용자가 총 3번의 숫자를 입력
		 * 3개 숫자를 모두 곱하여 총 합계 수를 출력
		 * 
		 * 123456789 * 123456789 * 123456789
		 */
		Scanner s = new Scanner(System.in);
		int a = 1;
		int n;
		long g = 1;	//long을 입력 시 최종 결과에서 - 음수 발생함 (->keep)
		do {
			System.out.println(a+"번째 숫자를 입력하세요.");
			n = s.nextInt();
			g = g * n;
			a++;
		}while(a<=3);
		System.out.println("총합계: "+g);
		s.close();
		
		
	}

}
