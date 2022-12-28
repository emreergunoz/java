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
		
		
		//map ile condition kullan�m�
		List<Integer> lm = liste.stream().
				map(a-> {
					if(a>50 && a%2==0) a+=5;  //a�a��da reducedeki de kullan�l�r ama o zmana �oklu ko�ul at�lma
					else if (a<50 && a>10) a-=5;//burda �oklu ko�ul lkullan�labilece�i i�in
					else a++;
					return a;
					
				}).collect(Collectors.toList());
		System.out.println(lm);
		
		//map ile methot �a��rma
		List<Integer> lmasal = liste.stream().
				map(p-> {
					if (asal(p)&&p>50)p=p; //yulkarda tan�mlad���m�z asal fonksiyonunu �a��r�dk ve listedeki 50 den b�y�k olan asallar� bulduk
					else p=0;
					return p ;
				}).collect(Collectors.toList());
		System.out.println(lmasal);
		
		//filter ile �oklu condition(ko�ul)
		
		List<Integer> lf = liste.stream().
				filter(p->(p>50 && p<90 && asal(p)))//yulkarda tan�mlad���m�z asal fonksiyonunu �a��r�dk ve listedeki 50 den b�y�k olan asallar� bulduk
				.collect(Collectors.toList());
		System.out.println(lf);
		
		
		// reduce �oklu condutions 
		Optional<Integer> islem = liste.stream().
				reduce((p1,p2)->p1>p2? (p1-p2): (p1+p2));//p1 ve p2 elemnal�n� al,, p1 p2 den b�y�k ise ((? ile yap�l�yor)) eevt ise ��kar 
		System.out.println(islem.get());                //((: bunun ile dururmun tam tersi)) topla
		


	}

}
