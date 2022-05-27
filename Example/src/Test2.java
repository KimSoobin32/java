import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		/* 응용문제 
		 * 조건문 코드를 작성
		 * 고객이 자신의 통장에서 입출금하는 프로세서를 제작
		 * 고객의 기본자산 금액은 100000
		 * 
		 * "1번 입력 시 입금, 2번 입력 시 출금 입니다." 라는 메세지가 제일 먼저 실행
		 * 1번을 입력 시 "해당 금액을 입력하세요"
		 * 사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산금액을 출력
		 * 
		 * 2번을 입력 시 "출금할 금액을 입력하세요."
		 * 사용자가 입력한 금액 - 기본 자산금액을 계산하여 총 자산 금액을 출력
		 * 
		 */
		int m = 100000;
		Scanner i1 = new Scanner(System.in);	//종류
		Scanner i2 = new Scanner(System.in);	//금액
		System.out.println("1번 입력 시 입금, 2번 입력 시 출금 입니다.");
		byte num = i1.nextByte();
		int im;
		if(num == 1) {
			System.out.println("해당 금액을 입력하세요.");
			im = i2.nextInt();
			//System.out.println(m + im);
			m = m + im;
		} else if(num == 2) {
			System.out.println("출금할 금액을 입력하세요.");
			im = i2.nextInt();
//			System.out.println(m - im);
			m = m - im;
		} else {
			System.out.println("정상적인 코드가 아닙니다.");
			i2.close();
		}
		System.out.println(m);
		i1.close();
		i2.close();

	}

}
