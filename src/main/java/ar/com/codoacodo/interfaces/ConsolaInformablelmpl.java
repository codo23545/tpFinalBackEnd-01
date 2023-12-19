package ar.com.codoacodo.interfaces;

public class ConsolaInformablelmpl implements Informable {
	//atributos
	private String atrx;

	//constructor propio!!
	public ConsolaInformablelmpl( ) {
		
	}
    //polimorfismo: sobrescribr
	public void informar() {
		System.out.println();

	}
	
	//metodos 
	public String getAtrx() {
		return this.atrx;	
	}

   public void setAtrx(String atrx) {
	   this.atrx = atrx;
   }


}


