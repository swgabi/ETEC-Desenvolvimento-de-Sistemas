import java.util.Scanner;
public class IdadeAlunosPorcentagem {
	
	/* Criar um programa que leia a idade de 5 alunos. Calcule e apresente 
	 * quantos são maiores de idade e quantos são menores de idade. 
	 * Calcular e apresentar também a porcentagem de maiores e menores de idade. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i1, i2, i3, i4, i5;
		int maiores, menores, porcentMaiores, porcentMenores;
		
		maiores = 0;
		menores = 0;
		
		System.out.println("Digite a idade do 1º aluno: ");
		i1 = in.nextInt();
		
		if (i1 >= 18) {
			maiores = maiores + 1;
		} else {
			menores = menores + 1;
		}
		
		System.out.println("Digite a idade do 2º aluno: ");
		i2 = in.nextInt();
		
		if (i2 >= 18) {
			maiores = maiores + 1;
		} else {
			menores = menores + 1;
		}
		
		System.out.println("Digite a idade do 3º aluno: ");
		i3 = in.nextInt();
		
		if (i3 >= 18) {
			maiores = maiores + 1;
		} else {
			menores = menores + 1;
		}
		
		System.out.println("Digite a idade do 4º aluno: ");
		i4 = in.nextInt();
		
		if (i4 >= 18) {
			maiores = maiores + 1;
		} else {
			menores = menores + 1;
		}
		
		System.out.println("Digite a idade do 5º aluno: ");
		i5 = in.nextInt();
		
		if (i5 >= 18) {
			maiores = maiores + 1;
		} else {
			menores = menores + 1;
		}
		
		porcentMaiores = (maiores * 100) / 5;
		porcentMenores = (menores * 100) / 5;
		
		System.out.println("Maiores de Idade: " + maiores);
		System.out.println("Porcentagem de maiores de idade: " + porcentMaiores);
		
		System.out.println("Menores de idade: " + menores);
		System.out.println("Porcentagem de menores de idade: " + porcentMenores);

		in.close();
	}
}