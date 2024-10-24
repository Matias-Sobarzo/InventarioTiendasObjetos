package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	public ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<>();

	public void agregaProducto(ProductoElectrodomestico producto) {
		this.listaDeProductos.add(producto);
	}
	
	public ArrayList<ProductoElectrodomestico> getListaDeProductos() {
		return listaDeProductos;
	}

	public void setListaDeProductos(ArrayList<ProductoElectrodomestico> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}	
	public void buscarProducto(String busqueda) {
		for (int i = 0; i < this.listaDeProductos.size(); i++) {
		if (busqueda == this.listaDeProductos.get(i).getNombre()) {
			System.out.println("Se ha encontrado el articulo: " + this.listaDeProductos.get(i).getNombre()); 
		}
		else {
			System.out.println("El articulo no se encuenta");
		}	
		}
	}
	

	public void venta (ProductoElectrodomestico venta, int cantidad) {
		for (int i = 0; i < this.listaDeProductos.size(); i++) {
			if (venta == this.listaDeProductos.get(i)) {
				int stock = this.listaDeProductos.get(i).getCantidadDisponible();
				if (cantidad > stock) {
					System.out.println("Cantidad no disponible");		
				}else{
					this.listaDeProductos.get(i).setCantidadDisponible(stock - cantidad);
					System.out.println("Venta realizada correctamente");
				}
			}else{
				System.out.println("El articulo no se encuenta");
			}
		}
	}
	
	public void productosDisponibles() {
		System.out.println("Los productos en existencia son: ");
		for (int i = 0; i < listaDeProductos.size(); i++) {
			listaDeProductos.get(i).mostrarInformacion();
		}
	}
}
