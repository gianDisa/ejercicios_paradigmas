package ejercicio_2;

public class Percusion extends Instrumento implements Lustrables{
	
	public Percusion(String nombre, String descripcion) {
		super(nombre, descripcion);
	}
	
	@Override
	protected void tocarInstrumento() {
		System.out.println("Toco mi instrum de percusion GOLPEANDO.");
	}
	
	@Override
	public void lustrar(Lustrador lustrador) {
		System.out.println("LUSTRO MI INSTRUM DE PERCUSION."+lustrador.nombre);
	}
	
}
