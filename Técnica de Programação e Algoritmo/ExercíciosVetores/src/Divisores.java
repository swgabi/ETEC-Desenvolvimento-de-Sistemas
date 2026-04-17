import java.util.Scanner;
public class Divisores {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			
        	int a[], i;
			final int TAM = 10;
			a = new int[TAM];

			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º número: ");
			    a[i] = in.nextInt();
			}

			for(i = 0; i < TAM; i++) {
			    int num = a[i];
      
			    System.out.print("Número " + num + " - Divisores: [");
			    int divisor = 0; 
			    
			    for (int x = 1; x <= num; x++) {
			        if (num % x == 0) {
			            if (divisor == 1) {
			                System.out.print(" ");
			            }
			            System.out.print(x);
			            divisor = 1; 
			        }
			    }
			    System.out.println("]");
			}

			in.close();
		} 
    }
}