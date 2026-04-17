import java.util.*;
public class RodizioPlaca {
	
	/* Criar um programa que leia o último número da placa 
	 * de um veículo e informe qual dia da semana o veículo
	 * não poderá circular em São Paulo.  */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numPlaca;
		
		System.out.println("Digite o último número da placa do seu veículo: ");
		numPlaca = in.nextInt();
		
		switch (numPlaca) {
			case 1:
			case 2:
				System.out.println("Segunda-Feira.");
				break;
			case 3:
			case 4:
				System.out.println("Terça-Feira.");
				break;
			case 5:
			case 6: 
				System.out.println("Quarta-Feira.");
				break;
			case 7: 
			case 8: 
				System.out.println("Quinta-Feira.");
				break;
			case 9: 
			case 0:
				System.out.println("Sexta-Feira.");
				break;
			default: 
				System.out.println("O número da placa é inválido.");
				break;
		}
		
		in.close();
	}
}