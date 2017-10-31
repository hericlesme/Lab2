package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private static ArrayList<Aluno> alunos;
	private Scanner menuScan = new Scanner(System.in);
	
	public Menu() {
		this.alunos = new ArrayList<>();
	}

	private static Aluno searchAluno(String nomeAluno) {
		Aluno student = null;
		for (int i = 0; i < alunos.size(); i++) {
			if (nomeAluno.equals(alunos.get(i).getName())) {
				student = alunos.get(i);
			}
		}
		return student;
	}

	public static void login(String nomeAluno) {
		if (!alunos.contains(searchAluno(nomeAluno))) {
			Aluno aluno = new Aluno(nomeAluno);
			alunos.add(aluno);
		}
		Aluno user = searchAluno(nomeAluno);
	}

	private final String nl = System.lineSeparator();

	public String opcoesCadastro() {
		return "1. Cadastra Laboratório" + nl + "2. Cadastra Disciplina" + nl + "3. Cadastra Horas" + nl
				+ "4. Cadastra Notas" + nl + "5. Cadastra Cantina" + nl + "6. Cadastra Lanche" + nl;
	}
	
	public void selectCadastro(int num) {
		switch(num) {
		case 1: 
			System.out.println(cadastroLab());
			int selNum = menuScan.nextInt();
			if (selNum == 1) {
				
			}
		}
	}
	
	public String cadastroLab() {
		return "1. Com cota" + nl + "2. Sem cota";
	}
}
