package ejercicio_5;

public class TarjetaBaja {

	private double saldo;
	private int cantViajesColectivo;
	private int cantViajesSubte;
	// completar
	
	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		// completar
		saldo = saldoInicial;
		cantViajesColectivo = 0;
		cantViajesSubte = 0;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		// completar
		return saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		// completar
		saldo+=monto;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() { //suponiendo que el limite el -100
		// completar
		if((saldo - 40) <= (-100))
		{
			System.out.println("\nSaldo Insuficiente.\n");
		}
		else {
			saldo-=40;
			cantViajesColectivo++;
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		// completar
		if((saldo - 35) <= (-100))
		{
			System.out.println("\nSaldo Insuficiente.\n");
		}
		else {
			saldo-=35;
			cantViajesSubte++;
		}
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		// completar
		return cantViajesSubte + cantViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		// completar
		return cantViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		// completar
		return cantViajesSubte;
	}

}
