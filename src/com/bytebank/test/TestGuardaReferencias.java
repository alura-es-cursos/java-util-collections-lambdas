package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;
import com.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencias {
	
	public static void main(String[] args) {
		
		GuardaReferencias guardaReferencias = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaReferencias.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22,44);
		guardaReferencias.adicionar(cc2);
		
		System.out.println(guardaReferencias.obtener(0));
		System.out.println(guardaReferencias.obtener(1));
		
	}

}
