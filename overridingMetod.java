package algoritma;

class anaSinif{
	void yaz() {
		System.out.println("Bu yaz� anas�n�ftan yaz�ld�");
	}
	
	void oku() {
		System.out.println("Oku metodu �al���yor");
	}
}

class altSinif extends anaSinif{
	void yaz() {
		System.out.println("Bu yaz� alts�n�ftan yaz�ld�");
	}
}



public class overridingMetod {

	public static void main(String[] args) {
		// Override 
		anaSinif ana = new anaSinif();
		ana.yaz();
		
		altSinif alt = new altSinif();
		alt.yaz();  //buradaki yaz metotu anas�n�ftaki yaz metodunu engelliyor(override ediyor) 
		alt.oku(); // override yap�lmad�, yap�lmas� i�in alts�n�fta oku metodu a�mam gerekiyor
	}

}
