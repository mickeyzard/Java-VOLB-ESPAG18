package contatore3;

public class Contatore3 {
	private int N;
	private int maxN;
	private int P;
	
	
	public void setMaxN (int maxN) {
		this.maxN = maxN;	
		}
	
	public Contatore3 (int P, int N) {
		this.P = P;
		this.N = N;
	}
	public void incrementa() {
		if (N == maxN) {
			System.out.println("Non si può piu incrementare!");
		}else {
			while (N < maxN) {
				N = N + P;;
				System.out.println(N);
			}
		}
		N = 0;
    }

    public void decrementa() {
    	if (N == maxN) {
			System.out.println("Non si può piu decrementare!");
		}else {
			while (N > maxN) {
				N = N - P;;
				System.out.println(N);
			}
		}
		N = 0; 
    }
			

	
	public void stampaN () {
		 System.out.println("Numero = " + N);
	}

}
