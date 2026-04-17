import java.util.*;
public class NomeIdade {
	
	/* Criar um programa que leia o nome, o ano de nascimento e o ano atual, e 
	 * ao final apresente a seguinte mensagem: “FULANO, VOCÊ TEM X ANOS” 
	 * onde FULANO é o nome do usuário e X é a idade do mesmo. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoNasc, anoAtual, idade;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = in.next();
		
		System.out.println("Digite o ano que você nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println(nome + ", você tem " + idade + " anos.");
		
		in.close();
	}
}