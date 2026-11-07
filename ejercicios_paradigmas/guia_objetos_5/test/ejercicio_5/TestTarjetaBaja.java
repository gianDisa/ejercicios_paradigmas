package ejercicio_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTarjetaBaja {
	
	private TarjetaBaja tarjeta; 
	@BeforeEach
	public void setUp() {
		tarjeta = new TarjetaBaja(100.0);
	}

	@Test
	void obtengoSaldo() {
		assertEquals(100.0, tarjeta.obtenerSaldo());
	}
	
	@Test
	void cargoYobtengoSaldo() {
		tarjeta.cargar(100);
		assertEquals(200.0, tarjeta.obtenerSaldo());
	}
	
	@Test
	void pagoBondi() {
		//tarjeta.cargar(100);
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		//tarjeta.pagarViajeEnColectivo();
		assertEquals(20.0, tarjeta.obtenerSaldo());
	}
	
	@Test
	void pagoSubte() {
		//tarjeta.cargar(100);
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		assertEquals(30.0, tarjeta.obtenerSaldo());
	}
	
	@Test
	void pagoBondiYcuentoViaje() {
		//tarjeta.cargar(100);
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		assertEquals(2, tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	void pagoSubteYcuentoViaje() {
		//tarjeta.cargar(100);
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		assertEquals(2, tarjeta.contarViajesEnSubte());
	}
	
	@Test
	void pagoYcuentoViaje() {
		//tarjeta.cargar(100);
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		assertEquals(2, tarjeta.contarViajes());
	}

}
