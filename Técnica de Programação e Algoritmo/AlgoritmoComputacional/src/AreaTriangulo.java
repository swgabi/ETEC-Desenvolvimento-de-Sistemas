import java.util.*;
public class AreaTriangulo {
	
	/* Criar um programa que calcule e apresente a área
	 * de um triângulo retângulo (Área do triângulo = base * altura / 2 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int b, h;
		double area;
		
		System.out.println("Digite o alor da base do triângulo: ");
		b = in.nextInt();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		h = in.nextInt();
		
		area = b * (h / 2);
		
		System.out.println("A área do triângulo é: " + area + ".");
		
		in.close();
	}
}