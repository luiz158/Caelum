package br.com.glauco.banco.conta;
/**
 * Testando GIT no Ubuntu!
 */

/**
 * @author Glauco
 *
 * @Em 28/07/2013 22:58:54
 */
public class Conta {
	protected double saldo;
	
	/*
	 * Método que realiza o depósito
	 * @param valor
	 * */
	public void deposita(double valor) {
	    this.saldo += valor;
	}
	
	/*
	 * Método que efetua o saque
	 * @param valor
	 */
	public void saca(double valor) {
	    this.saldo -= valor;
	}
	
	/*
	 * Método que recupera o saldo da conta
	 */
	public double getSaldo() {
	    return this.saldo;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
		
}