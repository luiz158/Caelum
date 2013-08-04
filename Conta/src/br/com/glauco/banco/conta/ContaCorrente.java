package br.com.glauco.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double valor) {
		//this.saldo += valor - 0.10;
		super.deposita(valor - 0.15);
	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*@Override
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor;
		}
	}*/
	

	/*@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}*/
}
