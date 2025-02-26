package org.cuatrovientos.dam.entorno.ejercicio4;

public class Main {

	public static void main(String[] args) {
		GestionLista gestion = new GestionLista();
		
		gestion.AnyadirElemento("Kaka");
		gestion.AnyadirElemento("baka");
		System.out.println(gestion.MostarLista());
	}

}
