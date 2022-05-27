import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
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
		
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		System.out.println("첫번째 숫자값을 입력하세요.");
//		int n1 = s1.nextInt();
//		System.out.println("두번째 숫자값을 입력하세요.");
//		int n2 = s2.nextInt();
//		s1.close();
//		s2.close();
//		int r = n1 * n2;
//		System.out.println(r);
//		if(r<=100) {
//			System.out.println("100이하의 결과값입니다.");
//		} else {
//			System.out.println("해당 값은 100이상 결과값입니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int user1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 숫자");
		int user2 = sc.nextInt();
		
		int user3 = user1 * user2;
		if(user3<100) {
			System.out.println("100이하");
		} else {
			System.out.println("100이상");
		}
		sc.close();
		sc2.close();
		

	}

}
