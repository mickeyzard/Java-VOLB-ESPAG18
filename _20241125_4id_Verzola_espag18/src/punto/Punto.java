package punto;

import java.lang.Math;

public class Punto {
	
	private double x;
	private double y;
	private double distanzaO;
	
	public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
	
	public void mostraXY() {
		
		System.out.println("Punto X:" + x);
		System.out.println("Punto Y:" + y);
		
	}
	
	public double distanzaOrigine() {
		
		distanzaO = Math.sqrt(x*x + y*y);
		return distanzaO;
	}

}
