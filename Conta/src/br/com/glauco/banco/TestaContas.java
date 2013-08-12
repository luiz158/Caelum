package br.com.glauco.banco;

import br.com.glauco.banco.conta.Conta;
import br.com.glauco.banco.conta.ContaCorrente;
import br.com.glauco.banco.conta.ContaPoupanca;
import br.com.glauco.banco.sistema.AtualizadorDeContas;

public class TestaContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta c1 = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		c1.deposita(100);
		cc.deposita(1000);
		cp.deposita(1000);
		
		if (c.equals(c1)){
			System.out.println("Os objetos são iguais!");
		} else {
			System.out.println("Os objetos são diferentes!");
		}

		//AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		//adc.roda(c);
		//adc.roda(cc);
		//adc.roda(cp);

		//System.out.println("Saldo Total: " + adc.getSaldoTotal());

	}
}