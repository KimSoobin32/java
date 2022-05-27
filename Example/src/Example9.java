import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * 응용문제9
		 * A학생에 대한 성적을 입력 받고 평균 점수가 나오는 프로그램 제작
		 * "점수를 입력하세요."라는 문구는 총 5번이 나오게 되며,
		 * 모든 점수는 합산하여 출력
		 * 추가: 모든 점수는 합산 한 후 5개의 점수에 대한 평균값을 출력하셔야 합니다.
		 * 출력 메세지는 "해당 점수의 평점은: " 출력 
		 * 단, 평점 점수가 40점 이하 일 경우 "재시험입니다. "라고 메세지를
		 * 출력후 프로세서는 종료합니다. 40점 이상일 경우 "합격"이라고 메세지를
		 * 출력하십시오.
		 * 
		 * 추가기획
		 * "입력하실 과목 수를 적어주세요: "라고 제일먼저 출력 후
		 * 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용되어야
		 * 합니다.
		 * for문
		 */
//		System.out.println("입력하실 과목 수를 적어주세요: ");
//
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();// 과목 수
//		int f;	//반복
//		int h = 0;	//합
//		int j;	//사용자 입력 점수
//		for(f=1;f<=num;f++) {
//			System.out.println("점수를 입력하세요.");
//			j = sc.nextInt();
//			h = h + j;
//		}
//		System.out.println("총 점수는 "+h+"입니다.");
//				
//		int aver = h/num;
//		System.out.println("해당 점수의 평점은: "+aver);
//		if(aver<=40) {
//			System.out.println("재시험입니다.");
//		}
//		else {System.out.println("합격");}
//		
//		sc.close();
		
		//
		Scanner s = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요.");
		int subject = s.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while(w<=subject) {
			System.out.println("점수 입력");
			user = s.nextInt();
			total += user;
			w++;
		}
		double avg = (double)(total) / subject;
		String msg;
		if(avg<40) {
			msg = "재시험입니다.";
		} else {
			msg = "합격입니다.";
		}
		System.out.println("최종 평균 점수는 "+avg+"점이며, "+msg);
		s.close();
	}

}
