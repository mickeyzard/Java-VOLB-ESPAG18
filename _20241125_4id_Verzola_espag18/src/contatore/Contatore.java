package contatore;

public class Contatore {
	
	private int N;
	public Contatore (int N) {
		this.N = N;
	}
	public int incrementa() {
		N++;
		return N;
	}
	public int decrementa() {
		N--;
		return N;
	}
	public void stampaN () {
		 System.out.println(N);
	}
}
