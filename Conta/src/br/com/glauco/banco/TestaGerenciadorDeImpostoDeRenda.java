package br.com.glauco.banco;

import br.com.glauco.banco.conta.ContaCorrente;
import br.com.glauco.banco.conta.GerenciadorDeImpostoDeRenda;
import br.com.glauco.banco.conta.SeguroDeVida;
/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:52:24
 * 
 */
public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		System.out.println(gerenciador.getTotal());
	}
}
