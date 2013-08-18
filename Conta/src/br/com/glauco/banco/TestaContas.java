package br.com.glauco.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.glauco.banco.conta.Conta;
import br.com.glauco.banco.conta.ContaCorrente;
import br.com.glauco.banco.conta.ContaPoupanca;
import br.com.glauco.banco.sistema.AtualizadorDeContas;

public class TestaContas {
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
		Conta c1 = new ContaCorrente();
		//Conta cc = new ContaCorrente();
		//Conta cp = new ContaPoupanca();

		c.deposita(1000);
		c1.deposita(1000);
		c.setNumero(123);
		c1.setNumero(123);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c);
		//contas.add("algo");
		//cc.deposita(1000);
		//cp.deposita(1000);
		System.out.println(contas.get(1));
		/*System.out.println(c);
		
		System.out.println("Resultado: " + (c == c1));
		
		if (c.equals(c1)){
			System.out.println("Os objetos são iguais!");
		} else {
			System.out.println("Os objetos são diferentes!");
		}*/

		//AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		//adc.roda(c);
		//adc.roda(cc);
		//adc.roda(cp);

		//System.out.println("Saldo Total: " + adc.getSaldoTotal());

	}
}