
public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제6
		 * 1~10까지 순차적으로 적용하는 반복문
		 * 단, 1~5까지는 모든 값을 곱하고, 6~10까지는 모든 값을 더함
		 * 해당 두개의 값을 비교하여 더한 값이 큰지, 곱한값이 큰지를
		 * 결과로 출력
		 */
		
		int a = 1;
		int h = 0;	//더할것
		int g = 1;	//곱할것
		while(a<=10) {
			if(a<=5) {
				g = g * a;				
			}else {
				h = h + a;
			}
			a++;
		}
		System.out.println("곱: "+g);
		System.out.println("합: "+h);
		if(g>h) {
			System.out.println("곱한값이 크다.");
		} else if(g<h) {
			System.out.println("더한값이 크다.");
		} else {
			System.out.println("두 비교값이 같다.");
		}
		
	}

}
