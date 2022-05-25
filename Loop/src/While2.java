
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		while(a<10) {
			c = b * a;	//산술연산
//			System.out.print(c+",");
			a++;	//증가감소 위치 중요 , 위치에 따라 값 달라짐
		}
		
		/*
		 * 응용문제
		 * 해당 결과값을 확인하여 반복문으로 코드를 작성
		 * 56,49,42,35,28,21,
		 */

		int n1 = 8;
		int n2 = 7;
		int n3;
		while(n1>=3) {
			n3 = n1 * n2;
			System.out.print(n3+",");
			n1--;
		}
		
		System.out.println("");
//		
//		int aa = 0;
//		int bb = 7;
//		int cc;
//		while(aa<6) {
//			cc = 56 - bb * aa;
//			System.out.print(cc+",");
//			aa++;
//		}
		
		/*
		 * 응용문제2.
		 * 다음 결과 값을 확인 하신 후 해당 결과값에 맞는 코드를 작성
		 * 4,7,10,13,16,19,22,
		 * 
		 */
		int dd = 0;
		int ee = 3;
		int ans;
		while(dd<=6) {
			ans = 4 + ee * dd;
			System.out.print(ans+",");
			dd++;
		}
				

		
	}

}
