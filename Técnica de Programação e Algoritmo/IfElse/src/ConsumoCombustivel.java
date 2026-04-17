import java.util.*;
public class ConsumoCombustivel {
	
	/* Criar um programa que calcule e apresente o gasto médio de combustível 
	 * (km por litro – km/L) de um veículo. O usuário deverá digitar a 
	 * distância percorrida (em Kilômetros) e a capacidade do tanque de 
	 * combustível (em litros). O gasto médio é obtido dividindo-se a distância 
	 * percorrida pela capacidade do tanque. Informar se o carro é econômico ou
	 * não, segundo a regra abaixo:
	 *    a. Se o consumo for >=10 km/L: Econômico
	 *    b. Se o consumo < 10 km/L: Não econômico */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double d, c, consumo;
		
		System.out.println("Digite a distância percorrida pelo carro em kilômetros: ");
		d = in.nextDouble();
		
		System.out.println("Digite a capaidade do tanque do carro em litros: ");
		c = in.nextDouble();
		
		consumo = d / c; 
		
		System.out.println("O consumo do veículo é: " + consumo + ".");
		
		if (consumo >= 10) {
			System.out.println("O carro é econômico.");
		} else {
			System.out.println("O carro não é econômico.");
		}
		
		in.close();
	}
}