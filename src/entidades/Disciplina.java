package entidades;
import java.util.Arrays;

public class Disciplina {

	// Atributos

	private String nomeDisciplina = "";
	private int horas;
	private double[] notas;
	private int numNotas;
	private int[] pesos;

	// Construtores

	public Disciplina(String nomeDisciplina) {
		this(nomeDisciplina, 4);
	}

	public Disciplina(String nomeDisciplina, int nNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.notas = new double[nNotas];
		this.pesos = this.inicializaPesos(nNotas);

	}

	public Disciplina(String nomeDisciplina, int nNotas, int[] pesos) {
		this.nomeDisciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.pesos = pesos;
		this.notas = new double[nNotas];
	}

	// Métodos

	private double mediaNotas() {
		double soma = 0;
		for (int i = 0; i < numNotas; i++) {
			soma += notas[i] * pesos[i];
		}
		return soma / somaPesos();

	}

	private double somaPesos() {
		int soma = 0;
		for (int i : pesos) {
			soma += i;
		}
		return soma;
	}

	public void cadastraHoras(int horas) {
		this.horas += horas;
	}

	public void cadastraNota(int nota, double valorNota) {
		int i = nota - 1;
		this.notas[i] = valorNota;

	}

	public boolean aprovado() {
		return mediaNotas() >= 7.0;
	}

	public String getDisc() {
		return (nomeDisciplina);
	}

	@Override
	public String toString() {
		return (this.nomeDisciplina + " " + this.horas + " " + mediaNotas() + " " + Arrays.toString(notas));
	}

	private int[] inicializaPesos(int nNotas) {
		int[] pesos = new int[nNotas];
		for (int i = 0; i < nNotas; i++) {
			pesos[i] = 1;
		}
		return pesos;
	}
}