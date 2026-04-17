import java.util.*;
public class SalarioProfessor {

	/* Criar um programa que calcule o salário líquido de um professor. Para fazer
	 * esse programa você deverá ler o valor de horas de cada aula, o número de aulas
	 * dadas no mês e o percentual de desconto do INSS (0.08). O salário líquido será
	 * obtido multiplicando-se o número de aulas dadas pelo valor da hora aula e
	 * descontando o percentual do INSS. */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double hrAula, numAula, salarioL;
		
		System.out.println("Digite quantas horas duram suas aulas "
				+ "(Ex: 2 horas = 200; 1h 30 min = 130): ");
		hrAula = in.nextDouble();
		
		System.out.println("Digite quantas aulas você da no mês: ");
		numAula = in.nextDouble();
		
		salarioL = (numAula * hrAula) - 0.08; 
		
		System.out.println("Seu salário Líquido é de: R$ " + salarioL);
		
		in.close();
	}
}