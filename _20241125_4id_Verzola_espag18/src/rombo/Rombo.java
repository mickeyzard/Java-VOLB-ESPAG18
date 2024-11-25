package rombo;

public class Rombo {
	
	private float x1, y1;
    private float x2, y2; 
    private float x3, y3; 
    private float x4, y4; 
    private float diagonaleMin;
    private float diagonaleMaj;
    private float perimetro;
    private float area;


    public Rombo(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }

   

    private float distanza(float x1, float y1, float x2, float y2) {
        return (float)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private float calcolaDiagonaleMaggiore() {
        diagonaleMaj = distanza(x1, y1, x3, y3);
        return diagonaleMaj;
    }

    private float calcolaDiagonaleMinore() {
         diagonaleMin = distanza(x2, y2, x4, y4);
         return diagonaleMin;
    }

    public float calcolaArea() {
        float diagonaleMaggiore = calcolaDiagonaleMaggiore();
        float diagonaleMinore = calcolaDiagonaleMinore();
        area = (diagonaleMaggiore * diagonaleMinore) / 2;
        return area;
    }

    public float calcolaPerimetro() {
        perimetro = (diagonaleMin*2) + (diagonaleMaj*2);
        return perimetro;
    }

    public String PosVertici() {
    	String myVertici = "Vertici del rombo = (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), "
    			            + "(" + x3 + ", " + y3 + "), (" + x4 + ", " + y4 + ")]";
    	return myVertici;
    }

}
