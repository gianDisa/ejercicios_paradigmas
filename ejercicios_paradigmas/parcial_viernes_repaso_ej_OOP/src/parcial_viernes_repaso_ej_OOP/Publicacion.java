package parcial_viernes_repaso_ej_OOP;

public abstract class Publicacion {
	
	protected String titulo;
	
	protected Publicacion(String titulo) {
		this.titulo=titulo;
	}
	
	public abstract void prestar(String titulo);
	public abstract void devolver(String titulo);
	public abstract boolean estaDisponible();
	public String getTitulo() {
		return titulo;
	}
}