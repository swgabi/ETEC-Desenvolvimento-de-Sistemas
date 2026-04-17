import java.util.Scanner;
public class Idade1 {
	
	/* Criar um programa que leia o ano de nascimento de 
	 * um usuário e o ano atual, calcule e apresente a sua idade. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano em que você nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Você tem " + idade + " anos.");
		
		in.close();
	}
}