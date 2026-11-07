package parcial_nov_2025;

public class Reina extends Criatura{
	
	public Reina(String nombre, int nivPelig, int nivVeloc) {
		super(nombre,nivPelig,nivVeloc);
	}
	
	@Override
	public void atacar() {
		System.out.println("Coordina ataques grupales");
	}
	

}
