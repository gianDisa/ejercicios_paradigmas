package ejercicio_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCerradura {
	
	private Cerradura cerradura;
	
	@BeforeEach
	public void setUp() {
		cerradura = new Cerradura(123, 3);
	}
	
	@Test
	void cerraduraAbre() {
		assertTrue(cerradura.abrir(123));
	}
	
	@Test
	void cerraduraNoAbre() {
		assertFalse(cerradura.abrir(1234));
	}
	
	@Test
	void verSiEstaAbierta() {
		cerradura.abrir(123);
		assertTrue(cerradura.estaAbierta());
	}
	
	@Test
	void verSiEstaCerrada() {
		cerradura.abrir(123);
		cerradura.cerrar();
		assertTrue(cerradura.estaCerrada());
	}
	
	@Test
	void puertaSeBloquea() {
		cerradura.abrir(1234);
		cerradura.abrir(1234);
		cerradura.abrir(1234);
		cerradura.abrir(1233);
		assertTrue(cerradura.fueBloqueada());
	}

}
