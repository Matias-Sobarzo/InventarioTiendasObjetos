package com.clases;

import java.util.ArrayList;
import java.util.Random;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	private int memoriaRam;
	private int numeroSerie;
	public static ArrayList<Integer> series = new ArrayList<>();

	public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, int memoriaRam) {
		super(nombre, precio, cantidadDisponible);
		this.memoriaRam = memoriaRam;
		this.numeroSerie = this.generarNroSerie();
		ComputadoraPortatil.series.add(this.numeroSerie);


	}
	
	
	public int getMemoriaRam() {
		return memoriaRam;
	}



	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}



	public int getNumeroSerie() {
		return numeroSerie;
	}



	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}



	private int generarNroSerie() {
		Random random = new Random();
		int numeroRandom = 1000 + random.nextInt(9000);
		if(ComputadoraPortatil.series.contains(numeroRandom)) {
			this.generarNroSerie();
		}
		return numeroRandom;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println(". Memoria Ram: " + this.getMemoriaRam() + " GB, numero de serie: " + this.getNumeroSerie());
		
	}
	

}
