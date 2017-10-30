import java.util.ArrayList;

public class Aluno {

	// Atributos

	private ArrayList <ContaLaboratorio> contaLab;
	private ArrayList <Disciplina> disciplinas;
	private ArrayList <ContaCantina> contaCantina;
	private Saude saude;

	
	public Aluno() {
		this.contaLab = new ArrayList<ContaLaboratorio>();
		this.disciplinas = new ArrayList<Disciplina>();
		this.contaCantina = new ArrayList<ContaCantina>();
		this.saude = new Saude();
	}

	public void cadastraLaboratorio(String nomeLaboratorio) {
    	ContaLaboratorio novoLaboratorio = new ContaLaboratorio(nomeLaboratorio);
    	this.contaLab.add(novoLaboratorio);
	}
//
//	public void cadastraLaboratorio(String nomeLaboratorio, int cota)
//
//	public void consomeEspaco(String nomeLaboratorio, int mbytes)
//
//	public void liberaEspaco(String nomeLaboratorio, int mbytes)
//
//	public boolean atingiuCota(String nomeLaboratorio)
//
//	public String laboratorioToString(String nomeLaboratorio)
//
//	public void cadastraDisciplina(String nomeDisciplina)
//
//	public void cadastraHoras(String nomeDisciplina, int horas)
//
//	public void cadastraNota(String nomeDisciplina, int nota, double valorNota)
//
//	public boolean aprovado(String nomeDisciplina)
//
//	public String disciplinaToString(String nomeDisciplina)
//
//	public void cadastraCantina(String nomeDisciplina)
//
//	public void cadastraLanche(String nomeDisciplina, int qtdItens, int valorCentavos)
//
//	public void pagarConta(String nomeDisciplina, int valorCentavos)
//
//	public String cantinaToString(String nomeDisciplina)
//
//	public void defineSaudeMental(String valor)
//
//	public void defineSaudeFisica(String valor)
//
//	public String geral()
//
//}
