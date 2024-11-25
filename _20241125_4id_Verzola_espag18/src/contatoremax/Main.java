package contatoremax;

public class Main {

	public static void main(String[] args) {
		ContaMax contaM = new ContaMax (20);
		contaM.stampaN();
		contaM.setMaxN(10);
		contaM.decremento();
		contaM.setMaxN(20);
		contaM.stampaN();
		contaM.incremento();

	}

}
