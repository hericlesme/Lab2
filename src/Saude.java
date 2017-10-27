
public class Saude {

	// Atributos

	private String saudeMental;
	private String saudeFisica;
	private String emoji;

	// Construtores

	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
		this.emoji = "";
	}

	// Métodos

	public void definirEmoji(String valor) {
		this.emoji = valor;
	}

	public void defineSaudeMental(String saudeMental) {
		this.saudeMental = saudeMental;
		this.emoji = "";
	}

	public void defineSaudeFisica(String saudeFisica) {
		this.saudeFisica = saudeFisica;
	}

	public String geral() {
		String health;
		if (this.saudeMental.equals(this.saudeFisica)) {
			health = this.saudeMental;
		} else {
			health = ("ok");
		}
		return (health + " " + emoji).trim();
	}
}
