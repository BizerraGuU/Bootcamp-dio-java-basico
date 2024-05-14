package Conta;

import java.util.Scanner;

public class Conta {

    public static void menuDeOpcoes() {
        System.out.println("Escolha uma opção: ");
        System.out.println("******************");
        System.out.println("\n1.Depositar;");
        System.out.println("2.Sacar;");
        System.out.println("3.Consultar Saldo;");
        System.out.println("0.Encerrar;");
    }

    public static void main(String[] args) {
    	
        Scanner digitadoPeloCliente = new Scanner(System.in);
        double saldo = 0;

        boolean repeticao = true;

        while (repeticao) {
        	
            menuDeOpcoes();
            
            System.out.print("\nDigite uma opção: ");
            int opcao = digitadoPeloCliente.nextInt();

            switch (opcao) {
            
                case 1: {
                	
                    System.out.println("\nVocê escolheu depositar!");
                    System.out.print("Digite o valor para depositar: ");
                    double depositoNaConta = digitadoPeloCliente.nextDouble();

                    if (depositoNaConta < 0) {
                    	
                        System.out.println("Valor inválido!");
                        
                    } else {
                    	
                        saldo += depositoNaConta;
                        System.out.println("Saldo atual:" + saldo);
                    }
                    
                    break;
                }

                case 2: {
                	
                    System.out.println("\nVocê escolheu Sacar!");
                    System.out.print("Digite o valor para sacar: ");
                    double saqueDaConta = digitadoPeloCliente.nextDouble();

                    if (saqueDaConta > saldo) {
                        System.out.println("Saldo insuficiente.");
                        
                    } else {
                    	
                        saldo -= saqueDaConta;
                        System.out.println("Saldo atual:" + saldo);
                    }
                    
                    break;
                }

                case 3: {
                	
                	if (saldo < 0) {
                		 break;
                	} else {
                	
                    System.out.println("\nVocê escolheu Consultar o Saldo!");
                    System.out.println("Saldo atual:" + saldo);
                    break;
                    
                	}
                }

                case 0: {
                	
                    System.out.println("Programa encerrado.");
                    
                    repeticao = false;
                    
                    break;
                }

                default: {
                	
                    System.out.println("Opção Inválida!");
                    
                    break;
                }
            }
        }
        digitadoPeloCliente.close();
    }
}
