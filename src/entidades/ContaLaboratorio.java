package entidades;

/**
 * Representação de uma conta de laboratório. Toda conta precisa ter um nome e
 * uma cota de dados, seja predefinida ou não, sendo possível alterar e
 * consultar a quantidade de dados armazenados.
 * 
 * @author Héricles Emanuel - 117110647
 * 
 */
public class ContaLaboratorio {

	private String nomeDoLaboratorio;
	private int dados;
	private int cota;

	/**
	 * Constrói uma conta de laboratorio a partir de seu nome. Toda conta começa com
	 * uma cota de dados de 2000 Megabytes.
	 *
	 * @param nomeLaboratorio
	 *            O nome da conta do laboratório.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this(nomeLaboratorio, 2000);

	}

	/**
	 * Constrói uma conta de laboratorio a partir de seu nome e cota de dados em
	 * Megabytes.
	 *
	 * @param nomeLaboratorio
	 *            O nome do laboratório.
	 * @param cota
	 *            A cota de dados que limita a quantidade máxima de Megabytes
	 *            utilizados.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeDoLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}

	/**
	 * Método que adiciona dados à conta, consumindo espaço, em Megabytes.
	 * 
	 * @param mbytes
	 *            Espaço em Megabytes a ser consumido.
	 */
	public void consomeEspaco(int mbytes) {
		this.dados += mbytes;
	}

	/**
	 * Método que remove dados à conta, liberando espaço, em Megabytes.
	 * 
	 * @param mbytes
	 *            Espaço em Megabytes a ser liberado.
	 */
	public void liberaEspaco(int mbytes) {
		this.dados -= mbytes;
	}

	/**
	 * Indica se o limite de dados foi atingido ou não.
	 * 
	 * @return valor booleano, que mostra se o limite foi atingido (true), ou não
	 *         (false).
	 */
	public boolean atingiuCota() {
		if (this.dados >= this.cota) {
			return true;
		}
		return false;
	}

	/**
	 * Método get para o nome do laboratório.
	 * 
	 * @return String que representa o nome do Laboratório.
	 * 
	 */
	public String getLab() {
		return nomeDoLaboratorio;
	}

	/**
	 * Retorna a String que representa a conta de laboratorio. A representação segue
	 * o formato: “Nome do laboratorio - dados/cota” (em Megabytes).
	 *
	 * @return a representação em String de uma conta de laboratorio.
	 */
	@Override
	public String toString() {
		return this.nomeDoLaboratorio + " " + this.dados + "/" + this.cota;
	}

}
