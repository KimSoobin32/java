
public class If_for {

	public static void main(String[] args) {
		final int a = 1;	
		//final�� ��� �� �������� ����� ����
		//��� : ���� ������ �ʴ� ��
		final String name = "ȫ�浿";
		//name = "�̼���"; -> �Ұ�
		
		System.out.println(a);
		System.out.println(name);
		
		final int ct = 5;	//������
		int f;	//�ݺ���
		boolean ok = false;	//���ǿ����� true, false
		for(f=1;f<11;f++) {
			if(f == ct) {	//�ݺ��� ���� ���� ���� ���� ���
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
				ok = true;	//���ǿ����� ���� ����
			}
		}
		if(ok == false) {	//���� �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ�
			System.out.println("Ȯ���� ���� �ʴ� �����Դϴ�.");
		}
		
		/*
		 * �� 20���� ���� �ݺ�.
		 * ¦�� ����, Ȧ�� ���� ���
		 */
		int ff;
		String odd = "";	//odd:Ȧ��, even:¦��
		for(ff=1;ff<=20;ff++) {
			if(ff % 2 != 1) {
				System.out.print(ff+" ");
			} else {	//���࿡ Ȧ�� ���� ��� odd������ ���������� ���� �߰�
				odd = odd + ff + " ";	//�߰��� ��� " "�� ������ Ȱ���Ͽ� ����
			}
		}
		System.out.println(odd);

	}

}
