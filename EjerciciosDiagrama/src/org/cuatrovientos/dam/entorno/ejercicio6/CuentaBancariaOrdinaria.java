package org.cuatrovientos.dam.entorno.ejercicio6;

public class CuentaBancariaOrdinaria {
	private int Número;
	private String Titular;
	private int saldo;
	public CuentaBancariaOrdinaria() {
		super();
	}
	
	public void depositar(int cantidad) {
		saldo += cantidad;
	}
	public void retirar(int cantidad) {
		saldo -= cantidad;
	}
	
	public String mostarInfoCuenta() {
		return Número + "\n" + Titular + "\n" + saldo;
	}
}
