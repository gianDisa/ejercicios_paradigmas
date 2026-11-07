package parcial_nov_2025;

public class Xenomorfo extends Criatura{
	
	public Xenomorfo(String nombre, int nivPelig, int nivVeloc) {
		super(nombre,nivPelig,nivVeloc);
	}
	
	@Override
	public void atacar() {
		System.out.println("Ataca con garras y cola");
	}
	

	
}
