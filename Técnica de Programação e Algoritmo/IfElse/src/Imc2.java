import java.util.*;
public class Imc2 {
	
	/* Criar um programa que leia o peso e a altura de um usuário. Informar o seu IMC
	 * junto com as seguintes condições: 
	 * - <18,5 = Excesso de magreza;
	 * - >= 18,5 e <25 = Peso normal;
	 * - >=25 e <30 = Excesso de peso;
	 * - >=30 e <35 = Obesidade I;
	 * - >=35 e <40 = Obesidade II;
	 * - >40 = Obesidade III.*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double altura, peso, imc; 
		
		System.out.println("Digite qual é a sua altura: ");
		altura = in.nextDouble();
		
		System.out.println("Digite quanto você pesa: ");
		peso = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Excesso de magreza.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Excesso de peso.");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade I");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade II");
		} else {
			System.out.println("Obesidade III");
		}
		
		in.close();
	}
}