import java.util.*;
public class AtrasoPrestacao {
	
	/* Efetuar o cálculo de uma prestação em atraso utilizando a fórmula:
	 * PRESTACAO ← VALOR + (VALOR * (TAXA/100)*TEMPO)
	 * Onde:
	 * VALOR é o valor original da prestação
	 * TAXA é a taxa de juros aplicada ao dia para correção da prestação
	 * TEMPO é a quantidade de dias que a prestação está atrasada */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double prestacao, valor, taxa, tempo;
		
		System.out.println("Digite o valor original de sua prestação: ");
		valor = in.nextDouble();
		
		System.out.println("Digite o valor da taxa que está sendo aplicada diariamente"
				+ " (Ex: 10% = 0,10): ");
		taxa = in.nextDouble();
		
		System.out.println("Digite a quantidade de dias que a prestação está atrasada: ");
		tempo = in.nextDouble();
		
		prestacao = valor + (valor * (taxa / 100) * tempo);
		
		System.out.println("O valor da sua prestação com juros aplicado é de: " + prestacao);
		
		in.close();
	}
}