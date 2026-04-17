import java.util.*;
public class DescontoPixOuCartao {
	
	/* Criar um programa que leia o preço de um produto que está sendo 
	 * vendido online. Sabendo-se que se pagar no pix o produto terá
	 * um desconto de 10% e se for no cartão de crédito terá um acrécimo
	 * de 5%, calcule e apresente os dois valores finais: o valor para 
	 * pagamento via PIX e o valor para pagamento no cartão de crédito. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double precoP, pix, cartao;
		
		System.out.println("Digite o preço do produto: ");
		precoP = in.nextDouble();
		
		pix = precoP * 0.10;
		cartao = precoP + (precoP * 0.05);
		
		System.out.println("Valor do produto se for pago no pix: R$" + pix + 
				"; valor do produto se for pago com o cartão de crédito: R$"
				+ cartao + ".");
		
		in.close();
	}
}