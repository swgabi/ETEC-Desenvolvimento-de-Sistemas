import java.util.*;
public class Imc1 {
	
	/* Criar um programa que leia o peso e altura de uma pessoa.
	 * Calcule e apresente seu IMC, (imc = peso / altura^2) */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double peso, altura, imc;
		
		System.out.println("Digite o seu peso: ");
		peso = in.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		altura = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("O seu IMC é: " + imc + ".");
		
		in.close();
	}
}