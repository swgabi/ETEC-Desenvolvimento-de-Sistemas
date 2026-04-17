import java.util.*;
public class DiasNoMes {
	
	/* Criar um programa que leia o número correspondente
	 * a um mês qualquer (de 1 à 12) e diga se o 
	 * referido mês tem 28, 30 ou 31 dias (desconsiderar 
	 * anos bissextos. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Digite o número de um mês qualquer (de 1 à 12): ");
		mes = in.nextInt();
		
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Este mês tem 31 dias.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Este mês tem 30 dias.");
				break;
			case 2: 
				System.out.println("Este mês tem 28 dias.");
				break;
			default: 
				System.out.println("O número deste mês é inválido.");
		}
		
		in.close();
	}
}