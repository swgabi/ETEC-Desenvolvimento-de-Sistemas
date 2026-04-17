import java.util.*;
public class VolumeDoCubo {
	
	/* Criar um programa que calcule e apresente o volume de um cubo, 
	 * sendo que o mesmo é obtido por meio da fórmula: v = l^3 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double lado, v;
		
		System.out.println("Digite a medida do lado do cubo: ");
		lado = in.nextDouble();
		
		v = lado * lado * lado;
		
		System.out.println("O volume do cubo é: " + v + ".");
		
		in.close();
	}
}