package sorular;

import java.util.Arrays;

public class Lynchbell {

	public static void main(String[] args) {
		//Emre Ergün Öz
				//19410051002
				//kod sayýlar bülüyor ancak istediðiniz sayýlar deðil 
				//deðiþtiirp üzerinde oynayým farklý kodlar ile denememe raðmen sonuca ulaþamadým
				// yaptýðýmý düþündüðüm en mantýklý olan bu olduðu için bunu attým
				int[]dizi =new int[5000];
				int[]dizi2=new int[5];
				int sayac2 = 0;
				int sayac = 0;
				  for (int i=10000;i<100000;i++) { // sayýlarý almak için döngü
					  String x = Integer.toString(i); //sayýyý string e çevirdik 
					  for(int j=0;j<x.length();j++) { // sitring sayýnýn elemanýný seçmek için 
						  int a=Integer.valueOf(x.charAt(j)); // string in seçilen sayýsýný tekrar int yaptýk ki iþlem yapabilelim
						  dizi2[0]= a; //tek elemanlý dizinin içine koyduk
						  for (int k = 0; k < dizi2.length; k++) {// bu for döngüsünð çýkarýp uyarlayýnca  sonuç gene yanlýþ oluyor ama nedeni bulamadým 
							  if (dizi2[k]==0) { //indisde 0 varsa yoksaymak için yaptým ancak istemedim þekilde çalýþýyor
								  break;
							  }else if (i%dizi2[k]!=0) { // seçtiðimiz sayý seçiken büyük sayýya bölünmüyor ise atlamak için
								  break;
								  
							  }else { //bölünüyor ise sayaç artçak
								  sayac2++;
							  } 
							  if (sayac2==5) {  // üstdeki son döngü 5 defa çalýþýrsa sayý doðrudur demektir
								  dizi[sayac]=i;sayac++;sayac2=0; //diizye ekle sayac2 artýr ve sayac 2 yi sýfýrla
							  }                                  //sayac dizinin indisi için sayac2 de üsttün 5 defa doðrulandýðý için 
						  }
					  }  
				  }
				  System.out.print(Arrays.toString(dizi));
			

	}

}
