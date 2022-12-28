package algoritma;

class hayvan{
	void ses() {
		System.out.println("Hayvan�n ��kard��� ses");
	}	
}

class kedi extends hayvan {
	void ses() {
		System.out.println("Miyav");
	}
}

class kopek extends hayvan {
	void ses() {
		System.out.println("Hav");
	}
}

class kus extends hayvan {
	void ses() {
		System.out.println("Cikcik");
	}
}

class hayvanSesi extends hayvan{
	void ses(hayvan hvyn) { //metodun giri� parametresi bir s�n�f/nesne
		hvyn.ses();
	}	
}

public class polymorphismOrnek {	

	public static void main(String[] args) {
		// Polymorphism - �ok bi�imlilik
		hayvan h = new hayvan();
		h.ses();
		
		kedi k = new kedi();
		k.ses();
		
		kopek ko = new kopek();
		ko.ses();
		
		kus ku = new kus();
		ku.ses();
		
		hayvanSesi hs = new hayvanSesi();
		hs.ses(new kopek());
		hs.ses(ko);
	
		
	}

}
