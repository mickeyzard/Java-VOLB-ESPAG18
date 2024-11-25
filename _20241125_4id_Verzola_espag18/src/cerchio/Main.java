package cerchio;

public class Main {

	public static void main(String[] args) {
		Cerchio cerchio1 = new Cerchio (0,0,7); //new Cerchio(raggio);
		cerchio1.puntiCerchio();
		System.out.println("Perimetro: " + cerchio1.perimetroC());
		System.out.println("Area: " + cerchio1.areaC());

	}

}
