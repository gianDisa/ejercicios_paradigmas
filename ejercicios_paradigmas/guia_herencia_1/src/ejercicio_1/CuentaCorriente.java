package ejercicio_1;

public class CuentaCorriente extends Cuenta{
	
	protected double montoEnDescubierto;
	
	public CuentaCorriente(double montoDesc) {
		super();
		montoEnDescubierto = montoDesc;
	}
	
	@Override
	public void verSaldo() {
		System.out.println("El saldo de la cuenta " +this.numCuenta+"es:"+(this.saldo+montoEnDescubierto)+"\n");
	}
	@Override
	public double getSaldo() {
		return (this.saldo+montoEnDescubierto);
	}
	
	@Override
	public boolean retirarDinero(double dineroRetirar) {
		if((saldo+montoEnDescubierto) < dineroRetirar)
		{
			System.out.println("No se tiene suficiente saldo para retirar, intente con otro monto.");
			return false;
		}
		montoEnDescubierto-=dineroRetirar;
		if(montoEnDescubierto<0) {
			this.saldo+=montoEnDescubierto;
		}
		return true;
		
	}
	
}
