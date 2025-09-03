package Clases;

public class Bicicleta extends Transporte{
	private String TipoRueda;
	private String Modelo;

	public Bicicleta (String clase, int matricula, String TipoRueda, String Modelo) {
		super (clase, matricula);
		
		this.TipoRueda = TipoRueda;
		this.Modelo = Modelo;
	}
}
