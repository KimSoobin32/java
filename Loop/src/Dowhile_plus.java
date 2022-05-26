
public class Dowhile_plus {

	public static void main(String[] args) {
		/*
		 * do~while : 30~35까지 합계를 출력
		 */
		int a = 30;
		int h = 0;
		do {
			h = h + a;
			a++;
		}while(a<=35);
		System.out.println(h);
		
		/*
		 * 응용문제 합계숫자 189가 있다. 단 1~10까지 합계치를
		 * 현재 189에서 뺀 총합계를 출력, 결과 134
		 */
//		int b = 1;
//		int n = 189;
//		int h1 = 0;
//		do {
//			h1 = h1 + b;
//			b++;
//		}while(b<11);
//		System.out.println(n - h1);
		
		int ww = 1;
		int total = 189;
		do {
			total -= ww;	//total = total - ww;
			ww++;
		}while(ww<=10);
		System.out.println("결과값: "+total);

	}

}
