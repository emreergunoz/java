package VideoDers;

class kup{
	int en;
	int boy;
	int yukseklik;
	
	int kupHacmi(){
		return en*boy*yukseklik;
	}
	
	kup(){
		en = 10;
		boy = 20;
		yukseklik = 30;
	}
	
	kup(int e, int b, int y){ // overloaded constructer metod
		en = e;
		boy = b;
		yukseklik = y;
	}
	
	
	
}

public class ders17 {

	public static void main(String[] args) {
		kup k = new kup();
		
		System.out.println(k.kupHacmi());

		kup k2 = new kup(5,10,15);
		System.out.println(k2.kupHacmi());
		
	}

}
