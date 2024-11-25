package cerchio;

public class Cerchio {
	
	private int xC;
	private int yC;
	private float raggio;
	private float perimetro;
	private float area;
	public Cerchio (int xC, int yC, float raggio) {
		this.xC = xC;
		this.yC = yC;
		this.raggio = raggio;
	}
	
	public void puntiCerchio () {
		System.out.println("punto x: " + xC + "\npunto y: " + yC);
	}
	
	public float perimetroC() {
		perimetro = (float) Math.PI * raggio * 2;
		return perimetro;
		
	}
	
	public float areaC() {
		area = (float) Math.PI * raggio * raggio;
		return area;
		
	}

}
