package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setkume {

	public static void main(String[] args) {
		/*Set matametikteki k�me gibi �al���r 
		 * Matematikteki k�me kurallar�na sahiptir
		 * Birl�eim ,  kesi�im, fark �zellikl�erini bar�nd�r�z  */
		//<> aras�na geli�lmi� veri tiplerini yani b�y�k harfle ba�layan String ve �nteger kullan�la bilir
		
		Set <String> a = new HashSet<>();// TAn�mlarken hashset kullan�lr 
		
		a.add("Ali");
		a.add("Elif");
		a.add("Bar��");
		a.add("Hasan");
		a.add("Ali");
		a.add("Hasan");
		System.out.println(a);
		System.out.println(a.size());//Tekrar eden elemenlar� remove etti�i i�ib silmi� demektir
		
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] {9,2,6,7,8,1,0,0,3}));// �zellikle say�sal verilerde asList diyip istenilen k�meye yaz�lan b�t�n verileri tekrarl�lar� silerek dolduru
		c.addAll(Arrays.asList(new Integer[] {1,2,5,4,8,9,0,3,3}));//aslist sayesinde s�ralay�p eklicek bu y�zden yazd�r�ken s�ral� yazd�rcak
		System.out.println(b);
		System.out.println(c);
		
		
		/*Birle�tirme-union
		b.addAll(c); //kesi�im i�n inaktif edildi
		System.out.println(b);//Birle�tirip tekrarl�lar� silip yaz�cak bu y�zden 0-9 aras� hespi yaz�lacak
		System.out.println(b.size());//Yeni k�menin eleman say�s� yaz�lacak
		
		//Kesi�im- intersection 
		b.retainAll(c); //kesi�en elemanlar yen b k�mesi oluyor
		System.out.println(b);
		System.out.println(b.size()); //yeni hali ile yaz�l�yor
		
		//Fark -remove*/
		b.removeAll(c); //kesi�meyen elemanlar� yazd�rd� kesi�enleri sildi
		System.out.println(b);
		System.out.println(b.size());
		
		//Hashset ve TreeSet
		HashSet<Integer> hs = new HashSet<>();
		hs.addAll(Arrays.asList(new Integer[] {9,11,23,0,7,0,2,45}));
		System.out.println(hs);
		
		//Treeset k�me elemanalr�n� s�ralayarak i�lme yapma olana�� sa�lar
		TreeSet<Integer> ts = new TreeSet<>(hs);//hs elemanalr�n� otomatik al�p s�ralayarak ts ye att� sortinhg yani
		System.out.println(ts);
		
		
		

	}

}
