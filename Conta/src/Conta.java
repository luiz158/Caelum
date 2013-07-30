/**
 * Testando GIT123glauco
 */

/**
 * @author Glauco
 *
 * @Em 28/07/2013 22:58:54
 */
public class Conta {
	private static int totalDeContas;
	
	Conta() {
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	/**
	 * @return the totalDeContas
	 */
	public int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
}