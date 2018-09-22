package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculadorTest {
	private Calculador c;
	private Formatador mockFormat = mock(Formatador.class);
	private Redutor mockRed = mock(Redutor.class);
	
	@BeforeEach
	public void setUp() throws Exception {
		when(mockFormat.formataFrase("Hello")).thenReturn("HELLO");
		when(mockFormat.formataFrase("a22@")).thenThrow(new IllegalArgumentException());
		when(mockRed.reducaoData("07/22/1995")).thenReturn(35);
		when(mockRed.reducaoData("2")).thenThrow(new IllegalArgumentException());
		when(mockRed.reducaoFrase("HELLO")).thenReturn(25);
		c = new Calculador(mockRed, mockFormat);
	}
	
	@Test
	public void NroDavida() {
		assertEquals(8, c.calculaNumeroDaVida("07/22/1995"));
	}
	
	@Test
	public void NroDoDestino() {
		assertEquals(7, c.calculaNumeroDestino("Hello"));
	}
	
	@Test
	public void NroDoDesejosDaAlma() {
		assertEquals(2, c.calculaNumeroDesejosDaAlma("Hello"));
	}
	
	@Test
	public void NroDoDesejosDaAlmaErrado() {
		assertThrows(IllegalArgumentException.class,() -> c.calculaNumeroDesejosDaAlma("a22@"));
	}
	
	@Test
	public void NroDaVidaErrado() {
		assertThrows(IllegalArgumentException.class,() -> c.calculaNumeroDaVida("2"));
	}
	
	@Test
	public void NroDoDestinoErrado() {
		assertThrows(IllegalArgumentException.class,() -> c.calculaNumeroDestino("a22@"));
	}
}
