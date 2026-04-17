import java.util.*;
public class OrdemCrescente {
	
	/* Criar um programa que leia três valores inteiros A, B e C e os 
	 * apresente em forma crescente (menor para o maior). */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = in.nextInt();
		
		if (a <= b && a <= c) {
			if (b <= c) {
				System.out.println("A: " + a + ", B: " + b + ", C: " + c);
			} else {
				System.out.println("A: " + a + ", C: " + c + ", B: " + b);
			} if (b <= a && b <= c) {
				if (a <= c) {
					System.out.println("B: " + b + ", A: " + a + ", C: " + c);
				} else {
					System.out.println("B: " + b + ", C: " + c + ", A: " + a);
				}
			}
		} else if (a <=b) {
			System.out.println("C: " + c + ", A: " + a + ", B: " + b);
		} else {
			System.out.println("C: " + c + ", B: " + b + ", A: " + a);
		}
		
		in.close();
	}
}