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
	private int numero;
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
	
	public boolean equals (Object object) {
		Conta outraConta = (Conta) object;
		if (this.numero == outraConta.numero) {
			return true;
		}
		return false;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + this.saldo;
	}
}