package ejercicio_6;

public class Cerradura {

	private int clave;
	private int cantFallos;
	private int contadorApAcertadas;
	private int contadorApFallidas;
	private int estado; // 1 - abierto, 0 - cerrado, -1 - bloqueado

	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		clave = claveDeApertura;
		cantFallos = cantidadDeFallosConsecutivosQueLaBloquean;
		contadorApAcertadas = 0;
		contadorApFallidas = 0;
		estado = 0;// cerrada
	}

//
	public boolean abrir(int clave) {
		if (estado == 0) {
			if (this.clave == clave) {
				estado = 1;
				contadorApAcertadas++;
				return true;
			} else {
				contadorApFallidas++;
				if (contadorApFallidas == cantFallos) {
					estado = -1;
					System.out.println("\nSe ha bloqueado la puerta.\n");
					return false;
				}
			}
		}else {
			if(estado == -1) {
				System.out.println("\nPuerta Bloqueada.\n");
				return false;
			}
			System.out.println("\nLa puerta ya esta abierta.\n");
		}
		return false;
	}

//
	public void cerrar() {
		if(estado == 1) {
			estado = 0;
		}else {
			System.out.println("\nLa puerta ya esta cerrada.\n");
		}
	}

//
	public boolean estaAbierta() {
		boolean estadoActual;
		if (estado == 1) {
			estadoActual = true;
		} else {
			estadoActual = false;
		}
		return estadoActual;
	}

//
	public boolean estaCerrada() {
		boolean estadoActual;
		if (estado == 0) {
			estadoActual = true;
		} else {
			estadoActual = false;
		}
		return estadoActual;
	}
//
	public boolean fueBloqueada() {
		if(estado == -1) {
			return true;
		}
		return false;
	}
//
	public int contarAperturasExitosas() {
		return contadorApAcertadas;
	}
//
	public int contarAperturasFallidas() {
		return contadorApFallidas;
	}
}
