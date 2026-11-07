package ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNota {
	
	private Nota nota;
	
	@BeforeEach
	public void setUp() {
		nota = new Nota(5);
	}
	
	@Test
	void quePuedoCrearlo() {
		
		assertNotNull(nota);
		
	}
	
	@Test
	void notaFueraDeRango() {
		nota = new Nota(11);
		assertEquals(-1, nota.obtenerValor());
	}
	
	@Test
	void notaAprobada() {
		nota = new Nota(7);
		//assertEquals(true, nota.aprobado());
		assertTrue(nota.aprobado());
	}
	
	@Test
	void notaDesaprobada() {
		nota = new Nota(6);
		//assertEquals(true, nota.aprobado());
		assertTrue(nota.desaprobado());
	}
	
	@Test
	void notaNoCambia() {
		
		nota.recuperar(11);
		assertEquals(5,nota.obtenerValor());
	}
	
	@Test
	void notaSiCambia() {
		
		nota.recuperar(10);
		assertEquals(10,nota.obtenerValor());
	}
}
