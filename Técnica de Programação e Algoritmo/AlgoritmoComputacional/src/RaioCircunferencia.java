import java.util.*;
public class RaioCircunferencia {
	
	/* Criar um programa que leia a medida de um raio, calcule e apresente 
	 * a área da circunferência. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double r, area;
		
		System.out.println("Digite a medida do raio da circunferência: ");
		r = in.nextDouble();
		
		area = 3.14 * r * r;
		
		System.out.println("A área da circunferência é: " + area + ".");
		
		in.close();		
	}
}