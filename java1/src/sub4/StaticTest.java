package sub4;

public class StaticTest {
	public static void main(String[] args) {
		Increment in1 = new Increment();
		Increment in2 = new Increment();
		Increment in3 = new Increment();
		
		Increment.add(); 
		//원래 in1.같이 객체로 실행해야하는데 
		//클래스타입으로 실행하는 메소드(이미 메모리에 상주중임) Method Area
		//클래스 메서드
	}
	public void hello() {
		System.out.println("Hello you~");
	}
}
