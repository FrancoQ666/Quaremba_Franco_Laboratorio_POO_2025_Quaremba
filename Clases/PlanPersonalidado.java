package Clases;

public class PlanPersonalidado extends PlanGeneral{
	private String Recargo;
	private String Nutricion;
	
	public PlanPremiun (int Codigo, int Nivel, int Costo) {
		super (Codigo, Nivel, Costo);
			
		this.Codigo = Codigo;
		this.Nivel = Nivel;
		this.Costo = Costo;
	}
}