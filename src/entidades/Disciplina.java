package entidades;

import java.util.Arrays;

/**
 * Representação de uma Disciplina. Toda conta precisa ter um nome, notas, horas
 * de estudo, número de notas e os seus pesos.
 * 
 * @author Héricles Emanuel - 117110647
 * 
 */
public class Disciplina {

	private String nomeDisciplina;
	private int horas;
	private double[] notas;
	private int numNotas;
	private int[] pesos;

	/**
	 * Constrói uma Disciplina a partir de seu nome. Toda disciplina começa com uma
	 * o número de notas igual a quatro e todas elas tem peso um.
	 *
	 * @param nomeDisciplina
	 *            O nome da disciplina.
	 */
	public Disciplina(String nomeDisciplina) {
		this(nomeDisciplina, 4);
	}

	/**
	 * Constrói uma Disciplina a partir de seu nome e número de notas. Todos as suas
	 * notas tem peso um.
	 *
	 * @param nomeDisciplina
	 *            O nome da disciplina.
	 * @param nNotas
	 *            O número de notas da disciplina.
	 */
	public Disciplina(String nomeDisciplina, int nNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.notas = new double[nNotas];
		this.pesos = this.inicializaPesos(nNotas);

	}

	/**
	 * Constrói uma Disciplina a partir de seu nome, número de notas e pesos de suas
	 * notas.
	 *
	 * @param nomeDisciplina
	 *            O nome da disciplina.
	 * @param nNotas
	 *            O número de notas da disciplina.
	 * @param pesos
	 *            Os pesos de cada nota da disciplinan.
	 */

	public Disciplina(String nomeDisciplina, int nNotas, int[] pesos) {
		this.nomeDisciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.pesos = pesos;
		this.notas = new double[nNotas];
	}

	/**
	 * Inicializa os pesos quando não são informados pelo usuário usando o valor 1
	 * como default.
	 * 
	 * @return um Array de inteiros com os pesos das notas.
	 */
	private int[] inicializaPesos(int nNotas) {
		int[] pesos = new int[nNotas];
		for (int i = 0; i < nNotas; i++) {
			pesos[i] = 1;
		}
		return pesos;
	}

	/**
	 * Calcula a média das notas, com base em seus valores e pesos.
	 * 
	 * @return um double com a média das notas.
	 */
	private double mediaNotas() {
		double soma = 0;
		for (int i = 0; i < numNotas; i++) {
			soma += notas[i] * pesos[i];
		}
		return soma / somaPesos();

	}

	/**
	 * Calcula a soma dos pesos das notas.
	 * 
	 * @return um double com a soma dos pesos.
	 */
	private double somaPesos() {
		int soma = 0;
		for (int i : pesos) {
			soma += i;
		}
		return soma;
	}

	/**
	 * Método que cadastra o número de horas de estudo somando ao total de horas
	 * estudadas.
	 * 
	 * @param horas
	 *            Horas estudadas a serem computadas.
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}

	/**
	 * Método que cadastra as notas da disciplina.
	 * 
	 * @param nota
	 *            Indica qual das notas será registrada.
	 * @param valorNota
	 *            valor da nota a ser registrado.
	 */
	public void cadastraNota(int nota, double valorNota) {
		int i = nota - 1;
		this.notas[i] = valorNota;

	}

	/**
	 * Verifica se o aluno está aprovado, com média maior que 7.
	 * 
	 * @return boolean indicando a aprovaçao do aluno.
	 */
	public boolean aprovado() {
		return mediaNotas() >= 7.0;
	}

	/**
	 * Método get para o nome da disciplina.
	 * 
	 * @return String que representa o nome do disciplina.
	 * 
	 */
	public String getDisc() {
		return (nomeDisciplina);
	}

	/**
	 * Retorna a String que representa a disciplina. A representação segue o
	 * formato: “Nome da disciplina - horas de estudo - media - array de notas”.
	 *
	 * @return a representação em String de uma disciplina.
	 */
	@Override
	public String toString() {
		return (this.nomeDisciplina + " " + this.horas + " " + mediaNotas() + " " + Arrays.toString(notas));
	}

}