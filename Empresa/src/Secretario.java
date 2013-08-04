/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:37:23
 * 
 */
public class Secretario extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.10;
	}

}
