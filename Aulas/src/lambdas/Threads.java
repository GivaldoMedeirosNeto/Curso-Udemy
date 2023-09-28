package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho1();
		
		Runnable t2 = new Runnable() {
			public void run() {	
				for(int i = 0; i <= 10; i++) {
					System.out.println("Trabalho 02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						
					}
				}
			}
		};
		
		Runnable t3 = () -> {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Trabalho 03");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}
			}
		};
		
		Runnable t4 = Threads::trabalho4;
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		Thread th4 = new Thread(t4);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}
	
	static void trabalho4() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Trabalho 04");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
	
}
