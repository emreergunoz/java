package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class harfsilme {
	//Emre Ergün Öz
	//19410051002
	static boolean sesliharf(String x) { //Methot oluþturdum boolean yerine string yazýnca main methot uyarý veriyordu nedenini çözemedim burda iþlem yapýp sonunda return true yazdým
		ArrayList<Object> isim = new ArrayList<Object>(); //kullanýcaðýmýz Arrylisti onject formatýnda oluþturduk her þeyi ala bilsin diye
		for( int i = 0; i< x.length();i++) { // kullanýcýdan gelecek string kadar uzun döngü kurduk
			char a=x.charAt(i); //her döngü adýmýnda stringin sonraki harfini char a (karaktere) çevirdik
			isim.add(a);//oluþan charý arraylisteekledik
		}
		System.out.println("Girdiðiniz isim" + isim);// oluþan listeyi yazdýrýdýk
		for (int i=0;i<isim.size();i++) { // dersden sonra çalýþýrken size ý buldum , bunun sayesinde arrayin uzunluðunu aldýk ve döngüye soktuk
			if(isim.get(i).equals('a') || isim.get(i).equals('e') ||isim.get(i).equals('o') ||isim.get(i).equals('ö') ||isim.get(i).equals('u') ||isim.get(i).equals('ü') ||isim.get(i).equals('ý') ||isim.get(i).equals('i') ) {
				isim.remove(i);//üstteki uzun yerde arrayin seçilen elemanýný yazýlý char ile karþýlaþtýrýyoruz 
			}                 //ancak == ifadesi char için kullanýlamýyor çünkü == remdeki ayný yeri kontrol ediyor equals ise verileirn eþit olup olmadýðýný kontro ediyor
			                 //|| veya demek , daha sonra koþula uyanlarý remove ediyoruz
		}System.out.println("Seli Harfler Silindi" + isim);// remove edildikten sonra listeyi tekrar yazdýrýyoruz
		return true;//boolean kullandýðýmýz için true-false return etmemiz lazým
	}

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);// scanner oluþturuduk
		System.out.print("String giriniz :"); //kullanýcýya string girilmesi gerektiðini söyledik
		String x = a.nextLine(); //girilen stringin nextline ýn string ifadesi sayesinde x e atýyoruz 
		sesliharf(x); // methoda gönderiyoruz 
		
	

	}

}
