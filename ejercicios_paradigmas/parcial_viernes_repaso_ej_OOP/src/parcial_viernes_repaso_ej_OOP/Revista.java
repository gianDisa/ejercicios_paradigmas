package parcial_viernes_repaso_ej_OOP;

public class Revista extends Publicacion{
	
	private int numEdic;
	
	public Revista(String titulo, int numEdic) {
		super(titulo);
		this.numEdic=numEdic;
	}
	
	public void prestar(String socio) {
		throw new IllegalStateException("Una revista no se puede prestar ni devolver.");
		//System.out.println("Una revista no se puede prestar ni devolver.");
	}
	public void devolver(String socio) {
		throw new IllegalStateException("Una revista no se puede prestar ni devolver.");
	}
	public boolean estaDisponible() {
		return false;
	}
	
}
