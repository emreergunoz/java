package sorular;

import java.util.Arrays;
import java.util.Random;

public class S�f�rBinaras� {

	public static void main(String[] args) {
		//Emre Erg�n �z
		//19410051002
		//farkl� yollar ve methotlar kullanarak denedim ancak ya asal say�lar d���nda say�lara asal dedi
		//yada yanl�� yerlerde yazd���m d�ng�ler sonucu dizi uzunlu�undan fazla dedi en sonda bunu yazd�m ve �al��t�
		Random r=new Random(); //rasgele k�t�phanesini ekeldik
		int sayac; //saya�lar� belirledik
		int sayac2=0;
		int[] random= new int[500]; //iki tane dizi olu�turduk 500 elemanl�
		int[] asal=new int[500];  //b�t�n say�lar�n asal olma ihtimaline kar�� 
		for(int i=0;i<500;i++) { //500 tekrarl� fonksiyon
			random[i]=r.nextInt(998)+1; //0 se�mesin sonda 999 olsun diye b�yle tan�mald�m olu�acak  say� dizinin inci indisine yerle�ecek
		}
		for(int x=1;x<random.length;x++) { //d�ng� kurduk bunun yerine saya�ta yap�al bilirtdi
			sayac=0;
			for(int j=1; j<=random[x];j++) { //�stteki d�ng�n�n x inci eleman� burda random dizinin indisini olu�turuyor
				if((random[x]%j)==0) { // say�n�n kendisinden �nceki say�lara b�l�m� kar��la�t�r�l�yor 
					sayac++;
				}
			}
			if(sayac==2) { //�stten sonu� gelmezse asal demektir 
				asal[sayac2]=random[x];sayac2++; //asal dizisini msayac2nci indisi  random dizisnin x inci indisi olcak 
			}
		}
		System.out.println("Random Say�lar ="+Arrays.toString(random));
		System.out.println("Asal Say�lar ="+Arrays.toString(asal)); //diziler yazd�r�ld�

	}

}
