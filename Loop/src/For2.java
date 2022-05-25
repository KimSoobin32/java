
public class For2 {

	public static void main(String[] args) {
		int a;	//for문 초기값
		int b = 2;	//연산에 사용할 변수
		int c;	//연산한 결과값 사용
		for(a=1; a<=9; a++) {
			c = b * a;	//산술연산 작업
			System.out.print(c+",");	//연산된 결과값을 출력
			
		}
		System.out.println();
		/* 응용문제 
		 * 다음 결과값을 보고 코드를 작성
		 * 45,40,35,30,25,20,
		 * 
		 */
		int d;	//for 변수값
		int e = 5;	//5배수값
		int f;	//계산값
		for(d=9; d>=4; d--) {
			f = d * e;
			System.out.print(f+",");
		}
		System.out.println();
		
//		int n1;
//		int n2 = 5;
//		int ans;
//		for(n1=0; n1<=5; n1++) {
//			ans = 45 - n2 * n1;
//			System.out.print(ans+",");
//		}
		
		/* 응용문제 
		 * 다음 결과값을 확인 후 코드를 제작하여 출력
		 * 
		 * 11,22,33,44,55,66,77,88,99,
		 * 
		 */
		int g;
		int h = 11;
		int i;
		for(g=1; g<=9; g++) {
			i = g * h;
			System.out.print(i+",");
		}
		System.out.println();
		
		//방법2
		int z;	//for
		int x;	//결과값
		for(z=1;z<10;z++) {
			x = (10 * z) + z;
			System.out.print(x+",");
		}

	}

}
