package ar.com.codoacodo.herencia;

public class Musica2 extends Articulo{
	private String[] temas;
	
	public Musica2 (
			 String titulo, 
             Float precio,
		     String img) {
		
		super(titulo, precio, img);
	}

    public void setTemas (String[] temas) {
    	this.temas = temas;
    }
    
    public String [] getTemas () {
    	return this.temas;
    	
    }
    
    public String toString() {
    	return super.toString();
    }
}
			                    






   
	
	