package homework;

public class Taxi extends transportation {
	
	String destination;			// ������
	int distance;				// ���������� �Ÿ�
	int maxPass = 4;			// �ִ� �°���
	int defaultDistance = 1;	// �⺻ �Ÿ�
	int defaultCost = 3000;		// �⺻ ���
	int perDistance = 1000;		// �Ÿ��� ���
	static String status = "�Ϲ�";		// ����
	int speed = 0;				// �ӵ�
	int total = 0;				// ���� �ݾ�
	int cost;					// �°��� ������ �ݾ�
	
	// �ý� ��ȣ ���� [���������� �����Ǿ�� �Ǳ⿡ �����Լ��� ��]
	public Taxi() {
		this.num = (int)(Math.random()*100+1);
		// �����Լ��� �⺻���� Double���̱⿡ (int)�� ����ȭ
		// 1���� ���� �̰� �ʹٸ� +1 => ���� �Լ��� 0���� ������ ������
		System.out.println("�ý� ��ȣ : "+num);
		Taxi.drive();
	}
	
	static boolean drive() {
        if (!gasLeft()) {
        	status = "���� �Ұ�";
            System.out.println("���� �ʿ�");
            return false;
        } 
        
         return true;
        
    }
	// ž��		�°�			������		�Ÿ�
	void board(int pass, String dest, int dis) {
		if(status == "�Ϲ�") {
			
			if(pass > 4)
				System.out.println("�ִ� �°� �� �ʰ�");
			else {
				
				if(dis==1)
					cost = defaultCost+ (perDistance*dis);
				else
					cost = defaultCost+ (perDistance*(dis-1));
				status = "������";
				System.out.println("ž�� �°� �� = "+pass);
				System.out.println("�ܿ� �°� �� = "+ (maxPass-pass));
				System.out.println("�⺻ ��� Ȯ�� = "+defaultCost);
				System.out.println("������ = "+dest);
				System.out.println("���������� �Ÿ� = "+ dis+"km");
				System.out.println("������ ��� = "+cost);
				total += cost;
				
			}
		}
		
	}
	// ������ 
	int refuel(int gas) {
		currentGas += gas;
		if(!gasLeft()) {
			status = "���� �Ұ�";
		}
		return currentGas;
			
	}
	
	int pay() {
		status = "�Ϲ�";
		maxPass = 4;
		System.out.println("���� ��� = "+ total);
		if(!gasLeft())
			System.out.println("���� �ʿ�");
		cost = 0;
		return total;
	}
	
	void passenger(int pass) {
		if(pass > 4)
			System.out.println("�ִ� �°� �� �ʰ�");
		
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
