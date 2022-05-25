
public class Datatype {

	public static void main(String[] args) {
		// String : 문자 "" 무조건 사용
		String a = "1234";
		System.out.println(a);
		
		byte b = 127; // byte : -128 ~ 127
		System.out.println(b);

		short c = 31000; // short : -32,768 ~ 32,767
		System.out.println(c);

		int d = 21474; // int : -2,147,483,648 ~ 2,147,483,64
		System.out.println(d);

		long e = 9999999; // long 사용시 끝에 L 사용해야함.
		// long : 9,000,..18개(9경) 기본메모리 할당에서 추가적용시 기능범위 증가.
		System.out.println(e);
	    /* 정수형 끝 */
		
		/* 실수형 */
	    float f = 3.5f; // 3.21342134+38 / 숫자 뒤에 f를 무조건 사용 해야함.
	    System.out.println(f);
	    
	 	double g = 44.5178d; // 1.784+308 / 원래 숫자 뒤에 d를 넣어야 하지만 지금은 안 넣어도 됨. 
	    System.out.println(g);
		/* 실수형 끝 */
	    
		
	}

}