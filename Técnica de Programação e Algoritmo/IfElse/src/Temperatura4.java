import java.util.Scanner;
public class Temperatura4 {
	
	/* Criar um programa que leia uma temperatura em Fahrenheit e converta-a em graus
	 * Celsius. Apresentar a temperatura convertida, junto com a mensagem indicada:
	 * I. Se a temperatura estiver abaixo de 0ºC: “Frio extremo”;
	 * II. Se a temperatura for menor ou igual à 10ºC: “Frio”;
	 * III. Se a temperatura for menor ou igua à 20ºC: “Frio moderado”;
	 * IV. Se a temperatura for menor ou igual à 24ºC: “Ameno”;
	 * V. Se a temperatura for maior ou igual à 25ºC: “Quente”; */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Fahreinheit: ");
		f = in.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius é: " + c + "°C.");
		
		if (c < 0) {
			System.out.println("Frio extremo.");
		} else if (c <= 10) {
			System.out.println("Frio");
		} else if (c <= 20) {
			System.out.println("Frio moderado!");
		} else if (c <= 24) {
			System.out.println("Ameno!");
		} else {
			System.out.println("Quente!");
		}
		
		in.close();
	}
}