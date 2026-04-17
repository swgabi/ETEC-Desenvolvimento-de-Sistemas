import java.util.Scanner;
public class Temperatura1 {
	
	/* Criar um programa que leia uma temperatura em graus CELSIUS apresente-a
	 * convertida em graus FAHRENHEIT: */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int c;
		double f;
		
		System.out.println("Digite a temperatura em Celsius: ");
		c = in.nextInt();
		
		f = (c * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + f + "°F.");
		
		in.close();
	}
}