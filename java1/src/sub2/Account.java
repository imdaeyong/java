package sub2;

public class Account {
	
	//특성 - 멤버변수
	protected String bank;
	protected String id;
	protected String name;
	protected int money;	
	
	
	//생성자 - 객체를 생성할때 멤버변수를 초기화(다른기능은 위의private로 
	// 인해서 다 막혀있지만 생성자로 초기화만 가능)
	public Account(String bank, String id, String name, int money) {
		this.bank=bank;
		this.id=id;
		this.name=name;
		this.money=money;
	}
	//기능 - 멤버메서드
	public void deposit(int money) {
		this.money += money;
		//앞의 money는 멤버변수의 money, 
		//뒤의 money는 deposit(1000)이런식으로 사용할때 
		//뒤의 1000(현재 잔액에 추가할 금액을 추가)
	}
	
	public void withdraw(int minusmoney) {
		money-=minusmoney;
		//이렇게쓰면 money가 자동으로 멤버변수의 money임
		//(같은 변수쓰면 위처럼 this써줘야하지만 아니면 그냥쓸수있음)
	}
	
	public void info() {
		System.out.println("==============");
		System.out.println("은 행 명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입 금 주 : "+name);
		System.out.println("현재잔액 : "+money);
		
	}
}
