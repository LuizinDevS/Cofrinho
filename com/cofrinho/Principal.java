package com.cofrinho;
import java.util.InputMismatchException;
import java.util.Scanner;

// Criando classe 'Principal' que possui o método 'main()', onde o programa será executado
public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		Cofrinho cofre = new Cofrinho();
		int escolha = 0;
		Boolean temLetra;
					
		do {
			temLetra = false;
			
		    System.out.println("===================================================");
			System.out.println("\tMENU");
			System.out.println("===================================================");			
			System.out.println("Pressione '1' para 'Adicionar' moedas em seu cofrinho.");
			System.out.println("Pressione '2' para 'Remover' moedas específicas do cofrinho.");
			System.out.println("Pressione '3' para 'Listar' todas as moedas que estão dentro do cofrinho.");
			System.out.println("Pressione '4' para 'Calcular' e converter o dinheiro existente no cofrinho para reais.");
			System.out.println("Pressione '5 para 'Encerrar' a aplicação.");
			
			try {
			   escolha = input.nextInt();					
			} catch (InputMismatchException e) {
				System.out.println("A opção informada é inválida. Tente novamente. ");
				temLetra = true;
				input.nextLine();			
			}
			
			switch(escolha) {
				// Adicionar moeda
				case 1: 																				
					cofre.adicionar();
					break;
						
					// Remover moeda	
					//case 2: 
					//	remover();
					//	break;
					
				// Listar as moedas do cofrinho	
				case 3:				
				    System.out.println("===================================================");
					System.out.println("\tLISTA DE MOEDAS");
					System.out.println("===================================================");
					cofre.listarTodasMoedas();
					break;
						
			    // Calcular o total de dinheiro do cofrinho em reais
				case 4: 
					cofre.calcularTotal();
					break;
					
				case 5:
					System.out.println("Encerrando aplicação...");
					input.close();
					break;
					
			    default: 
			    	if (!temLetra) {
			    		System.out.println("A opção informada é inválida. Tente novamente. ");
			    		break;
				    }				   
			} 
			   
	    } while (escolha != 5);
		
		input.close();
	}	
}
