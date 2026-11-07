package parcial_viernes_repaso_ej_OOP;

public class Libro extends Publicacion{

	private String autor;
	private String socioActual;
	
	public Libro(String titulo, String autor) {
		super(titulo);
		this.autor=autor;
	}
	
	public void prestar(String socio) {
		if(estaDisponible()) {
			socioActual = socio;
			System.out.println("Prestado.");
		}else {
			throw new IllegalStateException("El libro no esta dispo.");
		}
	}
	public void devolver(String socio) {
		if(socioActual == socio) {
			socioActual=null;
			System.out.println("Devuelto.");
		}else {
			throw new IllegalStateException("El socio no tiene asignado un libro.");
		}
	}
	public boolean estaDisponible() {
		return socioActual == null;
	}
}
