import java.util.Arrays;

public class Disciplina {

	// Atributos

	private String disciplina;
	private int horas;
	private double[] notas;
	private int numNotas = 4;
	private int[] pesos;
	
	// Construtores

	public Disciplina(String nomeDisciplina) {
		this.disciplina = nomeDisciplina;
		this.horas = 0;
		this.notas = new double[4];
	}
	
	public Disciplina(String nomeDisciplina, int nNotas) {
		this.disciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.notas = new double[nNotas];
	}
	public Disciplina(String nomeDisciplina, int nNotas, int[] pesos) {
		this.disciplina = nomeDisciplina;
		this.numNotas = nNotas;
		this.pesos = pesos;	
		this.notas = new double[nNotas];
	}

	// Métodos

	private double mediaNotas(double[] notas) {
		double soma = 0;
		if (pesos != null){
			for (int i = 0; i < numNotas; i++) {
				soma += i * pesos[i];
				}
			return soma / somaLista(pesos);
		} else {
			for (double i : notas) {
				soma += i;
			}
		}
		return soma / numNotas;
	}

	public double somaLista(int[] lista) {
		int soma = 0;
		for (int i : lista) {
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
		if (mediaNotas(notas) >= 7.0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return (this.disciplina + " " + this.horas + " " + mediaNotas(notas) + " " + Arrays.toString(notas));
	}
}
