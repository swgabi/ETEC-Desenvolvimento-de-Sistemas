import java.util.Scanner;
public class CustoCriacaoCoelho {
	
	/* Uma loja de animais precisa calcular o custo de uma criação de coelhos. 
	 * O custo é calculado com a fórmula: CUSTO = (NUM_COELHOS * 0,70)/18 + 10. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double custo, numCoelhos;
		
		System.out.println("Digite quantos coelhos tem na loja: ");
		numCoelhos = in.nextDouble();
		
		custo = ((numCoelhos * 0.70) / 18) + 10;
		
		System.out.println("O custo para a criação de coelhos é de: R$ " + custo);
		
		in.close();
	}
}