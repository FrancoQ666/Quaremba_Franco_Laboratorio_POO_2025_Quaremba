package Clases;

public class PlanBasico extends PlanGeneral{
	private String CostoAdicional;
	
	public PlanGeneral (int Codigo, int Nivel, int Costo) {
		super (Codigo, Nivel, Costo);
			
		this.Codigo = Codigo;
		this.Nivel = Nivel;
		this.Costo = Costo;
	}

}
