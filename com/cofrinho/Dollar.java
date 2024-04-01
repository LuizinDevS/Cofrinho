package com.cofrinho;

//Criando a classe extendida 'Dollar' que é filha de 'Moeda'
public class Dollar extends Moeda {
    public Dollar(int tipo, double val, double valReal) {			
		// tipo: 1- Euro, 2- Dollar, 3- Real
	    switch(tipo) {
	    	case 1: 
	    		this.nomeMoeda = "Euro";
	    		break;
	    	case 2: 
	    		this.nomeMoeda = "Dóllar";
	    		break;
	    	case 3: 
	    		this.nomeMoeda ="Real";
	    		break;
	    }
	    
		this.valorMoeda = val;
		this.valorMoedaConversaoReal = valReal;
	}
}
