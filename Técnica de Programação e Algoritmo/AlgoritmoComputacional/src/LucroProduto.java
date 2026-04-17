import java.util.*;
public class LucroProduto {
	
	/* Criar um programa que leia o preço de um produto, a quantidade vendida
	 * e o preço de venda do produto. Calcule e apresente o valor total obtido com
	 * o lucro do produto. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double preco, qtd, pVenda, lucro, valorTotal;
		
		System.out.println("Digite o preço do produto: ");
		preco = in.nextDouble();
		
		System.out.println("Digite a quantidade de produtos: ");
		qtd = in.nextDouble();
		
		System.out.println("Digite o preço devenda do produto: ");
		pVenda = in.nextDouble();
		
		lucro = (preco - pVenda) * qtd;
		valorTotal = (qtd * pVenda) + lucro;
		
		System.out.println("Valor total com o lucro: " + valorTotal + ".");
		
		in.close();
	}
}