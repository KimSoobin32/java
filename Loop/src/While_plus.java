
public class While_plus {

	public static void main(String[] args) {
		/*
		 * 5~10까지 더한 합계 수를 출력
		 */
		int w = 5;	//초기값
		int total = 0;	//합계치를 누적시키기 위한 변수값
		while(w<11) {	//+=, -=, *=, /=, %=
			//total = total + w;
			total += w;
			w++;
		}
		System.out.println("합계: "+total);
		
		/*
		 * 응용문제 : 3~8까지 곱한 수를 출력
		 */
		int n = 3;
		int r = 1;	//곱하기이기때문에 0쓰면 안됨, 곱하기 합계를 설정 시 1 기본값으로 설정
		
		while(n<=8) {
			r = r * n;
			n++;
		}
		System.out.println(r);

	}

}
