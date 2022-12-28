package timerform;

/*class thread  extends Thread{
		public void run() {
			//yapýcal ilemler buraya yazýlýr 
	} // thread sýnýfýný miras alma ile çaðýrýp burda iþlem yapýp aþaðýda çýktý alabilriz
}*/

public class threadornek {
	static int i,j;
	/*thread t = new thread();
	t.start(); Yukardaki iþlemi baþlatmak için kullanýlýr ancak thread sýnfýfýnýn miprt edilmesi lazým */
	
	public static void main(String[] args) {
		//Thred iþlemciye ayný zamanda farklý iþlemler yapmaya yarýyor
		Thread t1 = new Thread() {
			public void run() {
				for (i=0;i<1000;i++) System.out.print("AAA-");// iþlemcide boþluk buldukça yazýcak,
			}
		};/* burda ; lazým */
		Thread t2 = new Thread() {
			public void run() {
				for (j=0;j<1000;j++) System.out.print("BBB-"); // iþlemcide boþluk buldukça yazýcak
			}
			
		};/* burda ; lazým */
		t1.start();// timerlarýn baþlamasý için lazým
		t2.start();

	}

	}


