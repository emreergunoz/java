import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface lmd{
	//Interface daha sonra kullanýlmak üzere methot rezerve etmek
	//void yaz();  // veri döndürmeden 
	void yaz(String s);
	//int topla(int a, int b);
	

}
public class lambdaa {
	
	/*static void yaz() {
		System.out.println("Merhaba Lambda");
		fonksiyon deðer döndürmiyecekse void yazýyorduk bi þey retorn edicekse retunr ediceði tür kullanýlmalý
		 *baþýnda statik yok sa neseni oluþturulmalý
	}
	static void yaz2(String s) {
		System.out.println("Merhaba Lambda");
	}
	static int topla(int a,int b) {
		return a+b;
	}*/

	public static void main(String[] args) { 
		// derleyici lambdayý daha hýzlý derler m
		//interface aracýlýðý ile ekndine ahs iþleri yapar
		 
		/*Temel lambda syntax ý 
		()->System.out.println("Merhaba Lambda");  þeklindedir bu void gibi deðer döndürmeyen halidir
		(s)->System.out.println("Merhaba Lambda"); bu da içeriisnde parametre alan hali yani s i alýyor gerisisni yapýyor
		(a,b)->a+b; a-b giriþi varsa bunlarý topla diyor*/

		
		//lmd l =()->System.out.println("Lambda'dan yazýldý");
		//l.yaz();  döndürmeyen 
		
		lmd l =(s)->System.out.println("Lambda'dan yazýldý");
		l.yaz("Ýbrahim");  // s döndürdü bu yüzden içine bir þey yazýlmalý
		//lmd l =(a,b)->a+b;
		//System.out.println(l.topla(7, 8));
		
		ArrayList<Integer> liste  =new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<10;i++) liste.add(r.nextInt(20)); //20 ye kadar rasgele sayýlar oluþturuyrr 10 defa bunlarý arrak liste [] içine atýyor 
		System.out.println(liste);
		
		liste.forEach(p->System.out.println(p+"-"));//listedeki elemanalrýý tek tek alýr listenin elannalrýný p ye atar ve yaz demiþ oluruz
		
		List<Integer> ikiKat = new ArrayList<>(); // otomatik olarak interface kullanamdan aldý
		liste.forEach(p->ikiKat.add(p*2));
		System.out.println(ikiKat);

		
	}

}
