package parcial_nov_2025;

public class Facehugger extends Criatura{

	public Facehugger(String nombre, int nivPelig, int nivVeloc) {
		super(nombre,nivPelig,nivVeloc);
	}
	
	@Override
	public void atacar() {
		System.out.println("Parasita al huesped");
	}
	
}
