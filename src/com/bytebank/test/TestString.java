package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {
	
	public static void main(String[] args) {
		
		String nombre = "Alura"; // Inmutable
		
		// No utilizada en el mundo real
		// String nombre2 = new String("Alura");
		
		System.out.println("Antes de metodo: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		   //01234
		char letra = nombre.charAt(3);
		int indice = nombre.indexOf("e");
		
		Object cuenta = new CuentaAhorros(344, 544);
		
		printLine(nombre);
		printLine(letra);
		printLine(indice);
		printLine(new CuentaAhorros(200,  300));
		
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}
//	public static void printLine(String valor) {
//		System.out.println(valor);
//	}
//	public static void printLine(char valor) {
//		System.out.println(valor);
//	}
//	public static void printLine(CuentaAhorros valor) {
//		System.out.println(valor);
//	}
	

}
