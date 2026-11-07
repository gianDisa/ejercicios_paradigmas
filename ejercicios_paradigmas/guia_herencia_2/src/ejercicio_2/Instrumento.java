package ejercicio_2;

public abstract class Instrumento {
	
	protected String nombre;
	protected String descripcion;
	
	protected Instrumento(String nombre, String descripcion) {
		this.nombre=nombre;
		this.descripcion=descripcion;
	}

	protected abstract void tocarInstrumento();
	
}
