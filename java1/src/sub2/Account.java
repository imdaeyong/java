package sub2;

public class Account {
	
	//Ư�� - �������
	protected String bank;
	protected String id;
	protected String name;
	protected int money;	
	
	
	//������ - ��ü�� �����Ҷ� ��������� �ʱ�ȭ(�ٸ������ ����private�� 
	// ���ؼ� �� ���������� �����ڷ� �ʱ�ȭ�� ����)
	public Account(String bank, String id, String name, int money) {
		this.bank=bank;
		this.id=id;
		this.name=name;
		this.money=money;
	}
	//��� - ����޼���
	public void deposit(int money) {
		this.money += money;
		//���� money�� ��������� money, 
		//���� money�� deposit(1000)�̷������� ����Ҷ� 
		//���� 1000(���� �ܾ׿� �߰��� �ݾ��� �߰�)
	}
	
	public void withdraw(int minusmoney) {
		money-=minusmoney;
		//�̷��Ծ��� money�� �ڵ����� ��������� money��
		//(���� �������� ��ó�� this����������� �ƴϸ� �׳ɾ�������)
	}
	
	public void info() {
		System.out.println("==============");
		System.out.println("�� �� �� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�� �� �� : "+name);
		System.out.println("�����ܾ� : "+money);
		
	}
}
