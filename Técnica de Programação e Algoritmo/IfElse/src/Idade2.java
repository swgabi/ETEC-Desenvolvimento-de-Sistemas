import java.util.*;
public class Idade2 {
	
	/* Criar um programa que leia o ano de nascimento e o ano atual,
	 * calcule e apresente a idade do usuário informando se ele é 
	 * maior de idade ou menor de idade. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano em que você nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println(idade + " anos.");
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}
		
		in.close();
	}
}