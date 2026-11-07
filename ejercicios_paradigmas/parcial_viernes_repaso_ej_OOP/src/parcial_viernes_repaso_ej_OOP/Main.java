package parcial_viernes_repaso_ej_OOP;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Terror","Gian");
		Revista revista = new Revista("Noticias",123);
		Recurso_Digital recurso = new Recurso_Digital("Pagina", "www.pag.com");
		
		biblioteca.agregar(recurso);
		biblioteca.agregar(libro);
		biblioteca.agregar(revista);
		
		//biblioteca.prestar("Terror", "Javier");
		try {
			//biblioteca.prestar("Terror", "Javier");
			//biblioteca.prestar("Noticias","Javier");
			biblioteca.prestar("Pagina", "Charlie");
			biblioteca.prestar("Pagina", "Juan");
			biblioteca.prestar("Pagina", "Hernan");
			biblioteca.prestar("Pagina", "Gustavo");
		}
		catch(IllegalStateException e){
			System.out.println(e.getMessage());
			biblioteca.devolver("Pagina", "Juan");
			biblioteca.prestar("Pagina", "Gustavo");
			//biblioteca.devolver("Terror", "Javier");
			//biblioteca.prestar("Terror", "Javier");
		}
		
		
		
		
	}

}
