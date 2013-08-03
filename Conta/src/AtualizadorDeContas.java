
public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	  
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	  
	public void roda(Conta c) {
		// aqui você imprime o saldo anterior, atualiza a conta, 
		System.out.println(c.getSaldo());
		c.atualiza(selic);
	    // e depois imprime o saldo final
		System.out.println(c.getSaldo());
	    // lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.getSaldo();
	}

	// outros métodos, colocar o getter para saldoTotal!
	public double getSaldoTotal() {
		return this.saldoTotal += saldoTotal;
	}
}
