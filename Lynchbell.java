package sorular;

import java.util.Arrays;

public class Lynchbell {

	public static void main(String[] args) {
		//Emre Erg�n �z
				//19410051002
				//kod say�lar b�l�yor ancak istedi�iniz say�lar de�il 
				//de�i�tiirp �zerinde oynay�m farkl� kodlar ile denememe ra�men sonuca ula�amad�m
				// yapt���m� d���nd���m en mant�kl� olan bu oldu�u i�in bunu att�m
				int[]dizi =new int[5000];
				int[]dizi2=new int[5];
				int sayac2 = 0;
				int sayac = 0;
				  for (int i=10000;i<100000;i++) { // say�lar� almak i�in d�ng�
					  String x = Integer.toString(i); //say�y� string e �evirdik 
					  for(int j=0;j<x.length();j++) { // sitring say�n�n eleman�n� se�mek i�in 
						  int a=Integer.valueOf(x.charAt(j)); // string in se�ilen say�s�n� tekrar int yapt�k ki i�lem yapabilelim
						  dizi2[0]= a; //tek elemanl� dizinin i�ine koyduk
						  for (int k = 0; k < dizi2.length; k++) {// bu for d�ng�s�n� ��kar�p uyarlay�nca  sonu� gene yanl�� oluyor ama nedeni bulamad�m 
							  if (dizi2[k]==0) { //indisde 0 varsa yoksaymak i�in yapt�m ancak istemedim �ekilde �al���yor
								  break;
							  }else if (i%dizi2[k]!=0) { // se�ti�imiz say� se�iken b�y�k say�ya b�l�nm�yor ise atlamak i�in
								  break;
								  
							  }else { //b�l�n�yor ise saya� art�ak
								  sayac2++;
							  } 
							  if (sayac2==5) {  // �stdeki son d�ng� 5 defa �al���rsa say� do�rudur demektir
								  dizi[sayac]=i;sayac++;sayac2=0; //diizye ekle sayac2 art�r ve sayac 2 yi s�f�rla
							  }                                  //sayac dizinin indisi i�in sayac2 de �stt�n 5 defa do�ruland��� i�in 
						  }
					  }  
				  }
				  System.out.print(Arrays.toString(dizi));
			

	}

}
