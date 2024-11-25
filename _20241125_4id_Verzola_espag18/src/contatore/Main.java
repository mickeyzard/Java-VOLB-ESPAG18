package contatore;

public class Main {

	public static void main(String[] args) {
		
		Contatore conta = new Contatore (16);
		conta.stampaN();
		conta.incrementa();
		conta.stampaN();
		conta.decrementa();
		conta.decrementa();
		conta.stampaN();
	}

}
