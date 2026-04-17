import java.util.Scanner;
public class IntersecaoConjuntos {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			
        	final int TAM = 10;
			int a[] = new int[TAM];
			int b[] = new int[TAM];
			int c[] = new int[TAM]; 
			int i, j, ic;
			int vetorC = 0;
			int num;
			
			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º valor do conjunto A: ");
			    a[i] = in.nextInt();
			}
			
			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º valor do conjunto B: ");
			    b[i] = in.nextInt();
			}
			
			for(i = 0; i < TAM; i++) {
			    int vetorA = a[i];
			    num = 0;
			    for (ic = 0; ic < vetorC; ic++) {
			        if (c[ic] == vetorA) {
			            num = 1;
			        }
			    }
			    
			    if (num == 0) {
			        num = 0; 
			        for (j = 0; j < TAM; j++) {
			            if (vetorA == b[j]) {
			                num = 1;
			            }
			        }
			        
			        if (num == 1) {
			            c[vetorC] = vetorA;
			            vetorC = vetorC + 1;
			        }
			    }
			}
			
			System.out.print("Interseção dos vetores A e B: [");
			for(i = 0; i < vetorC; i++) {
			    System.out.print(" " + c[i]);
			    if (i < vetorC - 1) System.out.print("");
			}
			System.out.println(" ]");

			in.close();
		}
    }
}