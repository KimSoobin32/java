import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 응용문제3.
		 * 사용자가 해당 값을 입력
		 * 단 사용자가 2개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자 범위 안에 있는
		 * 모든 숫자를 더해서 결과값이 나오도록 제작
		 * 단 해당 코드는 do while로 작성
		 * 
		 * 예시)
		 * 첫번째 범위 숫자는? 5
		 * 두번째 범위 숫자는? 10
		 * 범위 숫자 모든 합계는 : 45 입니다.
		 */
		Scanner s1 = new Scanner(System.in);	//스캐너 하나만 써도 됨
		
		System.out.println("첫번째 범위 숫자는?");
		int n1 = s1.nextInt();
		System.out.println("두번째 범위 숫자는?");
		int n2 = s1.nextInt();
		
		int d = n1;
		int h = 0;
		do {
			h = h + d;
			d++;
		}while(d<=n2);
		System.out.printf("범위 숫자 모든 합계는 : %d 입니다.",h);
		
		s1.close();
		
	}

}
