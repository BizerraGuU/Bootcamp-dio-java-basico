package Cheque;

import java.util.Scanner;

public class VerificaCheque {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double chequeEspecial = 500;
		
		System.out.print("Digite seu saldo atual: ");
		double saldoAtual = scanner.nextDouble();
		
		System.out.print("\nDigite a quantidade que deseja sacar: ");
		double saqueDesejado = scanner.nextDouble();
		
		if (saqueDesejado > saldoAtual) {
			
			saldoAtual += chequeEspecial;
			
			if (saldoAtual < saqueDesejado) {
				System.out.println("\nTransação não realizada. Limite do cheque especial excedido.");
			} else {
				System.out.println("\nTransação realizada com sucesso utilizando o cheque especial.");		
			}
			
		} else {
			System.out.println("\nTransação realizada com sucesso");
		}

	}

}
