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
    	return reducao.reducaoData(data);
    }

    public int calculaNumeroDestino(String nomeCompleto){
        return reducao.reducaoFrase(nomeCompleto);
    }

    public int calculaNumeroDesejosDaAlma(String nomeCompleto){
    	int numero = 0;
    	for(int i = 0; i < nomeCompleto.length(); i++) {
    		switch(nomeCompleto.charAt(i)){
    		case 'A': numero += 1;
    		case 'E': numero += 5;
    		case 'I': numero += 9;
    		case 'O': numero += 6;
    		case 'U': numero += 3;
    		default: continue;
    		}
    	}
    	
        if(numero % 9 == 0) return 9;
        else return numero % 9;
    }
}