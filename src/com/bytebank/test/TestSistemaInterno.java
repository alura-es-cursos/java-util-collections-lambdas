package com.bytebank.test;

import com.bytebank.modelo.Administrador;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
