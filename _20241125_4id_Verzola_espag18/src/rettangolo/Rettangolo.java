package rettangolo;

public class Rettangolo {
	    private float x1, y1; 
	    private float x2, y2; 
	    private float x3, y3; 
	    private float x4, y4; 
	    private float perimetro;
	    private float area;


	    public Rettangolo(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
	        this.x1 = x1; this.y1 = y1;
	        this.x2 = x2; this.y2 = y2;
	        this.x3 = x3; this.y3 = y3;
	        this.x4 = x4; this.y4 = y4;
	    }

	    
	    private float distanza(float x1, float y1, float x2, float y2) {
	        return (float)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }

	    public float calcolaArea() {
	        float base = distanza(x1, y1, x2, y2);
	        float altezza = distanza(x2, y2, x3, y3);
	        area = base * altezza;
	        return area;
	    }

	    public float calcolaPerimetro() {
	        float base = distanza(x1, y1, x2, y2);
	        float altezza = distanza(x2, y2, x3, y3);
	        perimetro =  2 * (base + altezza);
	        return perimetro;
	    }
	    
	    public String PosVertici() {
	        String myVertici = "Vertici del Rettangolo = (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), "
	        		            + "(" + x3 + ", " + y3 + "), (" + x4 + ", " + y4 + ")]";
	        return myVertici;
	    }

	}


