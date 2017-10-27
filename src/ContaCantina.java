public class ContaCantina {

	// Atributos
	
	private String nomeCantina;
	private int counter = 0;
	private int debito;
	private int qntLanche = 0;
	private String[] descricoes = new String[5];

	// Construtores

	public ContaCantina(String nomeDaCantina) {
		this.nomeCantina = nomeDaCantina;
		this.debito = 0;
	}
	
	// Métodos

	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.qntLanche += qtdItens;
		this.debito += valorCentavos;
		adicionaDesc(detalhes);
	}
	
	public void adicionaDesc(String detalhes) {
		descricoes[this.counter] = detalhes;
		this.counter++;
		if (counter == 5){
			counter -= 5;
		}
	}

	public void pagaConta(int valorCentavos) {
		this.debito -= valorCentavos;
	}
	
	public String listarDetalhes() {
		String list = "";
		for(String i : this.descricoes) {
			list += "⟩ " + i + " ⟨";
		}
		return list;
	}

	@Override
	public String toString() {
		return (this.nomeCantina + " " + this.qntLanche + " " + this.debito);
	}
	
}
