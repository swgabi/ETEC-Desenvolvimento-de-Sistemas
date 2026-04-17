import java.util.*;
public class MediaNota1 {
	
	/* Criar um algoritmo que calcule e apresente a média de 
	 * um aluno após ler duas notas. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double nota1, nota2, media;
		
		System.out.println("Digite a 1º nota do aluno: ");
		nota1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota do aluno: ");
		nota2 = in.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("A média do aluno é: " + media + ".");
		
		in.close();
	}
}