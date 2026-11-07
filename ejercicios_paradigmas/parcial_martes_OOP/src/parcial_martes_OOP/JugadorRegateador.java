package parcial_martes_OOP;

public class JugadorRegateador extends Jugador{
	
	public JugadorRegateador(int num) {
		super(num);
		this.nivelHabilidad=3;
	}
	
	public void regatear(Jugador jugador) {
		
		if(this.posesion) {
			if(!(jugador.nivelHabilidad==3)) {
				if(jugador.nivelHabilidad==1) {
					System.out.println("El jugador num "+this.num+" elude al jugador de ataque "
							+ ""+jugador.num);
				}else {
					System.out.println("El jugador num "+this.num+" elude al jugador de medio "
							+ ""+jugador.num);
				}
			}else {
				throw new IllegalStateException("Un regateador no puede regatear a otro regateador");
			}
			
		}else {
			throw new IllegalStateException("El jugador num "+this.num+" no tiene la pelota");
		}
		
	}
	
}
