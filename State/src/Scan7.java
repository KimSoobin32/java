import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 * [인증번호 발송에 대한 번호 비교 코드]
		 * Q. 인증받은 번호를 입력하세요.
		 * 
		 * 숫자 220524
		 * 
		 * 사용자가 숫자 220524 외에 입력 시
		 * "인증번호가 틀립니다." 라고 출력
		 * 동일한 인증번호 숫자를 입력 시 "인증확인 되셨습니다." 라고 출력
		 * 
		 * 단, 220524는 java실행 시 가장 먼저 실행되는 변수로 처리
		 * 
		 */
		
//		int sc = 220524;
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Q. 인증받은 번호를 입력하세요.");
//		int num = s.nextInt();
//		s.close();	//Scanner 닫아주기
//		if(num == sc) {
//			System.out.println("인증확인 되셨습니다.");
//		} else {
//			System.out.println("인증번호가 틀립니다.");
//		}
		
		/* 응용문제 
		 * 
		 * 사용자가 입력하여 조건에 맞는 메세지를 출력
		 * 
		 * 첫번째 숫자값을 입력하세요.
		 * 두번째 숫자값을 입력하세요.
		 * 
		 * 첫번째 숫자값 * 두번째 숫자값에 대한 결과를 출력
		 * 단, 해당 결과값이 100 이하일 경우
		 * 출력메세지 "100이하의 결과값입니다."라고 설정
		 * 100이상일 경우 "해당 값은 100이상 결과값입니다." 라고 출력
		 * 
		 */
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		int n1 = s1.nextInt();
		System.out.println("두번째 숫자값을 입력하세요.");
		int n2 = s2.nextInt();
		s1.close();
		s2.close();
		int r = n1 * n2;
		System.out.println(r);
		if(r<=100) {
			System.out.println("100이하의 결과값입니다.");
		} else {
			System.out.println("해당 값은 100이상 결과값입니다.");
		}
		
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
		Scanner i1 = new Scanner(System.in);
		Scanner i2 = new Scanner(System.in);
		System.out.println("1번 입력 시 입금, 2번 입력 시 출금 입니다.");
		byte num = i1.nextByte();
		if(num == 1) {
			System.out.println("해당 금액을 입력하세요.");
			int im = i2.nextInt();
			System.out.println(m + im);
		} else if(num == 2) {
			System.out.println("해당 금액을 입력하세요.");
			int im = i2.nextInt();
			System.out.println(m - im);
		} else {
			System.out.println("1, 2가 아님");
		}
		i1.close();
		i2.close();
		
	}

}
