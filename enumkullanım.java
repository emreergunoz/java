package timerform;

enum GUNLER{
	PAZARTES�,SALI,�AR�AMBA,PER�EMBE,CUMA,CUMARTES�,PAZAR
}
public class enumkullan�m {

	public static void main(String[] args) {
		/* S�n�fa de�i�meyecek veriler varsa kullan�l�r
		Verileri dizi gibi tutar 
		Pazartesi indis 0 iken sal� indis 1 dir
		final String Gun= "sal�"; // bu de�i�kenin ba��nda final oldu�u i�in de�i�tirilemez
		final �n geli�mi� gali enum dur
		int string vb tutar ve ba��nba int str char veya "" kullanamz�a gerek yoktur ve bir �e�it class d�r*/
		
	    //Nesne tan�mlamadan GUNLER.CUMA diyerek kullan�labilir
		//Ancak genellikle Nesne �retilerek kullan�l�r
		GUNLER g = GUNLER.PER�EMBE;
		System.out.println(g);// direk per�embeyi yazar direk strimng kanul etti ancak to ile de�i�tirilebilir string to int gibi
		System.out.println(g.ordinal());//indis numaras�n� yazar
		System.out.println(g.compareTo(GUNLER.PAZAR));//-3 de�erini verir ��nk� compareto diyince ��karma i�lemi yapt� 3-6 = -3
		System.out.println(g.compareTo(GUNLER.PAZARTES�));//3-0=3
		System.out.println(g.compareTo(GUNLER.SALI));//3-1=2
		System.out.println(Math.abs(GUNLER.SALI.compareTo(GUNLER.CUMA)));//gene -3 vericekti ama math.abstrak sayesinde mutlak de�ere ald�k
	}
	

}
