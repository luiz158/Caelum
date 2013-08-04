/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:42:43
 * 
 */
public class Quadrado implements AreaCalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}

}
