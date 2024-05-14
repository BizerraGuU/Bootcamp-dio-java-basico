package Desafio_2;

public class Contador {
	
	public void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
		
			int contagem = numeroDois - numeroUm;
			
			for (int i=numeroUm; i < numeroDois; i++) {
						
				numeroUm++;

				}
			
			System.out.println("Número: " + numeroUm);
			System.out.println("Contagem: " + contagem);
			
		}
}
