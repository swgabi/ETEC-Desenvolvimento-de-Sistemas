import java.util.Scanner;
public class NumerosPrimos {
    
	public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			
        	int a[], i;
			final int TAM = 10;
			a = new int [TAM];

			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º número: ");
			    a[i] = in.nextInt();
			}

			for(i = 0; i < TAM; i++) {
			    int num = a[i];
			    int numPrimo = 1; 
			    
			    if (num <= 1) {
			        numPrimo = 0; 
			    } else {
			        for (int x = 2; x < num; x++) { 
			            if (num % x == 0) {
			                numPrimo = 0; 
			            }
			        }
			    }
			    
			    System.out.print("O número " + num + ": ");
			    
			    if (numPrimo == 1) {
			        System.out.println("é um número primo.");
			    } else {
			        System.out.println("não é um número primo.");
			    }
			}

			in.close();
		}
    }
}