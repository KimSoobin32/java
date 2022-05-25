import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		byte a = 10;
//		if(a < 30) {
//			System.out.println("입력한 값은 30이하 입니다.");
//		} else if(a < 60) {
//			System.out.println("입력한 값은 60이하 입니다.");
//		} else {
//			System.out.println("범위 밖의 숫자입니다.");
//		}
		
		if (a < 10) {
			System.out.println("10 이상 숫자를 입력하세요");
		} else if (a >= 10 || a <= 22) {	//조건문에 범위를 설정하여 적용함
			System.out.println("당첨 입니다.");
		} else {
			System.out.println("범위 밖의 숫자입니다.");
		}
		
		/* 응용문제
		 * 
		 *  Q. 1~45까지 숫자 하나를 입력하세요.
		 *  error 문구
		 *  0을 입력 : 숫자 입력이 잘못되었습니다.
		 *  45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
		 *  
		 *  1~45숫자를 입력하였을 경우
		 *  7,12,14 세가지 숫자가 입력 시 당첨입니다. 라고 출력
		 *  그 외에 숫자 시 다음 기회에 참여하세요. 라고 출력
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요.");
		int num = s.nextInt();
		s.close();
//		bad		
//		if(num == 0) {
//			System.out.println("숫자 입력이 잘못되었습니다.");
//		} else if(num >= 1 && num <= 45) {
//			//System.out.println("범위 안의 슷지입니다.");
//			if(num == 7 || num == 12 || num == 14) {
//				System.out.println("당첨입니다.");
//			} else {
//				System.out.println("다음 기회에 참여하세요.");
//			}
//		} else if(num > 45) {
//			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
//		}
		
		/*
		 * 수정 쉽도록 else로 빼자
		 */		
		if(num == 0) {
			System.out.println("숫자 입력이 잘못되었습니다.");			
		} else if(num > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		} else {
			if(num == 7 || num == 12 || num == 14) {
				System.out.println("20% 쿠폰 당첨입니다.");
			} else if(num == 41) {
				System.out.println("50% 쿠폰 당첨입니다.");
			} else {
				System.out.println("다음 기회에 참여하세요.");
			}
		}
 
	}

}
