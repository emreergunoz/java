import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class lambdaornek1 {
	static Boolean asal(int p) {
		int bolensayac=0;
		for(int i=2;i<p;i++) {
			if(p%i==0) bolensayac++;
	}
	if (bolensayac==0) return true ; else return false ;
	}
	

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> liste = new ArrayList<>();
		for(int i =0;i<10;i++) liste.add(r.nextInt(100));
		System.out.println(liste);
		
		
		//map ile condition kullanýmý
		List<Integer> lm = liste.stream().
				map(a-> {
					if(a>50 && a%2==0) a+=5;  //aþaðýda reducedeki de kullanýlýr ama o zmana çoklu koþul atýlma
					else if (a<50 && a>10) a-=5;//burda çoklu koþul lkullanýlabileceði için
					else a++;
					return a;
					
				}).collect(Collectors.toList());
		System.out.println(lm);
		
		//map ile methot çaðýrma
		List<Integer> lmasal = liste.stream().
				map(p-> {
					if (asal(p)&&p>50)p=p; //yulkarda tanýmladýðýmýz asal fonksiyonunu çaðýrýdk ve listedeki 50 den büyük olan asallarý bulduk
					else p=0;
					return p ;
				}).collect(Collectors.toList());
		System.out.println(lmasal);
		
		//filter ile çoklu condition(koþul)
		
		List<Integer> lf = liste.stream().
				filter(p->(p>50 && p<90 && asal(p)))//yulkarda tanýmladýðýmýz asal fonksiyonunu çaðýrýdk ve listedeki 50 den büyük olan asallarý bulduk
				.collect(Collectors.toList());
		System.out.println(lf);
		
		
		// reduce çoklu condutions 
		Optional<Integer> islem = liste.stream().
				reduce((p1,p2)->p1>p2? (p1-p2): (p1+p2));//p1 ve p2 elemnalýný al,, p1 p2 den büyük ise ((? ile yapýlýyor)) eevt ise çýkar 
		System.out.println(islem.get());                //((: bunun ile dururmun tam tersi)) topla
		


	}

}
