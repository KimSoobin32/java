
public class If3 {

	public static void main(String[] args) {
		
		//boolean : true, false로 구분
		boolean ck = false;
		if(ck == true) {
			System.out.println("회원가입이 진행됩니다.");
		}
		else {
			System.out.println("이용약관에 동의하셔야만 진행됩니다.");
		}
		
		String name, pw;
		name = "park";
		pw = "a12345";
		//&& : 한가지 조건 이상 모두 맞을 경우 and
		// || : 한가지 조건 이상에서 한개라도 맞을 경우 or
		if(name == "park" && pw == "a1234") {
			System.out.println("로그인 하셨습니다.");
		} 
		else {
			System.out.println("아이디 및 패스워드를 확인하세요");
		}
		
		if(name == "park" || name == "kim") {
		//if(name == "park" || pw == "a111") { //두 조건 중에 한가지로도 맞을 경우 (bug)
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("확인된 아이디가 없습니다.");
		}

	}

}
