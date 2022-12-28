import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class mapfilterreduce {

	public static void main(String[] args) {
		// Streaming api üzerinde çalýþýyor
		//Çalýþan sistemde durdurulmadan güncellenmesi
		
		
		ArrayList<Integer> sayilar  =new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<5;i++) sayilar.add(r.nextInt(20)); //20 ye kadar rasgele sayýlar oluþturuyrr 10 defa bunlarý arrak liste [] içine atýyor 
		System.out.println(sayilar);
		
		//map 
		
		List<Integer> lm = sayilar.stream().map(p->p-3).collect(Collectors.toList());//sayilar listesini al map ile elemanlarý alýp her elemandan 3 çýkar collector ile bunu canlý olarak yap
		System.out.println(lm);

		
		//filter
		List<Integer> lf = sayilar.stream().filter(p->p%2==1).collect(Collectors.toList());//p mod 2 1 e eþitse yani sayý tek ise filtrele diyoruz
		System.out.println(lf);
		List<Integer> lff = sayilar.stream().filter(p->p>=5).collect(Collectors.toList());//p 5 den büyük yada eþit ise al
		System.out.println(lff);
		
		//reduce
		// 2 li elemanlarý laýp iþleme sokar 
		//Basit int e sýnýf Integer ý toplayamayýz bu yüzden optional kullanýyoruz
		//P1 ve p2 Yukardaki arrayden Integer dan geldiði için optional yerine int kullansak basit int kullandýðýmýz için uyarý vericek
		Optional<Integer> toplam = sayilar.stream().reduce((p1,p2)->p1+p2); // ilk sayý ile 2. sayýyý toplar yeni sayý ilk sayý olur bu sefer yeni 2 yani 3. sayýyý alýr ve bütün sayýlarý toplamýþ oluruz
		System.out.println(toplam); // direk bu þeklide yazarsak opt,onl olarak bulcak
		System.out.println(toplam.get());// burdada optinal olmayan verisyonunu yazar
	}

}
