package Clases;

public class Revista extends Materiales{
	private String Articulo;
	

	public Materiales (String Titulo, String Autor, String Anio) {
		super (Titulo, Autor, Anio);
			
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.Anio = Anio;
	}
	private String setArticulo() {
		return Articulo;
	}
	private String getArticulo() {
		return Articulo;
	}
}


