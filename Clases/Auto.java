package Clases;

public class Auto extends Transporte{
	private String TipoCombustible;
	private String Modelo;

	public Auto (String clase, int matricula, String TipoCombustible, String Modelo) {
		super (clase, matricula);
		
		this.TipoCombustible = TipoCombustible;
		this.Modelo = Modelo;
	}
}
