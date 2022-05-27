import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * 응용문제7
		 * 사용자가 다음 질문을 확인하여 값을 입력 후 해당 결과를 돌출하는 프로세서 제작
		 * "첫번째 입력값 (단, 1~10까지입니다.): " 
		 * "두번째 입력값 (단, 1~10까지입니다.): "
		 * "세번째 입력값 (단, 1~10까지입니다.): " 
		 * "마지막 질문입니다. 해당 세가지 값에 대한 산술 기호를 적으시오." +,-,*,/
		 * 
		 * 해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력
		 * (반복문), 조건문
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 입력값 (단, 1~10까지입니다.): ");
		int n1 = s.nextInt();
		System.out.println("두번째 입력값 (단, 1~10까지입니다.): ");
		int n2 = s.nextInt();
		System.out.println("세번째 입력값 (단, 1~10까지입니다.): ");
		int n3 = s.nextInt();
		System.out.println("마지막 질문입니다. 해당 세가지 값에 대한 산술 기호를 적으시오.");
		String a = s.next();
		
		
		if(a.equals("+")) {	//String 비교 시 equals 주의! (== 불가)
			System.out.println(n1+n2+n3);
		} else if(a.equals("-")) {
			System.out.println(n1-n2-n3);
		} else if(a.equals("*")) {
			System.out.println(n1*n2*n3);
		} else {
			System.out.println(n1/n2/n3);	//소수점까지 나타내고싶을 경우 double 사용
		}
		s.close();
		

	}

}
