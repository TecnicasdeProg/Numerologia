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
      String newData = reducao.reducaoData(data);
      for(int i = 0; i < data.length(); i++) {
        numero += Integer.parseInt(String.valueOf(newData.charAt(i)));
      }

    	return (numero % 9 == 0) ? 9 : numero % 9;
    }

    public int calculaNumeroDestino(String nomeCompleto){
        int numero = 0;
        String newData = reducao.reducaoFrase(nomeCompleto);
        for(int i = 0; i < nomeCompleto.length(); i++) {
          numero += Integer.parseInt(String.valueOf(newData.charAt(i)));
        }
        return (numero % 9 == 0) ? 9 : numero % 9;
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
      return (numero % 9 == 0) ? 9 : numero % 9;
    	
    }
}
