package auto;

public class Auto {
	private String nomeMarca;
	private String nomeModello;
	private String targa;
	private int annoImmatricolazione;
	
	public Auto (String nomeMarca, String nomeModello, String targa, int annoImmatricolazione) {
        this.nomeMarca = nomeMarca;
        this.nomeModello = nomeModello;
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }
	
     public String toString() {
		
		String myAuto = nomeMarca + "\n" + nomeModello +"\n"+targa+"\n"+annoImmatricolazione;
		return myAuto;
		
	}
	 
}

