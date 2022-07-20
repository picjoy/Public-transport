package homework;


public class Bus extends transportation{
	
	int maxPass = 30;		// �ִ� �°� ��
	int currentPass = 0;	// ���� �°� ��
	int cost = 1000;		// ���
	// ���� ��ȣ ���� [���������� �����Ǿ�� �Ǳ⿡ �����Լ��� ��]
	public Bus() {
		this.num = (int)(Math.random()*100+1);
		// �����Լ��� �⺻���� Double���̱⿡ (int)�� ����ȭ
		// 1���� ���� �̰� �ʹٸ� +1 => ���� �Լ��� 0���� ������ ������
		System.out.println("���� ��ȣ : "+num);
	}
	// ���� ���� ����
	boolean busStatus(boolean change) {
		if(change == true)
			status = "������";
		else {
			status = "��������";
			currentPass = 0;
			maxPass = 30;
		}
		return change;	
	}
	
	// ���� ���� ����
	void currentBus() {
		System.out.println("���� = "+status);
		System.out.println("������ = "+currentGas);
		if(!gasLeft())
			System.out.println("���� �ʿ�");
	}
	
	// ���� �⸧�� ���� ���� ����
	void drive() {
		if(gasLeft()) {
			System.out.println("���� �⸧ : "+ currentGas );
			System.out.println("���� ����");
		}
		if(!gasLeft()) {
			System.out.println("������ �ʿ��մϴ�");
			System.out.println("���� �Ұ� = ��������");
			status = "��������";
		}
	}
	
	// ������ 
	int refuel(int gas) {
		currentGas += gas;
		if(!gasLeft()) {
			status = "��������";
		}
		return currentGas;
		
	}
			
		
	boolean available() {
		//�°� ž���� ���ִ� �°����� ���ϱ��� ����
		return maxPass >= currentPass;
	}
	
	// �°� ž��
	int board(int pass) {
		if(pass >= (maxPass-currentPass))
			System.out.println("�ִ� �°� �� �ʰ�");
		else {
			if(available()) {
				currentPass += pass;
				System.out.println("ž�� �°� �� = "+pass+"��");
				System.out.println("�ܿ� �°� �� = "+(maxPass-currentPass)+"��");
				System.out.println("��� Ȯ�� = "+(cost*pass));
			}
			if(!available()) {
				System.out.println("�ִ� �°� �� �ʰ�");
			}
		}
		return currentPass;
		
	}
	// �ӵ�����
	int changeSpeed(int acceleration) {
		//���� ���¸� üũ�ϰ� �������� 10 �̻��̾�� ������ �� ����
		if(gasLeft()) {
			this.acceleration = acceleration;
			
			currentSpeed += acceleration;
				
			System.out.println("���� �ӵ��� "+ currentSpeed+"�Դϴ�.");
				
		}
		System.out.println("�������� Ȯ�����ּ���."+currentGas);
		return currentGas;
			
	}
	
	
		
	
	
	
	
	
	
}
