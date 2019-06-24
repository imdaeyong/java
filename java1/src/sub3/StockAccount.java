package sub3;
import sub2.Account;
public class StockAccount extends Account{ 
	// Account가 Parent(슈퍼) 클래스! StockAccount = child
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
		//오버라이딩(부모의 메소드를 가리고 자신만 나옴),여기서 bank,id,name...등등을 참조할수없음(캡슐화되어있음)
		System.out.println("증권사: "+bank);
		System.out.println("계좌번호: "+id);
		System.out.println("입금주: "+name);
		System.out.println("예수금: "+money);
		
		System.out.println("종목 : " +company);
		System.out.println("수량 : " +count);
		System.out.println("가격 : " +price);	
	}
}
