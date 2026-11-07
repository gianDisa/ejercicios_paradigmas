package ejercicio_2;

public class Viento extends Instrumento implements Afinables, Lustrables{
	
	protected String material;
	
	public Viento(String nombre, String descripcion, String material) {
		super(nombre, descripcion);
		this.material = material;
	}
	
	@Override
	protected void tocarInstrumento() {
		System.out.println("Toco mi instrum de percusion SOPLANDO.");
	}
	@Override
	public void afinar(Afinador afinador) {
		System.out.println("Afino mi instrumento de forma AUTOMATICA."+afinador.nombre);
	}
	@Override
	public void lustrar(Lustrador lustrador) {
		System.out.println("LUSTRO MI INSTRUM DE viento."+lustrador.nombre);
	}
}
