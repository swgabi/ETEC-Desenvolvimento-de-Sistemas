import java.util.*;
public class ImparOuPar {
	
	/* Criar um programa que leia um número inteiro e informe se
	 * o número lido é par ou ímpar. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, ip; //ip --> "i" = impar, "p" = par
		
		System.out.println("Impar ou par?");
		System.out.println("Digite um número: ");
		n = in.nextInt();
		
		ip = n % 2; // % = pega o resto da divisão.
				
		if (ip == 1) {
			System.out.println("O número é ímpar.");
		} else {
			System.out.println("O número é par.");
		}
		
		in.close();
	}
}