import java.util.*;
public class VolumeDaLata {
	
	/* Criar um programa que calcule e apresente o volume de uma lata de óleo,
	 * onde o raio e a altura deverão ser informados pelo usuário */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double r, h, v;
		
		System.out.println("Digite a medida do raio da circunferência: ");
		r = in.nextDouble();
		
		System.out.println("Digite medida da altura da lata: ");
		h = in.nextDouble();
		
		v = 3.14 * (r * r) * h;
		
		System.out.println(" O volume da lata é: " + v + ".");
		
		in.close();
	}
}