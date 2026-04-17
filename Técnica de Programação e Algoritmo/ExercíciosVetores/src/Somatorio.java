import java.util.Scanner;
public class Somatorio {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			
        	final int TAM = 10;
			int a[] = new int[TAM];
			int b[] = new int [TAM];
			int i, j;
			
			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º valor de A: ");
			    a[i] = in.nextInt();
			}
			
			for(i = 0; i < TAM; i++) {
			    int soma = 0;
			    for (j = i; j < TAM; j++) {
			        soma = soma + a[j];
			    }
			    b[i] = soma;
			}
			
			System.out.print("Vetor A: [");
			for(i = 0; i < TAM; i++) {
			    System.out.print(" " + a[i]);
			    if (i < TAM - 1) System.out.print("");
			}
			System.out.println(" ]");

			System.out.print("Vetor B: [");
			for(i = 0; i < TAM; i++) {
			    System.out.print(" " + b[i]);
			    if (i < TAM - 1) System.out.print("");
			}
			System.out.println(" ]");

			in.close();
		}
    }
}