package rettangolo;

public class Main {

	public static void main(String[] args) {
		Rettangolo rettangolo1 = new Rettangolo(0, 0, 4, 0, 4, 3, 0, 3);

		System.out.println(rettangolo1.PosVertici()); 
		System.out.println("Area: " + rettangolo1.calcolaArea());
		System.out.println("Perimetro: " + rettangolo1.calcolaPerimetro()); 
		    

	}

}
