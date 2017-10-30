
public class Coisa {

	public static void main(String[] args) {
		Disciplina p2 = new Disciplina("p2", 4, new int[]{4,6,8,7});
		p2.cadastraNota(1, 5);
		p2.cadastraNota(2, 8);
		p2.cadastraNota(3, 5);
		p2.cadastraNota(4, 8);
		p2.cadastraHoras(8);
		System.out.println(p2.aprovado());
	}

}
