import java.util.*;
public class Salario2 {
	
	/* Criar um programa que leia o salário de um usuário e informe 
	 * se o salário lido está abaixo ou acima do salário mínimo, 
	 * que atualmente é de R$ 1302,00. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o seu sálario: ");
		salario = in.nextDouble();
		
		if (salario < 1302.00) {
			System.out.println("Seu sálario está abaixo do sálario mínimo!");
		} else {
			System.out.println("Seu sálario está acima do sálario mínimo!");
		}
		
		in.close();
	}
}