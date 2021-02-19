package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
	
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.deposita(210);
		try {
			cuenta.saca(2000);
			cuenta.saca(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}

}
