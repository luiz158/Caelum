/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:42:06
 * 
 */
public class Circulo implements AreaCalculavel {
	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

}
