package sub2;

public class ClassTest {
	public static void main(String[] args) {
		Account kb = new Account("��������","121-11-1234","������",	10000);		
		kb.deposit(40000);
		kb.withdraw(25000);
		//kb.money--; �̰� ������ ���� ��
		// �̷��� �����̱̽��(1���������°�) �̰� ���Ǵ� ������
		// ĸ��ȭ�� ���ؼ� �׷�!
		
		kb.info();
		
		Account wr = new Account("�츮����","111-11-1111","������",5000);		
		wr.deposit(15000);
		wr.withdraw(7000);
		wr.info();
	}
}
