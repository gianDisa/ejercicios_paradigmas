package ejercicio_1;

public class CuentaDeAhorros extends Cuenta {

	protected double saldoAhorro;

	public CuentaDeAhorros() {
		super();
		saldoAhorro = 0;
	}

	public void verSaldoAhorro() {
		System.out.println("El saldo de la cuenta de ahorro es: " + saldoAhorro);
	}

	public double getSaldoAhorro() {
		return saldoAhorro;
	}

	public boolean ingresarDineroAhorro(double monto) {

		if (!retirarDinero(monto)) {
			System.out.println("No hay sufi saldo en la cuenta para " 
		+ "transferir al saldo secundario.");
			return false;
		}
		saldoAhorro += monto;
		return true;
	}

	public boolean reintegrarDineroAhorro(double monto) {

		if (saldoAhorro < monto) {
			System.out.println("No hay sufi saldo en la cuenta de ahorro para " + "reintegrar.");
			return false;
		}
		saldoAhorro -= monto;
		return true;
	}
}
