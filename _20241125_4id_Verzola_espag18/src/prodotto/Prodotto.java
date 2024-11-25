package prodotto;

public class Prodotto {
	
	private String proprietario;
	private String nomeNegozio;
	
	public Prodotto (String proprietario) {
		this.proprietario = proprietario;
	}
	
	public Prodotto (String proprietario, String nomeNegozio) {
		this.proprietario = proprietario;
		 this.nomeNegozio = nomeNegozio;
		}
}
