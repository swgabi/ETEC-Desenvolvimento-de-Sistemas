import java.util.*;
public class ValoresInvertidos {
	
	/* Criar um programa que leia  dois valores inteiros: A  e B.
	 * Ao final apresente os valores invertidos (o valor de A deverá 
	 * estar armazenado em B e o valor de B deverá estar armazenado em A) */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores invertidos: " +"A: "+ a +", B: " + b + ".");
		
		in.close();
	}
}