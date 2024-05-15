package Verificacao;

import java.util.Scanner;

public class VerificaNumeroConta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número da sua conta: ");
		
		try {
			
			String numeroConta = scanner.next();
			
			verificaNumeroConta(numeroConta);
			
			System.out.println("Numero de conta valido.");
			
		} catch (IllegalArgumentException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} finally {
			
		  scanner.close();
		  
		}
}
	
	public static void verificaNumeroConta(String numeroDaContaDigitado) {
		
		int aux = numeroDaContaDigitado.length();

		if (aux != 8) {
			
			throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
		
		}
		
	}
			
}
