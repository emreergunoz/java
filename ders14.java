package VideoDers;

public class ders14 {
	
	public static int topla(int a, int b){
		
		return a+b;
		
	}
	
	public static int topla(int a, int b, int c){
		
		return a+b+c;
		
	}
	

	public static void main(String[] args) {
		ders14 d = new ders14();
		
		int sonuc;
		sonuc = d.topla(5,8);
		System.out.println(sonuc);
		sonuc = d.topla(5,8,13);
		System.out.println(sonuc);
		
	}

}
