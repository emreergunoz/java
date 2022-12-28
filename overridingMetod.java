package algoritma;

class anaSinif{
	void yaz() {
		System.out.println("Bu yazý anasýnýftan yazýldý");
	}
	
	void oku() {
		System.out.println("Oku metodu çalýþýyor");
	}
}

class altSinif extends anaSinif{
	void yaz() {
		System.out.println("Bu yazý altsýnýftan yazýldý");
	}
}



public class overridingMetod {

	public static void main(String[] args) {
		// Override 
		anaSinif ana = new anaSinif();
		ana.yaz();
		
		altSinif alt = new altSinif();
		alt.yaz();  //buradaki yaz metotu anasýnýftaki yaz metodunu engelliyor(override ediyor) 
		alt.oku(); // override yapýlmadý, yapýlmasý için altsýnýfta oku metodu açmam gerekiyor
	}

}
