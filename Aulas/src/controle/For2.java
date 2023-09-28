package controle;

public class For2 {
	
	public static void main(String[] args) {
	
		for(int x=10; x>=0; x-= 2) {
			System.out.printf("Contador = %d\n", x);
		}
		
		for(int y=1; y<=9; y+= 2) {
			System.out.printf("Contador = %d\n", y);
		}
		
		for(int x=1; x < 10; x++) {
			for(int y=0; y<10; y++) {
				System.out.printf("%d x %d = %d\n", x, y, x*y);
			}
		}
		
		for(int x=0; x < 10; x++) {
			for(int y=0; y<10; y++) {
				System.out.printf("[%d %d]", x, y);
			}
			System.out.println();
		}
		
	}

}
