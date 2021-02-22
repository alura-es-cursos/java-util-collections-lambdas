package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// <> Forzando a que acepte solo un tipo de objeto
		
		// LinkedList funciona con otra estructura de datos
		// List<Cliente> listaCLientes = new LinkedList<>();
		
		// El Vector es thread safe, entonces crea una unica instancia 
		// para todas las pilas de ejecucion
		// List<Cuenta> lista = new Vector<Cuenta>();
		
		// Obligatorio especificar        No es obligatorio
		
		List<Cuenta> lista = new ArrayList<Cuenta>();

		// referencia    Objeto -> HEAP
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		// Por cada cuenta : lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		// Por valor
		if (contiene) {
			System.out.println("Si, es igual (equals)");
		}
		
		
	}

}
