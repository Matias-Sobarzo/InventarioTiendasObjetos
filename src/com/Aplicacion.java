package com;

import com.clases.*;

public class Aplicacion {
	public static void main(String[] args) {
		
		ProductoElectrodomestico producto1 = new ProductoElectrodomestico("Aspiradora mademsa", 59990, 4);
		Televisor televisor1 = new Televisor("Televisor Lg", 190000, 5, 50, 1080);
		ComputadoraPortatil computadora1 = new ComputadoraPortatil("Notebook Acer", 598000, 12, 16);
		ProductoElectrodomestico producto2 = new ProductoElectrodomestico("Microondas", 40000, 8);
		
		TiendaElectronica tienda1 = new TiendaElectronica();
		
		tienda1.agregaProducto(televisor1);
		tienda1.agregaProducto(producto1);
		tienda1.agregaProducto(computadora1);
		tienda1.agregaProducto(producto2);
		
		tienda1.productosDisponibles();
		System.out.println("------");
		tienda1.buscarProducto("Aspiradora mademsa");
		System.out.println("------");
		tienda1.venta(televisor1, 1);
		System.out.println("------");
		tienda1.venta(producto1, 5);
		System.out.println("------");
		tienda1.venta(producto2, 4);
		System.out.println("------");
		tienda1.productosDisponibles();
	}
}
