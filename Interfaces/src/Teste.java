/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:43:26
 * 
 */
public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel c = new Circulo(3);
		System.out.println(c.calculaArea());
	}
}
