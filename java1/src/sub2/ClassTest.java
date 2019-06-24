package sub2;

public class ClassTest {
	public static void main(String[] args) {
		Account kb = new Account("국민은행","121-11-1234","김유신",	10000);		
		kb.deposit(40000);
		kb.withdraw(25000);
		//kb.money--; 이거 오류남 이제 ㅋ
		// 이런게 슬라이싱기법(1원씩빼가는거) 이게 허용되는 이유는
		// 캡슐화를 안해서 그럼!
		
		kb.info();
		
		Account wr = new Account("우리은행","111-11-1111","김춘추",5000);		
		wr.deposit(15000);
		wr.withdraw(7000);
		wr.info();
	}
}
