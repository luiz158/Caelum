/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:34:39
 * 
 */
public class ControleBonus {
	private double totalBonus = 0;

	public void registra(Funcionario f) {
		this.totalBonus += f.getBonus();
	}

	public double getTotalBonus() {
		return this.totalBonus;
	}
}
