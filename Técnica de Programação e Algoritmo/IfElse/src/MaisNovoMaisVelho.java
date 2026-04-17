import java.util.*;
public class MaisNovoMaisVelho {
	
	/* Criar um programa que leia o nome e a idade de 5 usuários. 
	 * Ao final apresente o nome e a idade do usuário mais velho 
	 * e o nome e a idade do usuário mais novo. */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i1, i2, i3, i4, i5, maisNovo, maisVelho; 
		String n1, n2, n3, n4, n5;
		String nomeMaisNovo, nomeMaisVelho;
		 
		System.out.println("Digite o nome do 1º usuário: ");
		n1 = in.nextLine();
		
		System.out.println("Digite a idade do 1º usuário: ");
		i1 = in.nextInt();
		in.nextLine();
		
		maisNovo = i1;
		nomeMaisNovo = n1;
		maisVelho = i1;
		nomeMaisVelho = n1;
		
		System.out.println("Digite o nome do 2º usuário: ");
		n2 = in.nextLine();
		
		System.out.println("Digite a idade do 2º usuário: ");
		i2 = in.nextInt();
		in.nextLine();
		
		if (i2 > maisVelho) {
			maisVelho = i2;
			nomeMaisVelho = n2;
		} else if (i2 < maisNovo) {
			maisNovo = i2;
			nomeMaisNovo = n2;
		}
		
		System.out.println("Digite o nome do 3º usuário: ");
		n3 = in.nextLine();
		
		System.out.println("Digite a idade do 3º usuário: ");
		i3 = in.nextInt();
		in.nextLine();
		
		if (i3 > maisVelho) {
			maisVelho = i3;
			nomeMaisVelho = n3;
		} else if (i3 < maisNovo) {
			maisNovo = i3;
			nomeMaisNovo = n3;
		}
		
		System.out.println("Digite o nome do 4º usuário: ");
		n4 = in.nextLine();
		
		System.out.println("Digite a idade do 4º usuário: ");
		i4 = in.nextInt();
		in.nextLine();
		
		if (i4 > maisVelho) {
			maisVelho = i4;
			nomeMaisVelho = n4;
		} else if (i4 < maisNovo) {
			maisNovo = i4;
			nomeMaisNovo = n4;
		}
		
		System.out.println("Digite o nome do 5º usuário: ");
		n5 = in.nextLine();
		
		System.out.println("Digite a idade do 5º usuário: ");
		i5 = in.nextInt();
		in.nextLine();
		
		if (i5 > maisVelho) {
			maisVelho = i5;
			nomeMaisVelho = n5;
		} else if (i5 < maisNovo) {
			maisNovo = i5;
			nomeMaisNovo = n5;
		}
		
		System.out.println("O mais velho é: " + nomeMaisVelho + ", " + maisVelho + " anos.");
		System.out.println("O mais novo é: " + nomeMaisNovo + ", " + maisNovo + " anos.");
		
		in.close();
	}
}