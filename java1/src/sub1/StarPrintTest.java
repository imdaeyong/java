package sub1;

public class StarPrintTest {
	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {	
//			
//			for(int j=5-i; j>0; j--) {
//				System.out.print("��");
//			}
//			
//			for(int j=0; j<i; j++) {
//				System.out.print("��");
//			}
//			
//			System.out.println();
//		}
//		//2����
//		for(int i=0; i<5; i++) {	
//			
//			for(int j=0; j<i; j++) {
//				System.out.print("��");
//			}
//			
//			for(int k=5; k>i; k--) {
//				System.out.print("��");
//			}
//			
//			System.out.println();
//		}
		//3����
		for(int i=1; i<5; i++) {
			for(int j=4-i; j>0; j--){
				System.out.print("��");
			}
			for(int k=2; k<=i*2; k++) {
				System.out.print("��");				
			}
			for(int j=4-i; j>0; j--) {
				System.out.print("��");				
			}
								
			System.out.println();
		}
		
		for(int i=1; i<5; i++) {
			
			for(int j=4-i; j>0; j--){
				System.out.print("��");
			
				for(int k=2; k<=i*2; k++) {
					System.out.print("��");					
				}
				
				System.out.print("��");
			}			
			System.out.println();
		}
	}	
}

