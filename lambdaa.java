import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface lmd{
	//Interface daha sonra kullan�lmak �zere methot rezerve etmek
	//void yaz();  // veri d�nd�rmeden 
	void yaz(String s);
	//int topla(int a, int b);
	

}
public class lambdaa {
	
	/*static void yaz() {
		System.out.println("Merhaba Lambda");
		fonksiyon de�er d�nd�rmiyecekse void yaz�yorduk bi �ey retorn edicekse retunr edice�i t�r kullan�lmal�
		 *ba��nda statik yok sa neseni olu�turulmal�
	}
	static void yaz2(String s) {
		System.out.println("Merhaba Lambda");
	}
	static int topla(int a,int b) {
		return a+b;
	}*/

	public static void main(String[] args) { 
		// derleyici lambday� daha h�zl� derler m
		//interface arac�l��� ile ekndine ahs i�leri yapar
		 
		/*Temel lambda syntax � 
		()->System.out.println("Merhaba Lambda");  �eklindedir bu void gibi de�er d�nd�rmeyen halidir
		(s)->System.out.println("Merhaba Lambda"); bu da i�eriisnde parametre alan hali yani s i al�yor gerisisni yap�yor
		(a,b)->a+b; a-b giri�i varsa bunlar� topla diyor*/

		
		//lmd l =()->System.out.println("Lambda'dan yaz�ld�");
		//l.yaz();  d�nd�rmeyen 
		
		lmd l =(s)->System.out.println("Lambda'dan yaz�ld�");
		l.yaz("�brahim");  // s d�nd�rd� bu y�zden i�ine bir �ey yaz�lmal�
		//lmd l =(a,b)->a+b;
		//System.out.println(l.topla(7, 8));
		
		ArrayList<Integer> liste  =new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<10;i++) liste.add(r.nextInt(20)); //20 ye kadar rasgele say�lar olu�turuyrr 10 defa bunlar� arrak liste [] i�ine at�yor 
		System.out.println(liste);
		
		liste.forEach(p->System.out.println(p+"-"));//listedeki elemanalr�� tek tek al�r listenin elannalr�n� p ye atar ve yaz demi� oluruz
		
		List<Integer> ikiKat = new ArrayList<>(); // otomatik olarak interface kullanamdan ald�
		liste.forEach(p->ikiKat.add(p*2));
		System.out.println(ikiKat);

		
	}

}
