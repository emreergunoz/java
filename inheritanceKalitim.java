package algoritma;

class cokgen {
	int kenarSayisi;	
}

class ucgen extends cokgen{ //inheritance (miras alma - kalıtım)
	int taban, yukseklik;
	
	ucgen(){
		taban=5;
		yukseklik=3;
	}
	
	ucgen(int t,int y){
		taban = t;
		yukseklik = y; 
	}
	
	float alan() {
		return (float)taban*yukseklik/2;
	}
}

class dortgen extends cokgen{
	int kenar1,kenar2;
	float alan(int k1,int k2) {
		kenar1 = k1;
		kenar2 = k2;
		return kenar1*kenar2;
	}
}

class dikucgen extends ucgen{
	
}




public class inheritanceKalitim {

	public static void main(String[] args) {
		cokgen cg = new cokgen();
		cg.kenarSayisi = 2;
		System.out.println(cg.kenarSayisi);

		ucgen ug = new ucgen();
		ug.kenarSayisi = 3;
		System.out.println(ug.kenarSayisi);
		//ug.taban=5;
		//ug.yukseklik=3;
		System.out.println(ug.alan());
		
		dortgen dg = new dortgen();
		dg.kenar1=5;
		dg.kenar2=7;
		System.out.println(dg.alan(4,8));
		
		dikucgen du =new dikucgen();
		System.out.println(du.alan());
	}

}
