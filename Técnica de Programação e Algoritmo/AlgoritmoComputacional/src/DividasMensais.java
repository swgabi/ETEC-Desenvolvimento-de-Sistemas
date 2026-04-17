import java.util.Scanner;
public class DividasMensais {
	
	/* Criar um programa que leia o salário de uma pessoa. Sabendo-se que para 
	 * viver sem dívidas a pessoa pode comprometer apenas 30% da sua renda 
	 * com dívidas, informar o valor máximo de dívidas que o usuário poderá
	 * contrair mensalmente. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, maxDivida;
		
		System.out.println("Digite o valor do seu salário mensal: ");
		salario = in.nextDouble();
		
		maxDivida = salario * 0.30;
		
		System.out.println("O valor de dividas mensais é de: R$ " + maxDivida);
		
		in.close();
	}
}