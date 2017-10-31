package entidades;

import java.util.ArrayList;

public class ContaCantina {

	// Atributos

	private String nomeCantina;
	private int debito;
	private int qntLanche = 0;
	private ArrayList<String> descricoes = new ArrayList<>();

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

	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.qntLanche += qtdItens;
		this.debito += valorCentavos;
		descricoes.add(detalhes);
	}

	public void pagaConta(int valorCentavos) {
		this.debito -= valorCentavos;
	}

	public String listarDetalhes() {
		String list = "";
		int limite = 5;
		if (descricoes.size() < 5) {
			limite = descricoes.size();
		}

		for (int i = descricoes.size() - limite; i < descricoes.size(); i++) {
			list += "- " + descricoes.get(i) + " -";
		}
		return list;
	}

	public String getCantina() {
		return nomeCantina;
	}

	@Override
	public String toString() {
		return (this.nomeCantina + " " + this.qntLanche + " " + this.debito);
	}

}
