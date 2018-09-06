package com.bcopstein.Numerologia;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatador{
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou digitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    public String formataPalavra(String palavra){//
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
        		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        		for(int i=0;i<palavra.length();i++) {
        			/*
        			if(palavra.substring(i,i+1).equals(" ")){//tem espaço
        				palavra = palavra.substring(0,i) + palavra.substring(i+1,palavra.length());
        			}
        			*/
        			if(alfabeto.contains(palavra.substring(i,i+1))) {
        				palavra = palavra.substring(0,i) + palavra.substring(i,i+1).toUpperCase() + palavra.substring(i+1,palavra.length());
        			}
        		}
        	}
        }
        return "";
    	
    }


    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    public String formataPalavraPlus(String palavra) {
    	if("123456789".contains(palavra.substring(0,1))) {throw new IllegalArgumentException("Primeiro caracter é um digito");}
    	return formataPalavra(palavra);
    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    // Retorna um array de palavras validas 
    public ArrayList<String> formataFrase(String frase){
    	if(frase == null || frase.trim().isEmpty()) {
        	throw new IllegalArgumentException();
        }
    	else {
    		Pattern p = Pattern.compile("[^A-Za-z0-9\\s]");//permite numeros,letras e espaços
        	Matcher m = p.matcher(frase);
        	// boolean b = m.matches();
        	boolean b = m.find();//se b==true entao tem caractere especial
 	     					  //se b==false entao não possui caractere especial
         	if(b)throw new IllegalArgumentException();
         	else {
         		ArrayList<String> retorno = new ArrayList<String>();
         		int iniciaPalavra = 0;
         		for(int i=0;i<frase.length();i++) {
         			if(frase.substring(i,i+1).equals(" ")) {
         				retorno.add(formataPalavra(frase.substring(iniciaPalavra,i)));
         				iniciaPalavra = i+1;
         			}
         		}
         		retorno.add(formataPalavra(frase.substring(iniciaPalavra,frase.length())));
        		return retorno;
         	}
    	}
    }
}
