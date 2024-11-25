package studente;

public class Studente {

	private String cognome;
	private String nome;
	private String codiceFiscale;
	private int numeroMatricola;
	
	public Studente (String cognome, String nome, String codiceFiscale, int numeroMatricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMatricola = numeroMatricola;
    }
	
     public String toString() {
		
		String myStudente = cognome + "\n" + nome +"\n"+codiceFiscale+"\n"+ numeroMatricola;
		return myStudente;
		
	}
	 
}
