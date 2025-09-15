package Clases;

public class PlanPremiun extends PlanGeneral{
	private String Recargo;
	
	public PlanPremiun (int Codigo, int Nivel, int Costo) {
		super (Codigo, Nivel, Costo);
			
		this.Codigo = Codigo;
		this.Nivel = Nivel;
		this.Costo = Costo;
	}
}
