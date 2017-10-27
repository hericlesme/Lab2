
public class Coisa {

	public static void main(String[] args) {
		Disciplina p2 = new Disciplina("P2");
		p2.cadastraHoras(8);
		p2.cadastraNota(1,4);
		p2.cadastraNota(2, 8);
		p2.cadastraNota(3, 7);
		p2.cadastraNota(4, 10);
		System.out.println(p2.aprovado());
		System.out.println(p2.toString());
		Disciplina lp2 = new Disciplina("LP2", 2);
		lp2.cadastraHoras(9);
		lp2.cadastraNota(1, 6);
		lp2.cadastraNota(2, 7);
		lp2.cadastraNota(3, 8);
		System.out.println(lp2.aprovado());
		System.out.println(lp2.toString());
	}

}
