import java.util.*;
public class Salario1 {
	
	/* Criar um programa que leia o salário bruto de uma pessoa, calcule e 
	 * apresente o salário líquido, descontando-se o que a lei prevê conforme abaixo:
	 * - INSS: equivale à 8% do salário bruto;
	 * - VALE TRANSPORTE: equivale à 6% do salário bruto.  */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double sBruto, sLiquido, desconto;
		
		System.out.println("Digite o seu sálario bruto: ");
		sBruto = in.nextDouble();
		
		desconto = sBruto * 0.08 + sBruto * 0.06;
		
		sLiquido = sBruto - desconto;
		
		System.out.println("Seu sálario líquido é R$ " + sLiquido + ".");
		
		in.close();
	}
}