package com.bcopstein.Numerologia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatador{
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou digitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    public String formataPalavra(String palavra){
        if(palavra == null || palavra.trim().isEmpty()) {
        	throw new IllegalArgumentException();
        }
        else {
        	Pattern p = Pattern.compile("[^A-Za-z0-9\\s]");//permite numeros,letras e espaços
        	Matcher m = p.matcher(palavra);
        	// boolean b = m.matches();
        	boolean b = m.find();//se b==true entao tem caractere especial
	     					  //se b==false entao não possui caractere especial
        	if(b)throw new IllegalArgumentException();
        	else {
        		for(int i=0;i<palavra.length();i++) {
        			if(palavra.substring(i,i+1).equals(" "));//tem espaço
        		}
        	}
        }
        return "";
    	
    }


    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    public String formataPalavraPlus(String palavra) {
        //TODO
    	return null;
    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    // Retorna um array de palavras validas 
    public String formataFrase(String frase){
        //TODO
    	return null;
    }
}
