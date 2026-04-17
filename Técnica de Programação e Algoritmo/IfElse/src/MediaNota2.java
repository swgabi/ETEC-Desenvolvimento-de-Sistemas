import java.util.*;
public class MediaNota2 {

	/* Crie um programa que leia duas notas de um aluno,
	 * calcule e apresente a sua média e além da média, exiba uma mensagem
	 * informando se o aluno foi reprovado ou aprovado seguindo os critérios abaixo:
	 * - Se a média for menor do que 6 o aluno será reprovado;
	 * - Se a média for maior ou igual a 6 o aluno será aprovado. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Digite a 1º nota do aluno: ");
		n1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota do aluno: ");
		n2 = in.nextDouble();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Média do aluno: " + media);
		
		if (media < 6) {
			System.out.println("Ele foi Reprovado!");
		} else {
			System.out.println("Ele foi Aprovado!");
		}
		
		in.close();
	}
}