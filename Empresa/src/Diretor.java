/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:35:49
 * 
 */
public class Diretor extends Funcionario {

	private int senha;
	
	@Override
	public double getBonus() {
		return this.salario * 0.15;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false; 
	}

}
