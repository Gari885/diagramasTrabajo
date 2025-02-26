package org.cuatrovientos.dam.entorno.ejercicio4;

import java.util.ArrayList;

public class GestionLista {
		private ArrayList<String> listaCompra;

		public GestionLista() {
			this.listaCompra = new ArrayList<>();
			
		}
		
		public void AnyadirElemento (String elemento) {
			this.listaCompra.add(elemento);
		}
		
		public void EliminarElemento (String elemento) {
			int pos = listaCompra.indexOf(elemento);
			if (pos >= 0) {
				listaCompra.remove(pos);
				
			}else {
				System.out.println("No hay ningun elemento con ese nombre");
				
			}
		}
		
		public String MostarLista() {
			String listaCompleta = "";
			for (String s: listaCompra) {
				listaCompleta += s + " ";
			}
			return listaCompleta;
		}
		
}
