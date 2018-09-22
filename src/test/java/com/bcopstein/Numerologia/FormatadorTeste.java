package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormatadorTeste {
	private Formatador f;
	
	@BeforeEach
	void instancia() {
		f = new Formatador();
	}
	
	@Test
	void testaPalavra() {
		String resp = f.formataPalavra("paLavRa");
		assertEquals("PALAVRA",resp);
	}
	@Test
	void testaPalavraComNumero() {
		String resp = f.formataPalavra("83412s");
		assertEquals("83412S",resp);
	}
	@Test
	void testaPalavraPlus() {
		String resp = f.formataPalavraPlus("a3412s");
		assertEquals("A3412S",resp);
	}
	@Test
	void testaFrase() {
		String resp = f.formataFrase("eST4 frase na2 esta f0rmat4");
		String result = "EST4FRASENA2ESTAF0RMAT4";
		assertEquals(result,resp);
	}
}
