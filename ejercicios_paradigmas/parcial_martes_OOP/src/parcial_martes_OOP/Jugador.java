package parcial_martes_OOP;

public class Jugador {
		
	protected String estado; //caminando, corriendo
	protected boolean posesion;//pelota
	protected int num;
	protected int nivelHabilidad;
	
	protected Jugador(int num) {
		estado = "Caminando";
		posesion = false;
		this.num = num;
	}
	
	public void correr() {
		if(this.estado.equals("Corriendo")) {
			throw new IllegalStateException("El jugador ya estaba corriendo");
		}
		this.estado="Corriendo";
	}
	
	public void caminar() {
		if(this.estado.equals("Caminando")) {
			throw new IllegalStateException("El jugador ya estaba corriendo");
		}
		this.estado="Caminando";
	}
}
