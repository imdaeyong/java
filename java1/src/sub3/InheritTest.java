package sub3;

public class InheritTest {
	public static void main(String[] args) {		
		StockAccount kw = new StockAccount("��������", "121-131-1212","������", 
											10000, "�Ｚ", 100, 40000);
		kw.deposit(10000);
		kw.withdraw(5000);
		kw.info();
	
	}
}
