import java.util.*;
public class DiasMesesAnos {
	
	/* Criar um programa que leia um número de dias qualquer e os apresente
	 * convertido em meses e anos. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Digite o número de dias: ");
		dia = in.nextInt();
		
		mes = dia / 30;
		ano = dia / 365;
		
		System.out.println(dia + " dias é igual a " + mes + " mês(es)");
		System.out.println(dia + " dias é igual a " + ano + " ano(s)");
		
		in.close();
	}
}