import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		//연습
		//1~100 모두 더하는 for 반복문
		int a;
		int h = 0;
		for(a=1;a<=100;a++) {
			h = h + a;
		}
//		System.out.printf("%d ", h);
		
		/*
		 * 1~100까지 곱한 결과값
		 */
		int f;
		//BigInteger : java에서 모든 무한의 값을 저장할 수 있는 유일한 자료형 (범위 무한대)
		BigInteger aa = new BigInteger("1");	//합계에 사용할 자료형 변수. 1을 최초값으로 설정. 단 ""를 무조건 적용해야 함
		for(f=1;f<=100;f++) {
			/* multiply : 사칙연산 곱하기를 담당
			 * add : 사칙연산 더하기를 담당
			 * substract : 사칙연산 빼기를 담당
			 * divide : 사칙연산 나누기를 담당
			 */
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
		

	}

	
}
