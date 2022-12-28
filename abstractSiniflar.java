package algoritma;

abstract class soyutSinif{
	int a,b;
	abstract void soyutMetod();
	
	void yaz() {
		System.out.println("Ben soyut sýnýf içinden yazdýrýldým");
	}	
}

class somutSinif extends soyutSinif{

	@Override
	void soyutMetod() {
		System.out.println("Somut sýnýf içinde soyut metod");		
	}
	
}



public class abstractSiniflar {

	public static void main(String[] args) {
		
		//soyutSinif soyutNesne = new soyutSinif(); Abstract Sýnýftan nesne türetilemez.

		somutSinif somutNesne = new somutSinif();
		somutNesne.yaz();
		somutNesne.soyutMetod();
	}

}
