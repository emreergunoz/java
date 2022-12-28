package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setkume {

	public static void main(String[] args) {
		/*Set matametikteki küme gibi çalýþýr 
		 * Matematikteki küme kurallarýna sahiptir
		 * Birlþeim ,  kesiþim, fark özelliklþerini barýndýrýz  */
		//<> arasýna geliþlmiþ veri tiplerini yani büyük harfle baþlayan String ve Ýnteger kullanýla bilir
		
		Set <String> a = new HashSet<>();// TAnýmlarken hashset kullanýlr 
		
		a.add("Ali");
		a.add("Elif");
		a.add("Barýþ");
		a.add("Hasan");
		a.add("Ali");
		a.add("Hasan");
		System.out.println(a);
		System.out.println(a.size());//Tekrar eden elemenlarý remove ettiði içib silmiþ demektir
		
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] {9,2,6,7,8,1,0,0,3}));// özellikle sayýsal verilerde asList diyip istenilen kümeye yazýlan bütün verileri tekrarlýlarý silerek dolduru
		c.addAll(Arrays.asList(new Integer[] {1,2,5,4,8,9,0,3,3}));//aslist sayesinde sýralayýp eklicek bu yüzden yazdýrýken sýralý yazdýrcak
		System.out.println(b);
		System.out.println(c);
		
		
		/*Birleþtirme-union
		b.addAll(c); //kesiþim içn inaktif edildi
		System.out.println(b);//Birleþtirip tekrarlýlarý silip yazýcak bu yüzden 0-9 arasý hespi yazýlacak
		System.out.println(b.size());//Yeni kümenin eleman sayýsý yazýlacak
		
		//Kesiþim- intersection 
		b.retainAll(c); //kesiþen elemanlar yen b kümesi oluyor
		System.out.println(b);
		System.out.println(b.size()); //yeni hali ile yazýlýyor
		
		//Fark -remove*/
		b.removeAll(c); //kesiþmeyen elemanlarý yazdýrdý kesiþenleri sildi
		System.out.println(b);
		System.out.println(b.size());
		
		//Hashset ve TreeSet
		HashSet<Integer> hs = new HashSet<>();
		hs.addAll(Arrays.asList(new Integer[] {9,11,23,0,7,0,2,45}));
		System.out.println(hs);
		
		//Treeset küme elemanalrýný sýralayarak iþlme yapma olanaðý saðlar
		TreeSet<Integer> ts = new TreeSet<>(hs);//hs elemanalrýný otomatik alýp sýralayarak ts ye attý sortinhg yani
		System.out.println(ts);
		
		
		

	}

}
