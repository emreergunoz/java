package hatayakalama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwException {
	
	static void ortalama(int v , int f ) {
		if (v<0 || f<0 || v>100 || f>100) { // 0 dan küçük yada 100 den buyükseler 
			throw new ArithmeticException("Notlar 0-100 arasýnda olmalý ");// bu aralýkta girilmezse otomatik hata kodu olarak bunu vericek 
		} else { // böyle bir hata yoksa alttaki iþlemi yap
			float ortalama =(float)(v*0.4 + f*0.6);// iþlemler yapýldýr float a zorlandý
			System.out.print("Ortalama = " + ortalama);
		}
	}

	public static void main(String[] args) {
		//Throp Exception 
		Scanner scan = new Scanner(System.in );
		int v,f;// üstteki bloða veri göndericez
		try { // verileri alýcaz
			System.out.print("Vize notunu giriniz : ");
			v= scan.nextInt();
			System.out.print("Final notunu giriniz : ");
			f= scan.nextInt();
			ortalama(v,f); //ortalama methoduna göndercez 
			
		} catch (InputMismatchException e) { // girilen veri hatasý 
			System.out.println("Sayýsal veri giriniz");// eðer 0-100 arasýnda deðilse üstteki çalýþacak  sayýsal veri girilmezse alttaki çalýþacak
		}
	}

}
