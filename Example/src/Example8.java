import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * 응용문제8
		 * 사용자 패스워드는 a1234
		 * 사용자가 패스워드를 입력
		 * 단, 3회 이상 실패시 다음과 같이 출력
		 * "패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다."
		 * 단, 패스워드가 맞을 경우 "로그인 되었습니다." 라고 출력
		 */
//		Scanner s = new Scanner(System.in);		
//		String p;		
//		int c = 1;		
//		while(c<=3) {
//			System.out.println("패스워드를 입력하세요.");
//			p = s.next();
//			if(p.equals("a1234")) {
//				System.out.println("로그인 되었습니다.");
//				break;
//			} else if(c>=3){
//				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
//			} else {
//				System.out.println("실패");
//			}
//			c++;
//		}		
//		s.close();
		
		final String pw = "a1234";
		int cnt = 3;
		Scanner sc = new Scanner(System.in);
		int w = 0;
		String msg = "패스워드를 입력하세요.";
		while(w<3) {
			System.out.println(msg);
			String user_pw = sc.next();
			if(pw.equals(user_pw)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				msg = "올바른 패스워드를 넣어주세요.";
				cnt--;
				if(cnt==0) {
					System.out.println("패스워드 횟수 제산으로 가까운 지점에 방문하셔야 합니다.");
				}				
			}			
			w++;
		}
		sc.close();

		
		
	}

}
