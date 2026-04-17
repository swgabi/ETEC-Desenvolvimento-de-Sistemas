import java.util.*;
public class Festa {
	
	/* Uma pessoa vai fazer uma festa e precisa calcular o total de comida e
	 * bebida a serem comprados. Criar um programa que leia o número de mulheres
	 * e homens convidados e calcule: 
	 * - O total de unidades de salgados à serem comprados (calcula-se
	 * 6 salgados por mulher e 10 por homem);
	 * - O total de litros de refrigerante ( cada homem bebe 800ml e 
	 * cada mulher bebe 600ml);
	 * - o total de bolo em kg (cada convidado com 100gr de bolo, 
	 * independente do sexo. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int m, h, salgado, bolo;
		double refri; 
		
		System.out.println("Digite quantas mulheres vão para a festa: ");
		m = in.nextInt();
		
		System.out.println("Digite quantos homens vão para a festa: ");
		h = in.nextInt();
		
		salgado = (m * 6) + (h * 10);
		refri = (m * 0.6) + (h * 0.8);
		bolo = (h + m * 100) / 1000;
		
		System.out.println("Vai ser preciso " + salgado + " salgados, " + refri +
				"L de refrigerante e " + bolo + "kg de bolo");
		
		in.close();
	}
}