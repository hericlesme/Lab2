
public class ContaLaboratorio {

	// Atributos

	private String nomeDoLaboratorio;
	private int dados = 0;
	private int cota = 2000;

	// Construtores

	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeDoLaboratorio = nomeLaboratorio;

	}

	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeDoLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}

	// Métodos

	public void consomeEspaco(int mbytes) {
		this.dados += mbytes;
	}

	public void liberaEspaco(int mbytes) {
		this.dados -= mbytes;
	}

	public boolean atingiuCota() {
		if (this.dados >= this.cota) {
			return true;
		}
		return false;
	}
	
	public String getLab() {
		return nomeDoLaboratorio;
	}

	@Override
	public String toString() {
		return (this.nomeDoLaboratorio + " " + this.dados + "/" + this.cota);
	}

}
