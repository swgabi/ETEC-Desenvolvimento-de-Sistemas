import java.util.Scanner;
public class Temperatura3 {
	
	/* Criar um programa que leia uma temperatura em Fahrenheit e converta-a em graus
	 * Celsius. Apresentar a temperatura convertida, junto com a mensagem indicada:
	 * I. Se a temperatura estiver abaixo de 15ºC: “Frio”
	 * II. Se a temperatura estiver igual ou acima de 15º e abaixo de 22ºC: “Ameno”
	 * III. Se a temperatura estiver igual ou acima de 22ºC: “Calor” */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Fahreinheit: ");
		f = in.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius é: " + c + "°C.");
		
		if (c <= 15) {
			System.out.println("Está frio!");
		} else if (c < 22) {
			System.out.println("Está ameno!");
		} else {
			System.out.println("Está quente!");
		}
		
		in.close();
	}
}