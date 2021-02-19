package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		
		
		//                          [ new |cc |null  |null  |null  ]
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
		
	}

}
