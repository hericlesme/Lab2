import java.util.Arrays;

public class Disciplina {

	// Atributos

	private String nomeDisciplina;
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
		this.pesos = this.retornaPesos(nNotas);
		
	}

	public Disciplina(String nomeDisciplina, int nNotas, int[] pesos) {
		this.nomeDisciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.pesos = pesos;
		this.notas = new double[nNotas];
	}

	// Métodos

	public double mediaNotas(double[] notas, int[] pesos) {
		double soma = 0;
		for (int i = 0; i < numNotas; i++) {
			soma += notas[i] * pesos[i];
		}
		return soma / somaPesos(pesos);

	}

	public double somaPesos(int[] pesos) {
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
		if (mediaNotas(notas, pesos) >= 7.0) {
			return true;
		}
		return false;
	}
	
	public String getDisc() {
		return (nomeDisciplina);
	}

	@Override
	public String toString() {
		return (this.nomeDisciplina + " " + this.horas + " " + mediaNotas(notas, pesos) + " " + Arrays.toString(notas));
	}

	private int[] retornaPesos(int nNotas) {
		int[] peso =  new int[nNotas];
		for (int i = 0; i < nNotas; i++) {
			pesos[i] = 1;
		}
		return peso;
	}
}