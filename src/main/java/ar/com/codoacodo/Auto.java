package ar.com.codoacodo;

import javax.print.DocFlavor.STRING;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Auto {

	/*atributos*/
	
	String marca;
	String modelo;
	String color;
	Integer anio; //puedo usar int
	Boolean encendido;
	Float velocidad;
	Float velocidadMaxima;
	
	
	
	/*constructor*/
	
	public Auto(
			
			String marca,
			String modelo,
			String color ,
			Integer anio,
			Float velocidadmaxima
			) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.velocidadMaxima = velocidadMaxima;
		
		this.encendido = Boolean.FALSE;
		this.velocidad = 0f;
			
	}
			
			/*metodos*/
	void encender() {
		  //este cambia el estado de encendido
		
		if(!this.encendido) {
		this.encendido = Boolean.TRUE;
		}else {
			System.out.println("ya esta encendido!");
			
		}
	}
	
	
	void apagar() {
		if(!this.encendido){
			this.encendido = Boolean.FALSE;
			this.velocidad = 0f;
		    }else {
				System.out.println("no se puede apagar 2 veces!");
				
	}
	}
	void acelerar() {
		if(!this.encendido){
			if(velocidad < velocidadMaxima) {
				this.velocidad++;
			}else {
				
				System.out.println("llegaste a la velocidad maxima");
			}
            
		  }else {
				
				System.out.println("primero encemde el auto para acelerar");
			
			}
			}
	void frenar() {
		if (this.encendido) {
			if(velocidad > 0) {
				this.velocidad--;
			}else {
				System.out.println("el auto llego a velocidad 0");
			}
			}else {
				System.out.println("auto apagado");
				
			}
			
				
			}
		void frenarconganas() {
			if (this.encendido) {
				while(this.velocidad > 0) {
					this.velocidad--;
					
				}
			}
	
	}
}