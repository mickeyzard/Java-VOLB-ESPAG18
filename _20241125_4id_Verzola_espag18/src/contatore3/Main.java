package contatore3;


public class Main {
	public static void main(String[] args) {
		 Contatore3 conta1 = new Contatore3(2, 20);
			conta1.stampaN();
			conta1.setMaxN(10);
			conta1.decrementa();
			conta1.setMaxN(20);
			conta1.stampaN();
			conta1.incrementa();
	}
}
