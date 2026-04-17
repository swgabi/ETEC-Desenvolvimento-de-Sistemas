import java.util.*;
public class TiposTriangulo {
	
	/* Criar um programa que leia 3 valores A, B e C para um possível triângulo 
	 * e informe o tipo de triângulo lido. Verificar ainda se as medidas formam 
	 * um triângulo segundo a lei:
	 * - Para que se possa formar um triângulo é necessário que a medida de qualquer um dos
	 * lados seja menor que a soma das medidas dos outros dois.
	 * 
	 * Triângulo Equilátero: Três lados iguais;
	 * Triângulo Escaleno: Três lados diferentes;
	 * Triângulos Isósceles: Dois lados iguais e um lado diferente. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite a medida do lado A: ");
		a = in.nextDouble();
		
		System.out.println("Digite a medida do lado B: ");
		b = in.nextDouble();
		
		System.out.println("Digite a medida do lado C: ");
		c = in.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				System.out.println("É um triângulo equilatero.");
			} else if (a == b || b == c || c ==a) { // || --> é "ou"
				System.out.println("É um triângulo isóceles.");
			} else {
				System.out.println("É um triângulo escaleno.");
			}
		} else {
			System.out.println("Não é um triângulo.");
		}
		
		in.close();
	}
}