package homework;

public class testTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ý� �׽�Ʈ
		// 1�� 
		// 1~2. ���� 2�� ���� & ���
		Taxi taxi1 = new Taxi();
		Taxi taxi2 = new Taxi();
		System.out.println("taxi1 ������ = "+taxi1.currentGas);
		System.out.println("taxi1 ���� = "+taxi1.status);
		System.out.println("taxi2 ������ = "+taxi2.currentGas);
		System.out.println("taxi2 ���� = "+taxi2.status);
		
		//2��(Taxi 1��� ����)
		// 1~2.�°�+2 ������ = ���￪ ���������� �Ÿ� 2km & ���
		taxi1.board(2, "���￪", 2);
		System.out.println("���� = "+ taxi1.status);
		// 3. ������ -80
		taxi1.refuel(-80);
		// 4~5. ��ݰ��� & ���
		System.out.println("������ = "+taxi1.currentGas);
		taxi1.pay();
		// 6~7. �°�+5 & �ִ�°��� �ʰ�
		taxi1.passenger(5);
		// 8~9. �°�+3 ������ = ���ε����д����� ���������� �Ÿ� 12km & ���
		taxi1.board(3, "���ε����д�����", 12);
		// 10. ������ -20
		taxi1.refuel(-20);
		// 11~12. ��� ���� & ���
		System.out.println("������ = "+taxi1.currentGas);
		taxi1.pay();

	}

}
