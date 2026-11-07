package ejercicio_1;

public class Main {
	public static void main(String[] args) {
		
	CuentaCorriente cuentaOrigen = new CuentaCorriente(1000);
	cuentaOrigen.ingresarDinero(10000);
	System.out.println(cuentaOrigen.getSaldo()); // 11000
	CuentaDeAhorros cuentaDestino = new CuentaDeAhorros();
	System.out.println(cuentaDestino.getSaldo()); // 0
	cuentaOrigen.transferir(500, cuentaDestino);
	System.out.println(cuentaOrigen.getSaldo()); // 9450
	System.out.println(cuentaDestino.getSaldo()); // 550
	System.out.println(cuentaDestino.getSaldoAhorro());
	cuentaDestino.ingresarDineroAhorro(250);
	System.out.println(cuentaDestino.getSaldoAhorro());
	System.out.println(cuentaDestino.getSaldo());
	
	}
}
