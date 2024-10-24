package com.clases;

public class Televisor extends ProductoElectrodomestico{
	private int tamañoPantalla;
	private int resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantalla, int resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}
	
	
	
	public int getTamañoPantalla() {
		return tamañoPantalla;
	}



	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}



	public int getResolucion() {
		return resolucion;
	}



	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}



	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println(". Resolucion: " + this.getResolucion() + ". Pulgadas: " + this.getTamañoPantalla());
		
	}
	
}
