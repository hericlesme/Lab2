package entidades;

/**
 * Representação do estado de saude. Este possuindo saúde física e mental. Além
 * disso, é possível definir um emoji que representa a última sensação do
 * usuário.
 * 
 * @author Héricles Emanuel - 117110647
 * 
 */
public class Saude {

	private String saudeMental;
	private String saudeFisica;
	private String emoji;

	/**
	 * Constrói o estado de saúde. A saúde física e mental são definidas como boas,
	 * por padrão. podendo ser alteradas. O emoji, que representa a ultima sensação
	 * registrada é inicialmente uma String vazia.
	 */
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
		this.emoji = "";
	}

	/**
	 * Define um emoji, representado em String para a última sensação registrada.
	 * 
	 * @param valor
	 *            String que representa a última sensação em forma de emoji.
	 */
	public void definirEmoji(String valor) {
		this.emoji = valor;
	}

	/**
	 * Altera o estado de saúde mental. Se houver emoji definido, e ocorrer alguma
	 * alteração mental, o emoji é resetado.
	 * 
	 * @param saudeMental
	 *            String que representa o estado da saude mental.
	 */
	public void defineSaudeMental(String saudeMental) {
		this.saudeMental = saudeMental;
		this.emoji = "";
	}

	/**
	 * Altera o estado de saúde física.
	 * 
	 * @param saudeFisica
	 *            String que representa o estado da saúde física.
	 */
	public void defineSaudeFisica(String saudeFisica) {
		this.saudeFisica = saudeFisica;
	}

	/**
	 * Retorna em String a representação do resultado geral da saúde do usuário com
	 * base na saúde Física e Mental. Se forem diferentes, o resultado retornado
	 * será "ok", caso contrário, o valor retornado é igual ao valor das mesmas. O
	 * emoji, caso definido, também é representado.
	 * 
	 * @return String que representa saúde geral e emoji registrados.
	 */
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
