package ejercicio_2;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		List<Venta> ventas = new ArrayList<>();
		Venta venta1 = new Venta("Carlos",100.00);
		Venta venta2 = new Venta("Hernan",100.01);
		ventas.add(venta1);
		ventas.add(venta2);
		int numBuscado = 1;
		for (Venta venta : ventas) {
			if(venta.getNum()==numBuscado) {
				System.out.println(venta.toString());
			}
			if(venta.getDia()==25) {
				System.out.println(venta.toString());
			}
		}
		
	}

}
