/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:43:50
 * 
 */
public class TesteErro {
	public static void main(String[] args) {
		try {
		System.out.println("início do main");
		metodo1();
		//System.out.println("fim do main");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Posição inválida");
		}System.out.println("fim do main");
	}
	
	static void metodo1() {
		System.out.println("início do método1");
		metodo2();
		System.out.println("fim do método1");
	}
	
	static void metodo2() {
		
		System.out.println("início do método2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do método2.");
	}
}
