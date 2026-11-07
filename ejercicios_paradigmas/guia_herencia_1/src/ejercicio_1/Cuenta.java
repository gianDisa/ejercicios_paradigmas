package ejercicio_1;

public class Cuenta {
	
	protected double saldo;
	protected int numCuenta;
	private static int ultimoId;
	
	public Cuenta() {
		this.saldo = 0;
		this.numCuenta=ultimoId+1;
		ultimoId=numCuenta;
	}
	
	public void verNumCuenta() {
		System.out.println("El numero de cuenta es:" +this.numCuenta);
	}
	
	public int getNumCuenta() {
		return this.numCuenta;
	}
	
	public void verSaldo() {
		System.out.println("El saldo de la cuenta " +this.numCuenta+"es:"+this.saldo+"\n");
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void ingresarDinero(double dineroIngresado) {
		this.saldo+=dineroIngresado;
	}
	
	public boolean retirarDinero(double dineroRetirar) {
		if(this.saldo >= dineroRetirar)
		{
			this.saldo-=dineroRetirar;
			return true;
		}
		System.out.println("No se tiene suficiente saldo para retirar, intente con otro monto.");
		return false;
	}
	
	public boolean transferir(double montoTransferir, Cuenta cuentaDestino) {
		if(cuentaDestino == null) {
			return false;
		}
		//saldo-=montoTransferir;
		//cuentaDestino.saldo += montoTransferir;
		;
		if(!retirarDinero(montoTransferir)) {
			System.out.println("No se tiene suficiente saldo para transferir, intente con otro monto.");
			return false;
		}
		cuentaDestino.ingresarDinero(montoTransferir);
		return true;
	}
}
