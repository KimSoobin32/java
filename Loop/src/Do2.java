
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1;	//�ݺ��� ���ʰ�
		int b = 9;	//��� ������
		int c;	//������ �ۿ��� �ؾ� �޸� ȿ�� ����
		do {
			c = a * b;
//			System.out.print(c+" ");
			a++;
		}while(a<10);
		
		/*
		 * ���빮��
		 * ���� ������� ���� do~while������ �ڵ带 �ۼ�
		 * 35 45 55 65 75
		 * 
		 */
		//���۰��̳� ���ᰪ�� ����� ���� �ʵ��� ����
		int n1 = 3;
		int n3;
		do {
			n3 =  (n1 * 10) + 5;
			System.out.print(n3+" ");
			n1++;
		}while(n1<=7);

	}

}
