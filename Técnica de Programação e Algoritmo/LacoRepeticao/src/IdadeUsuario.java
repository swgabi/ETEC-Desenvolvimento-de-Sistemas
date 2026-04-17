import java.util.Scanner;
public class IdadeUsuario {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoAtual, anoNasc, idade;
		int opcao;
		
		do {
			System.out.println("Digite o ano atual;");
			anoAtual = in.nextInt();
			
			System.out.println("Digite o ano de nascimento:");
			anoNasc = in.nextInt();
			
			idade = anoAtual - anoNasc;
			
			System.out.println("Idade: " + idade);
			
			System.out.println("Deseja continuar calculando a idade? 1 = sim | 0 = não: ");
			opcao = in.nextInt();
			
		} while (opcao !=0);
		
		in.close();
	}
}