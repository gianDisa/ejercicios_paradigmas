package ejercicio_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPunto {

	private Punto punto;
	
	@BeforeEach
	public void setUp() {
		punto = new Punto(0, 0);
	}
	
	@Test
	void  creaPunto(){
		assertNotNull(punto);
	}
	
	@Test
	void  xCambia(){
		
		punto.cambiarX(1);
		assertEquals(1, punto.obtenerX());
	}
	
	@Test
	void  estaSobreEjeX(){
		punto.cambiarX(0);
		assertTrue(punto.estaSobreEjeX());
	}
	
	@Test
	void  estaSobreEjeY(){
		punto.cambiarY(0);
		assertTrue(punto.estaSobreEjeY());
	}
	
	@Test
	void  NoEstaSobreEjeY(){
		punto.cambiarY(2);
		assertFalse(punto.estaSobreEjeY());
	}
	
	@Test
	void  NoEstaSobreEjeX(){
		punto.cambiarX(2);
		assertFalse(punto.estaSobreEjeX());
	}
	
	@Test
	void  esElOrigen(){
		punto.cambiarX(0);
		punto.cambiarY(0);
		assertTrue(punto.esElOrigen());
	}
	
	@Test
	void  NoEsElOrigen(){
		punto.cambiarX(2);
		punto.cambiarY(3);
		assertFalse(punto.esElOrigen());
	}
	
	@Test
	void  distOtroPunto1(){
		punto.cambiarX(1);
		punto.cambiarY(1);
		Punto otro = new Punto(2, 2);
		assertEquals(1.4142135623730951,punto.distanciaAotroPunto(otro));
	}
	
	@Test
	void  distOtroPunto2(){
		punto.cambiarX(3);
		punto.cambiarY(4);
		Punto otro = new Punto(11, 10);
		assertEquals(10,punto.distanciaAotroPunto(otro));
	}
	
	@Test
	void  distOrigen(){
		punto.cambiarX(3);
		punto.cambiarY(4);
		assertEquals(5,punto.distanciaAlOrigen());
	}

}
