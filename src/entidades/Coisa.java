package entidades;

public class Coisa {

	public static void main(String[] args) {
//		ContaCantina lala = new ContaCantina("dona zefa");
//		lala.cadastraLanche(5, 8000);
//		lala.cadastraLanche(4, 800, "Lanche com meu amigo rafael");
//		lala.cadastraLanche(5, 4000, "rafael tava com mais fome");
//		lala.cadastraLanche(4, 400, "meu amigo rafael come dms, ja vai em 11");
//		lala.cadastraLanche(4, 1000, "estou indo a falencia");
//		lala.cadastraLanche(4, 5152, "espero q esse seja o ultimo");
//		lala.cadastraLanche(1531, 516, "esse e so pra zerar o primeiro");
//		lala.pagaConta(9868);
//		System.out.println(lala.listarDetalhes());
//		System.out.println(lala.toString());
//		
		Aluno picles = new Aluno();
		picles.cadastraLaboratorio("lcchouse", 2000);
		picles.consomeEspaco("lcchouse", 2001);
		System.out.println(picles.atingiuCota("lcchouse"));
		System.out.println(picles.laboratorioToString("lcchouse"));
		picles.liberaEspaco("lcchouse", 500);
		System.out.println(picles.atingiuCota("lcchouse"));
		System.out.println(picles.laboratorioToString("lcchouse"));
		picles.cadastraDisciplina("Rafaeles");
		picles.cadastraHoras("Rafaeles", 16);
		picles.cadastraNota("Rafaeles", 1, 5);
		picles.cadastraNota("Rafaeles", 2, 6);
		picles.cadastraNota("Rafaeles", 3, 8);
		picles.cadastraNota("Rafaeles", 4, 9);
		System.out.println(picles.aprovado("Rafaeles"));
		System.out.println(picles.disciplinaToString("Rafaeles"));
		picles.cadastraCantina("Natural");
		picles.cadastraLanche("Natural", 5, 500);
		picles.cadastraLanche("Natural", 150, 15000, "Meu amigo rafael tem metabolismo rapido, come mt");
		picles.pagarConta("Natural", 500);
		System.out.println(picles.cantinaToString("Natural"));
		picles.defineSaudeFisica("boa");
		picles.defineSaudeMental("fraca");
		picles.defineEmoji("^<^");
		System.out.println(picles.geral());
		
		Aluno testinho = new Aluno();

        testinho.cadastraLaboratorio("LCC2");
        testinho.consomeEspaco("LCC2", 300);
        testinho.liberaEspaco("LCC2", 200);
        testinho.atingiuCota("LCC2");
        System.out.println(testinho.laboratorioToString("LCC2"));
        testinho.cadastraDisciplina("CALCULO");
        testinho.cadastraHoras("CALCULO", 4);
        testinho.cadastraNota("CALCULO", 1, 10);
        testinho.cadastraNota("CALCULO", 2, 10);
        testinho.cadastraNota("CALCULO", 3, 10);
        testinho.cadastraNota("CALCULO", 4, 10);
        testinho.aprovado("CALCULO");
        System.out.println(testinho.disciplinaToString("CALCULO"));
        testinho.cadastraCantina("amarelinha");
        testinho.cadastraLanche("amarelinha", 3, 300);
        testinho.pagarConta("amarelinha", 100);
        System.out.println(testinho.cantinaToString("amarelinha"));
        testinho.defineSaudeFisica("bom");
        testinho.defineSaudeMental("fraca");
        testinho.defineEmoji(":]");
        System.out.println(testinho.geral());
        testinho.cadastraDisciplina("CALCULO 5", 5);
        testinho.cadastraHoras("CALCULO 5", 4);
        testinho.cadastraNota("CALCULO 5", 1, 10);
        testinho.cadastraNota("CALCULO 5", 2, 10);
        testinho.cadastraNota("CALCULO 5", 3, 10);
        testinho.cadastraNota("CALCULO 5", 4, 10);
        testinho.cadastraNota("CALCULO 5", 5, 10);
        System.out.println(testinho.aprovado("CALCULO 5"));
        System.out.println(testinho.disciplinaToString("CALCULO 5"));
        testinho.cadastraCantina("Zé");
        testinho.cadastraLanche("Zé", 4, 300, "ALMOCEI NO SEU ZÉ");
        System.out.println(testinho.cantinaToString("Zé"));
        System.out.println(testinho.listarDetalhes("Zé"));
	}

}
