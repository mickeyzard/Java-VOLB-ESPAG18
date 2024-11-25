package telefonoCellulare;

public class TelefonoCellulare {
    private String marca;
    private String modello;
    private int memoria;
    private float prezzo;

    
    public TelefonoCellulare(String marca, String modello, int memoria, float prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.memoria = memoria;
        this.prezzo = prezzo;
    }

    public void accendi() {
        System.out.println("\nIl telefono si è accesso.");
    }

    public void spegni() {
        System.out.println("Il telefono si è spento.");
    }

    public void chiama(String numero) {
        System.out.println("Chiamata in corso verso il: " + numero);
    }

    public void inviaSMS(String numero) {
        System.out.println("Inviato un SMS a " + numero);
    }
    
    public String toString() {
    	String myCellulare = "Cellulare Utente: " +"\nmarca='" + marca +"\nmodello='" 
                             + modello + "\nmemoria=" + memoria +  "\nprezzo =" + prezzo;
        return myCellulare;
    }
}


