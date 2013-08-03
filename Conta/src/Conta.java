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
	
	public void deposita(double valor) {
	    this.saldo += valor;
	}

	public void saca(double valor) {
	    this.saldo -= valor;
	}

	public double getSaldo() {
	    return this.saldo;
	}
	
	void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	/*private static int totalDeContas;
	
	Conta() {
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	/**
	 * @return the totalDeContas
	 */
	/*public int getTotalDeContas() {
		return Conta.totalDeContas;
	}*/
	
}