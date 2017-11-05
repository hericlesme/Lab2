package entidades;

/**
 * Classe principal do sistema
 * 
 * Lab02 - Laboratório de Programação II
 * 
 * @author Héricles Emanuel - 117110647
 *
 */
public class Coisa {

	public static void main(String[] args) {
		Aluno gauds = new Aluno();
		gauds.cadastraLaboratorio("LCC2");
		gauds.consomeEspaco("LCC2", 1500);
		System.out.println(gauds.atingiuCota("LCC2"));
		gauds.consomeEspaco("LCC2", 700);
		System.out.println(gauds.atingiuCota("LCC2"));
		System.out.println(gauds.laboratorioToString("LCC2"));
		gauds.liberaEspaco("LCC2", 200);
		System.out.println(gauds.laboratorioToString("LCC2"));

		gauds.cadastraLaboratorio("LCC3", 5000);
		gauds.consomeEspaco("LCC3", 4999);
		System.out.println(gauds.laboratorioToString("LCC3"));

		gauds.cadastraDisciplina("P2", 3, new int[] { 4, 3, 3 });
		gauds.cadastraNota("P2", 1, 10);
		gauds.cadastraNota("P2", 2, 8);
		gauds.cadastraNota("P2", 3, 9);
		gauds.cadastraHoras("P2", 20);
		System.out.println(gauds.aprovado("P2"));
		System.out.println(gauds.disciplinaToString("P2"));

		gauds.cadastraCantina("McDonalds");
		gauds.cadastraLanche("McDonalds", 3, 4600, "Lanche básico");
		gauds.cadastraLanche("McDonalds", 1, 2000, "Sobremesa");
		gauds.pagarConta("McDonalds", 1600);
		System.out.println(gauds.cantinaToString("McDonalds"));
		System.out.println(gauds.listarDetalhes("McDonalds"));

		gauds.defineSaudeFisica("boa");
		gauds.defineSaudeMental("fraca");
		gauds.defineEmoji("o>");
		System.out.println(gauds.geral());

		Aluno pericles = new Aluno();
		pericles.cadastraLaboratorio("LCCHouse", 10000);
		pericles.consomeEspaco("LCCHouse", 5000);
		System.out.println(pericles.laboratorioToString("LCCHouse"));

		pericles.cadastraDisciplina("LP2");
		pericles.cadastraHoras("LP2", 50);
		pericles.cadastraNota("LP2", 1, 10);
		pericles.cadastraNota("LP2", 2, 10);
		pericles.cadastraNota("LP2", 3, 10);
		pericles.cadastraNota("LP2", 4, 10);
		System.out.println(pericles.disciplinaToString("LP2"));

		pericles.cadastraCantina("Natural");
		pericles.cadastraLanche("Natural", 2, 4000, "Muito caro");
		pericles.pagarConta("Natural", 600);
		System.out.println(pericles.listarDetalhes("Natural"));
		System.out.println(pericles.cantinaToString("Natural"));

		pericles.defineSaudeFisica("boa");
		pericles.defineSaudeMental("fraca");
		pericles.defineEmoji("xD");
		System.out.println(pericles.geral());

	}
}