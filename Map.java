package Set;

import java.util.HashMap;
import java.util.TreeMap;


public class Map {

	public static void main(String[] args) {
		/* MAp-�kili verileri tutarken kullan�lr�
		 * K=KEY
		 * V=Value yani numaras�
		 * -Maplerde Anahtrar veri Keydir yani veri �nceli�i key k�sm�d�r
		 * unic veriler key k�sm�na yaz�lmal�d�r
		*/
		
		//HashMap<K,V> �eklindedir
		HashMap<Integer, String> hm =new HashMap<>();
		hm.put(33,"Bilge");
		hm.put(12,"Ali");
		hm.put(63,"Ay�e");
		hm.put(33,"R�dvan");
		hm.put(33,"Bilge");//Map oldu�u i�in bi bilgeyi alcak ��nk� tekrarl� veriyi yazmaz 
		hm.put(100,"Enes");
		hm.put(37,"Bilge");//map oldu�u i�in silmesi laz�m ancakkey farkl� oldu�u i�in farkl� veri kabul eder
		hm.put(33,"Emre");//daha sonra eklenmi� olan emre key de�eri bilge ile ayn� oldu�u ii�in yeni veri olan emre verisini yazd�
		System.out.println(hm);//HAs oldu�u i�in random
		
		System.out.println(hm.get(33));//key de�eri girerek keye ba�l� veriyi �eker
		System.out.println(hm.containsValue("Emre"));//emre varm� diyoruz
		System.out.println(hm.containsKey(33));//33 varm� diyoruz
		System.out.println(hm.values());// map deki valuelerin hepsini yazar
		System.out.println(hm.keySet());// pamdeki, keyleri yazar
		
		//Treeset HashMap in s�ralanm�� halidir
		TreeMap<Integer, String> tm = new TreeMap<>(hm);
		System.out.println(tm); //keylere g�re s�ral� yazd�rd�
		
	}

}
