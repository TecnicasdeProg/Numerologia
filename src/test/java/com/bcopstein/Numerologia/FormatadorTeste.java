package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
		ArrayList<String> resp = f.formataFrase("eST4 frase na2 esta f0rmat4");
		ArrayList<String> result = new ArrayList<String>();
		result.add("EST4");
		result.add("FRASE");
		result.add("NA2");
		result.add("ESTA");
		result.add("F0RMAT4");
		assertEquals(result,resp);
	}
}
