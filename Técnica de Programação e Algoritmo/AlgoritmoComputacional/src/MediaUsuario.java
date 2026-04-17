import java.util.*;
public class MediaUsuario {
	
	/* Criar um programa que leia quatro notas de um usuário, calcule e 
	 * apresente a sua média aritmética. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a 1º nota: ");
		n1 = in.nextInt();
				
		System.out.println("Digite a 2º nota: ");
		n2 = in.nextInt();
		
		System.out.println("Digite a 3º nota: ");
		n3 = in.nextInt();
		
		System.out.println("Digite a 4º nota: ");
		n4 = in.nextInt();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A média aritmética é: " + media);
		
		in.close();
	}
}