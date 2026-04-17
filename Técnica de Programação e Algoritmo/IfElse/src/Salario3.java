import java.util.*;
public class Salario3 {
	
	/*Criar um programa que leia o salário de um empregado e 
	 * apresente o desconto do IRPF segundo a tabela. 
	 * Exemplo: Se o salário lido for igual a R$ 4000,00 o cálculo 
	 * será: IRPF ← 4000*27.5/100 - 662,94*/

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		double s, irpf;
		
		System.out.println("Digite seu sálario mensal: ");
		s = in.nextDouble();
		
		if (s <= 1434.59) {
			irpf = 0;
		} else if (s <= 2150) {
			irpf = ((s * 7.5) / 100) - 107.59;
		} else if (s <= 2866.70) {
			irpf = ((s * 15) / 100) - 268.84;
		} else if (s <= 3582) {
			irpf = ((s * 22.5)/ 100) - 483.84;
		} else {
			irpf = ((s * 27.5)/ 100) - 662.94;
		}
		
		System.out.println("O desconto do IRPF é: " + irpf);
		in.close();
	}
}