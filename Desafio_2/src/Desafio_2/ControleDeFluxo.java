package Desafio_2;

import java.util.Scanner;

public class ControleDeFluxo {
	

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		Scanner digitadoTerm = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int parametroUm = digitadoTerm.nextInt();
		
		System.out.print("Digite outro número: ");
		int parametroDois = digitadoTerm.nextInt();
		
		try {
			
			contador.contar(parametroUm, parametroDois);
		
			}   catch (ParametrosInvalidosException exception) {
					System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
	}
}
	
