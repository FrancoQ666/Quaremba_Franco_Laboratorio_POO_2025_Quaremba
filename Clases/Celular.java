package Clases;

public class Celular extends Dispositivos{
	private String Aumento;
	public Celular (String Marca, String Precio_base, String Aumento) {
		super(Marca, Precio_base);
		this.Aumento = Aumento;
 }
}
