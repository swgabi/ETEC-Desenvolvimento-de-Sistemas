import java.util.*;
public class Idade3 {
	
	/* Criar um programa que leia o ano de nascimento de um usuário e o ano atual. 
	 * Calcule e apresente a sua idade junto com mensagem correspondente:
	 * IV. Idade < 10 anos: criança;
	 * V. Idade >=10 e < 18: Adolescente;
	 * VI. Idade >=18 e Idade <60: Adulto;
	 * VII. Idade >=60 : Idoso. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano em que você nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println(idade + " anos.");
		
		if (idade < 10) {
			System.out.println("Você é uma criança.");
		} else if (idade >= 10 && idade <18) {
			System.out.println("Você é um adolescente.");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Você é um adulto.");
		} else {			
			System.out.println("Você é um idoso.");
		}
		
		in.close();
	}
}