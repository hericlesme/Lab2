package entidades;

import java.util.ArrayList;

/**
 * Representação de uma conta de cantina. Toda conta precisa ter um nome,
 * debito, quantidade de lanches adquiridos e opcionalmennte uma descrição do
 * lanche.
 * 
 * @author Héricles Emanuel - 117110647
 * 
 */
public class ContaCantina {

	private String nomeCantina;
	private int debito;
	private int qntLanche;
	private ArrayList<String> descricoes = new ArrayList<>();

	/**
	 * Constrói uma conta de cantinia a partir de seu nome. Toda conta começa com os
	 * valores de quantidade de lanche e débito zerados.
	 *
	 * @param nomeDaCantina
	 *            O nome da cantina.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeCantina = nomeDaCantina;
		this.debito = 0;
		this.qntLanche = 0;
	}

	/**
	 * Método cadastra o lanche, incrementando a quantidade de itens adquiridos, e
	 * seu valor em centavos a ser incrementado no débito.
	 * 
	 * @param qtdItens
	 *            Quantidade de itens adquiridos.
	 * @param valorCentavos
	 *            Valor em centavos do lanche.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qntLanche += qtdItens;
		this.debito += valorCentavos;
	}

	/**
	 * Método cadastra o lanche, incrementando a quantidade de itens adquiridos, seu
	 * valor em centavos a ser incrementado no débito e detalhes do lanche.
	 * 
	 * @param qtdItens
	 *            Quantidade de itens adquiridos.
	 * @param valorCentavos
	 *            Valor em centavos do lanche.
	 * @param detalhes
	 *            Descrição do lanche adquirido.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.qntLanche += qtdItens;
		this.debito += valorCentavos;
		descricoes.add(detalhes);
	}

	/**
	 * Altera o débito, reduzindo-o conforme o valor em centavos passado como
	 * parâmetro.
	 * 
	 * @param valorCentavos
	 */
	public void pagaConta(int valorCentavos) {
		this.debito -= valorCentavos;
	}

	/**
	 * Lista os últimos cinco detalhes, no máximo, se forem informados no cadastro
	 * do lanche
	 * 
	 * @return String que representa os detalhes descritos no cadastro do lanche.
	 */
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

	/**
	 * Método get para o nome da cantina
	 * 
	 * @return String que representa o nome da cantina.
	 */
	public String getCantina() {
		return nomeCantina;
	}

	/**
	 * Retorna a String que representa a conta de cantina. A representação segue o
	 * formato: “Nome da cantina - quantidade de lanches - débito”.
	 *
	 * @return a representação em String de uma conta de cantina.
	 */
	@Override
	public String toString() {
		return (this.nomeCantina + " " + this.qntLanche + " " + this.debito);
	}

}
