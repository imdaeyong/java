package sub4;

public class Increment {
	private int num1;
	
	//클래스변수
	private static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 :"+ num1);
		System.out.println("num2 :"+ num2);
	}
	//클래스 메서드
	public static void add() {
		num2++;
	}
}
