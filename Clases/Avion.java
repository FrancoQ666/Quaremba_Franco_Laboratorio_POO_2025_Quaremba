package Clases;

public class Avion extends Transporte{
	private String TipoCombustible;
	private String Modelo;

	public Avion (String clase, int matricula, String TipoCombustible, String Modelo) {
		super (clase, matricula);
		
		this.TipoCombustible = TipoCombustible;
		this.Modelo = Modelo;
	}
}
