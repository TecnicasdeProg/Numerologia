package com.bcopstein.Numerologia;

// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
    private Formatador formatador;
    private Redutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(Redutor reducao, Formatador formatador){
        this.reducao = reducao;
        this.formatador = formatador;
    }

    public int calculaNumeroDaVida(String data){
    	int numero = 0;
    	numero = reducao.reducaoData(data);
    	
    	return (numero % 9 == 0) ? 9 : numero % 9;
    }

    public int calculaNumeroDestino(String nomeCompleto){
        String newData = "";
        int numero = 0;
        
        newData = formatador.formataFrase(nomeCompleto);
        numero = reducao.reducaoFrase(newData);
        
        return (numero % 9 == 0) ? 9 : numero % 9;
    }

    public int calculaNumeroDesejosDaAlma(String nomeCompleto){
    	int numero = 0;
    	String newData = "";
    	newData = formatador.formataFrase(nomeCompleto);
    	for(int i = 0; i < newData.length(); i++) {
    		switch(newData.charAt(i)){
    		case 'A': numero += 1; break;
    		case 'E': numero += 5; break;
    		case 'I': numero += 9; break;
    		case 'O': numero += 6; break;
    		case 'U': numero += 3; break;
    		default: break;
    		}
    	}
      
    	return (numero % 9 == 0) ? 9 : numero % 9;
    }
}
