
public class Saude {
	
	// Atributos
	
	private String saudeMental;
	private String saudeFisica;
	
	// Construtores
	
	public Saude(){
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}
	
	// Métodos

	public void defineSaudeMental(String saudeMental) {
		this.saudeMental = saudeMental;
	}

	public void defineSaudeFisica(String saudeFisica) {
		this.saudeFisica = saudeFisica;
	}

	public String saudeGeral() {
		if (this.saudeMental.equals(this.saudeFisica)) {
			if (this.saudeFisica.equals("boa")) {
				return ("boa");
			} else {
				return ("fraca");
			}
		} else {
			return("ok");
		}
	}
}
