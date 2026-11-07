package ejercicio_4;

public class Libro implements Comparable<Libro>{
	private String titulo;
	private String autor;
	private static int codAnt;
	private int codigo;
	
	public Libro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
		this.codigo=codAnt+1;
		codAnt=codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		return titulo + "(por "+autor+")";
	}
	
	@Override
	public int compareTo(Libro otroLibro) {
		return this.titulo.compareTo(otroLibro.getTitulo());
	}
	
}
