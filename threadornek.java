package timerform;

/*class thread  extends Thread{
		public void run() {
			//yap�cal ilemler buraya yaz�l�r 
	} // thread s�n�f�n� miras alma ile �a��r�p burda i�lem yap�p a�a��da ��kt� alabilriz
}*/

public class threadornek {
	static int i,j;
	/*thread t = new thread();
	t.start(); Yukardaki i�lemi ba�latmak i�in kullan�l�r ancak thread s�nf�f�n�n miprt edilmesi laz�m */
	
	public static void main(String[] args) {
		//Thred i�lemciye ayn� zamanda farkl� i�lemler yapmaya yar�yor
		Thread t1 = new Thread() {
			public void run() {
				for (i=0;i<1000;i++) System.out.print("AAA-");// i�lemcide bo�luk bulduk�a yaz�cak,
			}
		};/* burda ; laz�m */
		Thread t2 = new Thread() {
			public void run() {
				for (j=0;j<1000;j++) System.out.print("BBB-"); // i�lemcide bo�luk bulduk�a yaz�cak
			}
			
		};/* burda ; laz�m */
		t1.start();// timerlar�n ba�lamas� i�in laz�m
		t2.start();

	}

	}


