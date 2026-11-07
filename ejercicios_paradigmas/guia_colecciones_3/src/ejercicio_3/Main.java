package ejercicio_3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola mi amor como como estas estas mi";
		Set <String> palabras = new HashSet<>();
		
		texto=texto.toLowerCase();
		texto = texto.replace(".", "").replace(",","").replace("!", "");
		String[] arrayPalabras = texto.split(" ");
		
		for (String string : arrayPalabras) {
			if(!palabras.add(string)) {
				palabras.remove(string);
			}
		}
		//pasarlo a lista mandandolo como param
		List<String> lista = new ArrayList<>(palabras);
		for (String string : lista) {
			//System.out.println(string.toString());
			System.out.println(string);
		}
//		pasarlo a vector
//		Object[] arraySinDup = palabras.toArray();
//		for (Object object : arraySinDup) {
//			System.out.println(object.toString());
//		}
		
	}

}
