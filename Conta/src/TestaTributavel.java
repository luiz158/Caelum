/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:52:53
 * 
 */
public class TestaTributavel {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();

		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		System.out.println("");
		
		//Testando o polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}
