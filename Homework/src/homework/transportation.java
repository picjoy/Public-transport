package homework;

public class transportation {
	
	int num;			// ��ȣ
	static int currentGas = 100;		// ������
	int currentSpeed = 0;	// ���� �ӵ�
	int acceleration;	// ����
	int maxPass;		// �ִ� �°� ��
	String status = "";	// ����

	// ���� Ȯ��
	static boolean gasLeft() {
		//�������� 10 �̻��̾�� ����
		return currentGas >= 10;
	}


}
	
	

	

