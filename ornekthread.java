package Ornekler;

public class ornekthread {
	static int a;
	public static void main(String[] args) {	
		Thread ornek1 =new Thread() {
			public void run() {	
				for(a=0;a<10;a++) System.out.println("Thread 1 den yazýldý " +a);
				
			}
			
		};
		Thread ornek2 =new Thread() {
			public void run() {
				for (a=0;a<10;a++) System.out.println("Thread 2 den yazýldý " +a);
				
			}
		};
		ornek1.start();
		ornek2.start();
	}
}
