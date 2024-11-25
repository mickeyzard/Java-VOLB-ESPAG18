package rombo;

public class Main {

	public static void main(String[] args) {
		 Rombo rombo1 = new Rombo(0, 0, 2, 4, 4, 0, 2, -4);

		System.out.println(rombo1.PosVertici()); 
		System.out.println("Area: " + rombo1.calcolaArea());
		System.out.println("Perimetro: " + rombo1.calcolaPerimetro()); 

	}

}
