package sub4;

public class StaticTest {
	public static void main(String[] args) {
		Increment in1 = new Increment();
		Increment in2 = new Increment();
		Increment in3 = new Increment();
		
		Increment.add(); 
		//���� in1.���� ��ü�� �����ؾ��ϴµ� 
		//Ŭ����Ÿ������ �����ϴ� �޼ҵ�(�̹� �޸𸮿� ��������) Method Area
		//Ŭ���� �޼���
	}
	public void hello() {
		System.out.println("Hello you~");
	}
}
