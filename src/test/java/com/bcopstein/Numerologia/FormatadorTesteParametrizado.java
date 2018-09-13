package com.bcopstein.Numerologia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatadorTesteParametrizado {
	@DisplayName("Testa palavras fomatador")
    @ParameterizedTest
    @CsvSource({ "al4gum4coiwq,AL4GUM4COIWQ","naizu,NAIZU", "2,2", "a,A","nenhumamudança,NENHUMAMUDANÇA","formatadorFUNCIONA,FORMATADORFUNCIONA","7672a,7672A"})
    public void fomartador(String palavra,String respostaEsperada) {
		Formatador f = new Formatador();
		String result = f.formataPalavra(palavra);
		assertEquals(result,respostaEsperada);
    }
}