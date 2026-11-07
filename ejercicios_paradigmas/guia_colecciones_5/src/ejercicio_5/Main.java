package ejercicio_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Double> ventasMes = new HashMap<>();
		agregarVenta(ventasMes, "Enero", 100.0);
		agregarVenta(ventasMes, "Enero", 200.0);
		agregarVenta(ventasMes, "Marzo", 200.0);
		agregarVenta(ventasMes, "Marzo", 200.0);
		mostrarVentas(ventasMes);
		
		

	}

	public static void agregarVenta(Map<String, Double> mapa, String mes, Double monto) {
//		Double total=0d;
//		if(mapa.containsKey(mes)) {
//			total = mapa.get(mes);
//		}
//		mapa.put(mes,monto + total);
		
		Double valorActual= mapa.getOrDefault(mes, 0d);
		mapa.put(mes, valorActual + monto);
	}
	
	public static void mostrarVentas(Map<String, Double> mapa) {
		for (String clave : mapa.keySet()) {
			System.out.println(clave +" "+ mapa.get(clave));
		}
	}
	
}

