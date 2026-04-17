import java.util.*;
public class AnoBissexto {
	
	/* Criar um programa que leia um ano qualquer. Informar 
	 * se o ano lido é ou não um ano bissexto */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ano; 
		
		System.out.println("Digite o ano que você quar descobrir se é bissexto ou não:");
		ano = in.nextInt();
		
		/* Calculo de ano bissexto:
		 * Um ano só é bissexto se: 
		 * - For divisível por 4 e não por 100 OU se for divisível por 400.  */
		
		if ((ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é bissexto.");
		}
		
		in.close();
	}
}