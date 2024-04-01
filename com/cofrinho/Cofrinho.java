package com.cofrinho;
import java.util.ArrayList;
import java.util.Scanner;

// Criando a classe 'Cofrinho' para guardar dinheiro que guarda dinheiro mesmo em moedas de tipo diferente
public class Cofrinho {
   ArrayList<Moeda> moedas = new ArrayList<Moeda>();
   Scanner input = new Scanner(System.in);
   Integer tipo, i;
   Boolean temLetra;
   Double valor, valorConversao;
   
   // Adiciona uma nova moeda no 'ArrayList<moeda>'
	public void adicionar() {
		System.out.println("\n");
	    System.out.println("===================================================");
		System.out.println("\tADICIONAR MOEDAS");
		System.out.println("===================================================");	
		System.out.println("Pressione 1 para adicionar 'Euro(s)' ao cofrinho.");
		System.out.println("Pressione 2 para adicionar 'Dollar(s)' ao cofrinho.");
		System.out.println("Pressione 3 para adicionar 'Real(s)' ao cofrinho.");								  																		         				
		tipo = input.nextInt();
		
		System.out.println("Qual valor deseja adicionar no cofre?");				
		valor = input.nextDouble();
		
		if (tipo != 3) {
			System.out.println("Qual a taxa de câmbio ou o valor de conversão moeda escolhida para reais?");				
			valorConversao = input.nextDouble();
		}
				
	   // tipo: 1- Euro, 2- Dollar, 3- Real 
	   switch(tipo) {
		   case 1:			  
			   Euro euro = new Euro(tipo, valor, valorConversao);			    
			   moedas.add(euro);		      		      
		       break;
		   case 2:			  
			   Dollar dollar = new Dollar(tipo, valor, valorConversao);			  			   
			   moedas.add(dollar);
		       break;
		   case 3:			 
			   Real real = new Real(tipo, valor);			  			  
			   moedas.add(real);
		       break;		       		  		  	
	   }
   }
   
   // Remove uma moeda específica do 'ArrayList<moeda>'	
   public void remover() {
	    System.out.println("\n");
	    System.out.println("===================================================");
		System.out.println("\tREMOVER MOEDA");
		System.out.println("===================================================");
		System.out.println("Pressione 1 para remover 'Euro(s)' do cofrinho.");
		System.out.println("Pressione 2 para remover 'Dollar(s)' do cofrinho.");
		System.out.println("Pressione 3 para remover 'Real(s)' do cofrinho.");		
		tipo = input.nextInt();
	   
	   // 1- Euro, 2- Dollar, 3- Real	
	   switch(tipo) {
		   case 1:			  			   
		       //ArrayMoedas.remove(Euro);		   		     
		       break;
		   case 2:			  		   
		       //ArrayMoedas.add(dollar);
		       break;
		   case 3:			 			   
		       //ArrayMoedas.add(real);
		       break;
	   }
   }
   
   // Lista todas as informações de cada uma das moedas contidas no 'ArrayList<Moeda>'
   public void listarTodasMoedas() {       
	   String str = "";	   
       for (Moeda moeda : moedas) { str = moeda.info() + "\n"; }       
       System.out.println(str);
   }   

   // Realiza as conversões das moedas informadas e totaliza o dinheiro em 'totalCofre'
   public void calcularTotal() {       	   
	   double totalCofre = 0.00;	   
       for (Moeda moeda : moedas) { totalCofre = totalCofre + moeda.converter(); }
       System.out.println("O dinheiro do cofre convertido em reais é R$: " + totalCofre);
   }         
}
