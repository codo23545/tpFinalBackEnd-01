package ar.com.codoacodo.repository;


import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	public static void main(String[] args) {
		//interface i  = new ClaseQueImplementa()..
		
		OradorRepository repository = new MySQLOradorRepository();
		
        repository.delete(2L);		
		
		
		
	}

	

}
