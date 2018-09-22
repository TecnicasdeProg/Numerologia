package com.bcopstein.Numerologia;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRedutor {
	private Redutor r = new Redutor();

	@Test
	public void testReducaoPalavraPitagorica() {
		r.setTipoTabela(TipoTabela.PITAGORICA);
		String palavra = "PALAVRA"; // 7 + 1 + 3 + 1 + 4 + 9 + 1 = 26
		r.reducaoPalavra(palavra);
		assertEquals(26, r.reducaoPalavra(palavra));
	}

	@Test
	public void testReducaoFrasePitagorica() {
		r.setTipoTabela(TipoTabela.PITAGORICA);
		String frase = "UMA FRASE CURTA Z"; // 3 + 4 + 1 + 6 + 9 + 1 + 1 + 5 + 3 + 3 + 9 + 2 + 1 + 8 = 56
		r.reducaoFrase(frase);
		assertEquals(56, r.reducaoFrase(frase));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPitagoricaThrow() {
		r.setTipoTabela(TipoTabela.PITAGORICA);
		r.reducaoPalavra("a");
	}

	@Test
	public void testReducaoPalavraChaldean() {
		r.setTipoTabela(TipoTabela.CHALDEAN);
		String palavra = "PALAVRA"; // 8 + 1 + 3 + 1 + 6 + 2 + 1 = 22
		r.reducaoPalavra(palavra);
		assertEquals(22, r.reducaoPalavra(palavra));
	}

	@Test
	public void testReducaoFraseChaldean() {
		r.setTipoTabela(TipoTabela.CHALDEAN);
		String frase = "UMA FRASE CURTA Z"; // 6 + 4 + 1 + 8 + 2 + 1 + 3 + 5 + 3 + 6 + 2 + 4 + 1 + 7 = 53
		r.reducaoFrase(frase);
		assertEquals(53, r.reducaoFrase(frase));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testChaldeanThrow() {
		r.setTipoTabela(TipoTabela.CHALDEAN);
		r.reducaoPalavra("a");
	}
	
	@Test
	public void testReducaoData() {
		String data = "10/10/2011";
		assertEquals(6, r.reducaoData(data));
}
	
	@Test(expected = IllegalArgumentException.class)
	public void testReducaoDataErroAno() {
		String data = "10/11/211";
		assertEquals(6, r.reducaoData(data));
}
	
	@Test(expected = IllegalArgumentException.class)
	public void testReducaoDataThrow() {
		String data = "10101010";
		r.reducaoData(data);
		assertEquals(22, r.reducaoData(data));
	}
}
