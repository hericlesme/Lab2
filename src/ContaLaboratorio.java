
public class ContaLaboratorio {
	
	// Atributos
	
	public String nomeDoLaboratorio;
	public int dados = 0;
	public int cota = 2000;
	
	// Construtores
	
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeDoLaboratorio = nomeLaboratorio;
		
	}
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeDoLaboratorio = nomeLaboratorio;
		this.cota = cota;
	
	}
	
	// Métodos
	
	public void consomeEspaco(int mbytes) {
		this.dados += mbytes;
	}
	
	public void liberaEspaco(int mbytes) {
		this.dados -= mbytes;
	}
	
	public boolean atingiuCota() {
		if (this.dados >= this.cota) {
			return (true);
		} else {
			return (false);
		}
	}
	
	@Override
	public String toString() {
		return (this.nomeDoLaboratorio + " " + this.dados + "/" + this.cota);
	}
	
}



