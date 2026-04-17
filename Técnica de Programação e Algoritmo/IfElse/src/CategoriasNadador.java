import java.util.*;
public class CategoriasNadador {
	
	/* Construa um algoritmo que receba a idade de um nadador e classifique-o 
	 * em uma das seguintes categorias:
	 * • 5 até 8 anos: Infantil;
	 * • 9 até 13 anos: Juvenil A;
	 * • 14 até 17 anos: Juvenil B;
	 * • Maiores de 18: Adulto; */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade para saber em qual turma da natação"
				+ "você vai entrar: ");
		idade = in.nextInt();
		
		if (idade >= 5 && idade <=8) {
			System.out.println("Você está na turma infantil!");
		} else if (idade >= 9 && idade <= 13) {
			System.out.println("Você está na turma juvenil A!");
		} else if (idade >= 14 && idade <=17) {
			System.out.println("Você está na turma juvenil B!");
		} else {
			System.out.println("Você está na turma adulto!");
		}
		
		in.close();
	}
}