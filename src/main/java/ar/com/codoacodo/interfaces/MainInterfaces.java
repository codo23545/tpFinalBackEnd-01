package ar.com.codoacodo.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {
		//instanciar
     ConsolaInformablelmpl obj1 = new ConsolaInformablelmpl();
     
     //Interface nombre = ClaseQueImplementa();
     Informable i = new ConsolaInformablelmpl();
     i.informar();
     
     //down casting
     //quiero la  ConsolaInformableImpl que esta dentro de i
     ConsolaInformablelmpl ci = (ConsolaInformablelmpl)i;
     
     
     
     
	}

}
