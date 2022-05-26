
public class For_plus {

	public static void main(String[] args) {
		/*
		 * 1~10까지 모든 숫자를 합한 결과값을 출력
		 */
		int f;
		int total = 0;
		for(f=1;f<11;f++) {	//total변수값에 반복값을 지속적으로 증가시킴
			//total = total + f;
			total += f;
		}
		System.out.println("총합계: "+total);
		
		//+=(더하기할당기호), -=(빼기할당기호), *=(곱하기할당), /=(나누기할당)
		// b = b - f; -> b -= f;
		
		/*
		 * 응용문제
		 * 전체값은 500이 있습니다.
		 * 총 8회 동안 반복되면서 한번 반복할때마다 12씩 감소하도록 하여 최종 값을 출력
		 * 결과값 404
		 */
		int a;
		int ans = 500;
		int n = 12;
		for(a=1;a<=8;a++) {
			ans = ans - n;
		}
		System.out.println(ans);
		
		/*
		 * 응용문제
		 * 구구단 2단 2*1 ~ 2*9의 총 합계를 출력
		 * 정답 합계 90
		 */
		int b;
		int g = 2;	//단
		int r;	//곱
		int h = 0;	//합
		for(b=1;b<10;b++) {
			r = g * b;
			h = h + r;			
		}
		System.out.println(h);

	}

}
