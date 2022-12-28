package timerform;

enum GUNLER{
	PAZARTESÝ,SALI,ÇARÞAMBA,PERÞEMBE,CUMA,CUMARTESÝ,PAZAR
}
public class enumkullaným {

	public static void main(String[] args) {
		/* Sýnýfa deðiþmeyecek veriler varsa kullanýlýr
		Verileri dizi gibi tutar 
		Pazartesi indis 0 iken salý indis 1 dir
		final String Gun= "salý"; // bu deðiþkenin baþýnda final olduðu için deðiþtirilemez
		final ýn geliþmiþ gali enum dur
		int string vb tutar ve baþýnba int str char veya "" kullanamzýa gerek yoktur ve bir çeþit class dýr*/
		
	    //Nesne tanýmlamadan GUNLER.CUMA diyerek kullanýlabilir
		//Ancak genellikle Nesne Üretilerek kullanýlýr
		GUNLER g = GUNLER.PERÞEMBE;
		System.out.println(g);// direk perþembeyi yazar direk strimng kanul etti ancak to ile deðiþtirilebilir string to int gibi
		System.out.println(g.ordinal());//indis numarasýný yazar
		System.out.println(g.compareTo(GUNLER.PAZAR));//-3 deðerini verir çünkü compareto diyince çýkarma iþlemi yaptý 3-6 = -3
		System.out.println(g.compareTo(GUNLER.PAZARTESÝ));//3-0=3
		System.out.println(g.compareTo(GUNLER.SALI));//3-1=2
		System.out.println(Math.abs(GUNLER.SALI.compareTo(GUNLER.CUMA)));//gene -3 vericekti ama math.abstrak sayesinde mutlak deðere aldýk
	}
	

}
