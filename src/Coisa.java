
public class Coisa {

	public static void main(String[] args) {
		Disciplina p2 = new Disciplina("P2");
		p2.cadastraHoras(8);
		int[] pesos = new int[] {6, 4};
		Disciplina np2 = new Disciplina("P2", 2, pesos);
		np2.cadastraNota(1, 7.0);
		np2.cadastraNota(2,8.0);
		np2.cadastraNota(3, 5.5);
		np2.cadastraNota(4, 7.5);
		System.out.println(np2.toString());
		System.out.println(p2.toString());
		
	}

}
