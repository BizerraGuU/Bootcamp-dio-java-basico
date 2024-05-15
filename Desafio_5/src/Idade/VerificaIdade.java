package Idade;

import java.util.Scanner;
public class VerificaIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idadeDoUsuario = scanner.nextInt();
		
		if (idadeDoUsuario >= 18) {
			
			System.out.println("\nVoce esta elegivel para criar uma conta bancaria.");
			
			
		} else if (idadeDoUsuario < 0) {
			System.err.println("\nVocê digitou uma idade inválida!");
			
		} else {
			
			System.err.println("\nVoce nao esta elegivel para criar uma conta bancaria.");
		}
		
	}

}
