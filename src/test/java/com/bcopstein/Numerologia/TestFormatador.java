package com.bcopstein.Numerologia;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;


public class TestFormatador {
	private Formatador f;
	
	@Before
	public void setUp() {
		f = new Formatador();
	}
	@Test
	public void testaPalavra() {
		String resp = f.formataPalavra("paLavRa");
		assertEquals("PALAVRA",resp);
	}
	@Test
	public void testaPalavraComNumero() {
		String resp = f.formataPalavra("83412s");
		assertEquals("83412S",resp);
	}
	@Test
	public void testaPalavraPlus() {
		String resp = f.formataPalavraPlus("a3412s");
		assertEquals("A3412S",resp);
	}
	@Test
	public void testaFrase() {
		String resp = f.formataFrase("eST4 frase na2 esta f0rmat4");
		String result = "EST4FRASENA2ESTAF0RMAT4";
		assertEquals(result,resp);
	}
}