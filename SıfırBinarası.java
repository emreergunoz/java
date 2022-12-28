package sorular;

import java.util.Arrays;
import java.util.Random;

public class SýfýrBinarasý {

	public static void main(String[] args) {
		//Emre Ergün Öz
		//19410051002
		//farklý yollar ve methotlar kullanarak denedim ancak ya asal sayýlar dýþýnda sayýlara asal dedi
		//yada yanlýþ yerlerde yazdýðým döngüler sonucu dizi uzunluðundan fazla dedi en sonda bunu yazdým ve çalýþtý
		Random r=new Random(); //rasgele kütüphanesini ekeldik
		int sayac; //sayaçlarý belirledik
		int sayac2=0;
		int[] random= new int[500]; //iki tane dizi oluþturduk 500 elemanlý
		int[] asal=new int[500];  //bütün sayýlarýn asal olma ihtimaline karþý 
		for(int i=0;i<500;i++) { //500 tekrarlý fonksiyon
			random[i]=r.nextInt(998)+1; //0 seçmesin sonda 999 olsun diye böyle tanýmaldým oluþacak  sayý dizinin inci indisine yerleþecek
		}
		for(int x=1;x<random.length;x++) { //döngü kurduk bunun yerine sayaçta yapýal bilirtdi
			sayac=0;
			for(int j=1; j<=random[x];j++) { //üstteki döngünün x inci elemaný burda random dizinin indisini oluþturuyor
				if((random[x]%j)==0) { // sayýnýn kendisinden önceki sayýlara bölümü karþýlaþtýrýlýyor 
					sayac++;
				}
			}
			if(sayac==2) { //üstten sonuç gelmezse asal demektir 
				asal[sayac2]=random[x];sayac2++; //asal dizisini msayac2nci indisi  random dizisnin x inci indisi olcak 
			}
		}
		System.out.println("Random Sayýlar ="+Arrays.toString(random));
		System.out.println("Asal Sayýlar ="+Arrays.toString(asal)); //diziler yazdýrýldý

	}

}
