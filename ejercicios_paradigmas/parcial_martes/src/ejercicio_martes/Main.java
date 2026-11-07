package ejercicio_martes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		List<String> palabras = new ArrayList<>();
		palabras.add("sol");
		palabras.add("casa");
		palabras.add("luz");
		palabras.add("mesa");
		palabras.add("a");
		
		Map<Integer,List<String>> mapaPalabras = agruparPorLongitud(palabras);
		mostrarMapa(mapaPalabras);
		
	}	
	
	static Map<Integer, List<String>> agruparPorLongitud(List<String> lista){
		
		int cant;
		Map<Integer, List<String>> mapa = new HashMap<>();
		for (String string : lista) {
			cant = string.length();
			
			List<String> palabras;
			if(mapa.containsKey(cant)) {
				palabras = mapa.get(cant);
				palabras.add(string);
			}
			else {
				palabras = new ArrayList<>();
				palabras.add(string);
				mapa.put(cant, palabras);
			}
			Collections.sort(palabras);
		}
		return mapa;
	}
	
	static void mostrarMapa(Map<Integer, List<String>> mapa) {
		
		for(Integer cant : mapa.keySet()) {
			System.out.println(cant);
			for(String palabra : mapa.get(cant)) {
				System.out.println(palabra);
			}	
		}	
	}	
}

	
	

