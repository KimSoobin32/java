
public class If3 {

	public static void main(String[] args) {
		
		//boolean : true, false�� ����
		boolean ck = false;
		if(ck == true) {
			System.out.println("ȸ�������� ����˴ϴ�.");
		}
		else {
			System.out.println("�̿����� �����ϼž߸� ����˴ϴ�.");
		}
		
		String name, pw;
		name = "park";
		pw = "a12345";
		//&& : �Ѱ��� ���� �̻� ��� ���� ��� and
		// || : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ��� or
		if(name == "park" && pw == "a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		} 
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���");
		}
		
		if(name == "park" || name == "kim") {
		//if(name == "park" || pw == "a111") { //�� ���� �߿� �Ѱ����ε� ���� ��� (bug)
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}

	}

}
