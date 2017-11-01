package entidades;

import java.util.ArrayList;

/**
 * Representação de um aluno. O aluno pode ter um conjunto de contas no
 * laboratorio, disciplinas, contas na cantina, e seu estado saúde. Todo aluno
 * precisa ter um nome e é unicamente identificado por esse nome.
 * 
 * @author Héricles Emanuel - 117110647
 */
public class Aluno {

	private String nomeAluno;
	private ArrayList<ContaLaboratorio> contaLab;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<ContaCantina> contaCantina;
	private Saude saude;

	/**
	 * Constrói um aluno a partir de seu nome. Todos os Arrays são vazios até que
	 * seja adicionado algum objeto. A saúde tem os valores padrões do objeto
	 * construído.
	 * 
	 * @param nomeAluno
	 *            O nome do aluno.
	 */
	public Aluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		this.contaLab = new ArrayList<ContaLaboratorio>();
		this.disciplinas = new ArrayList<Disciplina>();
		this.contaCantina = new ArrayList<ContaCantina>();
		this.saude = new Saude();
	}

	/**
	 * Método que procura uma conta de laboratório na lista tal objeto pelo seu
	 * nome.
	 * 
	 * @param nomeLaboratorio
	 *            String que representa o nome da conta de laboratório a ser
	 *            encontrada.
	 * @return Objeto do tipo ContaLaboratório encontrado.
	 */
	private ContaLaboratorio searchLab(String nomeLaboratorio) {
		ContaLaboratorio lab = null;
		for (int i = 0; i < contaLab.size(); i++) {
			if (nomeLaboratorio.equals(contaLab.get(i).getLab())) {
				lab = contaLab.get(i);
			}
		}
		return lab;
	}

	/**
	 * Método que procura uma Disciplina na lista tal objeto pelo seu nome.
	 * 
	 * @param nomeDisciplina
	 *            String que representa o nome da Disciplina a ser encontrada.
	 * @return Objeto do tipo Disciplina encontrado.
	 */
	private Disciplina searchDisc(String nomeDisciplina) {
		Disciplina disc = null;
		for (int i = 0; i < disciplinas.size(); i++) {
			if (nomeDisciplina.equals(disciplinas.get(i).getDisc())) {
				disc = disciplinas.get(i);
			}
		}
		return disc;
	}

	/**
	 * Método que procura uma conta de cantina na lista tal objeto pelo seu nome.
	 * 
	 * @param nomeDaCantinna
	 *            String que representa o nome da conta de Cantina a ser encontrada.
	 * @return Objeto do tipo ContaCantina encontrado.
	 */
	private ContaCantina searchCantina(String nomeDaCantina) {
		ContaCantina cantina = null;
		for (int i = 0; i < contaCantina.size(); i++) {
			if (nomeDaCantina.equals(contaCantina.get(i).getCantina())) {
				cantina = contaCantina.get(i);
			}
		}
		return cantina;
	}

	/**
	 * Chama o construtor do objeto do tipo ContaLaboratório, inicializa e o
	 * adiciona à lista de objetos do mesmo tipo.
	 * 
	 * @param nomeLaboratorio
	 *            Nome da conta do laboratorio a ser criada.
	 */
	public void cadastraLaboratorio(String nomeLaboratorio) {
		ContaLaboratorio novoLaboratorio = new ContaLaboratorio(nomeLaboratorio);
		this.contaLab.add(novoLaboratorio);
	}

	/**
	 * Chama o construtor do objeto do tipo ContaLaboratório, inicializa e o
	 * adiciona à lista de objetos do mesmo tipo.
	 * 
	 * @param nomeLaboratorio
	 *            Nome da conta do Laboratorio a ser criada.
	 * @param cota
	 *            Quantidade Limite de Armazenamento em Megabytes.
	 */
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		ContaLaboratorio novoLaboratorio = new ContaLaboratorio(nomeLaboratorio, cota);
		this.contaLab.add(novoLaboratorio);
	}

	/**
	 * Invoca o método da classe ContaLaboratório que consome espaço adicionando
	 * dados à conta.
	 * 
	 * @param nomeLaboratorio
	 *            Nome da conta do laboratório.
	 * @param mbytes
	 *            quantidade de mbytes a ser consumida.
	 */
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		searchLab(nomeLaboratorio).consomeEspaco(mbytes);
	}

	/**
	 * Invoca o método da classe ContaLaboratório que libera espaço removendo dados
	 * à conta.
	 * 
	 * @param nomeLaboratorio
	 *            Nome da conta do laboratório.
	 * @param mbytes
	 *            quantidade de mbytes a ser liberada.
	 */
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		searchLab(nomeLaboratorio).liberaEspaco(mbytes);
	}

	/**
	 * Invoca método da classe ContaLaboratório que indica se o limite de dados foi
	 * atingido ou não.
	 * 
	 * @param nomeLaboratorio
	 *            Nome da conta do Laboratório
	 * @return O retorno do método. Valor booleano, que mostra se o limite foi
	 *         atingido (true), ou não (false).
	 */
	public boolean atingiuCota(String nomeLaboratorio) {
		return searchLab(nomeLaboratorio).atingiuCota();
	}

	/**
	 * Invoca o método da classe ContaLaboratório que retorna a String que
	 * representa a conta de laboratorio. A representação segue o formato: “Nome do
	 * laboratorio - dados/cota” (em Megabytes).
	 * 
	 * @param nomeLaboratorio
	 *            Nome da conta do Laboratório
	 * @return O retorno do método. A representação em String de uma conta de
	 *          laboratorio.
	 */
	public String laboratorioToString(String nomeLaboratorio) {
		return searchLab(nomeLaboratorio).toString();
	}

	/**
	 * Invoca o método da classe ContaLaboratório que retorna a String que
	 * representa a conta de laboratorio. A representação segue o formato: “Nome do
	 * laboratorio - dados/cota” (em Megabytes).
	 *
	 * @returns O retorno do método. A representação em String de uma conta de
	 *          laboratorio.
	 */

	/**
	 * Chama o construtor do objeto do tipo Disciplina, inicializa e o adiciona à
	 * lista de objetos do mesmo tipo.
	 * 
	 * @param nomeDisciplina
	 *            Nome da Disciplina.
	 */
	public void cadastraDisciplina(String nomeDisciplina) {
		cadastraDisciplina(nomeDisciplina, 4);
	}

	/**
	 * Chama o construtor do objeto do tipo Disciplina, inicializa e o adiciona à
	 * lista de objetos do mesmo tipo.
	 * 
	 * @param nomeDisciplina
	 *            Nome da Disciplina.
	 * @param nNotas
	 *            Número de notas da disciplina
	 */
	public void cadastraDisciplina(String nomeDisciplina, int nNotas) {
		Disciplina novaDisciplina = new Disciplina(nomeDisciplina, nNotas);
		this.disciplinas.add(novaDisciplina);
	}

	/**
	 * Chama o construtor do objeto do tipo Disciplina, inicializa e o adiciona à
	 * lista de objetos do mesmo tipo.
	 * 
	 * @param nomeDisciplina
	 *            Nome da Disciplina.
	 * @param nNotas
	 *            Número de notas da disciplina
	 * @param pesos
	 *            Um conjunto de pesos para cada nota da disciplina.
	 */
	public void cadastraDisciplina(String nomeDisciplina, int nNotas, int[] pesos) {
		Disciplina novaDisciplina = new Disciplina(nomeDisciplina, nNotas, pesos);
		this.disciplinas.add(novaDisciplina);
	}

	/**
	 * Invoca o método da classe Disciplina que cadastra o número de horas de estudo
	 * somando ao total de horas estudadas.
	 * 
	 * @param nomeDisciplina
	 *            Nome do objeto do tipo Disciplina a ser utilizado.
	 * @param horas
	 *            Horas estudadas a serem computadas.
	 */
	public void cadastraHoras(String nomeDisciplina, int horas) {
		searchDisc(nomeDisciplina).cadastraHoras(horas);
	}

	/**
	 * Invoca o método da classe Disciplina que cadastra as notas da disciplina.
	 * 
	 * @param nomeDisciplina
	 *            Nome do objeto do tipo Disciplina a ser utilizado.
	 * @param nota
	 *            Indica qual das notas será registrada.
	 * @param valorNota
	 *            valor da nota a ser registrado.
	 */
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		searchDisc(nomeDisciplina).cadastraNota(nota, valorNota);
	}

	/**
	 * Invoca o método da classe Disciplina que Verifica se o aluno está aprovado,
	 * com média maior que 7.
	 * 
	 * @param nomeDisciplina
	 *            Nome do objeto do tipo Disciplina a ser utilizado.
	 * 
	 * @return O retorno do método. Boolean indicando a aprovaçao do aluno.
	 */
	public boolean aprovado(String nomeDisciplina) {
		return searchDisc(nomeDisciplina).aprovado();
	}

	/**
	 * Invoca o método da classe Disciplina que retorna a String que representa a
	 * disciplina. A representação segue o formato: “Nome da disciplina - horas de
	 * estudo - media - array de notas”.
	 *
	 * @param nomeDisciplina
	 *            Nome do objeto do tipo Disciplina a ser utilizado.
	 *
	 * @return o retorno do método. A representação em String de uma disciplina.
	 */
	public String disciplinaToString(String nomeDisciplina) {
		return searchDisc(nomeDisciplina).toString();
	}

	/**
	 * Chama o construtor do objeto do tipo ContaCantina, inicializa e o adiciona à
	 * lista de objetos do mesmo tipo.
	 * 
	 * @param nomeDaCantina
	 *            Nome da Cantina.
	 */
	public void cadastraCantina(String nomeDaCantina) {
		ContaCantina novaCantina = new ContaCantina(nomeDaCantina);
		contaCantina.add(novaCantina);
	}

	/**
	 * Invoca o método da classe ContaCantina que cadastra o lanche, incrementando a
	 * quantidade de itens adquiridos, e seu valor em centavos a ser incrementado no
	 * débito.
	 * 
	 * @param nomeDaCantina
	 *            Nome do objeto do tipo ContaCantina a utilizado.
	 * @param qtdItens
	 *            Quantidade de itens adquiridos.
	 * @param valorCentavos
	 *            Valor em centavos do lanche.
	 */
	public void cadastraLanche(String nomeDaCantina, int qtdItens, int valorCentavos) {
		searchCantina(nomeDaCantina).cadastraLanche(qtdItens, valorCentavos);
	}

	/**
	 * Invoca o método da classe ContaCantina que cadastra o lanche, incrementando a
	 * quantidade de itens adquiridos, e seu valor em centavos a ser incrementado no
	 * débito.
	 * 
	 * @param nomeDaCantina
	 *            Nome do objeto do tipo ContaCantina a utilizado.
	 * @param qtdItens
	 *            Quantidade de itens adquiridos.
	 * @param valorCentavos
	 *            Valor em centavos do lanche.
	 * @param detalhes
	 *            Descrição do lanche adquirido
	 */
	public void cadastraLanche(String nomeDaCantina, int qtdItens, int valorCentavos, String detalhes) {
		searchCantina(nomeDaCantina).cadastraLanche(qtdItens, valorCentavos, detalhes);
	}

	/**
	 * Invoca o método da classe ContaCantina que altera o débito, reduzindo-o
	 * conforme o valor em centavos passado como parâmetro.
	 * 
	 * @param nomeDaCantina
	 *            Nome do objeto do tipo ContaCantina a utilizado.
	 * @param valorCentavos
	 */
	public void pagarConta(String nomeDaCantina, int valorCentavos) {
		searchCantina(nomeDaCantina).pagaConta(valorCentavos);
	}

	/**
	 * Invoca o método da classe ContaCantina que retorna a String que representa a
	 * conta de catinia. A representação segue o formato: “Nome da cantina -
	 * quantidade de lanches - débito”.
	 * 
	 * @param nomeDaCantina
	 *            Nome do objeto do tipo ContaCantina a utilizado.
	 * 
	 * @return O retorno do método. representação em String de uma conta de
	 *          cantina.
	 */
	public String cantinaToString(String nomeDaCantina) {
		return searchCantina(nomeDaCantina).toString();
	}

	/**
	 * Invoca o método da classe ContaCantinan que lista os últimos cinco detalhes,
	 * no máximo, se forem informados no cadastro do lanche.
	 * 
	 * @param nomeDaCantina
	 *            Nome do objeto do tipo ContaCantina a utilizado.
	 * @return O retorno do método. String que representa os detalhes descritos no
	 *         cadastro do lanche.
	 */
	public String listarDetalhes(String nomeDaCantina) {
		return searchCantina(nomeDaCantina).listarDetalhes();
	}

	/**
	 * Invoca o método da classe Saude que altera o estado de saúde mental. Se
	 * houver emoji definido, e ocorrer alguma alteração mental, o emoji é resetado.
	 * 
	 * @param valor
	 *            String que representa o estado da saude mental.
	 */
	public void defineSaudeMental(String valor) {
		saude.defineSaudeMental(valor);
	}

	/**
	 * Invoca o método da classe Saude que altera o estado de saúde física.
	 * 
	 * @param valor
	 *            String que representa o estado da saude físsica.
	 */
	public void defineSaudeFisica(String valor) {
		saude.defineSaudeFisica(valor);
	}

	/**
	 * Invoca o método da classe Saude que define um emoji, representado em String
	 * para a última sensação registrada.
	 * 
	 * @param emoji
	 *            String que representa a última sensação em forma de emoji.
	 */
	public void defineEmoji(String emoji) {
		saude.definirEmoji(emoji);
	}

	/**
	 * Invoca o método da classe Saude que retorna em String a representação do
	 * resultado geral da saúde do usuário com base na saúde Física e Mental. Se
	 * forem diferentes, o resultado retornado será "ok", caso contrário, o valor
	 * retornado é igual ao valor das mesmas. O emoji, caso definido, também é
	 * representado.
	 * 
	 * @return O retorno do método. String que representa saúde geral e emoji
	 *         registrados.
	 */
	public String geral() {
		return saude.geral();
	}

	/**
	 * Método get para o nome do Aluno.
	 * 
	 * @return String que representa o nome do Aluno.
	 */
	public String getName() {
		return this.nomeAluno;
	}
}
