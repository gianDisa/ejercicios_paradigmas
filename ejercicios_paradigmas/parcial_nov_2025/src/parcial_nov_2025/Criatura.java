package parcial_nov_2025;

public abstract class Criatura implements Comparable<Criatura>{

	protected String nombre;
	protected Integer nivPelig;
	protected Integer nivVeloc;
	
	protected Criatura(String nombre, int nivPelig, int nivVeloc){
		
		this.nombre=nombre;
		this.nivPelig=nivPelig;
		this.nivVeloc = nivVeloc;
	}
	
	protected abstract void atacar();
	
	@Override
	public int compareTo(Criatura otraCriatura) {
		
		return this.nivPelig - otraCriatura.nivPelig;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getNivPelig() {
		return this.nivPelig;
	}
}
