package hatayakalama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatchfinaly {

	public static void main(String[] args) {
		
		try {   //iþlemler, kontrol edilcekelr yazýlýyor 
			int a,b,toplam;
			Scanner scan = new Scanner(System.in);
			System.out.print("a sayýsýný giriniz : ");
			a = scan.nextInt(); 
			System.out.print("b sayýsýný giriniz : ");
			b = scan.nextInt(); 
			toplam = a + b;
			System.out.println("Toplam = " + toplam);
		}catch (InputMismatchException e) { // hangi hatayý bulacaðýný yazýyoruz, burda sayý-harf ayrýmý yapýyor
			System.out.println("Sayý Giriniz !");
			System.out.println("Hata Kodunuz : " + e.getMessage()); //hangi hata çýktýðýný yazdýrýr
		} finally { //sonuçda ne yapýlacaðý giirlir 
			System.out.println("Ýþlem Tamamlandý");
			
		}
	}

}
