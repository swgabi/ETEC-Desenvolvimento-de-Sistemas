import java.util.*;
public class MediaNota4 {
	
	/* Criar um programa que leia duas notas para um aluno. 
	 * Calcular e apresentar a sua média, sendo que:
	 * • SE a média for menor do que 3 o aluno está REPROVADO;
	 * • SE a média for >=6 o aluno está APROVADO;
	 * • SE a média for >=3 e < 6 avisar via mensagem que o aluno está em EXAME. 
	 * Solicitar então uma nota de EXAME, extrair uma nova média entre a média 
	 * anterior e a nota de EXAME. Caso a nova média seja >=6 o aluno será APROVADO. 
	 * Caso contrário está reprovado. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
double n1, n2, media, notaExame, novaMedia;
		
		System.out.println("Digite a 1º nota do aluno: ");
		n1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota do aluno: ");
		n2 = in.nextDouble();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Média do aluno: " + media);
		
		if (media < 3) {
			System.out.println("Ele foi Reprovado!");
		} else if(media >= 6) {
			System.out.println("Ele foi Aprovado!");
		} else {
			System.out.println("O aluno está em EXAME.");
			System.out.println("Digite a nota do exame de recuperação: ");
			notaExame = in.nextDouble();
			
			novaMedia = (media + notaExame) / 2;
			
			if (novaMedia >= 6) {
				System.out.println("Ele foi Aprovado!");
			} else {
				System.out.println("Ele foi Reprovado!");
			}
		}
		
		in.close();
	}
}