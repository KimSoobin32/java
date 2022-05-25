
public class App {

	public static void main(String[] args) {
		/* 합계 계산 공식 중 작은 값을 출력하시오.*/
		int r1 = 25 + 31 * 4 + 12;
		int r2 = 15 * 3 + 9 + 14;
		
		if(r1 < r2) {
			System.out.println("공식1번 값이 작습니다.");
			System.out.println(r1);
		} else if(r2 < r1) {
			System.out.println("공식2번 값이 작습니다.");
			System.out.println(r2);
		} else {
			System.out.println("두 값이 같습니다.");
		}
		
		/* 해당 값을 2진수로 짝수, 홀수로 확인하기 */
		int c = r2 % 2;	//%기호로 사용 시 0 또는 1로 나머지 값이 출력됩니다.
		System.out.println(c);
		if(c == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다");
		}

	}

}
