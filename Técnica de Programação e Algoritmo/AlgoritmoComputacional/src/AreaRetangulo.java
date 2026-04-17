import java.util.Scanner;
public class AreaRetangulo {
	
	/* Calcule a área do retângulo. A base e a altura do retângulo serão 
	 * informados pelo usuário. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int base, altura,area;
		
		System.out.println("Digite o valor da base do retângulo: ");
		base = in.nextInt();
		
		System.out.println("Digite o valor da altura do retânglo: ");
		altura = in.nextInt();
		
		area = base * altura;
		
		System.out.println("A área do retângulo é: " + area + ".");

		in.close();
	}
}