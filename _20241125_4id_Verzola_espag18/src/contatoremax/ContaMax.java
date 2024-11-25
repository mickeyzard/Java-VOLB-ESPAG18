package contatoremax;

public class ContaMax {
	private int N;
	private int maxN;
	
	
	public void setMaxN (int maxN) {
		this.maxN = maxN;	
		}
	
	public ContaMax (int N) {
		this.N = N;
	}
	public void incremento() {
		if (N == maxN) {
			System.out.println("Non si può piu incrementare!");
		}else {
			while (N < maxN) {
				N++;
				System.out.println(N);
			}
		}
		N = 0;
	
	
		}
	
	public void decremento() {
		if (N == maxN) {
			System.out.println("Non si può piu decrementare!");
		}else {
			while (N > maxN) {
				N--;
				System.out.println(N);
			}
			N = 0;
		}
			

	}
	
	public void stampaN () {
		 System.out.println("Numero = " + N);
	}

}
