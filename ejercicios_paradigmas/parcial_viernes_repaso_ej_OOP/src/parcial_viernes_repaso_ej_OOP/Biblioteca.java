package parcial_viernes_repaso_ej_OOP;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Publicacion> publicaciones;

	public Biblioteca(){
		publicaciones =  new ArrayList<>();
	}
	
	public void agregar(Publicacion publi) {
		if (!publicaciones.contains(publi)) {
			publicaciones.add(publi);
		}else {
			throw new IllegalStateException("La publicacion ya esta en la bilioteca");
		}
	}

	public boolean prestar(String titulo, String socio) {
		
		for(Publicacion publi : publicaciones) {
			if(publi.getTitulo() == titulo) {
				publi.prestar(socio);
				
				return true;
			}	
		}
		//throw new IllegalStateException("La publicacion no esta en la bilioteca");
		System.out.println("La publicacion no esta en la bilioteca");
		return false;
	}
	
	public boolean devolver(String titulo, String socio) {
		
		for(Publicacion publi : publicaciones) {
			if(publi.getTitulo() == titulo) {
				publi.devolver(socio);
				
				return true;
			}	
		}
		System.out.println("La publicacion no esta en la bilioteca");
		return false;
	}
	
}
