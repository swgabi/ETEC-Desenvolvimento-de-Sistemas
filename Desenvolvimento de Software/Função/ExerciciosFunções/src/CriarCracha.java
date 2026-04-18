import java.util.Scanner;
public class CriarCracha {
	
	public static void imprimirCrachas(String cargo, String nome) {
		
		System.out.println("O nome da pessoa é: "+ nome +", o cargo da pessoa é: "+ cargo);
		
	}
	public static void main(String[] args) {
		
		String nome;
		
		String cargo;
		
	    Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = in.next();
		
		System.out.println("Digite o seu cargo: ");
		cargo = in.next();
		
		imprimirCrachas(cargo, nome);
		
	}
}