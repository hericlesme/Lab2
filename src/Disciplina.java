import java.util.Arrays;

public class Disciplina {
	
	// Atributos
	
	private String disciplina;
	private int horas;
	private double[] notas;
	
	// Construtores
	
	public Disciplina(String nomeDisciplina) {
		this.disciplina = nomeDisciplina;
		this.horas = 0;
		this.notas = new double[4];
	}
	
	// Métodos
	
	private double mediaNotas(double[] notas) {
		double soma = 0;
		for (double i : notas) {
			soma += i;
		}
		return (soma / 4);
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
