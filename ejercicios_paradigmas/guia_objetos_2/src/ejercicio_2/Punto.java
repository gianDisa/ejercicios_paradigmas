package ejercicio_2;

public class Punto {
	// completar
	private double x;
	private double y;

	public Punto(double xIni, double yIni) { // constructor
		this.x = xIni;
		this.y = yIni;
	}

	public double obtenerX() {
		return x;
	}

	public double obtenerY() {
		return y;
	}

	public void cambiarX(double nuevoX) {
		this.x = nuevoX;
	}

	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	}

	public boolean estaSobreEjeX() {
		if (this.x == 0) {
			return true;
		}
		return false;
	}

	public boolean estaSobreEjeY() {
		if (this.y == 0) {
			return true;
		}
		return false;
	}
	
	public boolean esElOrigen(){
		if (this.x == 0 && this.y == 0) {
			return true;
		}
		return false;
	}
	
	public double distanciaAlOrigen() { 
		double xcuad = x * x;
		double ycuad = y * y;
		return	Math.sqrt(xcuad+ycuad);
	}
	public double distanciaAotroPunto(Punto otro) { 
		double terminoX = (x - otro.x)*(x - otro.x) ;
		double terminoY = (y - otro.y)*(y - otro.y);
		return	Math.sqrt(terminoX+terminoY);
	}
}
