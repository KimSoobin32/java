
public class Do1 {

	public static void main(String... args) {
		int a = 1;	//�ʱⰪ
		do {
			System.out.print(a+" ");
			a++;	//����,����
		}while(a<11);	//������(���ᰪ)
		System.out.println("");
		/*
		 * ���빮��
		 * 5~0���� ��µǴ� do~while�� �ۼ�
		 * 
		 */
		byte b = 5;
		do {
			System.out.print(b+",");
			b--;
		}while(b>=0);
		
		int c = 50;	//���ʰ�
		int d = 60;	//���ᰪ
		do {
			System.out.println(c+" ");
			c++;
		}while(c<=d);

	}

}