package sorular;

import java.util.Scanner;

public class asalsay�_Bulma { 
	//Emre Erg�n �z
	//19410051002
	public static boolean asal(int a) { // say� g�nderilecek methotu yaz�yoruz , true-false d�nd�rmesi i�in boolen yaz�yoruz, i�erisine int t�r�nde de�er g�nderilecek diyrouz
		for(int i=2;i<a;i++) { // asal  olmas� i�inkendiisinden �nceki b�t�n say�lar�n denenmesi laz�m
			if(a%i==0) {//�stte se�ilen say�y�a b�l�n�yormu diye deniyoruz
				return false;// //b�l�n�yor ise asal de�ildir	 
			}
		}
		return true; //�stte return true nas�l yaz�cam bulamad�m sayac vs. denedim olmad� denemeye devam ederken ecipse
	}               // burara cod tamamla sayesinde retun false altt� o zmana fark ettim true ye �evirdim �al��t�
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); //veri almak i�in scanner tan�mlan�
		System.out.print("De�erlendirmek istedi�iniz say�y� giriniz:");// say� almak istedi�inizi ekrana yazar�z girilecek say�y� consol da yaz�n�n devam�na yazmak i�in ln kullanmay�z
		int c;// c diye int olan bir say� var diyoruz
		c=s.nextInt(); //bu say� girilen say� olcak diyoruz
		System.out.println(asal(c)); //girilen say�y� methoda g�nder sonucu yaz diyoruz
	}

}
