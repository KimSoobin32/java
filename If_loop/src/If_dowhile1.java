
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * 응용문제: 구구단 6단 중에서 35이상 결과 숫자만 출력
		 */
		int a = 1;
		int g = 6;
		int r;
		do {
			r = g * a;
			if(r>=35) {
//				System.out.printf("%d ",r);
			}		
			a++;
		}while(a<=9);
		
		/*
		 * 응용문제
		 * 14~27까지 숫자 중 짝수 값만 모두 더하여
		 * 최종 결과값을 출력, 결과: 140
		 */
		int b = 14;
		int h = 0;
		do {
			if(b%2==0) {
				h = h + b;
			}			
			b++;
		}while(b<=27);
		System.out.println(h);
	}

}
