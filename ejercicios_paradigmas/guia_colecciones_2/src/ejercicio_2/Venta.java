package ejercicio_2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Venta {
	private int numVenta;
	private static int ultimoNum;
	private LocalDate fecha;
	private LocalTime hora;
	private String nombreCliente;
	private double monto;
	
	public Venta(String nombreCliente, double monto) {
		
		this.numVenta = ultimoNum + 1;
		ultimoNum=numVenta;
		this.fecha=LocalDate.now();
		this.hora=LocalTime.now();
		this.nombreCliente=nombreCliente;
		this.monto=monto;
	}
	
	public int getNum() {
		return numVenta;
	}
	
	public int getDia() {
		return fecha.getDayOfMonth();
	}
	
	@Override
	public String toString() {
		return this.numVenta + " " + this.fecha + " " + this.hora + " " + this.nombreCliente+" "
				+ this.monto;
	}
	
}
