import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		/* ���빮�� 
		 * ���ǹ� �ڵ带 �ۼ�
		 * ���� �ڽ��� ���忡�� ������ϴ� ���μ����� ����
		 * ���� �⺻�ڻ� �ݾ��� 100000
		 * 
		 * "1�� �Է� �� �Ա�, 2�� �Է� �� ��� �Դϴ�." ��� �޼����� ���� ���� ����
		 * 1���� �Է� �� "�ش� �ݾ��� �Է��ϼ���"
		 * ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ�ݾ��� ���
		 * 
		 * 2���� �Է� �� "����� �ݾ��� �Է��ϼ���."
		 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ� �� �ڻ� �ݾ��� ���
		 * 
		 */
		int m = 100000;
		Scanner i1 = new Scanner(System.in);	//����
		Scanner i2 = new Scanner(System.in);	//�ݾ�
		System.out.println("1�� �Է� �� �Ա�, 2�� �Է� �� ��� �Դϴ�.");
		byte num = i1.nextByte();
		int im;
		if(num == 1) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���.");
			im = i2.nextInt();
			//System.out.println(m + im);
			m = m + im;
		} else if(num == 2) {
			System.out.println("����� �ݾ��� �Է��ϼ���.");
			im = i2.nextInt();
//			System.out.println(m - im);
			m = m - im;
		} else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
			i2.close();
		}
		System.out.println(m);
		i1.close();
		i2.close();

	}

}
