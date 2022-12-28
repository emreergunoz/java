package algoritma;

interface arayuz{  //class yazmak yerine interface kelimesi yazýlýr
	int a = 0;
	int b = 1;
	void oku();
	void yaz();
}


class islem implements arayuz{ //interfaceler extend edilmez implement edilir

	@Override
	public void oku() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yaz() {
		// TODO Auto-generated method stub
		
	}
	
}


public class interfaceArayuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		islem is = new islem();
		System.out.println(is.a+ " - " + is.b);
		is.oku();
	}

}
