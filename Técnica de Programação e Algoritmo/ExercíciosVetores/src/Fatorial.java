import java.util.Scanner;
public class Fatorial {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			
        	final int TAM = 15;
			int a[] = new int[TAM]; 
			int b[] = new int[TAM]; 
			int i, x; 
			
			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º número: ");
			    a[i] = in.nextInt();
			}
			
			for(i = 0; i < TAM; i++) {
			    int numero = a[i];
			    int fatorial = 1;
			    
			    if (numero < 0) {
			        fatorial = 0; 
			    } else {
			        if (numero == 0) {
			            fatorial = 1; 
			        } else if (numero == 1) {
			            fatorial = 1;
			        } else {
			            for (x = numero; x >= 2; x--) {
			                fatorial = fatorial * x; 
			            }
			        }
			    }
			    
			    b[i] = fatorial;
			}
			
			System.out.print("Números: [");
			for(i = 0; i < TAM; i++) {
			    System.out.print(" " + a[i]);
			    if (i < TAM - 1) System.out.print("");
			}
			System.out.println(" ]");

			System.out.print("Seus fatoriais: [");
			for(i = 0; i < TAM; i++) {
			    System.out.print(" " + b[i]);
			    if (i < TAM - 1) System.out.print("");
			}
			System.out.println(" ]");

			in.close();
		}
    }
}