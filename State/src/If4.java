import java.util.Scanner;	
//import : java�� �ִ� ������ �ε��� �� ����ϴ� ���
//export : java�� �ִ� ������ ���� ������ �� �ִ� ���

//java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε��ϰԵ˴ϴ�.
//java.util ��Ű���� �׳� ������� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� ��.
//��, �ش� �ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �ȵ�(import��)
public class If4 {

	public static void main(String[] args) {
		
		//new : ��ü�� �����ϴ� ���Դϴ�.
		Scanner a = new Scanner(System.in);	//System.in(�Է�) != System.out(���)
		
		System.out.println("���̵� �Է��ϼ���");		
		String mid = a.next();	//next() : ����ڰ� �Է��ϴ� ���¸� ����. (����, ���ڸ� �Է� �޴� ����)
		System.out.println(mid);
		a.close();
		
	}

}
