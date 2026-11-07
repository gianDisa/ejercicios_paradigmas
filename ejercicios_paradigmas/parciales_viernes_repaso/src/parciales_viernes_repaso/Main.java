package parciales_viernes_repaso;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Comparable> lista = new ArrayList<>();
		lista.add(5);
		lista.add(2);
		lista.add(8);
		lista.add(1);
		List<Integer> listaRtdo = contarMayores(lista);
		mostrarLista(listaRtdo);
	}
	
	static List<Integer> contarMayores(List<Comparable>datos){
		
		List<Integer> listaInt = new ArrayList<>();
		int cantidad;
		
		for(Comparable numeroActual : datos) {
			cantidad=0;
			for(Comparable num :datos) {
				if(numeroActual.compareTo(num)<0) {
					cantidad++;
				}
			}
			listaInt.add(cantidad);
		}
		return listaInt;
	}
	
	static void mostrarLista(List<Integer> lista) {
		
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}
	
}
