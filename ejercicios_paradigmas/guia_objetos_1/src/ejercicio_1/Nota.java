package ejercicio_1;

public class Nota {

	// completar - atributos
	private int valor;

	/**
	 * pre : valorInicial está comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 */
	public Nota(int valorInicial) { // constructor
		// completar
		if (valorInicial >= 0 && valorInicial <= 10) {
			this.valor = valorInicial;
		} else {
			this.valor = -1;
		}
	}

	/**
	 * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {
		return valor;
	}

	/**
	 * post: indica si la Nota permite o no la aprobación.
	 */
	public boolean aprobado() {
		if (valor >= 7)
			return true;
		else
			return false;
	}

	/**
	 * post: indica si la Nota implica desaprobación.
	 */
	public boolean desaprobado() {
//		if (valor < 7)
//			return true;
//		else
//			return false;
		return !aprobado();

	}

	/**
	 * pre : nuevoValor está comprendido entre 0 y 10. post: modifica el valor
	 * numérico de la Nota, cambiándolo por nuevoValor, siempre y cuando nuevoValor
	 * sea superior al valor numérico actual de la Nota.
	 */
	public void recuperar(int nuevoValor) {
		if (nuevoValor <= 10 && nuevoValor >= 0) {
			if(nuevoValor > valor) {
				valor = nuevoValor;
			}
		}
	}
}
