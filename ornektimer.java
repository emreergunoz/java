package Ornekler;


class ornek_1 extends Thread{
	public void run() {
		for(int i = 0;i<100;i++) {
			System.out.print("1");
		}
		
	}
}
class ornek_2 extends Thread{
	public void  run () {
		for(int i = 0;i<100;i++) {
			System.out.print("2");
		}
		
	}
}
public class ornektimer {
	public static  int i;
	public static void main(String[] args) {
		ornek_1 o =new ornek_1();
		ornek_2 o2 = new ornek_2();
		o.start();
		o2.start();
		

	}

}
