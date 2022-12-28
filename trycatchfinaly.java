package hatayakalama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatchfinaly {

	public static void main(String[] args) {
		
		try {   //i�lemler, kontrol edilcekelr yaz�l�yor 
			int a,b,toplam;
			Scanner scan = new Scanner(System.in);
			System.out.print("a say�s�n� giriniz : ");
			a = scan.nextInt(); 
			System.out.print("b say�s�n� giriniz : ");
			b = scan.nextInt(); 
			toplam = a + b;
			System.out.println("Toplam = " + toplam);
		}catch (InputMismatchException e) { // hangi hatay� bulaca��n� yaz�yoruz, burda say�-harf ayr�m� yap�yor
			System.out.println("Say� Giriniz !");
			System.out.println("Hata Kodunuz : " + e.getMessage()); //hangi hata ��kt���n� yazd�r�r
		} finally { //sonu�da ne yap�laca�� giirlir 
			System.out.println("��lem Tamamland�");
			
		}
	}

}
