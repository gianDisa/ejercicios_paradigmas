package ejercicio_2;

public class Cuerda extends Instrumento implements Afinables{
	
	public Cuerda(String nombre, String descripcion) {
		super(nombre, descripcion);
	}
	
	@Override
	protected void tocarInstrumento() {
		System.out.println("Toco mi instrum de percusion TOCANDO LAS CUERDAS.");
	}
	
	@Override
	public void afinar(Afinador afinador) {
		System.out.println("Afino mi instrumento de forma MANUAL."+afinador.nombre);
	}
}
