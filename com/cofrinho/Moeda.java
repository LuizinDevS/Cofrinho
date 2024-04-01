package com.cofrinho;

// Criando a classe mãe 'Moeda', os atributos foram declarados como 'protected' para que apenas as classes filhas possam acessá-los 
public abstract class  Moeda {
	// Inicialização de variavéis
	protected String nomeMoeda = "";
	protected int tipoMoeda = 0;
	protected double valorMoeda = 0.00;
	protected double valorMoedaConversaoReal = 0.00;		
	
	// Declaração de métodos da classe 'Moeda'
	public String info() {		
		String infoMoeda = "";			
		infoMoeda = infoMoeda + "Nome: " + nomeMoeda + "\n";
		infoMoeda = infoMoeda + "Valor: " + valorMoeda + "\n";
		infoMoeda = infoMoeda + "Valor de Conversão(p/ Real): " + valorMoedaConversaoReal + "\n";		
		return infoMoeda;		
	}
	
	public double converter() {
		double valConvertido = 0.00;		
		valConvertido = valorMoeda * valorMoedaConversaoReal; 
		return valConvertido;
	}	
}
