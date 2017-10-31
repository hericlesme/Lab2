package entidades;
import java.util.ArrayList;

public class Aluno {

	// Atributos

	private ArrayList<ContaLaboratorio> contaLab;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<ContaCantina> contaCantina;
	private Saude saude;

	// Construtores

	public Aluno() {
		this.contaLab = new ArrayList<ContaLaboratorio>();
		this.disciplinas = new ArrayList<Disciplina>();
		this.contaCantina = new ArrayList<ContaCantina>();
		this.saude = new Saude();
	}

	// Searchers

	// Laboratórios

	private ContaLaboratorio searchLab(String nomeLaboratorio) {
		ContaLaboratorio lab = null;
		for (int i = 0; i < contaLab.size(); i++) {
			if (nomeLaboratorio.equals(contaLab.get(i).getLab())) {
				lab = contaLab.get(i);
			}
		}
		return (lab);
	}
	// Disciplinas

	private Disciplina searchDisc(String nomeDisciplina) {
		Disciplina disc = null;
		for (int i = 0; i < disciplinas.size(); i++) {
			if (nomeDisciplina.equals(disciplinas.get(i).getDisc())) {
				disc = disciplinas.get(i);
			}
		}
		return (disc);
	}
	// Cantinas

	private ContaCantina searchCantina(String nomeDaCantina) {
		ContaCantina cantina = null;
		for (int i = 0; i < contaCantina.size(); i++) {
			if (nomeDaCantina.equals(contaCantina.get(i).getCantina())) {
				cantina = contaCantina.get(i);
			}
		}
		return (cantina);
	}

	// Métodos

	// Laboratório

	public void cadastraLaboratorio(String nomeLaboratorio) {
		ContaLaboratorio novoLaboratorio = new ContaLaboratorio(nomeLaboratorio);
		this.contaLab.add(novoLaboratorio);
	}

	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		ContaLaboratorio novoLaboratorio = new ContaLaboratorio(nomeLaboratorio, cota);
		this.contaLab.add(novoLaboratorio);
	}

	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		searchLab(nomeLaboratorio).consomeEspaco(mbytes);
	}

	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		searchLab(nomeLaboratorio).liberaEspaco(mbytes);
	}

	public boolean atingiuCota(String nomeLaboratorio) {
		return (searchLab(nomeLaboratorio).atingiuCota());
	}

	public String laboratorioToString(String nomeLaboratorio) {
		return searchLab(nomeLaboratorio).toString();
	}

	// Disciplina

	public void cadastraDisciplina(String nomeDisciplina) {
		cadastraDisciplina(nomeDisciplina, 4);
	}
	
	public void cadastraDisciplina(String nomeDisciplina, int nNotas) {
		Disciplina novaDisciplina = new Disciplina(nomeDisciplina, nNotas);
		this.disciplinas.add(novaDisciplina);
	}
	
	public void cadastraDisciplina(String nomeDisciplina, int nNotas, int[] pesos) {
		Disciplina novaDisciplina = new Disciplina(nomeDisciplina, nNotas, pesos);
		this.disciplinas.add(novaDisciplina);
	}

	public void cadastraHoras(String nomeDisciplina, int horas) {
		searchDisc(nomeDisciplina).cadastraHoras(horas);
	}

	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		searchDisc(nomeDisciplina).cadastraNota(nota, valorNota);
	}

	public boolean aprovado(String nomeDisciplina) {
		return (searchDisc(nomeDisciplina).aprovado());
	}

	public String disciplinaToString(String nomeDisciplina) {
		return (searchDisc(nomeDisciplina).toString());
	}

	// Cantina

	public void cadastraCantina(String nomeDaCantina) {
		ContaCantina novaCantina = new ContaCantina(nomeDaCantina);
		contaCantina.add(novaCantina);
	}

	public void cadastraLanche(String nomeDaCantina, int qtdItens, int valorCentavos) {
		searchCantina(nomeDaCantina).cadastraLanche(qtdItens, valorCentavos);
	}

	public void cadastraLanche(String nomeDaCantina, int qtdItens, int valorCentavos, String detalhes) {
		searchCantina(nomeDaCantina).cadastraLanche(qtdItens, valorCentavos, detalhes);
	}

	public void pagarConta(String nomeDaCantina, int valorCentavos) {
		searchCantina(nomeDaCantina).pagaConta(valorCentavos);
	}

	public String cantinaToString(String nomeDaCantina) {
		return (searchCantina(nomeDaCantina).toString());
	}
	
	public String listarDetalhes(String nomeDaCantina) {
		return (searchCantina(nomeDaCantina).listarDetalhes());
	}

	// Saúde

	public void defineSaudeMental(String valor) {
		saude.defineSaudeMental(valor);
	}

	public void defineSaudeFisica(String valor) {
		saude.defineSaudeFisica(valor);
	}
	
	public void defineEmoji(String emoji) {
		saude.definirEmoji(emoji);
	}
	
	public String geral() {
		return (saude.geral());
	}

}
