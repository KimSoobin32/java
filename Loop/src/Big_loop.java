import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		//����
		//1~100 ��� ���ϴ� for �ݺ���
		int a;
		int h = 0;
		for(a=1;a<=100;a++) {
			h = h + a;
		}
//		System.out.printf("%d ", h);
		
		/*
		 * 1~100���� ���� �����
		 */
		int f;
		//BigInteger : java���� ��� ������ ���� ������ �� �ִ� ������ �ڷ��� (���� ���Ѵ�)
		BigInteger aa = new BigInteger("1");	//�հ迡 ����� �ڷ��� ����. 1�� ���ʰ����� ����. �� ""�� ������ �����ؾ� ��
		for(f=1;f<=100;f++) {
			/* multiply : ��Ģ���� ���ϱ⸦ ���
			 * add : ��Ģ���� ���ϱ⸦ ���
			 * substract : ��Ģ���� ���⸦ ���
			 * divide : ��Ģ���� �����⸦ ���
			 */
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
		

	}

	
}
