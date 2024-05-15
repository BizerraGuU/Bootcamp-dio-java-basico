package Saque;

import java.util.Scanner;

public class ControlaSaque {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu limite diário de saque: ");
		double saqueDiario = scanner.nextInt();

		
		for (int i = 0; i < saqueDiario; i++) {
		
		System.out.print("\nInforme o valor do saque: ");
		double valorDoSaque = scanner.nextDouble();
		
		if (valorDoSaque > saqueDiario) {
			System.err.println("Limite diario de saque atingido. Transacoes encerradas.");
			break;
		} else {
			System.out.println("O saque foi realizado com sucesso.");
		}
		
		saqueDiario -= valorDoSaque;
		
		if (saqueDiario == 0){
			System.err.println("Limite diario de saque atingido. Transacoes encerradas.");
			break;
		}
		
		}
		
	}

}
