package algoritma;

abstract class soyutSinif{
	int a,b;
	abstract void soyutMetod();
	
	void yaz() {
		System.out.println("Ben soyut s�n�f i�inden yazd�r�ld�m");
	}	
}

class somutSinif extends soyutSinif{

	@Override
	void soyutMetod() {
		System.out.println("Somut s�n�f i�inde soyut metod");		
	}
	
}



public class abstractSiniflar {

	public static void main(String[] args) {
		
		//soyutSinif soyutNesne = new soyutSinif(); Abstract S�n�ftan nesne t�retilemez.

		somutSinif somutNesne = new somutSinif();
		somutNesne.yaz();
		somutNesne.soyutMetod();
	}

}
