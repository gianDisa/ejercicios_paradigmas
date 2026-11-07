package parcial_martes_OOP;

public class JugadorAtaque extends Jugador{
	
	public JugadorAtaque(int num){
		super(num);
		this.nivelHabilidad=1;
	}
	
	public void disparar(String tipo) {
		if(this.posesion) {
			if(tipo.equals("Colocado")) {
				System.out.println("Jugador "+ this.num+" realiza un disparo colocado");
			}else{
				if(tipo.equals("Potente")) {
					System.out.println("Jugador "+ this.num+" realiza un disparo colocado");
				}else {
					throw new IllegalStateException("El modo de disparo no es valido");
				}
			}
		}else {
			throw new IllegalStateException("El jugador num "+this.num+" no tiene la pelota.");
		}
	}
	
}
