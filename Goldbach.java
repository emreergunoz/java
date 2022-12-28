package sorular;

import java.util.ArrayList;
import java.util.Random;

public class Goldbach {
	//Emre Ergün Öz
	//19410051002
	// Yapabildiðim kadar yaptým, kod çalýþýyor ancak kurduðum döngü sayesinde diziyi iki tarftanda incelediði için
	// Sonucun yarýsý ayný cevaplarýn tersen yazýlýý gibi oluyor 3+5 ve 5+3 gibi
	// yaptýkdan sonra silmeye çalýþtým ama baþtan ortaya silince dizi kendini büyükden küçüðe sýraladý bende bu hali ile býraktým
	//Bunun dýþýnda ara ara 7+7 gibi sayýlar oluþunca ortada kalabiliyordu yarýsýný silersem bunlardan birisi siliniyordu
	//ayný sayýlarýda silebilirdim ama  gene ikililer bozulurdu
	public static ArrayList<Integer> asal=new ArrayList<Integer>();// asallarý ve goldbach i tutacak arraylar oluþturud
	public static ArrayList<Integer> goldbach=new ArrayList<Integer>(); //methotlar ile yaptýðým için farklý yerlerdekullanýlýr diye public tanýmladým
	public static int cýft=0; //arraylist yerine deðiþken tanýmladým
	static boolean asalMi(int x) { //asal sayýlarý bulcak methotu yazdým
		int y; // dersde gösterdiðinizden farklý olarak iç içe forla yapmaya çalýþtým bu sayede 2 ye bölünürlüðü daha hýzlý kontrol eder diye düþündüm
		for(int i=2;i<100;i++) {//100 den küçük sayýlarý kontrol etmek için hepsini tek tek alýyor
			y=0;//önceki ödevden farklý olarak dersde gösterdiðiniz sonuç yöntemi y artmazsa asaldýrdemek için  
			for (int j=2;j<=i/2;j++) { //2 ye bölününce kalanlarla iþlem yapmasý kolay ve 2 ye bölümü direk eledik
				if (i%j==0) y++; // eðer bölünüyor ise artacak 
			}
			if(y==0) { //eðer artmazsa bu satýra geçicek 
				asal.add(i); //sayýyý asal arrayýna eklicek 
			}
		}System.out.println("Asal Sayýlar = " + asal);return rasgelecýft(1);// oluþan asallarý burda yazýcakki kod hatalý da olsa 
	}                                          //kodunçalýþtýðý yere kadar yazdýrsýn // diðer methoda geçmesi için onu return ediyoruz
	static boolean rasgelecýft(int x) {//random sayý oluþturacak metodu yazdýk
		Random a = new Random(); // a harfi random kütüphanesini kullllnamak için kullanýcaz
		int i=0; // while döngüsünden çýkmak için deðiþken  atadýk sayac gibi
		while (i<1) { //random sayý cift olursa i artýcak döngü kýrýlcak
			int b=a.nextInt(97)+2; //97+2 demek 0 olsada 2 yi seçicek ve 97 olursa 99 son sayýmýz olcak
			if (b%2==0){//oluþan random sayý 2 ye bölünüyorsa çalýþýcak
				cýft=b; // seçilen sayý cift public deðiþkenine atandý
				i++; //döngüyü kýrmak için i arttý
			}
		}System.out.println("Rasgele Oluþan Çift Sayý = " + cýft);//oluþan çift sayýyý yazdýrýyoruz
		return goldbach(1);// goldbach methodunu çaðýrýyoruz
	}
	static boolean goldbach(int z) {// elim alýþtýðý için sayý gönder çalýþssýn þekl,nde kullanýyorum
		for(int i=0;i<asal.size();i++) { // asal arrayinin indislerini alamk için döngü 
			for(int j=1;j<asal.size();j++) { // ilk indisler diðer büütn indiler karþýlaþtýrýlmalý buda ikinciyi alýcak 
				if (asal.get(i)+asal.get(j)==cýft) { //eðer seçilen indisler toplandýðýnda sayýmýz çýkýyor ise çalýþýcak
					goldbach.add(asal.get(i)); //kabul edilen ikilileri arraye atýcak
					goldbach.add(asal.get(j)); //burayý yazmasam tersdende geleceði için gene doðru sonuçlar çýkardý ama 
					                          // ikili þekilde olursa arrayde  görmesi kolay olur
				}
			}
		}System.out.println("Bulunan Goldbach Sayýlarý = " + goldbach); //arrayi yazdýrýyoruz 
		 System.out.println("Bulunan sayýlarýn her sýralý ikisi çift sayýyý oluþturuyor");
		return true; //boolean kullandýðýmýz için retun kullanmamýz gerek
		
	}
	public static void main(String[] args) {
		asalMi(1); // ilk methodu çaðýrýyoruz
				  // ilk yaptýðýmda burda hepsini sýra ile çaðýrmýþtým sonra methotlara ekledim 
	}
}
