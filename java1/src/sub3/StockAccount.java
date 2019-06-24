package sub3;
import sub2.Account;
public class StockAccount extends Account{ 
	// Account�� Parent(����) Ŭ����! StockAccount = child
	private	String company;
	private int count;
	private int price;
	
	public StockAccount(String bank, 
						String id, 
						String name, 
						int    money,
						String company,
						int    count,
						int    price) {
		super(bank, id, name, money);
		
		this.company = company;
		this.count 	 = count;
		this.price 	 = price;
	}
	
	public void sell(int count, int price) {
		this.count -= count;
	}
	
	public void buy(int count, int price) {
		this.count += count;
	}
		
	public void info() { 
		//�������̵�(�θ��� �޼ҵ带 ������ �ڽŸ� ����),���⼭ bank,id,name...����� �����Ҽ�����(ĸ��ȭ�Ǿ�����)
		System.out.println("���ǻ�: "+bank);
		System.out.println("���¹�ȣ: "+id);
		System.out.println("�Ա���: "+name);
		System.out.println("������: "+money);
		
		System.out.println("���� : " +company);
		System.out.println("���� : " +count);
		System.out.println("���� : " +price);	
	}
}
