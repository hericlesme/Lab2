package entidades;

import java.util.Scanner;

public class Coisa {

	public static void main(String[] args) {

		Menu menu = new Menu();

		Scanner scan = new Scanner(System.in);
		String operacao = "";

		while (!operacao.equals("CLOSE")) {

			operacao = scan.nextLine();
			switch (operacao.toUpperCase()) {
			
			case "LOGIN":
				System.out.print("Usuário: ");
				String user = scan.nextLine();
				menu.login(user);
				break;
			
			case "CADASTRA":
				System.out.println(menu.opcoesCadastro());
				int num = scan.nextInt();
				
			default:
				break;
				
			}
		
			}
		}
	}