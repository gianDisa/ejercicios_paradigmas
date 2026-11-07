package ejercicio_4;


import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Miedo","Carlos");
		Libro libro2 = new Libro("Toga","Tomas");
		Libro libro3 = new Libro("Miedo","Mateo");
		Libro libro4 = new Libro("Futbol","Gaby");
		Set<Libro> ejemplaresUnicos = new TreeSet<>();
		
		ejemplaresUnicos.add(libro1);
		ejemplaresUnicos.add(libro2);
		ejemplaresUnicos.add(libro3);
		ejemplaresUnicos.add(libro4);
		
		for (Libro libro : ejemplaresUnicos) {
			System.out.println(libro);
			//System.out.println(libro.toString());
		}
		
		
		
	}

}
