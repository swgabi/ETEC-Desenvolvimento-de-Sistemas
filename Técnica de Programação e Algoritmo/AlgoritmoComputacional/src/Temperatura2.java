import java.util.Scanner;
public class Temperatura2 {
	
	/* Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em
	 * graus Celsius utilizando a fórmula: C = (F-32) * (5/9) onde F é a temperatura
	 * em Fahrenheit e C em Celsius. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Fahreinheit: ");
		f = in.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius é: " + c + "°C.");
		
		in.close();
	}
}