package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class harfsilme {
	//Emre Erg�n �z
	//19410051002
	static boolean sesliharf(String x) { //Methot olu�turdum boolean yerine string yaz�nca main methot uyar� veriyordu nedenini ��zemedim burda i�lem yap�p sonunda return true yazd�m
		ArrayList<Object> isim = new ArrayList<Object>(); //kullan�ca��m�z Arrylisti onject format�nda olu�turduk her �eyi ala bilsin diye
		for( int i = 0; i< x.length();i++) { // kullan�c�dan gelecek string kadar uzun d�ng� kurduk
			char a=x.charAt(i); //her d�ng� ad�m�nda stringin sonraki harfini char a (karaktere) �evirdik
			isim.add(a);//olu�an char� arraylisteekledik
		}
		System.out.println("Girdi�iniz isim" + isim);// olu�an listeyi yazd�r�d�k
		for (int i=0;i<isim.size();i++) { // dersden sonra �al���rken size � buldum , bunun sayesinde arrayin uzunlu�unu ald�k ve d�ng�ye soktuk
			if(isim.get(i).equals('a') || isim.get(i).equals('e') ||isim.get(i).equals('o') ||isim.get(i).equals('�') ||isim.get(i).equals('u') ||isim.get(i).equals('�') ||isim.get(i).equals('�') ||isim.get(i).equals('i') ) {
				isim.remove(i);//�stteki uzun yerde arrayin se�ilen eleman�n� yaz�l� char ile kar��la�t�r�yoruz 
			}                 //ancak == ifadesi char i�in kullan�lam�yor ��nk� == remdeki ayn� yeri kontrol ediyor equals ise verileirn e�it olup olmad���n� kontro ediyor
			                 //|| veya demek , daha sonra ko�ula uyanlar� remove ediyoruz
		}System.out.println("Seli Harfler Silindi" + isim);// remove edildikten sonra listeyi tekrar yazd�r�yoruz
		return true;//boolean kulland���m�z i�in true-false return etmemiz laz�m
	}

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);// scanner olu�turuduk
		System.out.print("String giriniz :"); //kullan�c�ya string girilmesi gerekti�ini s�yledik
		String x = a.nextLine(); //girilen stringin nextline �n string ifadesi sayesinde x e at�yoruz 
		sesliharf(x); // methoda g�nderiyoruz 
		
	

	}

}
