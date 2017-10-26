public class ContaCantina {

	// Atributos

	private String nomeCantina;
	private int debito;
	private int qntLanche = 0;

	// Construtores

	public ContaCantina(String nomeDaCantina) {
		this.nomeCantina = nomeDaCantina;
		this.debito = 0;
	}

	// Métodos

	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qntLanche += qtdItens;
		this.debito += valorCentavos;
	}

	public void pagaConta(int valorCentavos) {
		this.debito -= valorCentavos;
	}

	@Override
	public String toString() {
		return (this.nomeCantina + " " + this.qntLanche + " " + this.debito);
	}
}
