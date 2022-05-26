
public class If_for2 {

	public static void main(String[] args) {
		//1~100까지 숫자 중 80 이상의 숫자만 출력
		int f;
		for(f=1;f<=100;f++) {
			if(f>=80) {
//				System.out.print(f+" ");
			}
		}
		
		//200~300까지 숫자 중 240 이하의 숫자만 출력
		int ff;
		for(ff=200;ff<=300;ff++) {
			if(ff<=240) {
//				System.out.print(ff+" ");
			}
		}
		
		//3의 배수만 출력
		final int a = 3;
		int w;
		for(w=1;w<11;w++) {
			if(w%a == 0) {
//				System.out.printf("%d ",w);
			}
		}
		
		/*
		 * 응용문제: 구구딘 중 2단을 반복.
		 * 단, 2단 결과값 중 10 보다 큰 숫자만 출력
		 */
		int n;
		final int g = 2;
		int r;
		for(n=1;n<=9;n++) {
			r = g * n;
			if(r>10) {
//				System.out.print(r+" ");
			}		
		}
		
		/*
		 * 응용문제
		 * 다음 결과값을 보고 해당 값이 출력되도록 코드 제작 (9바퀴)
		 * 18 36 54 72
		 */
		int aa;
		final int gg = 9;
		int rr;
		for(aa=1;aa<=9;aa++) {
			if(aa%2==0) {
				rr = gg * aa;
//				System.out.print(rr+" ");
			}			
						
		}
		
		/*
		 * 응용문제
		 * 다음 결과값을 보고 해당 값이 출력되도록 코드 제작, 산술 연선자 x
		 * 1~20 사이의 숫자
		 * 6 14 17 19
		 */
		int n1;
		for(n1=1;n1<=20;n1++) {
			if(n1 == 6 || n1 == 14 || n1 == 17 || n1 == 19) {
				System.out.print(n1+" ");
			}
			
		}
		
		
		
		
	}

}
