package homework;

public class testBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� �׽�Ʈ
		// 1�� 
		// 1~2. ���� 2�� ���� & ���
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		
		// 2�� (���� 1��� ����)
		// 1 ~ 2. �°� +2 & ���
		bus1.board(2);
		// 3 ~ 4. ������ -50
		bus1.refuel(-50);
		System.out.println("������ = "+bus1.currentGas);
		// 5. ���� ���� => ��������
		bus1.busStatus(false);
		// 6. ������ +10
		bus1.refuel(10);
		// 7. ���� ���¿� ������ ���
		bus1.currentBus();
		// 8. ���� ���� => ������
		bus1.busStatus(true);
		// 9 ~ 10. �°� +45 => �ִ� �°� �� �ʰ�
		bus1.board(45);
		// 11 ~ 12. �°� +5 & ���
		bus1.board(5);
		// 13. ������ -55
		bus1.refuel(-55);
		// 14. ���� ���¿� ������ ���
		bus1.currentBus();

	}

}
