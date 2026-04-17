import java.util.Scanner;
public class DiferencaConjuntos {

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
			        int temNoB = 0; 
			        for (j = 0; j < TAM; j++) {
			            if (vetorA == b[j]) {
			                temNoB = 1;
			            }
			        }
			        
			        if (temNoB == 0) {
			            c[vetorC] = vetorA;
			            vetorC = vetorC + 1;
			        }
			    }
			}
			
			System.out.print("Diferença entre os conjuntos A e B: [");
			for(i = 0; i < vetorC; i++) {
			    System.out.print(" " + c[i]);
			    if (i < vetorC - 1) System.out.print("");
			}
			System.out.println(" ]");

			in.close();
		}
    }
}