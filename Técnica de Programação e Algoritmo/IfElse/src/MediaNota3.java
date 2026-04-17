import java.util.Scanner;
public class MediaNota3 {
	
	/* Criar um programa que leia duas notas de um usuário, calcule e
	 * apresente a sua média, e em seguida uma mensagem segundo a 
	 * condição da média:
	 * - Se a média for < 4: Reprovado 
	 * - Se a média for >=6: Aprovado. 
	 * - Se a média for >=4 e <6: Recuperação */
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		double n1, n2, m;
		
		System.out.println("Entre com a 1ª nota:");
		n1 = in.nextDouble();
		
		System.out.println("Entre com a 2ª nota:");
		n2 = in.nextDouble();
		
		m = (n1 + n2) / 2;
		
		System.out.println("A média é: " + m);
		
		if (m < 4) {
			System.out.println("Você está reprovado!");
		}else if(m < 6) {
			System.out.println("Você está de recuperação ");
		}else {
			System.out.println("Você está aprovado! ");
		}
		
		in.close();
	}
}