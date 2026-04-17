import java.util.*;
public class Bhaskara {
	
	/* Criar um programa que leia os valores A, B e C de uma equação 
	 * de segundo grau (Ax2+BX+C). Calcular as duas raízes reais 
	 * de X lembrando que:
	 * • Se ∆ < 0: não existem raízes reais para a equação;
	 * • Se ∆ = 0: existe apenas uma raiz real para a equação;
	 * • Se ∆ > 0: existem duas raízes reais para a equação.
	 * 
	 * Fórmulas:
	 * ∆ = B^2-4*A*C
	 * Bhaskara: (- B± √ ∆ )/ (2*A) */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c, delta, x, x1, x2;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = in.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = in.nextDouble();
		
		delta = (b * b) - (4 * a * c);
		
		System.out.println("O valor de delta é: " + delta);
		
		if (delta < 0) {
			System.out.println("Não existem raizes reais para a equação.");
		} else if (delta == 0) {
			x = - b / (2 * a);
			System.out.println("Valor de x: " + x);
			System.out.println("Existe uma raiz real.");
		} else {
			x1 = (- b + (delta * delta)) / (2 * a);
			x2 = (- b - (delta * delta)) / (2 * a);
			System.out.println("x1 = " + x1 + "; x2 = " + x2);
			System.out.println("Existem duas raizes reais para a equação.");
		}

		in.close();
	}
}