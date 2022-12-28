import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class mapfilterreduce {

	public static void main(String[] args) {
		// Streaming api �zerinde �al���yor
		//�al��an sistemde durdurulmadan g�ncellenmesi
		
		
		ArrayList<Integer> sayilar  =new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<5;i++) sayilar.add(r.nextInt(20)); //20 ye kadar rasgele say�lar olu�turuyrr 10 defa bunlar� arrak liste [] i�ine at�yor 
		System.out.println(sayilar);
		
		//map 
		
		List<Integer> lm = sayilar.stream().map(p->p-3).collect(Collectors.toList());//sayilar listesini al map ile elemanlar� al�p her elemandan 3 ��kar collector ile bunu canl� olarak yap
		System.out.println(lm);

		
		//filter
		List<Integer> lf = sayilar.stream().filter(p->p%2==1).collect(Collectors.toList());//p mod 2 1 e e�itse yani say� tek ise filtrele diyoruz
		System.out.println(lf);
		List<Integer> lff = sayilar.stream().filter(p->p>=5).collect(Collectors.toList());//p 5 den b�y�k yada e�it ise al
		System.out.println(lff);
		
		//reduce
		// 2 li elemanlar� la�p i�leme sokar 
		//Basit int e s�n�f Integer � toplayamay�z bu y�zden optional kullan�yoruz
		//P1 ve p2 Yukardaki arrayden Integer dan geldi�i i�in optional yerine int kullansak basit int kulland���m�z i�in uyar� vericek
		Optional<Integer> toplam = sayilar.stream().reduce((p1,p2)->p1+p2); // ilk say� ile 2. say�y� toplar yeni say� ilk say� olur bu sefer yeni 2 yani 3. say�y� al�r ve b�t�n say�lar� toplam�� oluruz
		System.out.println(toplam); // direk bu �eklide yazarsak opt,onl olarak bulcak
		System.out.println(toplam.get());// burdada optinal olmayan verisyonunu yazar
	}

}
