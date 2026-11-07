package ejercicio_2;

public class MainOrquesta{

	public static void main(String[] args) {
		
		Cuerda instruCuerda = new Cuerda("guitarra elec","hola");
		Afinador afinad = new Afinador("Carlos");
		
		Instrumento orquesta[] = new Instrumento[4];
		orquesta[0]=new Cuerda("Guitarra","Criolla");
		orquesta[3]=new Cuerda("Guitarra","Criolla");
		orquesta[1]=new Viento("Guitarra","Criolla","Madera");
		orquesta[2]=new Percusion("Tambor", "Acustica");
		
		for (Instrumento instrumento : orquesta) {
			instrumento.tocarInstrumento();
		}
		
		for (Instrumento instrumento : orquesta) {
			if(instrumento instanceof Cuerda)
			instrumento.tocarInstrumento();
		}
		
		instruCuerda.afinar(afinad);
		
	}

}
