/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:48:40
 * 
 */
public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}
}
