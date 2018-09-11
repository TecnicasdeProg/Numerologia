package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FormatadorTesteParametrizado {
    private String fInput;
    private String fExpected;

@Parameters
public Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        { "AL4GUM4COIWQ", "al4gum4coiwq" }, { "NAIZU", "naizu" }, { "2", "2" }, { "A", "a" }, { "NENHUMAMUDANÇA", "nenhumamudança" }, { "FORMATADORFUNCIONA", "formatadorFUNCIONA" }, { "7672", "7672" }  
    });
}


public void FormatadorTeste(String input, String expected) {
    this.fInput = input;
    this.fExpected = expected;
}

@Test
public void testeParametrizado() {
	Formatador f = new Formatador();
    assertEquals(fExpected, f.formataPalavra(fInput));
}
}