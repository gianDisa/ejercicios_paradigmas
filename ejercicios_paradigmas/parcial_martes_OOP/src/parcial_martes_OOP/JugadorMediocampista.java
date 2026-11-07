package parcial_martes_OOP;

public class JugadorMediocampista extends Jugador{
	
	public JugadorMediocampista(int num) {
		super(num);
		this.nivelHabilidad=2;
	}
	
	public void pasarBalon(String tipo, Jugador jugador){
		if(this.posesion) {
			if(tipo.equals("Raso")) {
				System.out.println("Jugador "+this.num+" realiza un pase raso a "
						+ "jugador "+jugador.num);
				jugador.posesion=true;
				this.posesion=false;
			}else {
				if(tipo.equals("Bombeado")) {
					System.out.println("Jugador "+this.num+" realiza un pase bombeado a "
				+ "jugador"+jugador.num);
					jugador.posesion=true;
					this.posesion=false;
			}else {
				throw new IllegalStateException("El modo de pase no es valido");
			}
		}
	}else {
		throw new IllegalStateException("El jugador num "+this.num+" no tiene la pelota.");
	}
 }
	public void sacarDelMedio() {
		this.posesion=true;
	}
}
