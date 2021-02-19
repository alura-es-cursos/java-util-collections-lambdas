package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestControlBonificacion {

	private static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		com.bytebank.modelo.Gerente jimena = new com.bytebank.modelo.Gerente();
		jimena.setSalario(10000);

		com.bytebank.modelo.Contador alexiz = new com.bytebank.modelo.Contador();
		alexiz.setSalario(5000);
		
		ControlBonificacion controlBonificacion = 
				new ControlBonificacion();
		
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexiz);
	}
	
}

