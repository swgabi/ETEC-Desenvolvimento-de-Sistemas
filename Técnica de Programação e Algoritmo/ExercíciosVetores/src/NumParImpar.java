import java.util.Scanner;
public class NumParImpar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM = 20;
        int a[] = new int[TAM];
        int b [] = new int [TAM];
       
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            a[i] = in.nextInt(); 
        }

        int indiceB = 0; 

        for (int i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) { 
                b[indiceB] = a[i]; 
                indiceB++; 
            }
        }
        
        for (int i = 0; i < TAM; i++) {
            if (a[i] % 2 != 0) { 
                b[indiceB] = a[i]; 
                indiceB++;
            }
        }
        
        System.out.print("Vetor A: [");
        for (int i = 0; i < TAM; i++) {
            System.out.print(a[i] + (i < TAM - 1 ? ", " : "")); 
        }
        System.out.println("]");
        
        // Condição de verdadeiro ou falso:
        // ? - Verdadeiro, adiciona vírgula e espaço (", ")
        // : - Falso, adiciona nada ("")
       
        System.out.print("Vetor B - Pares e Ímpares: [");
        for (int i = 0; i < TAM; i++) {
            System.out.print(b[i] + (i < TAM - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        in.close();
    }
}