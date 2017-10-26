
public class Coisa {

	public static void main(String[] args) {
		ContaLaboratorio contaLCC2 = new ContaLaboratorio("LCC2");
		System.out.println(contaLCC2.toString());
		contaLCC2.consomeEspaco(2000);
		System.out.println(contaLCC2.atingiuCota());
	
	}

}
