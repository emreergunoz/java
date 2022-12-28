package Set;

import java.util.HashMap;
import java.util.TreeMap;


public class Map {

	public static void main(String[] args) {
		/* MAp-İkili verileri tutarken kullanılrı
		 * K=KEY
		 * V=Value yani numarası
		 * -Maplerde Anahtrar veri Keydir yani veri önceliği key kısmıdır
		 * unic veriler key kısmına yazılmalıdır
		*/
		
		//HashMap<K,V> şeklindedir
		HashMap<Integer, String> hm =new HashMap<>();
		hm.put(33,"Bilge");
		hm.put(12,"Ali");
		hm.put(63,"Ayşe");
		hm.put(33,"Rıdvan");
		hm.put(33,"Bilge");//Map olduğu için bi bilgeyi alcak çünkü tekrarlı veriyi yazmaz 
		hm.put(100,"Enes");
		hm.put(37,"Bilge");//map olduğu için silmesi lazım ancakkey farklı olduğu için farklı veri kabul eder
		hm.put(33,"Emre");//daha sonra eklenmiş olan emre key değeri bilge ile aynı olduğu iiçin yeni veri olan emre verisini yazdı
		System.out.println(hm);//HAs olduğu için random
		
		System.out.println(hm.get(33));//key değeri girerek keye bağlı veriyi çeker
		System.out.println(hm.containsValue("Emre"));//emre varmı diyoruz
		System.out.println(hm.containsKey(33));//33 varmı diyoruz
		System.out.println(hm.values());// map deki valuelerin hepsini yazar
		System.out.println(hm.keySet());// pamdeki, keyleri yazar
		
		//Treeset HashMap in sıralanmış halidir
		TreeMap<Integer, String> tm = new TreeMap<>(hm);
		System.out.println(tm); //keylere göre sıralı yazdırdı
		
	}

}
