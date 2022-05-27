import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 응용문제2
		 * 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며,(몇단)
		 * 구구단 결과를 계산하여 짝수인지 홀수인지를 출력
		 * 
		 * "구구단에 대한 숫자를 입력하세요."라고 메세지가 출력되면
		 * 해당 숫자에 맞춰서 모든 결과를 더하며,
		 * 더한 값에 따라 짝수인지 홀수인지를 출력
		 * 단, 해당 반복문은 for ~ do while까지 한가지를 선택해서 작성
		 * 
		 * 조건문은 반복문 밖에 존재
		 * 반복문 안에는 합구함, 짝수냐 홀수냐를 조건문에서
		 */
		Scanner s = new Scanner(System.in);
		String msg = "구구단에 대한 숫자를 입력하세요.";
		String msg2;	//메세지 구분, 증복 줄이기
		int d = 1;	//반복
		int g;	//단
		int h = 0;	//합
		System.out.println(msg);
		g = s.nextInt();
		s.close();
		do {
			h = h + (g * d);	//h += g*d;
			d++;
		}while(d<=9);
		if(h%2==0) {
//			System.out.println(h+" 결과값은 짝수입니다.");
			msg2 = "짝수";
		} else {
//			System.out.println(h+" 홀수");
			msg2 = "홀수";
		}
		System.out.println("결과값은 " + msg2 + "입니다.");

	}

}
