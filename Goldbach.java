package sorular;

import java.util.ArrayList;
import java.util.Random;

public class Goldbach {
	//Emre Erg�n �z
	//19410051002
	// Yapabildi�im kadar yapt�m, kod �al���yor ancak kurdu�um d�ng� sayesinde diziyi iki tarftanda inceledi�i i�in
	// Sonucun yar�s� ayn� cevaplar�n tersen yaz�l�� gibi oluyor 3+5 ve 5+3 gibi
	// yapt�kdan sonra silmeye �al��t�m ama ba�tan ortaya silince dizi kendini b�y�kden k����e s�ralad� bende bu hali ile b�rakt�m
	//Bunun d���nda ara ara 7+7 gibi say�lar olu�unca ortada kalabiliyordu yar�s�n� silersem bunlardan birisi siliniyordu
	//ayn� say�lar�da silebilirdim ama  gene ikililer bozulurdu
	public static ArrayList<Integer> asal=new ArrayList<Integer>();// asallar� ve goldbach i tutacak arraylar olu�turud
	public static ArrayList<Integer> goldbach=new ArrayList<Integer>(); //methotlar ile yapt���m i�in farkl� yerlerdekullan�l�r diye public tan�mlad�m
	public static int c�ft=0; //arraylist yerine de�i�ken tan�mlad�m
	static boolean asalMi(int x) { //asal say�lar� bulcak methotu yazd�m
		int y; // dersde g�sterdi�inizden farkl� olarak i� i�e forla yapmaya �al��t�m bu sayede 2 ye b�l�n�rl��� daha h�zl� kontrol eder diye d���nd�m
		for(int i=2;i<100;i++) {//100 den k���k say�lar� kontrol etmek i�in hepsini tek tek al�yor
			y=0;//�nceki �devden farkl� olarak dersde g�sterdi�iniz sonu� y�ntemi y artmazsa asald�rdemek i�in  
			for (int j=2;j<=i/2;j++) { //2 ye b�l�n�nce kalanlarla i�lem yapmas� kolay ve 2 ye b�l�m� direk eledik
				if (i%j==0) y++; // e�er b�l�n�yor ise artacak 
			}
			if(y==0) { //e�er artmazsa bu sat�ra ge�icek 
				asal.add(i); //say�y� asal array�na eklicek 
			}
		}System.out.println("Asal Say�lar = " + asal);return rasgelec�ft(1);// olu�an asallar� burda yaz�cakki kod hatal� da olsa 
	}                                          //kodun�al��t��� yere kadar yazd�rs�n // di�er methoda ge�mesi i�in onu return ediyoruz
	static boolean rasgelec�ft(int x) {//random say� olu�turacak metodu yazd�k
		Random a = new Random(); // a harfi random k�t�phanesini kullllnamak i�in kullan�caz
		int i=0; // while d�ng�s�nden ��kmak i�in de�i�ken  atad�k sayac gibi
		while (i<1) { //random say� cift olursa i art�cak d�ng� k�r�lcak
			int b=a.nextInt(97)+2; //97+2 demek 0 olsada 2 yi se�icek ve 97 olursa 99 son say�m�z olcak
			if (b%2==0){//olu�an random say� 2 ye b�l�n�yorsa �al���cak
				c�ft=b; // se�ilen say� cift public de�i�kenine atand�
				i++; //d�ng�y� k�rmak i�in i artt�
			}
		}System.out.println("Rasgele Olu�an �ift Say� = " + c�ft);//olu�an �ift say�y� yazd�r�yoruz
		return goldbach(1);// goldbach methodunu �a��r�yoruz
	}
	static boolean goldbach(int z) {// elim al��t��� i�in say� g�nder �al��ss�n �ekl,nde kullan�yorum
		for(int i=0;i<asal.size();i++) { // asal arrayinin indislerini alamk i�in d�ng� 
			for(int j=1;j<asal.size();j++) { // ilk indisler di�er b��tn indiler kar��la�t�r�lmal� buda ikinciyi al�cak 
				if (asal.get(i)+asal.get(j)==c�ft) { //e�er se�ilen indisler topland���nda say�m�z ��k�yor ise �al���cak
					goldbach.add(asal.get(i)); //kabul edilen ikilileri arraye at�cak
					goldbach.add(asal.get(j)); //buray� yazmasam tersdende gelece�i i�in gene do�ru sonu�lar ��kard� ama 
					                          // ikili �ekilde olursa arrayde  g�rmesi kolay olur
				}
			}
		}System.out.println("Bulunan Goldbach Say�lar� = " + goldbach); //arrayi yazd�r�yoruz 
		 System.out.println("Bulunan say�lar�n her s�ral� ikisi �ift say�y� olu�turuyor");
		return true; //boolean kulland���m�z i�in retun kullanmam�z gerek
		
	}
	public static void main(String[] args) {
		asalMi(1); // ilk methodu �a��r�yoruz
				  // ilk yapt���mda burda hepsini s�ra ile �a��rm��t�m sonra methotlara ekledim 
	}
}
