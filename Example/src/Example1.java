import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * while문으로 코드 작성해야하며, 프로세서는 다음과 같다.
		 * 사용자가 상품을 전체 선택하였다.질문은
		 * "7000 결제하시겠습니까?"라고 출력되며, 숫자 1이라고 입력하면
		 * 최종결제 금액에 추가 되어집니다. 단, 2라고 입력 시
		 * 최종결제 금액에 추가 되어지면 안됨.
		 * 
		 * 총 질문 횟수는 4번
		 * 마지막에 최종 결제 금액이 나오도록 코드 작성
		 */
		Scanner s = new Scanner(System.in);
		final int p = 7000;
		int w = 1;
		int n;
		int m = 0;
		while(w<=4) {
			System.out.println("7000 결제하시겠습니까?");
			n = s.nextInt();
			if(n==1) {
				m = m + p;
			}
			w++;
		}
		System.out.println("최종금액은: "+m);
		s.close();
		
		
	}

}
