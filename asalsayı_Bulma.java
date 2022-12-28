package sorular;

import java.util.Scanner;

public class asalsayý_Bulma { 
	//Emre Ergün Öz
	//19410051002
	public static boolean asal(int a) { // sayý gönderilecek methotu yazýyoruz , true-false döndürmesi için boolen yazýyoruz, içerisine int türünde deðer gönderilecek diyrouz
		for(int i=2;i<a;i++) { // asal  olmasý içinkendiisinden önceki bütün sayýlarýn denenmesi lazým
			if(a%i==0) {//üstte seçilen sayýyýa bölünüyormu diye deniyoruz
				return false;// //bölünüyor ise asal deðildir	 
			}
		}
		return true; //üstte return true nasýl yazýcam bulamadým sayac vs. denedim olmadý denemeye devam ederken ecipse
	}               // burara cod tamamla sayesinde retun false alttý o zmana fark ettim true ye çevirdim çalýþtý
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); //veri almak için scanner tanýmlaný
		System.out.print("Deðerlendirmek istediðiniz sayýyý giriniz:");// sayý almak istediðinizi ekrana yazarýz girilecek sayýyý consol da yazýnýn devamýna yazmak için ln kullanmayýz
		int c;// c diye int olan bir sayý var diyoruz
		c=s.nextInt(); //bu sayý girilen sayý olcak diyoruz
		System.out.println(asal(c)); //girilen sayýyý methoda gönder sonucu yaz diyoruz
	}

}
